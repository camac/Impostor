package org.openntf.impostor.hook;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Enumeration;

import org.eclipse.osgi.framework.adaptor.BundleClassLoader;
import org.eclipse.osgi.framework.adaptor.BundleData;
import org.eclipse.osgi.framework.adaptor.ClassLoaderDelegateHook;

import lotus.domino.axis.encoding.ser.ElementSerializerFactory;

public class HelloClassLoaderDelegateHook implements ClassLoaderDelegateHook {

	private ClassLoader cl = null;

	@Override
	public Class postFindClass(String arg0, BundleClassLoader arg1, BundleData arg2) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String postFindLibrary(String arg0, BundleClassLoader arg1, BundleData arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public URL postFindResource(String arg0, BundleClassLoader arg1, BundleData arg2) throws FileNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Enumeration postFindResources(String arg0, BundleClassLoader arg1, BundleData arg2)
			throws FileNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	private void initClassLoader() {
		try {
			if (cl == null) {
				String binpath = "D:\\Projects\\Hapi\\com.jord.hapi.xsp\\bin\\";
				URL url = new File(binpath).toURI().toURL();
				URL[] urls = new URL[] { url };
				ClassLoader cl = new URLClassLoader(urls);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Class preFindClass(String name, BundleClassLoader classLoader, BundleData data)
			throws ClassNotFoundException {

		try {

			if (data.getSymbolicName().contains("jord.hapi.xsp")) {

				System.out.println("Hello, I am looking for class: " + name + " in " + data.getSymbolicName());

				initClassLoader();

				try {
					
					System.out.println("about to load class" + name);
					
					Class c = cl.loadClass(name);

					if (c != null) {
						System.out.println("WE LOADED " + c.getName() + " from filesystem!");
					}

					return c;

				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public String preFindLibrary(String arg0, BundleClassLoader arg1, BundleData arg2) throws FileNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public URL preFindResource(String name, BundleClassLoader classLoader, BundleData data)
			throws FileNotFoundException {

		try {

			if (data.getSymbolicName().contains("com.jord.hapi.xsp")) {

				initClassLoader();

				System.out.println("Look for Resource " + name);
				
				URL url = cl.getResource(name);
				
				if (url != null) {
					System.out.println("We found " + url.toString());
				}

				return url;

			} else if (data.getSymbolicName().contains("jord")) {

				if (name.contains("database_refresh.png")) {

					String testpath = "C:\\Users\\cgregor\\Desktop\\OSGiHooks\\loadme.png";
					URL url = new File(testpath).toURI().toURL();
					return url;

				}
			}

		} catch (Exception e) {

		}

		return null;

	}

	@Override
	public Enumeration preFindResources(String name, BundleClassLoader classLoader, BundleData data)
			throws FileNotFoundException {

		System.out.println("Hello, I am looking for Resources: " + name);
		return null;

	}

}
