package org.openntf.impostor.hook;

import java.security.ProtectionDomain;
import java.util.ArrayList;

import org.eclipse.osgi.baseadaptor.BaseData;
import org.eclipse.osgi.baseadaptor.bundlefile.BundleEntry;
import org.eclipse.osgi.baseadaptor.hooks.ClassLoadingHook;
import org.eclipse.osgi.baseadaptor.loader.BaseClassLoader;
import org.eclipse.osgi.baseadaptor.loader.ClasspathEntry;
import org.eclipse.osgi.baseadaptor.loader.ClasspathManager;
import org.eclipse.osgi.framework.adaptor.BundleProtectionDomain;
import org.eclipse.osgi.framework.adaptor.ClassLoaderDelegate;

public class HelloClassLoadingHook implements ClassLoadingHook {

	@Override
	public boolean addClassPathEntry(ArrayList arg0, String arg1, ClasspathManager hostManager, BaseData data,
			ProtectionDomain domain) {

		if (data.getSymbolicName().contains("jord.hapi.xsp")) {

			System.out.println("IMPOSTOR - asking about class path entries for hapi.xsp");
						
		}		
		
		return false;
	}

	@Override
	public BaseClassLoader createClassLoader(ClassLoader parent , ClassLoaderDelegate delegate , BundleProtectionDomain domain ,
			BaseData data , String[] bundleclasspath ) {

		if (data.getSymbolicName().contains("jord.hapi.xsp")) {
			
			System.out.println("IMPOSTOR - asking about class path entries for hapi.xsp");
			
		}

		
		return null;
	}

	@Override
	public String findLibrary(BaseData arg0, String arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClassLoader getBundleClassLoaderParent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void initializedClassLoader(BaseClassLoader arg0, BaseData data) {

		if (data.getSymbolicName().contains("jord.hapi.xsp")) {
			
			System.out.println("IMPOSTOR - initialized class loader for hapi.xsp");
			
		}		

	}

	@Override
	public byte[] processClass(String arg0, byte[] arg1, ClasspathEntry arg2, BundleEntry arg3, ClasspathManager arg4) {
		// TODO Auto-generated method stub
		return null;
	}

}
