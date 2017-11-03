package ch.ehi.umleditor.application;

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
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.core.Element;
import javax.swing.Icon;
<<<<<<< HEAD
/**
 * Utility Class for TreeNode's.
 *
 * @author Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.4 $ $Date: 2006-06-29 22:08:56 $
 */
public class NavigationTreeNodeUtility {
  private NavigationTreeNodeUtility(){
  }
  /** returns the appropriate icon
   */
  static public Icon getIcon(Object node, boolean expanded) {
    String fileName = null;
    
  	if (node instanceof ch.ehi.umleditor.umlpresentation.Diagram) {
		fileName = "classDiagram.gif";//$NON-NLS-1$
	}else if (node instanceof ch.ehi.uml1_4.implementation.UmlModel) {
		return getPackageLeafIcon(expanded);
	} else if (node instanceof ch.ehi.interlis.modeltopicclass.INTERLIS2Def) {
		return getPackageLeafIcon(expanded);
	} else if (node instanceof ch.ehi.interlis.modeltopicclass.ModelDef) {
		return getPackageLeafIcon(expanded);
	} else if (node instanceof ch.ehi.interlis.modeltopicclass.TopicDef) {
		return getPackageLeafIcon(expanded);
	} else if (node instanceof ch.ehi.uml1_4.implementation.UmlPackage) {
		return getPackageLeafIcon(expanded);
	} else {
		// all other types are standard
		fileName = ch.softenvironment.util.StringUtils.getPureClassName(node) + ".gif";
	}
  	java.net.URL url = node.getClass().getResource(LauncherView.IMAGE_PATH + "Navigation/" + fileName);//$NON-NLS-1$
  	if (url == null) {
  		ch.softenvironment.util.Tracer.getInstance().developerWarning("file not found <" + fileName + ">");//$NON-NLS-3$//$NON-NLS-2$//$NON-NLS-1$
  		return null;
  	} else {
  		return new javax.swing.ImageIcon(url);
  	}
  }
  /**
   * Returns the string to display for this object.
   */
  static public String getName(Object element) {
	if (element instanceof ch.ehi.uml1_4.implementation.UmlModel) {
		// show the fileName of UmlModel
        java.io.File file = null;
        if (LauncherView.getInstance() != null) {
        	// allow external tools to use this Utility
        	file = LauncherView.getInstance().getCurrentFile();
        }
		return file!=null ? file.getName() : LauncherView.defaultFileName;
	} else if (isModelElement(element)) {
		return ((ModelElement)element).getDefLangName();
	} else if (isClassDiagram(element)) {
		return ElementUtils.mapNlsString(((ch.ehi.umleditor.umlpresentation.Diagram)element).getName());
	} else throw new IllegalArgumentException("unknown EditorTreeElement");//$NON-NLS-1$
  }
  /**
   * Return the standard package-Symbol.
   * @return Icon representing a Package.
   */
  static private Icon getPackageLeafIcon(boolean expanded) {
/*
  	if (expanded) {
  		
  	} else {
  		return javax.swing.UIManager.getIcon("Tree.closedIcon");
  	}
*/
  	return null; // will adapt closed/openedPackage automatically
  }
  /**
   * Return whether Specification Dialog exists or not.
   * @see NavigationView
   */
  static public boolean hasSpecification(Element element) {
  	// Show UmlModel in RootNode instead of LogicalView
  	return ElementUtils.getElementDialog(element) != null;
  }
    /**
   * Return whether TreeElement is a AssociationDef or not.
   */
  static public boolean isAssociationDef(Element node) {
  	return node instanceof ch.ehi.interlis.associations.AssociationDef;
  }
  /**
   * Return whether TreeElement is a ClassDef or not.
   */
  static public boolean isClassDef(Element node) {
  	return node instanceof ch.ehi.interlis.modeltopicclass.ClassDef;
  }
  /**
   * Return whether TreeElement is a Diagram or not.
   */
  static public boolean isClassDiagram(Object element) {
  	return element instanceof ch.ehi.umleditor.umlpresentation.Diagram;
  }
  /**
   * Return whether TreeElement is a ModelElement or not.
   */
  static private boolean isModelElement(Object element) {
  	return element instanceof ModelElement;
  }
  /**
   * Return whether Node mapping this TreeElement might be renamed.
   * @see NavigationView
   */
  static public boolean isNodeEditable(Element node) {
    return !(node instanceof ch.ehi.uml1_4.implementation.UmlModel)
        && !(node instanceof ch.ehi.interlis.metaobjects.MetaObjectFile);
  }
  /**
   * Return whether Node mapping this TreeElement might be removed.
   * @see NavigationView
   */
  static public boolean isNodeRemovable(Element node) {
    return !(node instanceof ch.ehi.uml1_4.implementation.UmlModel);
  }
  /**
   * Return whether Node mapping this TreeElement might be moved.
   * @see NavigationView
   */
  static public boolean isNodeMovable(Element node) {
    return !(node instanceof ch.ehi.uml1_4.implementation.UmlModel)
      && !(node instanceof ch.ehi.uml1_4.foundation.core.Feature)
      && !(node instanceof ch.ehi.uml1_4.foundation.core.AssociationEnd)
      ;
  }
  /**
   * Sets the string to display for this object.
   */
  static public void setName(Object node,String newName) {
  	if (isModelElement(node)) {
  		((ModelElement)node).setName(new ch.ehi.basics.types.NlsString(((ModelElement)node).getName(), newName));
  	} else if (isClassDiagram(node)) {
  		((ch.ehi.umleditor.umlpresentation.Diagram)node).setName(new ch.ehi.basics.types.NlsString(((ch.ehi.umleditor.umlpresentation.Diagram)node).getName(), newName));
  	}
  }
=======

/**
 * Utility Class for TreeNode's.
 *
 * @author Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.4 $ $Date: 2006-06-29 22:08:56 $
 */
public class NavigationTreeNodeUtility {
	private NavigationTreeNodeUtility() {
	}

