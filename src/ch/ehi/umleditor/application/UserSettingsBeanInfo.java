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
/**
 * The bean information class for ch.ehi.umleditor.application.UserSettings.
<<<<<<< HEAD
 * 
 * @author: Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:40:07 $
 */
public class UserSettingsBeanInfo extends java.beans.SimpleBeanInfo {
/**
 * Gets the backgroundColor property descriptor.
 * @return java.beans.PropertyDescriptor
 */
public java.beans.PropertyDescriptor backgroundColorPropertyDescriptor() {
	java.beans.PropertyDescriptor aDescriptor = null;
	try {
		try {
			/* Using methods via getMethod is the faster way to create the backgroundColor property descriptor. */
			java.lang.reflect.Method aGetMethod = null;
			try {
				/* Attempt to find the method using getMethod with parameter types. */
				java.lang.Class aGetMethodParameterTypes[] = {};
				aGetMethod = getBeanClass().getMethod("getBackgroundColor", aGetMethodParameterTypes);
			} catch (Throwable exception) {
				/* Since getMethod failed, call findMethod. */
				handleException(exception);
				aGetMethod = findMethod(getBeanClass(), "getBackgroundColor", 0);
			};
			java.lang.reflect.Method aSetMethod = null;
			try {
				/* Attempt to find the method using getMethod with parameter types. */
				java.lang.Class aSetMethodParameterTypes[] = {
					java.awt.Color.class
				};
				aSetMethod = getBeanClass().getMethod("setBackgroundColor", aSetMethodParameterTypes);
			} catch (Throwable exception) {
				/* Since getMethod failed, call findMethod. */
				handleException(exception);
				aSetMethod = findMethod(getBeanClass(), "setBackgroundColor", 1);
			};
			aDescriptor = new java.beans.PropertyDescriptor("backgroundColor"
			, aGetMethod, aSetMethod);
		} catch (Throwable exception) {
			/* Since we failed using methods, try creating a default property descriptor. */
			handleException(exception);
			aDescriptor = new java.beans.PropertyDescriptor("backgroundColor"
			, getBeanClass());
		};
		aDescriptor.setBound(true);
		/* aDescriptor.setConstrained(false); */
		/* aDescriptor.setDisplayName("backgroundColor"); */
		/* aDescriptor.setShortDescription("backgroundColor"); */
		/* aDescriptor.setExpert(false); */
		/* aDescriptor.setHidden(false); */
		/* aDescriptor.setValue("preferred", new Boolean(false)); */
		/* aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true)); */
	} catch (Throwable exception) {
		handleException(exception);
	};
	return aDescriptor;
}
/**
 * Gets the diagramHeight property descriptor.
 * @return java.beans.PropertyDescriptor
 */
public java.beans.PropertyDescriptor diagramHeightPropertyDescriptor() {
	java.beans.PropertyDescriptor aDescriptor = null;
	try {
		try {
			/* Using methods via getMethod is the faster way to create the diagramHeight property descriptor. */
			java.lang.reflect.Method aGetMethod = null;
			try {
				/* Attempt to find the method using getMethod with parameter types. */
				java.lang.Class aGetMethodParameterTypes[] = {};
				aGetMethod = getBeanClass().getMethod("getDiagramHeight", aGetMethodParameterTypes);
			} catch (Throwable exception) {
				/* Since getMethod failed, call findMethod. */
				handleException(exception);
				aGetMethod = findMethod(getBeanClass(), "getDiagramHeight", 0);
			};
			java.lang.reflect.Method aSetMethod = null;
			try {
				/* Attempt to find the method using getMethod with parameter types. */
				java.lang.Class aSetMethodParameterTypes[] = {
					java.lang.Integer.class
				};
				aSetMethod = getBeanClass().getMethod("setDiagramHeight", aSetMethodParameterTypes);
			} catch (Throwable exception) {
				/* Since getMethod failed, call findMethod. */
				handleException(exception);
				aSetMethod = findMethod(getBeanClass(), "setDiagramHeight", 1);
			};
			aDescriptor = new java.beans.PropertyDescriptor("diagramHeight"
			, aGetMethod, aSetMethod);
		} catch (Throwable exception) {
			/* Since we failed using methods, try creating a default property descriptor. */
			handleException(exception);
			aDescriptor = new java.beans.PropertyDescriptor("diagramHeight"
			, getBeanClass());
		};
		aDescriptor.setBound(true);
		/* aDescriptor.setConstrained(false); */
		/* aDescriptor.setDisplayName("diagramHeight"); */
		/* aDescriptor.setShortDescription("diagramHeight"); */
		/* aDescriptor.setExpert(false); */
		/* aDescriptor.setHidden(false); */
		/* aDescriptor.setValue("preferred", new Boolean(false)); */
		/* aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true)); */
	} catch (Throwable exception) {
		handleException(exception);
	};
	return aDescriptor;
}
/**
 * Gets the diagramWidth property descriptor.
 * @return java.beans.PropertyDescriptor
 */
public java.beans.PropertyDescriptor diagramWidthPropertyDescriptor() {
	java.beans.PropertyDescriptor aDescriptor = null;
	try {
		try {
			/* Using methods via getMethod is the faster way to create the diagramWidth property descriptor. */
			java.lang.reflect.Method aGetMethod = null;
			try {
				/* Attempt to find the method using getMethod with parameter types. */
				java.lang.Class aGetMethodParameterTypes[] = {};
				aGetMethod = getBeanClass().getMethod("getDiagramWidth", aGetMethodParameterTypes);
			} catch (Throwable exception) {
				/* Since getMethod failed, call findMethod. */
				handleException(exception);
				aGetMethod = findMethod(getBeanClass(), "getDiagramWidth", 0);
			};
			java.lang.reflect.Method aSetMethod = null;
			try {
				/* Attempt to find the method using getMethod with parameter types. */
				java.lang.Class aSetMethodParameterTypes[] = {
					java.lang.Integer.class
				};
				aSetMethod = getBeanClass().getMethod("setDiagramWidth", aSetMethodParameterTypes);
			} catch (Throwable exception) {
				/* Since getMethod failed, call findMethod. */
				handleException(exception);
				aSetMethod = findMethod(getBeanClass(), "setDiagramWidth", 1);
			};
			aDescriptor = new java.beans.PropertyDescriptor("diagramWidth"
			, aGetMethod, aSetMethod);
		} catch (Throwable exception) {
			/* Since we failed using methods, try creating a default property descriptor. */
			handleException(exception);
			aDescriptor = new java.beans.PropertyDescriptor("diagramWidth"
			, getBeanClass());
		};
		aDescriptor.setBound(true);
		/* aDescriptor.setConstrained(false); */
		/* aDescriptor.setDisplayName("diagramWidth"); */
		/* aDescriptor.setShortDescription("diagramWidth"); */
		/* aDescriptor.setExpert(false); */
		/* aDescriptor.setHidden(false); */
		/* aDescriptor.setValue("preferred", new Boolean(false)); */
		/* aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true)); */
	} catch (Throwable exception) {
		handleException(exception);
	};
	return aDescriptor;
}
/**
 * Find the method by comparing (name & parameter size) against the methods in the class.
 * @return java.lang.reflect.Method
 * @param aClass java.lang.Class
 * @param methodName java.lang.String
 * @param parameterCount int
 */
public static java.lang.reflect.Method findMethod(java.lang.Class aClass, java.lang.String methodName, int parameterCount) {
	try {
		/* Since this method attempts to find a method by getting all methods from the class,
	this method should only be called if getMethod cannot find the method. */
		java.lang.reflect.Method methods[] = aClass.getMethods();
		for (int index = 0; index < methods.length; index++){
			java.lang.reflect.Method method = methods[index];
			if ((method.getParameterTypes().length == parameterCount) && (method.getName().equals(methodName))) {
				return method;
			}
		}
	} catch (java.lang.Throwable exception) {
		return null;
	}
	return null;
}
/**
 * Gets the font property descriptor.
 * @return java.beans.PropertyDescriptor
 */
public java.beans.PropertyDescriptor fontPropertyDescriptor() {
	java.beans.PropertyDescriptor aDescriptor = null;
	try {
		try {
			/* Using methods via getMethod is the faster way to create the font property descriptor. */
			java.lang.reflect.Method aGetMethod = null;
			try {
				/* Attempt to find the method using getMethod with parameter types. */
				java.lang.Class aGetMethodParameterTypes[] = {};
				aGetMethod = getBeanClass().getMethod("getFont", aGetMethodParameterTypes);
			} catch (Throwable exception) {
				/* Since getMethod failed, call findMethod. */
				handleException(exception);
				aGetMethod = findMethod(getBeanClass(), "getFont", 0);
			};
			java.lang.reflect.Method aSetMethod = null;
			try {
				/* Attempt to find the method using getMethod with parameter types. */
				java.lang.Class aSetMethodParameterTypes[] = {
					java.lang.String.class
				};
				aSetMethod = getBeanClass().getMethod("setFont", aSetMethodParameterTypes);
			} catch (Throwable exception) {
				/* Since getMethod failed, call findMethod. */
				handleException(exception);
				aSetMethod = findMethod(getBeanClass(), "setFont", 1);
			};
			aDescriptor = new java.beans.PropertyDescriptor("font"
			, aGetMethod, aSetMethod);
		} catch (Throwable exception) {
			/* Since we failed using methods, try creating a default property descriptor. */
			handleException(exception);
			aDescriptor = new java.beans.PropertyDescriptor("font"
			, getBeanClass());
		};
		aDescriptor.setBound(true);
		/* aDescriptor.setConstrained(false); */
		/* aDescriptor.setDisplayName("font"); */
		/* aDescriptor.setShortDescription("font"); */
		/* aDescriptor.setExpert(false); */
		/* aDescriptor.setHidden(false); */
		/* aDescriptor.setValue("preferred", new Boolean(false)); */
		/* aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true)); */
	} catch (Throwable exception) {
		handleException(exception);
	};
	return aDescriptor;
}
/**
 * Gets the foregroundColor property descriptor.
 * @return java.beans.PropertyDescriptor
 */
public java.beans.PropertyDescriptor foregroundColorPropertyDescriptor() {
	java.beans.PropertyDescriptor aDescriptor = null;
	try {
		try {
			/* Using methods via getMethod is the faster way to create the foregroundColor property descriptor. */
			java.lang.reflect.Method aGetMethod = null;
			try {
				/* Attempt to find the method using getMethod with parameter types. */
				java.lang.Class aGetMethodParameterTypes[] = {};
				aGetMethod = getBeanClass().getMethod("getForegroundColor", aGetMethodParameterTypes);
			} catch (Throwable exception) {
				/* Since getMethod failed, call findMethod. */
				handleException(exception);
				aGetMethod = findMethod(getBeanClass(), "getForegroundColor", 0);
			};
			java.lang.reflect.Method aSetMethod = null;
			try {
				/* Attempt to find the method using getMethod with parameter types. */
				java.lang.Class aSetMethodParameterTypes[] = {
					java.awt.Color.class
				};
				aSetMethod = getBeanClass().getMethod("setForegroundColor", aSetMethodParameterTypes);
			} catch (Throwable exception) {
				/* Since getMethod failed, call findMethod. */
				handleException(exception);
				aSetMethod = findMethod(getBeanClass(), "setForegroundColor", 1);
			};
			aDescriptor = new java.beans.PropertyDescriptor("foregroundColor"
			, aGetMethod, aSetMethod);
		} catch (Throwable exception) {
			/* Since we failed using methods, try creating a default property descriptor. */
			handleException(exception);
			aDescriptor = new java.beans.PropertyDescriptor("foregroundColor"
			, getBeanClass());
		};
		aDescriptor.setBound(true);
		/* aDescriptor.setConstrained(false); */
		/* aDescriptor.setDisplayName("foregroundColor"); */
		/* aDescriptor.setShortDescription("foregroundColor"); */
		/* aDescriptor.setExpert(false); */
		/* aDescriptor.setHidden(false); */
		/* aDescriptor.setValue("preferred", new Boolean(false)); */
		/* aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true)); */
	} catch (Throwable exception) {
		handleException(exception);
	};
	return aDescriptor;
}
/**
 * Returns the BeanInfo of the superclass of this bean to inherit its features.
 * @return java.beans.BeanInfo[]
 */
public java.beans.BeanInfo[] getAdditionalBeanInfo() {
	java.lang.Class superClass;
	java.beans.BeanInfo superBeanInfo = null;

	try {
		superClass = getBeanDescriptor().getBeanClass().getSuperclass();
	} catch (java.lang.Throwable exception) {
		return null;
	}

	try {
		superBeanInfo = java.beans.Introspector.getBeanInfo(superClass);
	} catch (java.beans.IntrospectionException ie) {}

	if (superBeanInfo != null) {
		java.beans.BeanInfo[] ret = new java.beans.BeanInfo[1];
		ret[0] = superBeanInfo;
		return ret;
	}
	return null;
}
/**
 * Gets the bean class.
 * @return java.lang.Class
 */
public static java.lang.Class getBeanClass() {
	return ch.ehi.umleditor.application.UserSettings.class;
}
/**
 * Gets the bean class name.
 * @return java.lang.String
 */
public static java.lang.String getBeanClassName() {
	return "ch.ehi.umleditor.application.UserSettings";
}
public java.beans.BeanDescriptor getBeanDescriptor() {
	java.beans.BeanDescriptor aDescriptor = null;
	try {
		/* Create and return the UserSettingsBeanInfo bean descriptor. */
		aDescriptor = new java.beans.BeanDescriptor(ch.ehi.umleditor.application.UserSettings.class);
		/* aDescriptor.setExpert(false); */
		/* aDescriptor.setHidden(false); */
		/* aDescriptor.setValue("hidden-state", Boolean.FALSE); */
	} catch (Throwable exception) {
	};
	return aDescriptor;
}
/**
 * Return the event set descriptors for this bean.
 * @return java.beans.EventSetDescriptor[]
 */
public java.beans.EventSetDescriptor[] getEventSetDescriptors() {
	try {
		java.beans.EventSetDescriptor aDescriptorList[] = {};
		return aDescriptorList;
	} catch (Throwable exception) {
		handleException(exception);
	};
	return null;
}
/**
 * Return the method descriptors for this bean.
 * @return java.beans.MethodDescriptor[]
 */
public java.beans.MethodDescriptor[] getMethodDescriptors() {
	try {
		java.beans.MethodDescriptor aDescriptorList[] = {};
		return aDescriptorList;
	} catch (Throwable exception) {
		handleException(exception);
	};
	return null;
}
/**
 * Return the property descriptors for this bean.
 * @return java.beans.PropertyDescriptor[]
 */
public java.beans.PropertyDescriptor[] getPropertyDescriptors() {
	try {
		java.beans.PropertyDescriptor aDescriptorList[] = {
			backgroundColorPropertyDescriptor()
			,diagramHeightPropertyDescriptor()
			,diagramWidthPropertyDescriptor()
			,fontPropertyDescriptor()
			,foregroundColorPropertyDescriptor()
			,importDirectoryPropertyDescriptor()
			,languagePropertyDescriptor()
			,showLogViewPropertyDescriptor()
			,showStatusBarPropertyDescriptor()
			,showToolBarPropertyDescriptor()
			,workingDirectoryPropertyDescriptor()
		};
		return aDescriptorList;
	} catch (Throwable exception) {
		handleException(exception);
	};
	return null;
}
/**
 * Called whenever the bean information class throws an exception.
 * @param exception java.lang.Throwable
 */
private void handleException(java.lang.Throwable exception) {

	/* Uncomment the following lines to print uncaught exceptions to stdout */
	// System.out.println("--------- UNCAUGHT EXCEPTION ---------");
	// exception.printStackTrace(System.out);
}
/**
 * Gets the importDirectory property descriptor.
 * @return java.beans.PropertyDescriptor
 */
public java.beans.PropertyDescriptor importDirectoryPropertyDescriptor() {
	java.beans.PropertyDescriptor aDescriptor = null;
	try {
		try {
			/* Using methods via getMethod is the faster way to create the importDirectory property descriptor. */
			java.lang.reflect.Method aGetMethod = null;
			try {
				/* Attempt to find the method using getMethod with parameter types. */
				java.lang.Class aGetMethodParameterTypes[] = {};
				aGetMethod = getBeanClass().getMethod("getImportDirectory", aGetMethodParameterTypes);
			} catch (Throwable exception) {
				/* Since getMethod failed, call findMethod. */
				handleException(exception);
				aGetMethod = findMethod(getBeanClass(), "getImportDirectory", 0);
			};
			java.lang.reflect.Method aSetMethod = null;
			try {
				/* Attempt to find the method using getMethod with parameter types. */
				java.lang.Class aSetMethodParameterTypes[] = {
					java.lang.String.class
				};
				aSetMethod = getBeanClass().getMethod("setImportDirectory", aSetMethodParameterTypes);
			} catch (Throwable exception) {
				/* Since getMethod failed, call findMethod. */
				handleException(exception);
				aSetMethod = findMethod(getBeanClass(), "setImportDirectory", 1);
			};
			aDescriptor = new java.beans.PropertyDescriptor("importDirectory"
			, aGetMethod, aSetMethod);
		} catch (Throwable exception) {
			/* Since we failed using methods, try creating a default property descriptor. */
			handleException(exception);
			aDescriptor = new java.beans.PropertyDescriptor("importDirectory"
			, getBeanClass());
		};
		aDescriptor.setBound(true);
		/* aDescriptor.setConstrained(false); */
		/* aDescriptor.setDisplayName("importDirectory"); */
		/* aDescriptor.setShortDescription("importDirectory"); */
		/* aDescriptor.setExpert(false); */
		/* aDescriptor.setHidden(false); */
		/* aDescriptor.setValue("preferred", new Boolean(false)); */
		/* aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true)); */
	} catch (Throwable exception) {
		handleException(exception);
	};
	return aDescriptor;
}
/**
 * Gets the language property descriptor.
 * @return java.beans.PropertyDescriptor
 */
public java.beans.PropertyDescriptor languagePropertyDescriptor() {
	java.beans.PropertyDescriptor aDescriptor = null;
	try {
		try {
			/* Using methods via getMethod is the faster way to create the language property descriptor. */
			java.lang.reflect.Method aGetMethod = null;
			try {
				/* Attempt to find the method using getMethod with parameter types. */
				java.lang.Class aGetMethodParameterTypes[] = {};
				aGetMethod = getBeanClass().getMethod("getLanguage", aGetMethodParameterTypes);
			} catch (Throwable exception) {
				/* Since getMethod failed, call findMethod. */
				handleException(exception);
				aGetMethod = findMethod(getBeanClass(), "getLanguage", 0);
			};
			java.lang.reflect.Method aSetMethod = null;
			try {
				/* Attempt to find the method using getMethod with parameter types. */
				java.lang.Class aSetMethodParameterTypes[] = {
					java.lang.String.class
				};
				aSetMethod = getBeanClass().getMethod("setLanguage", aSetMethodParameterTypes);
			} catch (Throwable exception) {
				/* Since getMethod failed, call findMethod. */
				handleException(exception);
				aSetMethod = findMethod(getBeanClass(), "setLanguage", 1);
			};
			aDescriptor = new java.beans.PropertyDescriptor("language"
			, aGetMethod, aSetMethod);
		} catch (Throwable exception) {
			/* Since we failed using methods, try creating a default property descriptor. */
			handleException(exception);
			aDescriptor = new java.beans.PropertyDescriptor("language"
			, getBeanClass());
		};
		aDescriptor.setBound(true);
		/* aDescriptor.setConstrained(false); */
		/* aDescriptor.setDisplayName("language"); */
		/* aDescriptor.setShortDescription("language"); */
		/* aDescriptor.setExpert(false); */
		/* aDescriptor.setHidden(false); */
		/* aDescriptor.setValue("preferred", new Boolean(false)); */
		/* aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true)); */
	} catch (Throwable exception) {
		handleException(exception);
	};
	return aDescriptor;
}
/**
 * Gets the showLogView property descriptor.
 * @return java.beans.PropertyDescriptor
 */
public java.beans.PropertyDescriptor showLogViewPropertyDescriptor() {
	java.beans.PropertyDescriptor aDescriptor = null;
	try {
		try {
			/* Using methods via getMethod is the faster way to create the showLogView property descriptor. */
			java.lang.reflect.Method aGetMethod = null;
			try {
				/* Attempt to find the method using getMethod with parameter types. */
				java.lang.Class aGetMethodParameterTypes[] = {};
				aGetMethod = getBeanClass().getMethod("getShowLogView", aGetMethodParameterTypes);
			} catch (Throwable exception) {
				/* Since getMethod failed, call findMethod. */
				handleException(exception);
				aGetMethod = findMethod(getBeanClass(), "getShowLogView", 0);
			};
			java.lang.reflect.Method aSetMethod = null;
			try {
				/* Attempt to find the method using getMethod with parameter types. */
				java.lang.Class aSetMethodParameterTypes[] = {
					java.lang.Boolean.class
				};
				aSetMethod = getBeanClass().getMethod("setShowLogView", aSetMethodParameterTypes);
			} catch (Throwable exception) {
				/* Since getMethod failed, call findMethod. */
				handleException(exception);
				aSetMethod = findMethod(getBeanClass(), "setShowLogView", 1);
			};
			aDescriptor = new java.beans.PropertyDescriptor("showLogView"
			, aGetMethod, aSetMethod);
		} catch (Throwable exception) {
			/* Since we failed using methods, try creating a default property descriptor. */
			handleException(exception);
			aDescriptor = new java.beans.PropertyDescriptor("showLogView"
			, getBeanClass());
		};
		aDescriptor.setBound(true);
		/* aDescriptor.setConstrained(false); */
		/* aDescriptor.setDisplayName("showLogView"); */
		/* aDescriptor.setShortDescription("showLogView"); */
		/* aDescriptor.setExpert(false); */
		/* aDescriptor.setHidden(false); */
		/* aDescriptor.setValue("preferred", new Boolean(false)); */
		/* aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true)); */
	} catch (Throwable exception) {
		handleException(exception);
	};
	return aDescriptor;
}
/**
 * Gets the showStatusBar property descriptor.
 * @return java.beans.PropertyDescriptor
 */
public java.beans.PropertyDescriptor showStatusBarPropertyDescriptor() {
	java.beans.PropertyDescriptor aDescriptor = null;
	try {
		try {
			/* Using methods via getMethod is the faster way to create the showStatusBar property descriptor. */
			java.lang.reflect.Method aGetMethod = null;
			try {
				/* Attempt to find the method using getMethod with parameter types. */
				java.lang.Class aGetMethodParameterTypes[] = {};
				aGetMethod = getBeanClass().getMethod("getShowStatusBar", aGetMethodParameterTypes);
			} catch (Throwable exception) {
				/* Since getMethod failed, call findMethod. */
				handleException(exception);
				aGetMethod = findMethod(getBeanClass(), "getShowStatusBar", 0);
			};
			java.lang.reflect.Method aSetMethod = null;
			try {
				/* Attempt to find the method using getMethod with parameter types. */
				java.lang.Class aSetMethodParameterTypes[] = {
					java.lang.Boolean.class
				};
				aSetMethod = getBeanClass().getMethod("setShowStatusBar", aSetMethodParameterTypes);
			} catch (Throwable exception) {
				/* Since getMethod failed, call findMethod. */
				handleException(exception);
				aSetMethod = findMethod(getBeanClass(), "setShowStatusBar", 1);
			};
			aDescriptor = new java.beans.PropertyDescriptor("showStatusBar"
			, aGetMethod, aSetMethod);
		} catch (Throwable exception) {
			/* Since we failed using methods, try creating a default property descriptor. */
			handleException(exception);
			aDescriptor = new java.beans.PropertyDescriptor("showStatusBar"
			, getBeanClass());
		};
		aDescriptor.setBound(true);
		/* aDescriptor.setConstrained(false); */
		/* aDescriptor.setDisplayName("showStatusBar"); */
		/* aDescriptor.setShortDescription("showStatusBar"); */
		/* aDescriptor.setExpert(false); */
		/* aDescriptor.setHidden(false); */
		/* aDescriptor.setValue("preferred", new Boolean(false)); */
		/* aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true)); */
	} catch (Throwable exception) {
		handleException(exception);
	};
	return aDescriptor;
}
/**
 * Gets the showToolBar property descriptor.
 * @return java.beans.PropertyDescriptor
 */
public java.beans.PropertyDescriptor showToolBarPropertyDescriptor() {
	java.beans.PropertyDescriptor aDescriptor = null;
	try {
		try {
			/* Using methods via getMethod is the faster way to create the showToolBar property descriptor. */
			java.lang.reflect.Method aGetMethod = null;
			try {
				/* Attempt to find the method using getMethod with parameter types. */
				java.lang.Class aGetMethodParameterTypes[] = {};
				aGetMethod = getBeanClass().getMethod("getShowToolBar", aGetMethodParameterTypes);
			} catch (Throwable exception) {
				/* Since getMethod failed, call findMethod. */
				handleException(exception);
				aGetMethod = findMethod(getBeanClass(), "getShowToolBar", 0);
			};
			java.lang.reflect.Method aSetMethod = null;
			try {
				/* Attempt to find the method using getMethod with parameter types. */
				java.lang.Class aSetMethodParameterTypes[] = {
					java.lang.Boolean.class
				};
				aSetMethod = getBeanClass().getMethod("setShowToolBar", aSetMethodParameterTypes);
			} catch (Throwable exception) {
				/* Since getMethod failed, call findMethod. */
				handleException(exception);
				aSetMethod = findMethod(getBeanClass(), "setShowToolBar", 1);
			};
			aDescriptor = new java.beans.PropertyDescriptor("showToolBar"
			, aGetMethod, aSetMethod);
		} catch (Throwable exception) {
			/* Since we failed using methods, try creating a default property descriptor. */
			handleException(exception);
			aDescriptor = new java.beans.PropertyDescriptor("showToolBar"
			, getBeanClass());
		};
		aDescriptor.setBound(true);
		/* aDescriptor.setConstrained(false); */
		/* aDescriptor.setDisplayName("showToolBar"); */
		/* aDescriptor.setShortDescription("showToolBar"); */
		/* aDescriptor.setExpert(false); */
		/* aDescriptor.setHidden(false); */
		/* aDescriptor.setValue("preferred", new Boolean(false)); */
		/* aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true)); */
	} catch (Throwable exception) {
		handleException(exception);
	};
	return aDescriptor;
}
/**
 * Gets the workingDirectory property descriptor.
 * @return java.beans.PropertyDescriptor
 */
public java.beans.PropertyDescriptor workingDirectoryPropertyDescriptor() {
	java.beans.PropertyDescriptor aDescriptor = null;
	try {
		try {
			/* Using methods via getMethod is the faster way to create the workingDirectory property descriptor. */
			java.lang.reflect.Method aGetMethod = null;
			try {
				/* Attempt to find the method using getMethod with parameter types. */
				java.lang.Class aGetMethodParameterTypes[] = {};
				aGetMethod = getBeanClass().getMethod("getWorkingDirectory", aGetMethodParameterTypes);
			} catch (Throwable exception) {
				/* Since getMethod failed, call findMethod. */
				handleException(exception);
				aGetMethod = findMethod(getBeanClass(), "getWorkingDirectory", 0);
			};
			java.lang.reflect.Method aSetMethod = null;
			try {
				/* Attempt to find the method using getMethod with parameter types. */
				java.lang.Class aSetMethodParameterTypes[] = {
					java.lang.String.class
				};
				aSetMethod = getBeanClass().getMethod("setWorkingDirectory", aSetMethodParameterTypes);
			} catch (Throwable exception) {
				/* Since getMethod failed, call findMethod. */
				handleException(exception);
				aSetMethod = findMethod(getBeanClass(), "setWorkingDirectory", 1);
			};
			aDescriptor = new java.beans.PropertyDescriptor("workingDirectory"
			, aGetMethod, aSetMethod);
		} catch (Throwable exception) {
			/* Since we failed using methods, try creating a default property descriptor. */
			handleException(exception);
			aDescriptor = new java.beans.PropertyDescriptor("workingDirectory"
			, getBeanClass());
		};
		aDescriptor.setBound(true);
		/* aDescriptor.setConstrained(false); */
		/* aDescriptor.setDisplayName("workingDirectory"); */
		/* aDescriptor.setShortDescription("workingDirectory"); */
		/* aDescriptor.setExpert(false); */
		/* aDescriptor.setHidden(false); */
		/* aDescriptor.setValue("preferred", new Boolean(false)); */
		/* aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true)); */
	} catch (Throwable exception) {
		handleException(exception);
	};
	return aDescriptor;
}
=======
 *
 * @author: Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:40:07 $
 */
public class UserSettingsBeanInfo extends java.beans.SimpleBeanInfo {
	/**
	 * Gets the backgroundColor property descriptor.
	 * 
	 * @return java.beans.PropertyDescriptor
	 */
	public java.beans.PropertyDescriptor backgroundColorPropertyDescriptor() {
		java.beans.PropertyDescriptor aDescriptor = null;
		try {
			try {
				/*
				 * Using methods via getMethod is the faster way to create the
				 * backgroundColor property descriptor.
				 */
				java.lang.reflect.Method aGetMethod = null;
				try {
					/*
					 * Attempt to find the method using getMethod with parameter
					 * types.
					 */
					java.lang.Class aGetMethodParameterTypes[] = {};
					aGetMethod = getBeanClass().getMethod("getBackgroundColor", aGetMethodParameterTypes);
				} catch (Throwable exception) {
					/* Since getMethod failed, call findMethod. */
					handleException(exception);
					aGetMethod = findMethod(getBeanClass(), "getBackgroundColor", 0);
				}
				;
				java.lang.reflect.Method aSetMethod = null;
				try {
					/*
					 * Attempt to find the method using getMethod with parameter
					 * types.
					 */
					java.lang.Class aSetMethodParameterTypes[] = { java.awt.Color.class };
					aSetMethod = getBeanClass().getMethod("setBackgroundColor", aSetMethodParameterTypes);
				} catch (Throwable exception) {
					/* Since getMethod failed, call findMethod. */
					handleException(exception);
					aSetMethod = findMethod(getBeanClass(), "setBackgroundColor", 1);
				}
				;
				aDescriptor = new java.beans.PropertyDescriptor("backgroundColor", aGetMethod, aSetMethod);
			} catch (Throwable exception) {
				/*
				 * Since we failed using methods, try creating a default
				 * property descriptor.
				 */
				handleException(exception);
				aDescriptor = new java.beans.PropertyDescriptor("backgroundColor", getBeanClass());
			}
			;
			aDescriptor.setBound(true);
			/* aDescriptor.setConstrained(false); */
			/* aDescriptor.setDisplayName("backgroundColor"); */
			/* aDescriptor.setShortDescription("backgroundColor"); */
			/* aDescriptor.setExpert(false); */
			/* aDescriptor.setHidden(false); */
			/* aDescriptor.setValue("preferred", new Boolean(false)); */
			/*
			 * aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true));
			 */
		} catch (Throwable exception) {
			handleException(exception);
		}
		;
		return aDescriptor;
	}

