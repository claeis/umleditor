package ch.ehi.umleditor.plugin.loader;

import java.io.*;
import java.lang.reflect.Modifier;
import java.net.*;
import java.util.*;
import java.util.jar.*;
import java.util.zip.*;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.JarURLConnection;

import ch.ehi.umleditor.plugin.AbstractPlugin;
import ch.ehi.umleditor.application.LauncherView;

/**
 * @author ce
 */
public class JARClassLoader extends URLClassLoader
{
	private String path;
	private JAR jar;
	private ArrayList pluginClasses = new ArrayList();


	public JARClassLoader(String path,PluginLoader pluginLoader)
		throws IOException
	{

		super(new URL[] { new URL("file","",path) });

		URL u = new URL("jar", "", new URL("file","",path) + "!/");
		JarURLConnection uc = (JarURLConnection)u.openConnection();

		JarFile zipFile = uc.getJarFile();

		jar = new JAR(path,this);

		Enumeration entires = zipFile.entries();
		while(entires.hasMoreElements())
		{
			ZipEntry entry = (ZipEntry)entires.nextElement();
			String name = entry.getName();
			//System.err.println(name);
			if(name.endsWith("Plugin.class")){
				pluginClasses.add(name);
			}
		}

		pluginLoader.addPluginJAR(jar);

	}
	void startAllPlugins()
	{

		boolean ok = true;

		for(int i = 0; i < pluginClasses.size(); i++)
		{
			String name = (String)pluginClasses.get(i);
			name = fileToClass(name);
			try
			{
				Class clazz = loadClass(name);
				AbstractPlugin plugin=(AbstractPlugin)clazz.newInstance();
				jar.addPlugin(plugin);
			}
			catch(Throwable t)
			{
				LauncherView.getInstance().log("plugin","Error while starting plugin " + name);

			}
		}
	}
	/**
	 * Converts a file name to a class name. All slash characters are
	 * replaced with periods and the trailing '.class' is removed.
	 */
	public static String fileToClass(String name)
	{
		char[] clsName = name.toCharArray();
		for(int i = clsName.length - 6; i >= 0; i--)
			if(clsName[i] == '/')
				clsName[i] = '.';
		return new String(clsName,0,clsName.length - 6);
	}

	/**
	 * A JAR file.
	 */
	public static class JAR
	{
		public JARClassLoader getClassLoader()
		{
			return classLoader;
		}
	
	
		public void addPlugin(AbstractPlugin plugin)
		{
			//plugin.jar = JAR.this;
	
			plugin.start();
	
			plugins.addElement(plugin);
		}
	
		public AbstractPlugin[] getPlugins()
		{
			AbstractPlugin[] array = new AbstractPlugin[plugins.size()];
			plugins.copyInto(array);
			return array;
		}
	
		public JAR(String path, JARClassLoader classLoader)
		{
			this.path = path;
			this.classLoader = classLoader;
			plugins = new Vector();
		}
	
		// package-private members
		void getPlugins(Vector vector)
		{
			for(int i = 0; i < plugins.size(); i++)
			{
				vector.addElement(plugins.elementAt(i));
			}
		}
	
		// private members
		private String path;
		private JARClassLoader classLoader;
		private Vector plugins;
	}

}
