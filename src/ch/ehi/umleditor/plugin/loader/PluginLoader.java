package ch.ehi.umleditor.plugin.loader;

import java.io.File;
import ch.ehi.umleditor.application.LauncherView;

/**
 * @author ce
 *
 */
public class PluginLoader {
private java.util.ArrayList jars=new java.util.ArrayList();
/**
 * Loads all plugins in a directory.
 */
public void loadPlugins(String dirPath)
{
								File dir = new File(dirPath);
								if(!(dir.exists() && dir.isDirectory()))
																return;
								File[] plugins = dir.listFiles();
								if(plugins == null)
																return;

								for(int i = 0; i < plugins.length; i++)
								{
																File plugin = plugins[i];
																if(!plugin.getName().toLowerCase().endsWith(".jar"))
																								continue;

																String path = plugin.getAbsolutePath();
																//System.err.println(path);
																try
																{
																								new JARClassLoader(path,this);
																}
																catch(java.io.IOException io)
																{
																								LauncherView.getInstance().log("plugin","Cannot load"
																																																							+ " plugin " + path);
																}
								}
}
public void startAllPlugins(){
								for(int i = 0; i < jars.size(); i++)
								{
																((JARClassLoader.JAR)jars.get(i)).getClassLoader()
																.startAllPlugins();
								}
}
public java.util.ArrayList getAllPlugins(){
								java.util.ArrayList ret=new java.util.ArrayList();
								for(int i = 0; i < jars.size(); i++)
								{
																ret.addAll(java.util.Arrays.asList(((JARClassLoader.JAR)jars.get(i)).getPlugins()));
								}
								return ret;
}
public void addPluginJAR(JARClassLoader.JAR jar){
								jars.add(jar);
}

}
