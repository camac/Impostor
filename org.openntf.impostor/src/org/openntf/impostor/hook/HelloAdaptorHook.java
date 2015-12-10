package org.openntf.impostor.hook;

import java.io.IOException;
import java.net.URLConnection;
import java.util.Properties;

import org.eclipse.osgi.baseadaptor.BaseAdaptor;
import org.eclipse.osgi.baseadaptor.hooks.AdaptorHook;
import org.eclipse.osgi.framework.log.FrameworkLog;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;

public class HelloAdaptorHook implements AdaptorHook {

	@Override
	public void addProperties(Properties arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public FrameworkLog createFrameworkLog() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void frameworkStart(BundleContext arg0) throws BundleException {
		// TODO Auto-generated method stub
		System.out.println("Hello is it me you're looking for?");

	}

	@Override
	public void frameworkStop(BundleContext arg0) throws BundleException {
		// TODO Auto-generated method stub

	}

	@Override
	public void frameworkStopping(BundleContext arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleRuntimeError(Throwable arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void initialize(BaseAdaptor arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public URLConnection mapLocationToURLConnection(String arg0) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean matchDNChain(String arg0, String[] arg1) {
		// TODO Auto-generated method stub
		return false;
	}

}
