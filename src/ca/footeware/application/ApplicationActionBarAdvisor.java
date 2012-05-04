package ca.footeware.application;

import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ContributionItemFactory;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

/**
 * Sets up application's main toolbar and menubar.
 * 
 * @author Footeware.ca
 */
public class ApplicationActionBarAdvisor extends ActionBarAdvisor {
	private IWorkbenchWindow workbenchWindow;

	/**
	 * Constructor.
	 * 
	 * @param configurer
	 *            {@link IActionBarConfigurer}
	 */
	public ApplicationActionBarAdvisor(final IActionBarConfigurer configurer) {
		super(configurer);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.application.ActionBarAdvisor#fillMenuBar(org.eclipse.jface
	 * .action.IMenuManager)
	 */
	@Override
	protected final void fillMenuBar(final IMenuManager menuBar) {
		final MenuManager windowMenu = new MenuManager("&Window",
				IWorkbenchActionConstants.M_WINDOW);
		menuBar.add(windowMenu);

		final MenuManager showViewMenu = new MenuManager("Show &View",
				"showView");
		windowMenu.add(showViewMenu);

		final IContributionItem viewsList = ContributionItemFactory.VIEWS_SHORTLIST
				.create(this.workbenchWindow);
		showViewMenu.add(viewsList);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.application.ActionBarAdvisor#makeActions(org.eclipse.ui
	 * .IWorkbenchWindow)
	 */
	@Override
	protected final void makeActions(final IWorkbenchWindow window) {
		this.workbenchWindow = window;
	}
}
