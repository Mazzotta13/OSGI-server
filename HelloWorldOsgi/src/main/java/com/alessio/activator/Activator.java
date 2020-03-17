package com.alessio.activator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleListener;
import org.osgi.framework.FrameworkEvent;
import org.osgi.framework.FrameworkListener;

import com.alessio.service.Greeting;
import com.alessio.service.impl.GreetingImpl;

public class Activator implements BundleActivator, FrameworkListener, BundleListener {

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("bundle start");
		context.registerService(Greeting.class.getName(), new GreetingImpl("service"), null);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("bundle stop");
	}

	@Override
	public void bundleChanged(BundleEvent event) {
		System.out.println("BundleEvent: "+event.getType());
	}

	@Override
	public void frameworkEvent(FrameworkEvent event) {
		System.out.println("frameworkEvent: "+event.getType());
	}

}
