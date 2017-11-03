package ch.ehi.umleditor.umldrawingtools;

/* This file is part of the UML/INTERLIS-Editor.
 * For more information, please see <http://www.umleditor.org/>.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
import ch.softenvironment.client.ResourceManager;
<<<<<<< HEAD
/**
 * Interface for presentation aspects of a ModelElement.
 * 
 * @author Peter Hirzel <i>soft</i>Environment 
=======

/**
 * Interface for presentation aspects of a ModelElement.
 *
 * @author Peter Hirzel <i>soft</i>Environment
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
 * @version $Revision: 1.5 $ $Date: 2006-06-29 22:16:01 $
 */
public interface ModelElementUI {
	static String REMOVE_IN_MODEL = ResourceManager.getResource(ModelElementUI.class, "MniRemoveInModel_text");
	static String CREATION_ERROR = ResourceManager.getResource(ModelElementUI.class, "CECreationError");
	static String SELECT_IN_BROWSER = ResourceManager.getResource(ModelElementUI.class, "MniSelectInBrowser_text");
<<<<<<< HEAD
/**
 * Return the ModelElement represented by this Interface.
 * @return ModelElement
 * @see ModelElementUI
 */
ch.ehi.uml1_4.foundation.core.ModelElement getModelElement();
/**
 * Remove the Figure in Model (implies visual deletion).
 * @see ModelElementUI
 */
void removeInModel();
/**
 * Remove the Figure visually.
 * Still kept in real model.
 * @see ModelElementUI
 */
void removeVisually();
/**
 * Show the Specification Dialog of the PresentationElement.
 * @author Peter Hirzel
 * @see createPopupMenu()
 * @see ModelElementUI
 */
void showSpecification();
=======

	/**
	 * Return the ModelElement represented by this Interface.
	 * 
	 * @return ModelElement
	 * @see ModelElementUI
	 */
	ch.ehi.uml1_4.foundation.core.ModelElement getModelElement();

	/**
	 * Remove the Figure in Model (implies visual deletion).
	 * 
	 * @see ModelElementUI
	 */
	void removeInModel();

	/**
	 * Remove the Figure visually. Still kept in real model.
	 * 
	 * @see ModelElementUI
	 */
	void removeVisually();

	/**
	 * Show the Specification Dialog of the PresentationElement.
	 * 
	 * @author Peter Hirzel
	 * @see createPopupMenu()
	 * @see ModelElementUI
	 */
	void showSpecification();
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
}
