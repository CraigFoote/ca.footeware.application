package ca.footeware.application;

import org.eclipse.ui.IWorkbenchPreferenceConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

/**
 * Sets up application's window, specifying attributes such as statusBar, tab
 * styling, etc.
 * 
 * @author Footeware.ca
 */
public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {
	/**
	 * Constructor.
	 * 
	 * @param configurer
	 *            {@link IWorkbenchWindowConfigurer}
	 */
	public ApplicationWorkbenchWindowAdvisor(
			final IWorkbenchWindowConfigurer configurer) {
		super(configurer);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.application.WorkbenchWindowAdvisor#createActionBarAdvisor
	 * (org.eclipse.ui.application.IActionBarConfigurer)
	 */
	@Override
	public final ActionBarAdvisor createActionBarAdvisor(
			final IActionBarConfigurer configurer) {
		return new ApplicationActionBarAdvisor(configurer);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.application.WorkbenchWindowAdvisor#preWindowOpen()
	 */
	@Override
	public final void preWindowOpen() {
		final IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
		configurer.setShowCoolBar(true);
		configurer.setShowStatusLine(true);
		configurer.setShowMenuBar(true);
		configurer.setShowProgressIndicator(true);
		PlatformUI.getPreferenceStore().setValue(
				IWorkbenchPreferenceConstants.SHOW_TRADITIONAL_STYLE_TABS,
				false);
		PlatformUI.getPreferenceStore().setValue(
				IWorkbenchPreferenceConstants.SHOW_MEMORY_MONITOR, true);
		PlatformUI.getPreferenceStore().setValue(
				IWorkbenchPreferenceConstants.SHOW_PROGRESS_ON_STARTUP, true);
	}
}
