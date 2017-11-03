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
<<<<<<< HEAD
public class JARClassLoader extends URLClassLoader
{
=======
public class JARClassLoader extends URLClassLoader {
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
	private String path;
	private JAR jar;
	private ArrayList pluginClasses = new ArrayList();

<<<<<<< HEAD

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
=======
	public JARClassLoader(String path, PluginLoader pluginLoader) throws IOException {

		super(new URL[] { new URL("file", "", path) });

		URL u = new URL("jar", "", new URL("file", "", path) + "!/");
		JarURLConnection uc = (JarURLConnection) u.openConnection();

		JarFile zipFile = uc.getJarFile();

		jar = new JAR(path, this);

		Enumeration entires = zipFile.entries();
		while (entires.hasMoreElements()) {
			ZipEntry entry = (ZipEntry) entires.nextElement();
			String name = entry.getName();
			// System.err.println(name);
			if (name.endsWith("Plugin.class")) {
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
				pluginClasses.add(name);
			}
		}

		pluginLoader.addPluginJAR(jar);

	}
<<<<<<< HEAD
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
				ch.ehi.basics.logging.EhiLogger.logError("Error while starting plugin " + name,t);
=======

	void startAllPlugins() {

		boolean ok = true;

		for (int i = 0; i < pluginClasses.size(); i++) {
			String name = (String) pluginClasses.get(i);
			name = fileToClass(name);
			try {
				Class clazz = loadClass(name);
				AbstractPlugin plugin = (AbstractPlugin) clazz.newInstance();
				jar.addPlugin(plugin);
			} catch (Throwable t) {
				ch.ehi.basics.logging.EhiLogger.logError("Error while starting plugin " + name, t);
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9

			}
		}
	}
<<<<<<< HEAD
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
=======

	/**
	 * Converts a file name to a class name. All slash characters are replaced
	 * with periods and the trailing '.class' is removed.
	 */
	public static String fileToClass(String name) {
		char[] clsName = name.toCharArray();
		for (int i = clsName.length - 6; i >= 0; i--)
			if (clsName[i] == '/')
				clsName[i] = '.';
		return new String(clsName, 0, clsName.length - 6);
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
	}

	/**
	 * A JAR file.
	 */
<<<<<<< HEAD
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
=======
	public static class JAR {
		public JARClassLoader getClassLoader() {
			return classLoader;
		}

		public void addPlugin(AbstractPlugin plugin) {
			// plugin.jar = JAR.this;

			plugin.start();

			plugins.addElement(plugin);
		}

		public AbstractPlugin[] getPlugins() {
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
			AbstractPlugin[] array = new AbstractPlugin[plugins.size()];
			plugins.copyInto(array);
			return array;
		}
<<<<<<< HEAD
	
		public JAR(String path, JARClassLoader classLoader)
		{
=======

		public JAR(String path, JARClassLoader classLoader) {
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
			this.path = path;
			this.classLoader = classLoader;
			plugins = new Vector();
		}
<<<<<<< HEAD
	
		// package-private members
		void getPlugins(Vector vector)
		{
			for(int i = 0; i < plugins.size(); i++)
			{
				vector.addElement(plugins.elementAt(i));
			}
		}
	
=======

		// package-private members
		void getPlugins(Vector vector) {
			for (int i = 0; i < plugins.size(); i++) {
				vector.addElement(plugins.elementAt(i));
			}
		}

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
		// private members
		private String path;
		private JARClassLoader classLoader;
		private Vector plugins;
	}

}