	/**
	 * Gets the diagramHeight property descriptor.
	 * 
	 * @return java.beans.PropertyDescriptor
	 */
	public java.beans.PropertyDescriptor diagramHeightPropertyDescriptor() {
		java.beans.PropertyDescriptor aDescriptor = null;
		try {
			try {
				/*
				 * Using methods via getMethod is the faster way to create the
				 * diagramHeight property descriptor.
				 */
				java.lang.reflect.Method aGetMethod = null;
				try {
					/*
					 * Attempt to find the method using getMethod with parameter
					 * types.
					 */
					java.lang.Class aGetMethodParameterTypes[] = {};
					aGetMethod = getBeanClass().getMethod("getDiagramHeight", aGetMethodParameterTypes);
				} catch (Throwable exception) {
					/* Since getMethod failed, call findMethod. */
					handleException(exception);
					aGetMethod = findMethod(getBeanClass(), "getDiagramHeight", 0);
				}
				;
				java.lang.reflect.Method aSetMethod = null;
				try {
					/*
					 * Attempt to find the method using getMethod with parameter
					 * types.
					 */
					java.lang.Class aSetMethodParameterTypes[] = { java.lang.Integer.class };
					aSetMethod = getBeanClass().getMethod("setDiagramHeight", aSetMethodParameterTypes);
				} catch (Throwable exception) {
					/* Since getMethod failed, call findMethod. */
					handleException(exception);
					aSetMethod = findMethod(getBeanClass(), "setDiagramHeight", 1);
				}
				;
				aDescriptor = new java.beans.PropertyDescriptor("diagramHeight", aGetMethod, aSetMethod);
			} catch (Throwable exception) {
				/*
				 * Since we failed using methods, try creating a default
				 * property descriptor.
				 */
				handleException(exception);
				aDescriptor = new java.beans.PropertyDescriptor("diagramHeight", getBeanClass());
			}
			;
			aDescriptor.setBound(true);
			/* aDescriptor.setConstrained(false); */
			/* aDescriptor.setDisplayName("diagramHeight"); */
			/* aDescriptor.setShortDescription("diagramHeight"); */
			/* aDescriptor.setExpert(false); */
			/* aDescriptor.setHidden(false); */
			/* aDescriptor.setValue("preferred", new Boolean(false)); */
			/*
			 * aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true));
			 */
		} catch (Throwable exception) {
			handleException(exception);
		}
		;
		return aDescriptor;
	}