	/**
	 * returns the appropriate icon
	 */
	static public Icon getIcon(Object node, boolean expanded) {
		String fileName = null;

		if (node instanceof ch.ehi.umleditor.umlpresentation.Diagram) {
			fileName = "classDiagram.gif";//$NON-NLS-1$
		} else if (node instanceof ch.ehi.uml1_4.implementation.UmlModel) {
			fileName = "ili2ModelSet.gif";
		} else if (node instanceof ch.ehi.interlis.modeltopicclass.INTERLIS2Def) {
			fileName = "interlis2Def.gif";
		} else if (node instanceof ch.ehi.interlis.modeltopicclass.ModelDef) {
			fileName = "modelDef.gif";
		} else if (node instanceof ch.ehi.interlis.modeltopicclass.TopicDef) {
			fileName = "TopicDef.gif";
		} else if (node instanceof ch.ehi.uml1_4.implementation.UmlPackage) {
			fileName = "ili2PackageSet.gif";
		} else {
			// all other types are standard
			fileName = ch.softenvironment.util.StringUtils.getPureClassName(node) + ".gif";
		}
		java.net.URL url = node.getClass().getResource(LauncherView.IMAGE_PATH + "Navigation/" + fileName);//$NON-NLS-1$
		if (url == null) {
			ch.softenvironment.util.Tracer.getInstance().developerWarning("file not found <" + fileName + ">");// $NON-NLS-3$//$NON-NLS-2$//$NON-NLS-1$
			return null;
		} else {
			return new javax.swing.ImageIcon(url);
		}
	}

	/**
	 * Returns the string to display for this object.
	 */
	static public String getName(Object element) {
		if (element instanceof ch.ehi.uml1_4.implementation.UmlModel) {
			// show the fileName of UmlModel
			java.io.File file = null;
			if (LauncherView.getInstance() != null) {
				// allow external tools to use this Utility
				file = LauncherView.getInstance().getCurrentFile();
			}
			return file != null ? file.getName() : LauncherView.defaultFileName;
		} else if (isModelElement(element)) {
			return ((ModelElement) element).getDefLangName();
		} else if (isClassDiagram(element)) {
			return ElementUtils.mapNlsString(((ch.ehi.umleditor.umlpresentation.Diagram) element).getName());
		} else
			throw new IllegalArgumentException("unknown EditorTreeElement"); //$NON-NLS-1$
	}

