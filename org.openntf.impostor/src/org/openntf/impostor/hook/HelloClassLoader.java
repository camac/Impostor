package org.openntf.impostor.hook;

import java.io.IOException;
import java.net.URL;
import java.security.ProtectionDomain;
import java.util.Enumeration;

import org.eclipse.osgi.baseadaptor.bundlefile.BundleEntry;
import org.eclipse.osgi.baseadaptor.bundlefile.BundleFile;
import org.eclipse.osgi.baseadaptor.loader.BaseClassLoader;
import org.eclipse.osgi.baseadaptor.loader.ClasspathEntry;
import org.eclipse.osgi.baseadaptor.loader.ClasspathManager;
import org.eclipse.osgi.framework.adaptor.BundleData;
import org.eclipse.osgi.framework.adaptor.ClassLoaderDelegate;

public class HelloClassLoader implements BaseClassLoader {

	@Override
	public void attachFragment(BundleData arg0, ProtectionDomain arg1, String[] arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

	@Override
	public Class findLocalClass(String arg0) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public URL findLocalResource(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Enumeration findLocalResources(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClassLoaderDelegate getDelegate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClassLoader getParent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public URL getResource(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Enumeration getResources(String arg0) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	public Class loadClass(String arg0) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClasspathEntry createClassPathEntry(BundleFile arg0, ProtectionDomain arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class defineClass(String arg0, byte[] arg1, ClasspathEntry arg2, BundleEntry arg3) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClasspathManager getClasspathManager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProtectionDomain getDomain() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object publicDefinePackage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5,
			String arg6, URL arg7) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class publicFindLoaded(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object publicGetPackage(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