	/**
	 * Gets the diagramWidth property descriptor.
	 * 
	 * @return java.beans.PropertyDescriptor
	 */
	public java.beans.PropertyDescriptor diagramWidthPropertyDescriptor() {
		java.beans.PropertyDescriptor aDescriptor = null;
		try {
			try {
				/*
				 * Using methods via getMethod is the faster way to create the
				 * diagramWidth property descriptor.
				 */
				java.lang.reflect.Method aGetMethod = null;
				try {
					/*
					 * Attempt to find the method using getMethod with parameter
					 * types.
					 */
					java.lang.Class aGetMethodParameterTypes[] = {};
					aGetMethod = getBeanClass().getMethod("getDiagramWidth", aGetMethodParameterTypes);
				} catch (Throwable exception) {
					/* Since getMethod failed, call findMethod. */
					handleException(exception);
					aGetMethod = findMethod(getBeanClass(), "getDiagramWidth", 0);
				}
				;
				java.lang.reflect.Method aSetMethod = null;
				try {
					/*
					 * Attempt to find the method using getMethod with parameter
					 * types.
					 */
					java.lang.Class aSetMethodParameterTypes[] = { java.lang.Integer.class };
					aSetMethod = getBeanClass().getMethod("setDiagramWidth", aSetMethodParameterTypes);
				} catch (Throwable exception) {
					/* Since getMethod failed, call findMethod. */
					handleException(exception);
					aSetMethod = findMethod(getBeanClass(), "setDiagramWidth", 1);
				}
				;
				aDescriptor = new java.beans.PropertyDescriptor("diagramWidth", aGetMethod, aSetMethod);
			} catch (Throwable exception) {
				/*
				 * Since we failed using methods, try creating a default
				 * property descriptor.
				 */
				handleException(exception);
				aDescriptor = new java.beans.PropertyDescriptor("diagramWidth", getBeanClass());
			}
			;
			aDescriptor.setBound(true);
			/* aDescriptor.setConstrained(false); */
			/* aDescriptor.setDisplayName("diagramWidth"); */
			/* aDescriptor.setShortDescription("diagramWidth"); */
			/* aDescriptor.setExpert(false); */
			/* aDescriptor.setHidden(false); */
			/* aDescriptor.setValue("preferred", new Boolean(false)); */
			/*
			 * aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true));
			 */
		} catch (Throwable exception) {
			handleException(exception);
		}
		;
		return aDescriptor;
	}