	/**
	 * Return the standard package-Symbol.
	 * 
	 * @return Icon representing a Package.
	 */
	static private Icon getPackageLeafIcon(boolean expanded) {
		/*
		 * if (expanded) {
		 * 
		 * } else { return javax.swing.UIManager.getIcon("Tree.closedIcon"); }
		 */
		return null; // will adapt closed/openedPackage automatically
	}

	/**
	 * Return whether Specification Dialog exists or not.
	 * 
	 * @see NavigationView
	 */
	static public boolean hasSpecification(Element element) {
		// Show UmlModel in RootNode instead of LogicalView
		return ElementUtils.getElementDialog(element) != null;
	}

	/**
	 * Return whether TreeElement is a AssociationDef or not.
	 */
	static public boolean isAssociationDef(Element node) {
		return node instanceof ch.ehi.interlis.associations.AssociationDef;
	}

	/**
	 * Return whether TreeElement is a ClassDef or not.
	 */
	static public boolean isClassDef(Element node) {
		return node instanceof ch.ehi.interlis.modeltopicclass.ClassDef;
	}
	
	/**
	 * Return whether TreeElement is a INTERLIS2Def or not
	 */
	static public boolean isINTERLIS2Def(Object node) {
		return node instanceof ch.ehi.interlis.modeltopicclass.INTERLIS2Def;
	}

	/**
	 * Return whether TreeElement is a Diagram or not.
	 */
	static public boolean isClassDiagram(Object element) {
		return element instanceof ch.ehi.umleditor.umlpresentation.Diagram;
	}

	/**
	 * Return whether TreeElement is a ModelElement or not.
	 */
	static private boolean isModelElement(Object element) {
		return element instanceof ModelElement;
	}

	/**
	 * Return whether Node mapping this TreeElement might be renamed.
	 * 
	 * @see NavigationView
	 */
	static public boolean isNodeEditable(Element node) {
		return !(node instanceof ch.ehi.uml1_4.implementation.UmlModel)
				&& !(node instanceof ch.ehi.interlis.metaobjects.MetaObjectFile);
	}

	/**
	 * Return whether Node mapping this TreeElement might be removed.
	 * 
	 * @see NavigationView
	 */
	static public boolean isNodeRemovable(Element node) {
		return !(node instanceof ch.ehi.uml1_4.implementation.UmlModel);
	}

	/**
	 * Return whether Node mapping this TreeElement might be moved.
	 * 
	 * @see NavigationView
	 */
	static public boolean isNodeMovable(Element node) {
		return !(node instanceof ch.ehi.uml1_4.implementation.UmlModel)
				&& !(node instanceof ch.ehi.uml1_4.foundation.core.Feature)
				&& !(node instanceof ch.ehi.uml1_4.foundation.core.AssociationEnd);
	}

	/**
	 * Sets the string to display for this object.
	 */
	static public void setName(Object node, String newName) {
		if(isINTERLIS2Def(node)) {//aqui hice cambios extraños
			ch.ehi.interlis.modeltopicclass.INTERLIS2Def obj = (ch.ehi.interlis.modeltopicclass.INTERLIS2Def) node;
			//si el nodo ya tiene la extencion ili
			if(obj.getName().getValue().endsWith(".ili")) {
				((ch.ehi.interlis.modeltopicclass.INTERLIS2Def) node).setName(new ch.ehi.basics.types.NlsString(
						((ch.ehi.interlis.modeltopicclass.INTERLIS2Def) node).getName(), newName));
			}else {
				((ch.ehi.interlis.modeltopicclass.INTERLIS2Def) node).setName(new ch.ehi.basics.types.NlsString(
					((ch.ehi.interlis.modeltopicclass.INTERLIS2Def) node).getName(), newName+".ili"));
				}
		}else if (isModelElement(node)) {
			((ModelElement) node).setName(new ch.ehi.basics.types.NlsString(((ModelElement) node).getName(), newName));
		} else if (isClassDiagram(node)) {
			((ch.ehi.umleditor.umlpresentation.Diagram) node).setName(new ch.ehi.basics.types.NlsString(
					((ch.ehi.umleditor.umlpresentation.Diagram) node).getName(), newName));
		}
	}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
}
