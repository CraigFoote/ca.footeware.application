package ca.footeware.application.internal;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 */
public class Activator extends AbstractUIPlugin {
	// The shared instance
	private static Activator plugin;

	/**
	 * The plug-in ID.
	 */
	public static final String PLUGIN_ID = "ca.footeware.application";

	/**
	 * Returns the shared instance.
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return Activator.plugin;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	@Override
	public final void start(final BundleContext context) throws Exception {
		super.start(context);
		Activator.plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	@Override
	public final void stop(final BundleContext context) throws Exception {
		Activator.plugin = null;
		super.stop(context);
	}
}