	/**
	 * Find the method by comparing (name & parameter size) against the methods
	 * in the class.
	 * 
	 * @return java.lang.reflect.Method
	 * @param aClass
	 *            java.lang.Class
	 * @param methodName
	 *            java.lang.String
	 * @param parameterCount
	 *            int
	 */
	public static java.lang.reflect.Method findMethod(java.lang.Class aClass, java.lang.String methodName,
			int parameterCount) {
		try {
			/*
			 * Since this method attempts to find a method by getting all
			 * methods from the class, this method should only be called if
			 * getMethod cannot find the method.
			 */
			java.lang.reflect.Method methods[] = aClass.getMethods();
			for (int index = 0; index < methods.length; index++) {
				java.lang.reflect.Method method = methods[index];
				if ((method.getParameterTypes().length == parameterCount) && (method.getName().equals(methodName))) {
					return method;
				}
			}
		} catch (java.lang.Throwable exception) {
			return null;
		}
		return null;
	}

	/**
	 * Gets the font property descriptor.
	 * 
	 * @return java.beans.PropertyDescriptor
	 */
	public java.beans.PropertyDescriptor fontPropertyDescriptor() {
		java.beans.PropertyDescriptor aDescriptor = null;
		try {
			try {
				/*
				 * Using methods via getMethod is the faster way to create the
				 * font property descriptor.
				 */
				java.lang.reflect.Method aGetMethod = null;
				try {
					/*
					 * Attempt to find the method using getMethod with parameter
					 * types.
					 */
					java.lang.Class aGetMethodParameterTypes[] = {};
					aGetMethod = getBeanClass().getMethod("getFont", aGetMethodParameterTypes);
				} catch (Throwable exception) {
					/* Since getMethod failed, call findMethod. */
					handleException(exception);
					aGetMethod = findMethod(getBeanClass(), "getFont", 0);
				}
				;
				java.lang.reflect.Method aSetMethod = null;
				try {
					/*
					 * Attempt to find the method using getMethod with parameter
					 * types.
					 */
					java.lang.Class aSetMethodParameterTypes[] = { java.lang.String.class };
					aSetMethod = getBeanClass().getMethod("setFont", aSetMethodParameterTypes);
				} catch (Throwable exception) {
					/* Since getMethod failed, call findMethod. */
					handleException(exception);
					aSetMethod = findMethod(getBeanClass(), "setFont", 1);
				}
				;
				aDescriptor = new java.beans.PropertyDescriptor("font", aGetMethod, aSetMethod);
			} catch (Throwable exception) {
				/*
				 * Since we failed using methods, try creating a default
				 * property descriptor.
				 */
				handleException(exception);
				aDescriptor = new java.beans.PropertyDescriptor("font", getBeanClass());
			}
			;
			aDescriptor.setBound(true);
			/* aDescriptor.setConstrained(false); */
			/* aDescriptor.setDisplayName("font"); */
			/* aDescriptor.setShortDescription("font"); */
			/* aDescriptor.setExpert(false); */
			/* aDescriptor.setHidden(false); */
			/* aDescriptor.setValue("preferred", new Boolean(false)); */
			/*
			 * aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true));
			 */
		} catch (Throwable exception) {
			handleException(exception);
		}
		;
		return aDescriptor;
	}

