package org.openntf.impostor.hook;

import org.eclipse.osgi.baseadaptor.HookConfigurator;
import org.eclipse.osgi.baseadaptor.HookRegistry;

public class HelloConfigurator implements HookConfigurator {

	@Override
	public void addHooks(HookRegistry hookRegistry) {

		hookRegistry.addAdaptorHook(new HelloAdaptorHook());		
		hookRegistry.addClassLoaderDelegateHook(new HelloClassLoaderDelegateHook());
		hookRegistry.addClassLoadingHook(new HelloClassLoadingHook());
	}

}
