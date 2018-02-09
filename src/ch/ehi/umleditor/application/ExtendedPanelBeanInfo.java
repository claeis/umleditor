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
 * The bean information class for ch.ehi.umleditor.application.ExtendedPanel.
 *
 * @author: Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:38:52 $
 */
public class ExtendedPanelBeanInfo extends java.beans.SimpleBeanInfo {
	/**
	 * Gets the classifierExtension property descriptor.
	 * 
	 * @return java.beans.PropertyDescriptor
	 */
	public java.beans.PropertyDescriptor classifierExtensionPropertyDescriptor() {
		java.beans.PropertyDescriptor aDescriptor = null;
		try {
			try {
				/*
				 * Using methods via getMethod is the faster way to create the
				 * classifierExtension property descriptor.
				 */
				java.lang.reflect.Method aGetMethod = null;
				java.lang.reflect.Method aSetMethod = null;
				try {
					/*
					 * Attempt to find the method using getMethod with parameter
					 * types.
					 */
					java.lang.Class aSetMethodParameterTypes[] = {
							ch.ehi.uml1_4.foundation.core.GeneralizableElement.class };
					aSetMethod = getBeanClass().getMethod("setClassifierExtension", aSetMethodParameterTypes);
				} catch (Throwable exception) {
					/* Since getMethod failed, call findMethod. */
					handleException(exception);
					aSetMethod = findMethod(getBeanClass(), "setClassifierExtension", 1);
				}
				;
				aDescriptor = new java.beans.PropertyDescriptor("classifierExtension", aGetMethod, aSetMethod);
			} catch (Throwable exception) {
				/*
				 * Since we failed using methods, try creating a default
				 * property descriptor.
				 */
				handleException(exception);
				aDescriptor = new java.beans.PropertyDescriptor("classifierExtension", getBeanClass());
			}
			;
			aDescriptor.setBound(true);
			/* aDescriptor.setConstrained(false); */
			/* aDescriptor.setDisplayName("classifierExtension"); */
			/* aDescriptor.setShortDescription("classifierExtension"); */
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
	 * Gets the componentOrientation property descriptor.
	 * 
	 * @return java.beans.PropertyDescriptor
	 */
	public java.beans.PropertyDescriptor componentOrientationPropertyDescriptor() {
		java.beans.PropertyDescriptor aDescriptor = null;
		try {
			try {
				/*
				 * Using methods via getMethod is the faster way to create the
				 * componentOrientation property descriptor.
				 */
				java.lang.reflect.Method aGetMethod = null;
				try {
					/*
					 * Attempt to find the method using getMethod with parameter
					 * types.
					 */
					java.lang.Class aGetMethodParameterTypes[] = {};
					aGetMethod = getBeanClass().getMethod("getComponentOrientation", aGetMethodParameterTypes);
				} catch (Throwable exception) {
					/* Since getMethod failed, call findMethod. */
					handleException(exception);
					aGetMethod = findMethod(getBeanClass(), "getComponentOrientation", 0);
				}
				;
				java.lang.reflect.Method aSetMethod = null;
				try {
					/*
					 * Attempt to find the method using getMethod with parameter
					 * types.
					 */
					java.lang.Class aSetMethodParameterTypes[] = { java.awt.ComponentOrientation.class };
					aSetMethod = getBeanClass().getMethod("setComponentOrientation", aSetMethodParameterTypes);
				} catch (Throwable exception) {
					/* Since getMethod failed, call findMethod. */
					handleException(exception);
					aSetMethod = findMethod(getBeanClass(), "setComponentOrientation", 1);
				}
				;
				aDescriptor = new java.beans.PropertyDescriptor("componentOrientation", aGetMethod, aSetMethod);
			} catch (Throwable exception) {
				/*
				 * Since we failed using methods, try creating a default
				 * property descriptor.
				 */
				handleException(exception);
				aDescriptor = new java.beans.PropertyDescriptor("componentOrientation", getBeanClass());
			}
			;
			/* aDescriptor.setBound(false); */
			/* aDescriptor.setConstrained(false); */
			/* aDescriptor.setDisplayName("componentOrientation"); */
			/* aDescriptor.setShortDescription("componentOrientation"); */
			/* aDescriptor.setExpert(false); */
			/* aDescriptor.setHidden(false); */
			/* aDescriptor.setValue("preferred", new Boolean(false)); */
			/*
			 * aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true));
			 */
			aDescriptor.setValue("enumerationValues",
					new Object[] { "UNKNOWN", java.awt.ComponentOrientation.UNKNOWN,
							"java.awt.ComponentOrientation.UNKNOWN", "LEFT_TO_RIGHT",
							java.awt.ComponentOrientation.LEFT_TO_RIGHT, "java.awt.ComponentOrientation.LEFT_TO_RIGHT",
							"RIGHT_TO_LEFT", java.awt.ComponentOrientation.RIGHT_TO_LEFT,
							"java.awt.ComponentOrientation.RIGHT_TO_LEFT", });
		} catch (Throwable exception) {
			handleException(exception);
		}
		;
		return aDescriptor;
	}

	/**
	 * Gets the extension property descriptor.
	 * 
	 * @return java.beans.PropertyDescriptor
	 */
	public java.beans.PropertyDescriptor extensionPropertyDescriptor() {
		java.beans.PropertyDescriptor aDescriptor = null;
		try {
			try {
				/*
				 * Using methods via getMethod is the faster way to create the
				 * extension property descriptor.
				 */
				java.lang.reflect.Method aGetMethod = null;
				java.lang.reflect.Method aSetMethod = null;
				try {
					/*
					 * Attempt to find the method using getMethod with parameter
					 * types.
					 */
					java.lang.Class aSetMethodParameterTypes[] = {
							ch.ehi.uml1_4.foundation.core.GeneralizableElement.class };
					aSetMethod = getBeanClass().getMethod("setExtension", aSetMethodParameterTypes);
				} catch (Throwable exception) {
					/* Since getMethod failed, call findMethod. */
					handleException(exception);
					aSetMethod = findMethod(getBeanClass(), "setExtension", 1);
				}
				;
				aDescriptor = new java.beans.PropertyDescriptor("extension", aGetMethod, aSetMethod);
			} catch (Throwable exception) {
				/*
				 * Since we failed using methods, try creating a default
				 * property descriptor.
				 */
				handleException(exception);
				aDescriptor = new java.beans.PropertyDescriptor("extension", getBeanClass());
			}
			;
			aDescriptor.setBound(true);
			/* aDescriptor.setConstrained(false); */
			/* aDescriptor.setDisplayName("extension"); */
			/* aDescriptor.setShortDescription("extension"); */
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
		return ch.ehi.umleditor.application.ExtendedPanel.class;
	}

	/**
	 * Gets the bean class name.
	 * 
	 * @return java.lang.String
	 */
	public static java.lang.String getBeanClassName() {
		return "ch.ehi.umleditor.application.ExtendedPanel";
	}

	public java.beans.BeanDescriptor getBeanDescriptor() {
		java.beans.BeanDescriptor aDescriptor = null;
		try {
			/* Create and return the ExtendedPanelBeanInfo bean descriptor. */
			aDescriptor = new java.beans.BeanDescriptor(ch.ehi.umleditor.application.ExtendedPanel.class);
			/* aDescriptor.setExpert(false); */
			/* aDescriptor.setHidden(false); */
			/* aDescriptor.setValue("hidden-state", Boolean.FALSE); */
		} catch (Throwable exception) {
		}
		;
		return aDescriptor;
	}

	/**
	 * Gets the getClassifierExtension() method descriptor.
	 * 
	 * @return java.beans.MethodDescriptor
	 */
	public java.beans.MethodDescriptor getClassifierExtensionMethodDescriptor() {
		java.beans.MethodDescriptor aDescriptor = null;
		try {
			/*
			 * Create and return the getClassifierExtension() method descriptor.
			 */
			java.lang.reflect.Method aMethod = null;
			try {
				/*
				 * Attempt to find the method using getMethod with parameter
				 * types.
				 */
				java.lang.Class aParameterTypes[] = {};
				aMethod = getBeanClass().getMethod("getClassifierExtension", aParameterTypes);
			} catch (java.lang.Throwable exception) {
				/* Since getMethod failed, call findMethod. */
				handleException(exception);
				aMethod = findMethod(getBeanClass(), "getClassifierExtension", 0);
			}
			;
			try {
				/*
				 * Try creating the method descriptor with parameter
				 * descriptors.
				 */
				java.beans.ParameterDescriptor aParameterDescriptors[] = {};
				aDescriptor = new java.beans.MethodDescriptor(aMethod, aParameterDescriptors);
			} catch (java.lang.Throwable exception) {
				/*
				 * Try creating the method descriptor without parameter
				 * descriptors.
				 */
				handleException(exception);
				aDescriptor = new java.beans.MethodDescriptor(aMethod);
			}
			;
			/* aDescriptor.setDisplayName("getClassifierExtension()"); */
			/* aDescriptor.setShortDescription("getClassifierExtension()"); */
			/* aDescriptor.setExpert(false); */
			/* aDescriptor.setHidden(false); */
			/*
			 * aDescriptor.setValue("preferred", new java.lang.Boolean(false));
			 */
		} catch (java.lang.Throwable exception) {
			handleException(exception);
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
	 * Gets the getExtension() method descriptor.
	 * 
	 * @return java.beans.MethodDescriptor
	 */
	public java.beans.MethodDescriptor getExtensionMethodDescriptor() {
		java.beans.MethodDescriptor aDescriptor = null;
		try {
			/* Create and return the getExtension() method descriptor. */
			java.lang.reflect.Method aMethod = null;
			try {
				/*
				 * Attempt to find the method using getMethod with parameter
				 * types.
				 */
				java.lang.Class aParameterTypes[] = {};
				aMethod = getBeanClass().getMethod("getExtension", aParameterTypes);
			} catch (Throwable exception) {
				/* Since getMethod failed, call findMethod. */
				handleException(exception);
				aMethod = findMethod(getBeanClass(), "getExtension", 0);
			}
			;
			try {
				/*
				 * Try creating the method descriptor with parameter
				 * descriptors.
				 */
				java.beans.ParameterDescriptor aParameterDescriptors[] = {};
				aDescriptor = new java.beans.MethodDescriptor(aMethod, aParameterDescriptors);
			} catch (Throwable exception) {
				/*
				 * Try creating the method descriptor without parameter
				 * descriptors.
				 */
				handleException(exception);
				aDescriptor = new java.beans.MethodDescriptor(aMethod);
			}
			;
			/* aDescriptor.setDisplayName("getExtension()"); */
			/* aDescriptor.setShortDescription("getExtension()"); */
			/* aDescriptor.setExpert(false); */
			/* aDescriptor.setHidden(false); */
			/* aDescriptor.setValue("preferred", new Boolean(false)); */
		} catch (Throwable exception) {
			handleException(exception);
		}
		;
		return aDescriptor;
	}

	/**
	 * Return the method descriptors for this bean.
	 * 
	 * @return java.beans.MethodDescriptor[]
	 */
	public java.beans.MethodDescriptor[] getMethodDescriptors() {
		try {
			java.beans.MethodDescriptor aDescriptorList[] = { getExtensionMethodDescriptor(),
					main_javalangString__MethodDescriptor(),
					setClassifierExtension_chehiuml1_4foundationcoreGeneralizableElementMethodDescriptor(),
					setExtension_chehiuml1_4foundationcoreGeneralizableElementMethodDescriptor() };
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
			java.beans.PropertyDescriptor aDescriptorList[] = { classifierExtensionPropertyDescriptor(),
					componentOrientationPropertyDescriptor(), extensionPropertyDescriptor() };
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
	 * Gets the main(java.lang.String[]) method descriptor.
	 * 
	 * @return java.beans.MethodDescriptor
	 */
	public java.beans.MethodDescriptor main_javalangString__MethodDescriptor() {
		java.beans.MethodDescriptor aDescriptor = null;
		try {
			/*
			 * Create and return the main(java.lang.String[]) method descriptor.
			 */
			java.lang.reflect.Method aMethod = null;
			try {
				/*
				 * Attempt to find the method using getMethod with parameter
				 * types.
				 */
				java.lang.Class aParameterTypes[] = { java.lang.String[].class };
				aMethod = getBeanClass().getMethod("main", aParameterTypes);
			} catch (Throwable exception) {
				/* Since getMethod failed, call findMethod. */
				handleException(exception);
				aMethod = findMethod(getBeanClass(), "main", 1);
			}
			;
			try {
				/*
				 * Try creating the method descriptor with parameter
				 * descriptors.
				 */
				java.beans.ParameterDescriptor aParameterDescriptor1 = new java.beans.ParameterDescriptor();
				aParameterDescriptor1.setName("arg1");
				aParameterDescriptor1.setDisplayName("args");
				java.beans.ParameterDescriptor aParameterDescriptors[] = { aParameterDescriptor1 };
				aDescriptor = new java.beans.MethodDescriptor(aMethod, aParameterDescriptors);
			} catch (Throwable exception) {
				/*
				 * Try creating the method descriptor without parameter
				 * descriptors.
				 */
				handleException(exception);
				aDescriptor = new java.beans.MethodDescriptor(aMethod);
			}
			;
			/* aDescriptor.setDisplayName("main(java.lang.String[])"); */
			/* aDescriptor.setShortDescription("main(java.lang.String[])"); */
			/* aDescriptor.setExpert(false); */
			/* aDescriptor.setHidden(false); */
			/* aDescriptor.setValue("preferred", new Boolean(false)); */
		} catch (Throwable exception) {
			handleException(exception);
		}
		;
		return aDescriptor;
	}

	/**
	 * Gets the
	 * setClassifierExtension(ch.ehi.uml1_4.foundation.core.GeneralizableElement)
	 * method descriptor.
	 * 
	 * @return java.beans.MethodDescriptor
	 */
	public java.beans.MethodDescriptor setClassifierExtension_chehiuml1_4foundationcoreGeneralizableElementMethodDescriptor() {
		java.beans.MethodDescriptor aDescriptor = null;
		try {
			/*
			 * Create and return the
			 * setClassifierExtension(ch.ehi.uml1_4.foundation.core.
			 * GeneralizableElement) method descriptor.
			 */
			java.lang.reflect.Method aMethod = null;
			try {
				/*
				 * Attempt to find the method using getMethod with parameter
				 * types.
				 */
				java.lang.Class aParameterTypes[] = { ch.ehi.uml1_4.foundation.core.GeneralizableElement.class };
				aMethod = getBeanClass().getMethod("setClassifierExtension", aParameterTypes);
			} catch (Throwable exception) {
				/* Since getMethod failed, call findMethod. */
				handleException(exception);
				aMethod = findMethod(getBeanClass(), "setClassifierExtension", 1);
			}
			;
			try {
				/*
				 * Try creating the method descriptor with parameter
				 * descriptors.
				 */
				java.beans.ParameterDescriptor aParameterDescriptor1 = new java.beans.ParameterDescriptor();
				aParameterDescriptor1.setName("arg1");
				aParameterDescriptor1.setDisplayName("generalizableElement");
				java.beans.ParameterDescriptor aParameterDescriptors[] = { aParameterDescriptor1 };
				aDescriptor = new java.beans.MethodDescriptor(aMethod, aParameterDescriptors);
			} catch (Throwable exception) {
				/*
				 * Try creating the method descriptor without parameter
				 * descriptors.
				 */
				handleException(exception);
				aDescriptor = new java.beans.MethodDescriptor(aMethod);
			}
			;
			/*
			 * aDescriptor.setDisplayName(
			 * "setClassifierExtension(ch.ehi.uml1_4.foundation.core.GeneralizableElement)"
			 * );
			 */
			/*
			 * aDescriptor.setShortDescription(
			 * "setClassifierExtension(ch.ehi.uml1_4.foundation.core.GeneralizableElement)"
			 * );
			 */
			/* aDescriptor.setExpert(false); */
			/* aDescriptor.setHidden(false); */
			/* aDescriptor.setValue("preferred", new Boolean(false)); */
		} catch (Throwable exception) {
			handleException(exception);
		}
		;
		return aDescriptor;
	}

	/**
	 * Gets the setExtension(ch.ehi.uml1_4.foundation.core.GeneralizableElement)
	 * method descriptor.
	 * 
	 * @return java.beans.MethodDescriptor
	 */
	public java.beans.MethodDescriptor setExtension_chehiuml1_4foundationcoreGeneralizableElementMethodDescriptor() {
		java.beans.MethodDescriptor aDescriptor = null;
		try {
			/*
			 * Create and return the
			 * setExtension(ch.ehi.uml1_4.foundation.core.GeneralizableElement)
			 * method descriptor.
			 */
			java.lang.reflect.Method aMethod = null;
			try {
				/*
				 * Attempt to find the method using getMethod with parameter
				 * types.
				 */
				java.lang.Class aParameterTypes[] = { ch.ehi.uml1_4.foundation.core.GeneralizableElement.class };
				aMethod = getBeanClass().getMethod("setExtension", aParameterTypes);
			} catch (Throwable exception) {
				/* Since getMethod failed, call findMethod. */
				handleException(exception);
				aMethod = findMethod(getBeanClass(), "setExtension", 1);
			}
			;
			try {
				/*
				 * Try creating the method descriptor with parameter
				 * descriptors.
				 */
				java.beans.ParameterDescriptor aParameterDescriptor1 = new java.beans.ParameterDescriptor();
				aParameterDescriptor1.setName("arg1");
				aParameterDescriptor1.setDisplayName("generalizableElement");
				java.beans.ParameterDescriptor aParameterDescriptors[] = { aParameterDescriptor1 };
				aDescriptor = new java.beans.MethodDescriptor(aMethod, aParameterDescriptors);
			} catch (Throwable exception) {
				/*
				 * Try creating the method descriptor without parameter
				 * descriptors.
				 */
				handleException(exception);
				aDescriptor = new java.beans.MethodDescriptor(aMethod);
			}
			;
			/*
			 * aDescriptor.setDisplayName(
			 * "setExtension(ch.ehi.uml1_4.foundation.core.GeneralizableElement)"
			 * );
			 */
			/*
			 * aDescriptor.setShortDescription(
			 * "setExtension(ch.ehi.uml1_4.foundation.core.GeneralizableElement)"
			 * );
			 */
			/* aDescriptor.setExpert(false); */
			/* aDescriptor.setHidden(false); */
			/* aDescriptor.setValue("preferred", new Boolean(false)); */
		} catch (Throwable exception) {
			handleException(exception);
		}
		;
		return aDescriptor;
	}
}