	/**
	 * Gets the foregroundColor property descriptor.
	 * 
	 * @return java.beans.PropertyDescriptor
	 */
	public java.beans.PropertyDescriptor foregroundColorPropertyDescriptor() {
		java.beans.PropertyDescriptor aDescriptor = null;
		try {
			try {
				/*
				 * Using methods via getMethod is the faster way to create the
				 * foregroundColor property descriptor.
				 */
				java.lang.reflect.Method aGetMethod = null;
				try {
					/*
					 * Attempt to find the method using getMethod with parameter
					 * types.
					 */
					java.lang.Class aGetMethodParameterTypes[] = {};
					aGetMethod = getBeanClass().getMethod("getForegroundColor", aGetMethodParameterTypes);
				} catch (Throwable exception) {
					/* Since getMethod failed, call findMethod. */
					handleException(exception);
					aGetMethod = findMethod(getBeanClass(), "getForegroundColor", 0);
				}
				;
				java.lang.reflect.Method aSetMethod = null;
				try {
					/*
					 * Attempt to find the method using getMethod with parameter
					 * types.
					 */
					java.lang.Class aSetMethodParameterTypes[] = { java.awt.Color.class };
					aSetMethod = getBeanClass().getMethod("setForegroundColor", aSetMethodParameterTypes);
				} catch (Throwable exception) {
					/* Since getMethod failed, call findMethod. */
					handleException(exception);
					aSetMethod = findMethod(getBeanClass(), "setForegroundColor", 1);
				}
				;
				aDescriptor = new java.beans.PropertyDescriptor("foregroundColor", aGetMethod, aSetMethod);
			} catch (Throwable exception) {
				/*
				 * Since we failed using methods, try creating a default
				 * property descriptor.
				 */
				handleException(exception);
				aDescriptor = new java.beans.PropertyDescriptor("foregroundColor", getBeanClass());
			}
			;
			aDescriptor.setBound(true);
			/* aDescriptor.setConstrained(false); */
			/* aDescriptor.setDisplayName("foregroundColor"); */
			/* aDescriptor.setShortDescription("foregroundColor"); */
			/* aDescriptor.setExpert(false); */
			/* aDescriptor.setHidden(false); */
			/* aDescriptor.setValue("preferred", new Boolean(false)); */
			/*
			 * aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true));
			 */
		} catch (Throwable exception) {
			handleException(exception);
		}
		;
		return aDescriptor;
	}

