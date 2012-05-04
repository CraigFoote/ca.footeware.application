package ca.footeware.application;

import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

/**
 * Sets up application's workbench and default perspective.
 * 
 * @author Footeware.ca
 */
public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.application.WorkbenchAdvisor#createWorkbenchWindowAdvisor
	 * (org.eclipse.ui.application.IWorkbenchWindowConfigurer)
	 */
	@Override
	public final WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(
			final IWorkbenchWindowConfigurer configurer) {
		return new ApplicationWorkbenchWindowAdvisor(configurer);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.application.WorkbenchAdvisor#getInitialWindowPerspectiveId
	 * ()
	 */
	@Override
	public final String getInitialWindowPerspectiveId() {
		return null;
	}
}