	/**
	 * Returns the BeanInfo of the superclass of this bean to inherit its
	 * features.
	 * 
	 * @return java.beans.BeanInfo[]
	 */
	public java.beans.BeanInfo[] getAdditionalBeanInfo() {
		java.lang.Class superClass;
		java.beans.BeanInfo superBeanInfo = null;

		try {
			superClass = getBeanDescriptor().getBeanClass().getSuperclass();
		} catch (java.lang.Throwable exception) {
			return null;
		}

		try {
			superBeanInfo = java.beans.Introspector.getBeanInfo(superClass);
		} catch (java.beans.IntrospectionException ie) {
		}

		if (superBeanInfo != null) {
			java.beans.BeanInfo[] ret = new java.beans.BeanInfo[1];
			ret[0] = superBeanInfo;
			return ret;
		}
		return null;
	}

	/**
	 * Gets the bean class.
	 * 
	 * @return java.lang.Class
	 */
	public static java.lang.Class getBeanClass() {
		return ch.ehi.umleditor.application.UserSettings.class;
	}

	/**
	 * Gets the bean class name.
	 * 
	 * @return java.lang.String
	 */
	public static java.lang.String getBeanClassName() {
		return "ch.ehi.umleditor.application.UserSettings";
	}

	public java.beans.BeanDescriptor getBeanDescriptor() {
		java.beans.BeanDescriptor aDescriptor = null;
		try {
			/* Create and return the UserSettingsBeanInfo bean descriptor. */
			aDescriptor = new java.beans.BeanDescriptor(ch.ehi.umleditor.application.UserSettings.class);
			/* aDescriptor.setExpert(false); */
			/* aDescriptor.setHidden(false); */
			/* aDescriptor.setValue("hidden-state", Boolean.FALSE); */
		} catch (Throwable exception) {
		}
		;
		return aDescriptor;
	}

	/**
	 * Return the event set descriptors for this bean.
	 * 
	 * @return java.beans.EventSetDescriptor[]
	 */
	public java.beans.EventSetDescriptor[] getEventSetDescriptors() {
		try {
			java.beans.EventSetDescriptor aDescriptorList[] = {};
			return aDescriptorList;
		} catch (Throwable exception) {
			handleException(exception);
		}
		;
		return null;
	}

	/**
	 * Return the method descriptors for this bean.
	 * 
	 * @return java.beans.MethodDescriptor[]
	 */
	public java.beans.MethodDescriptor[] getMethodDescriptors() {
		try {
			java.beans.MethodDescriptor aDescriptorList[] = {};
			return aDescriptorList;
		} catch (Throwable exception) {
			handleException(exception);
		}
		;
		return null;
	}

	/**
	 * Return the property descriptors for this bean.
	 * 
	 * @return java.beans.PropertyDescriptor[]
	 */
	public java.beans.PropertyDescriptor[] getPropertyDescriptors() {
		try {
			java.beans.PropertyDescriptor aDescriptorList[] = { backgroundColorPropertyDescriptor(),
					diagramHeightPropertyDescriptor(), diagramWidthPropertyDescriptor(), fontPropertyDescriptor(),
					foregroundColorPropertyDescriptor(), importDirectoryPropertyDescriptor(),
					languagePropertyDescriptor(), showLogViewPropertyDescriptor(), showStatusBarPropertyDescriptor(),
					showToolBarPropertyDescriptor(), workingDirectoryPropertyDescriptor() };
			return aDescriptorList;
		} catch (Throwable exception) {
			handleException(exception);
		}
		;
		return null;
	}

	/**
	 * Called whenever the bean information class throws an exception.
	 * 
	 * @param exception
	 *            java.lang.Throwable
	 */
	private void handleException(java.lang.Throwable exception) {

		/*
		 * Uncomment the following lines to print uncaught exceptions to stdout
		 */
		// System.out.println("--------- UNCAUGHT EXCEPTION ---------");
		// exception.printStackTrace(System.out);
	}

	/**
	 * Gets the importDirectory property descriptor.
	 * 
	 * @return java.beans.PropertyDescriptor
	 */
	public java.beans.PropertyDescriptor importDirectoryPropertyDescriptor() {
		java.beans.PropertyDescriptor aDescriptor = null;
		try {
			try {
				/*
				 * Using methods via getMethod is the faster way to create the
				 * importDirectory property descriptor.
				 */
				java.lang.reflect.Method aGetMethod = null;
				try {
					/*
					 * Attempt to find the method using getMethod with parameter
					 * types.
					 */
					java.lang.Class aGetMethodParameterTypes[] = {};
					aGetMethod = getBeanClass().getMethod("getImportDirectory", aGetMethodParameterTypes);
				} catch (Throwable exception) {
					/* Since getMethod failed, call findMethod. */
					handleException(exception);
					aGetMethod = findMethod(getBeanClass(), "getImportDirectory", 0);
				}
				;
				java.lang.reflect.Method aSetMethod = null;
				try {
					/*
					 * Attempt to find the method using getMethod with parameter
					 * types.
					 */
					java.lang.Class aSetMethodParameterTypes[] = { java.lang.String.class };
					aSetMethod = getBeanClass().getMethod("setImportDirectory", aSetMethodParameterTypes);
				} catch (Throwable exception) {
					/* Since getMethod failed, call findMethod. */
					handleException(exception);
					aSetMethod = findMethod(getBeanClass(), "setImportDirectory", 1);
				}
				;
				aDescriptor = new java.beans.PropertyDescriptor("importDirectory", aGetMethod, aSetMethod);
			} catch (Throwable exception) {
				/*
				 * Since we failed using methods, try creating a default
				 * property descriptor.
				 */
				handleException(exception);
				aDescriptor = new java.beans.PropertyDescriptor("importDirectory", getBeanClass());
			}
			;
			aDescriptor.setBound(true);
			/* aDescriptor.setConstrained(false); */
			/* aDescriptor.setDisplayName("importDirectory"); */
			/* aDescriptor.setShortDescription("importDirectory"); */
			/* aDescriptor.setExpert(false); */
			/* aDescriptor.setHidden(false); */
			/* aDescriptor.setValue("preferred", new Boolean(false)); */
			/*
			 * aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true));
			 */
		} catch (Throwable exception) {
			handleException(exception);
		}
		;
		return aDescriptor;
	}

	/**
	 * Gets the language property descriptor.
	 * 
	 * @return java.beans.PropertyDescriptor
	 */
	public java.beans.PropertyDescriptor languagePropertyDescriptor() {
		java.beans.PropertyDescriptor aDescriptor = null;
		try {
			try {
				/*
				 * Using methods via getMethod is the faster way to create the
				 * language property descriptor.
				 */
				java.lang.reflect.Method aGetMethod = null;
				try {
					/*
					 * Attempt to find the method using getMethod with parameter
					 * types.
					 */
					java.lang.Class aGetMethodParameterTypes[] = {};
					aGetMethod = getBeanClass().getMethod("getLanguage", aGetMethodParameterTypes);
				} catch (Throwable exception) {
					/* Since getMethod failed, call findMethod. */
					handleException(exception);
					aGetMethod = findMethod(getBeanClass(), "getLanguage", 0);
				}
				;
				java.lang.reflect.Method aSetMethod = null;
				try {
					/*
					 * Attempt to find the method using getMethod with parameter
					 * types.
					 */
					java.lang.Class aSetMethodParameterTypes[] = { java.lang.String.class };
					aSetMethod = getBeanClass().getMethod("setLanguage", aSetMethodParameterTypes);
				} catch (Throwable exception) {
					/* Since getMethod failed, call findMethod. */
					handleException(exception);
					aSetMethod = findMethod(getBeanClass(), "setLanguage", 1);
				}
				;
				aDescriptor = new java.beans.PropertyDescriptor("language", aGetMethod, aSetMethod);
			} catch (Throwable exception) {
				/*
				 * Since we failed using methods, try creating a default
				 * property descriptor.
				 */
				handleException(exception);
				aDescriptor = new java.beans.PropertyDescriptor("language", getBeanClass());
			}
			;
			aDescriptor.setBound(true);
			/* aDescriptor.setConstrained(false); */
			/* aDescriptor.setDisplayName("language"); */
			/* aDescriptor.setShortDescription("language"); */
			/* aDescriptor.setExpert(false); */
			/* aDescriptor.setHidden(false); */
			/* aDescriptor.setValue("preferred", new Boolean(false)); */
			/*
			 * aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true));
			 */
		} catch (Throwable exception) {
			handleException(exception);
		}
		;
		return aDescriptor;
	}

	/**
	 * Gets the showLogView property descriptor.
	 * 
	 * @return java.beans.PropertyDescriptor
	 */
	public java.beans.PropertyDescriptor showLogViewPropertyDescriptor() {
		java.beans.PropertyDescriptor aDescriptor = null;
		try {
			try {
				/*
				 * Using methods via getMethod is the faster way to create the
				 * showLogView property descriptor.
				 */
				java.lang.reflect.Method aGetMethod = null;
				try {
					/*
					 * Attempt to find the method using getMethod with parameter
					 * types.
					 */
					java.lang.Class aGetMethodParameterTypes[] = {};
					aGetMethod = getBeanClass().getMethod("getShowLogView", aGetMethodParameterTypes);
				} catch (Throwable exception) {
					/* Since getMethod failed, call findMethod. */
					handleException(exception);
					aGetMethod = findMethod(getBeanClass(), "getShowLogView", 0);
				}
				;
				java.lang.reflect.Method aSetMethod = null;
				try {
					/*
					 * Attempt to find the method using getMethod with parameter
					 * types.
					 */
					java.lang.Class aSetMethodParameterTypes[] = { java.lang.Boolean.class };
					aSetMethod = getBeanClass().getMethod("setShowLogView", aSetMethodParameterTypes);
				} catch (Throwable exception) {
					/* Since getMethod failed, call findMethod. */
					handleException(exception);
					aSetMethod = findMethod(getBeanClass(), "setShowLogView", 1);
				}
				;
				aDescriptor = new java.beans.PropertyDescriptor("showLogView", aGetMethod, aSetMethod);
			} catch (Throwable exception) {
				/*
				 * Since we failed using methods, try creating a default
				 * property descriptor.
				 */
				handleException(exception);
				aDescriptor = new java.beans.PropertyDescriptor("showLogView", getBeanClass());
			}
			;
			aDescriptor.setBound(true);
			/* aDescriptor.setConstrained(false); */
			/* aDescriptor.setDisplayName("showLogView"); */
			/* aDescriptor.setShortDescription("showLogView"); */
			/* aDescriptor.setExpert(false); */
			/* aDescriptor.setHidden(false); */
			/* aDescriptor.setValue("preferred", new Boolean(false)); */
			/*
			 * aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true));
			 */
		} catch (Throwable exception) {
			handleException(exception);
		}
		;
		return aDescriptor;
	}

	/**
	 * Gets the showStatusBar property descriptor.
	 * 
	 * @return java.beans.PropertyDescriptor
	 */
	public java.beans.PropertyDescriptor showStatusBarPropertyDescriptor() {
		java.beans.PropertyDescriptor aDescriptor = null;
		try {
			try {
				/*
				 * Using methods via getMethod is the faster way to create the
				 * showStatusBar property descriptor.
				 */
				java.lang.reflect.Method aGetMethod = null;
				try {
					/*
					 * Attempt to find the method using getMethod with parameter
					 * types.
					 */
					java.lang.Class aGetMethodParameterTypes[] = {};
					aGetMethod = getBeanClass().getMethod("getShowStatusBar", aGetMethodParameterTypes);
				} catch (Throwable exception) {
					/* Since getMethod failed, call findMethod. */
					handleException(exception);
					aGetMethod = findMethod(getBeanClass(), "getShowStatusBar", 0);
				}
				;
				java.lang.reflect.Method aSetMethod = null;
				try {
					/*
					 * Attempt to find the method using getMethod with parameter
					 * types.
					 */
					java.lang.Class aSetMethodParameterTypes[] = { java.lang.Boolean.class };
					aSetMethod = getBeanClass().getMethod("setShowStatusBar", aSetMethodParameterTypes);
				} catch (Throwable exception) {
					/* Since getMethod failed, call findMethod. */
					handleException(exception);
					aSetMethod = findMethod(getBeanClass(), "setShowStatusBar", 1);
				}
				;
				aDescriptor = new java.beans.PropertyDescriptor("showStatusBar", aGetMethod, aSetMethod);
			} catch (Throwable exception) {
				/*
				 * Since we failed using methods, try creating a default
				 * property descriptor.
				 */
				handleException(exception);
				aDescriptor = new java.beans.PropertyDescriptor("showStatusBar", getBeanClass());
			}
			;
			aDescriptor.setBound(true);
			/* aDescriptor.setConstrained(false); */
			/* aDescriptor.setDisplayName("showStatusBar"); */
			/* aDescriptor.setShortDescription("showStatusBar"); */
			/* aDescriptor.setExpert(false); */
			/* aDescriptor.setHidden(false); */
			/* aDescriptor.setValue("preferred", new Boolean(false)); */
			/*
			 * aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true));
			 */
		} catch (Throwable exception) {
			handleException(exception);
		}
		;
		return aDescriptor;
	}

	/**
	 * Gets the showToolBar property descriptor.
	 * 
	 * @return java.beans.PropertyDescriptor
	 */
	public java.beans.PropertyDescriptor showToolBarPropertyDescriptor() {
		java.beans.PropertyDescriptor aDescriptor = null;
		try {
			try {
				/*
				 * Using methods via getMethod is the faster way to create the
				 * showToolBar property descriptor.
				 */
				java.lang.reflect.Method aGetMethod = null;
				try {
					/*
					 * Attempt to find the method using getMethod with parameter
					 * types.
					 */
					java.lang.Class aGetMethodParameterTypes[] = {};
					aGetMethod = getBeanClass().getMethod("getShowToolBar", aGetMethodParameterTypes);
				} catch (Throwable exception) {
					/* Since getMethod failed, call findMethod. */
					handleException(exception);
					aGetMethod = findMethod(getBeanClass(), "getShowToolBar", 0);
				}
				;
				java.lang.reflect.Method aSetMethod = null;
				try {
					/*
					 * Attempt to find the method using getMethod with parameter
					 * types.
					 */
					java.lang.Class aSetMethodParameterTypes[] = { java.lang.Boolean.class };
					aSetMethod = getBeanClass().getMethod("setShowToolBar", aSetMethodParameterTypes);
				} catch (Throwable exception) {
					/* Since getMethod failed, call findMethod. */
					handleException(exception);
					aSetMethod = findMethod(getBeanClass(), "setShowToolBar", 1);
				}
				;
				aDescriptor = new java.beans.PropertyDescriptor("showToolBar", aGetMethod, aSetMethod);
			} catch (Throwable exception) {
				/*
				 * Since we failed using methods, try creating a default
				 * property descriptor.
				 */
				handleException(exception);
				aDescriptor = new java.beans.PropertyDescriptor("showToolBar", getBeanClass());
			}
			;
			aDescriptor.setBound(true);
			/* aDescriptor.setConstrained(false); */
			/* aDescriptor.setDisplayName("showToolBar"); */
			/* aDescriptor.setShortDescription("showToolBar"); */
			/* aDescriptor.setExpert(false); */
			/* aDescriptor.setHidden(false); */
			/* aDescriptor.setValue("preferred", new Boolean(false)); */
			/*
			 * aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true));
			 */
		} catch (Throwable exception) {
			handleException(exception);
		}
		;
		return aDescriptor;
	}

	/**
	 * Gets the workingDirectory property descriptor.
	 * 
	 * @return java.beans.PropertyDescriptor
	 */
	public java.beans.PropertyDescriptor workingDirectoryPropertyDescriptor() {
		java.beans.PropertyDescriptor aDescriptor = null;
		try {
			try {
				/*
				 * Using methods via getMethod is the faster way to create the
				 * workingDirectory property descriptor.
				 */
				java.lang.reflect.Method aGetMethod = null;
				try {
					/*
					 * Attempt to find the method using getMethod with parameter
					 * types.
					 */
					java.lang.Class aGetMethodParameterTypes[] = {};
					aGetMethod = getBeanClass().getMethod("getWorkingDirectory", aGetMethodParameterTypes);
				} catch (Throwable exception) {
					/* Since getMethod failed, call findMethod. */
					handleException(exception);
					aGetMethod = findMethod(getBeanClass(), "getWorkingDirectory", 0);
				}
				;
				java.lang.reflect.Method aSetMethod = null;
				try {
					/*
					 * Attempt to find the method using getMethod with parameter
					 * types.
					 */
					java.lang.Class aSetMethodParameterTypes[] = { java.lang.String.class };
					aSetMethod = getBeanClass().getMethod("setWorkingDirectory", aSetMethodParameterTypes);
				} catch (Throwable exception) {
					/* Since getMethod failed, call findMethod. */
					handleException(exception);
					aSetMethod = findMethod(getBeanClass(), "setWorkingDirectory", 1);
				}
				;
				aDescriptor = new java.beans.PropertyDescriptor("workingDirectory", aGetMethod, aSetMethod);
			} catch (Throwable exception) {
				/*
				 * Since we failed using methods, try creating a default
				 * property descriptor.
				 */
				handleException(exception);
				aDescriptor = new java.beans.PropertyDescriptor("workingDirectory", getBeanClass());
			}
			;
			aDescriptor.setBound(true);
			/* aDescriptor.setConstrained(false); */
			/* aDescriptor.setDisplayName("workingDirectory"); */
			/* aDescriptor.setShortDescription("workingDirectory"); */
			/* aDescriptor.setExpert(false); */
			/* aDescriptor.setHidden(false); */
			/* aDescriptor.setValue("preferred", new Boolean(false)); */
			/*
			 * aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true));
			 */
		} catch (Throwable exception) {
			handleException(exception);
		}
		;
		return aDescriptor;
	}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
}
