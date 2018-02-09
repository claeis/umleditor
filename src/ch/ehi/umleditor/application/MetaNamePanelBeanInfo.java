package ch.ehi.umleditor.application;

public class MetaNamePanelBeanInfo extends java.beans.SimpleBeanInfo{
	/**
	 * Gets the
	 * addMetaNamePanelListener(ch.ehi.umleditor.application.MetaNamePanelListener)
	 * method descriptor.
	 * 
	 * @return java.beans.MethodDescriptor
	 */
	public java.beans.MethodDescriptor addMetaNamePanelListener_chehiumleditorapplicationMetaNamePanelListenerMethodDescriptor() {
		java.beans.MethodDescriptor aDescriptor = null;
		try {
			/*
			 * Create and return the
			 * addMetaNamePanelListener(ch.ehi.umleditor.application.
			 * MetaNamePanelListener) method descriptor.
			 */
			java.lang.reflect.Method aMethod = null;
			try {
				/*
				 * Attempt to find the method using getMethod with parameter
				 * types.
				 */
				Class aParameterTypes[] = { ch.ehi.umleditor.application.MetaNamePanelListener.class };
				aMethod = getBeanClass().getMethod("addMetaNamePanelListener", aParameterTypes);
			} catch (java.lang.Throwable exception) {
				/* Since getMethod failed, call findMethod. */
				handleException(exception);
				aMethod = findMethod(getBeanClass(), "addMetaNamePanelListener", 1);
			}
			;
			try {
				/*
				 * Try creating the method descriptor with parameter
				 * descriptors.
				 */
				java.beans.ParameterDescriptor aParameterDescriptor1 = new java.beans.ParameterDescriptor();
				aParameterDescriptor1.setName("arg1");
				aParameterDescriptor1.setDisplayName("newListener");
				java.beans.ParameterDescriptor aParameterDescriptors[] = { aParameterDescriptor1 };
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
		} catch (java.lang.Throwable exception) {
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
					Class aGetMethodParameterTypes[] = {};
					aGetMethod = getBeanClass().getMethod("getComponentOrientation", aGetMethodParameterTypes);
				} catch (java.lang.Throwable exception) {
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
					Class aSetMethodParameterTypes[] = { java.awt.ComponentOrientation.class };
					aSetMethod = getBeanClass().getMethod("setComponentOrientation", aSetMethodParameterTypes);
				} catch (java.lang.Throwable exception) {
					/* Since getMethod failed, call findMethod. */
					handleException(exception);
					aSetMethod = findMethod(getBeanClass(), "setComponentOrientation", 1);
				}
				;
				aDescriptor = new java.beans.PropertyDescriptor("componentOrientation", aGetMethod, aSetMethod);
			} catch (java.lang.Throwable exception) {
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
			/* aDescriptor.setShortMetaAttrbEnum("componentOrientation"); */
			/* aDescriptor.setExpert(false); */
			/* aDescriptor.setHidden(false); */
			/*
			 * aDescriptor.setValue("preferred", new java.lang.Boolean(false));
			 */
			/*
			 * aDescriptor.setValue("ivjDesignTimeProperty", new
			 * java.lang.Boolean(true));
			 */
			aDescriptor.setValue("enumerationValues",
					new java.lang.Object[] { "UNKNOWN", java.awt.ComponentOrientation.UNKNOWN,
							"java.awt.ComponentOrientation.UNKNOWN", "LEFT_TO_RIGHT",
							java.awt.ComponentOrientation.LEFT_TO_RIGHT, "java.awt.ComponentOrientation.LEFT_TO_RIGHT",
							"RIGHT_TO_LEFT", java.awt.ComponentOrientation.RIGHT_TO_LEFT,
							"java.awt.ComponentOrientation.RIGHT_TO_LEFT", });
		} catch (java.lang.Throwable exception) {
			handleException(exception);
		}
		;
		return aDescriptor;
	}

	/**
	 * Gets the MetaNamePanel event set descriptor.
	 * 
	 * @return java.beans.EventSetDescriptor
	 */
	public java.beans.EventSetDescriptor metaNamePanelEventSetDescriptor() {
		java.beans.EventSetDescriptor aDescriptor = null;
		try {
			try {
				/*
				 * Try using method descriptors to create the MetaNamePanel
				 * event set descriptor.
				 */
				java.beans.MethodDescriptor eventMethodDescriptors[] = {
						metaNamePanelpnlEditSimpleEditPanel_txaEditKey_keyReleased_javautilEventObjectMethodEventDescriptor(),
						pnlEditSimpleEditPanel_txaEditKey_keyReleased_javautilEventObjectMethodEventDescriptor() };
				java.lang.reflect.Method anAddMethod = null;
				try {
					/*
					 * Attempt to find the method using getMethod with parameter
					 * types.
					 */
					Class anAddMethodParameterTypes[] = {
							ch.ehi.umleditor.application.MetaNamePanelListener.class };
					anAddMethod = getBeanClass().getMethod("addMetaNamePanelListener", anAddMethodParameterTypes);
				} catch (java.lang.Throwable exception) {
					/* Since getMethod failed, call findMethod. */
					handleException(exception);
					anAddMethod = findMethod(getBeanClass(), "addMetaNamePanelListener", 1);
				}
				;
				java.lang.reflect.Method aRemoveMethod = null;
				try {
					/*
					 * Attempt to find the method using getMethod with parameter
					 * types.
					 */
					Class aRemoveMethodParameterTypes[] = {
							ch.ehi.umleditor.application.MetaNamePanelListener.class };
					aRemoveMethod = getBeanClass().getMethod("removeMetaNamePanelListener",
							aRemoveMethodParameterTypes);
				} catch (java.lang.Throwable exception) {
					/* Since getMethod failed, call findMethod. */
					handleException(exception);
					aRemoveMethod = findMethod(getBeanClass(), "removeMetaNamePanelListener", 1);
				}
				;
				aDescriptor = new java.beans.EventSetDescriptor("metaNamePanel",
						ch.ehi.umleditor.application.MetaNamePanelListener.class, eventMethodDescriptors,
						anAddMethod, aRemoveMethod);
			} catch (java.lang.Throwable exception) {
				/*
				 * Using method descriptors failed, try using the methods names.
				 */
				handleException(exception);
				java.lang.String eventMethodNames[] = { "pnlEditSimpleEditPanel_txaEditKey_keyReleased" };
				aDescriptor = new java.beans.EventSetDescriptor(getBeanClass(), "metaNamePanel",
						ch.ehi.umleditor.application.MetaNamePanelListener.class, eventMethodNames,
						"addMetaNamePanelListener", "removeMetaNamePanelListener");
			}
			;

		} catch (java.lang.Throwable exception) {
			handleException(exception);
		}
		;
		return aDescriptor;
	}

	/**
	 * Gets the
	 * metaNamePanel.pnlEditSimpleEditPanel_txaEditKey_keyReleased(java.util.EventObject)
	 * method descriptor.
	 * 
	 * @return java.beans.MethodDescriptor
	 */
	public java.beans.MethodDescriptor metaNamePanelpnlEditSimpleEditPanel_txaEditKey_keyReleased_javautilEventObjectMethodEventDescriptor() {
		java.beans.MethodDescriptor aDescriptor = null;
		try {
			/*
			 * Create and return the
			 * metaNamePanel.pnlEditSimpleEditPanel_txaEditKey_keyReleased(
			 * java.util.EventObject) method descriptor.
			 */
			java.lang.reflect.Method aMethod = null;
			try {
				/*
				 * Attempt to find the method using getMethod with parameter
				 * types.
				 */
				Class aParameterTypes[] = { java.util.EventObject.class };
				aMethod = (ch.ehi.umleditor.application.MetaNamePanelListener.class)
						.getMethod("pnlEditSimpleEditPanel_txaEditKey_keyReleased", aParameterTypes);
			} catch (java.lang.Throwable exception) {
				/* Since getMethod failed, call findMethod. */
				handleException(exception);
				aMethod = findMethod((ch.ehi.umleditor.application.MetaNamePanelListener.class),
						"pnlEditSimpleEditPanel_txaEditKey_keyReleased", 1);
			}
			;
			try {
				/*
				 * Try creating the method descriptor with parameter
				 * descriptors.
				 */
				java.beans.ParameterDescriptor aParameterDescriptor1 = new java.beans.ParameterDescriptor();
				aParameterDescriptor1.setName("arg1");
				aParameterDescriptor1.setDisplayName("newEvent");
				java.beans.ParameterDescriptor aParameterDescriptors[] = { aParameterDescriptor1 };
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
			/*
			 * aDescriptor.setDisplayName(
			 * "pnlEditSimpleEditPanel_txaEditKey_keyReleased");
			 */
			/*
			 * aDescriptor.setShortMetaAttrbEnum(
			 * "pnlEditSimpleEditPanel_txaEditKey_keyReleased");
			 */
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
	 * Gets the enabled property descriptor.
	 * 
	 * @return java.beans.PropertyDescriptor
	 */
	public java.beans.PropertyDescriptor enabledPropertyDescriptor() {
		java.beans.PropertyDescriptor aDescriptor = null;
		try {
			try {
				/*
				 * Using methods via getMethod is the faster way to create the
				 * enabled property descriptor.
				 */
				java.lang.reflect.Method aGetMethod = null;
				try {
					/*
					 * Attempt to find the method using getMethod with parameter
					 * types.
					 */
					java.lang.Class aGetMethodParameterTypes[] = {};
					aGetMethod = getBeanClass().getMethod("isEnabled", aGetMethodParameterTypes);
				} catch (java.lang.Throwable exception) {
					/* Since getMethod failed, call findMethod. */
					handleException(exception);
					aGetMethod = findMethod(getBeanClass(), "isEnabled", 0);
				}
				;
				java.lang.reflect.Method aSetMethod = null;
				try {
					/*
					 * Attempt to find the method using getMethod with parameter
					 * types.
					 */
					java.lang.Class aSetMethodParameterTypes[] = { boolean.class };
					aSetMethod = getBeanClass().getMethod("setEnabled", aSetMethodParameterTypes);
				} catch (java.lang.Throwable exception) {
					/* Since getMethod failed, call findMethod. */
					handleException(exception);
					aSetMethod = findMethod(getBeanClass(), "setEnabled", 1);
				}
				;
				aDescriptor = new java.beans.PropertyDescriptor("enabled", aGetMethod, aSetMethod);
			} catch (java.lang.Throwable exception) {
				/*
				 * Since we failed using methods, try creating a default
				 * property descriptor.
				 */
				handleException(exception);
				aDescriptor = new java.beans.PropertyDescriptor("enabled", getBeanClass());
			}
			;
			aDescriptor.setBound(true);
			/* aDescriptor.setConstrained(false); */
			/* aDescriptor.setDisplayName("enabled"); */
			aDescriptor.setShortDescription("Disable or enable the component");
			/* aDescriptor.setExpert(false); */
			/* aDescriptor.setHidden(false); */
			aDescriptor.setValue("preferred", new java.lang.Boolean(true));
			/*
			 * aDescriptor.setValue("ivjDesignTimeProperty", new
			 * java.lang.Boolean(true));
			 */
		} catch (java.lang.Throwable exception) {
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
	public static Class getBeanClass() {
		return ch.ehi.umleditor.application.MetaNamePanel.class;
	}

	/**
	 * Gets the bean class name.
	 * 
	 * @return java.lang.String
	 */
	public static java.lang.String getBeanClassName() {
		return "ch.ehi.umleditor.application.MetaNamePanel";
	}

	public java.beans.BeanDescriptor getBeanDescriptor() {
		java.beans.BeanDescriptor aDescriptor = null;
		try {
			/*
			 * Create and return the MetaNamePanelBeanInfo bean descriptor.
			 */
			aDescriptor = new java.beans.BeanDescriptor(ch.ehi.umleditor.application.MetaNamePanel.class);
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
			java.beans.EventSetDescriptor aDescriptorList[] = { metaNamePanelEventSetDescriptor() };
			return aDescriptorList;
		} catch (java.lang.Throwable exception) {
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
			java.beans.MethodDescriptor aDescriptorList[] = {
					addMetaNamePanelListener_chehiumleditorapplicationMetaNamePanelListenerMethodDescriptor(),
					main_javalangString__MethodDescriptor(),
					removeMetaNamePanelListener_chehiumleditorapplicationMetaNameEnumPanelListenerMethodDescriptor() };
			return aDescriptorList;
		} catch (java.lang.Throwable exception) {
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
			java.beans.PropertyDescriptor aDescriptorList[] = { componentOrientationPropertyDescriptor(),
					enabledPropertyDescriptor() };
			return aDescriptorList;
		} catch (java.lang.Throwable exception) {
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
				Class aParameterTypes[] = { java.lang.String[].class };
				aMethod = getBeanClass().getMethod("main", aParameterTypes);
			} catch (java.lang.Throwable exception) {
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
			} catch (java.lang.Throwable exception) {
				/*
				 * Try creating the method descriptor without parameter
				 * descriptors.
				 */
				handleException(exception);
				aDescriptor = new java.beans.MethodDescriptor(aMethod);
			}
			;
			/* aDescriptor.setDisplayName("main(java.lang.String[])"); */
			/* aDescriptor.setShortMetaAttrbEnum("main(java.lang.String[])"); */
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
	 * Gets the
	 * pnlEditSimpleEditPanel_txaEditKey_keyReleased(java.util.EventObject)
	 * method descriptor.
	 * 
	 * @return java.beans.MethodDescriptor
	 */
	public java.beans.MethodDescriptor pnlEditSimpleEditPanel_txaEditKey_keyReleased_javautilEventObjectMethodEventDescriptor() {
		java.beans.MethodDescriptor aDescriptor = null;
		try {
			/*
			 * Create and return the
			 * pnlEditSimpleEditPanel_txaEditKey_keyReleased(java.util.
			 * EventObject) method descriptor.
			 */
			java.lang.reflect.Method aMethod = null;
			try {
				/*
				 * Attempt to find the method using getMethod with parameter
				 * types.
				 */
				java.lang.Class aParameterTypes[] = { java.util.EventObject.class };
				aMethod = (ch.ehi.umleditor.application.MetaNamePanelListener.class)
						.getMethod("pnlEditSimpleEditPanel_txaEditKey_keyReleased", aParameterTypes);
			} catch (java.lang.Throwable exception) {
				/* Since getMethod failed, call findMethod. */
				handleException(exception);
				aMethod = findMethod((ch.ehi.umleditor.application.MetaNamePanelListener.class),
						"pnlEditSimpleEditPanel_txaEditKey_keyReleased", 1);
			}
			;
			try {
				/*
				 * Try creating the method descriptor with parameter
				 * descriptors.
				 */
				java.beans.ParameterDescriptor aParameterDescriptor1 = new java.beans.ParameterDescriptor();
				aParameterDescriptor1.setName("arg1");
				aParameterDescriptor1.setDisplayName("newEvent");
				java.beans.ParameterDescriptor aParameterDescriptors[] = { aParameterDescriptor1 };
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
			aDescriptor.setDisplayName("pnlEditSimpleEditPanel_txaEditKey_keyReleased(java.util.EventObject)");
			/*
			 * aDescriptor.setShortMetaName(
			 * "pnlEditSimpleEditPanel_txaEditKey_keyReleased(java.util.EventObject)"
			 * );
			 */
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
	 * Gets the
	 * removeMetaNamePanelListener(ch.ehi.umleditor.application.MetaNamePanelListener)
	 * method descriptor.
	 * 
	 * @return java.beans.MethodDescriptor
	 */
	public java.beans.MethodDescriptor removeMetaNamePanelListener_chehiumleditorapplicationMetaNameEnumPanelListenerMethodDescriptor() {
		java.beans.MethodDescriptor aDescriptor = null;
		try {
			/*
			 * Create and return the
			 * removeMetaNamePanelListener(ch.ehi.umleditor.application.
			 * MetaNamePanelListener) method descriptor.
			 */
			java.lang.reflect.Method aMethod = null;
			try {
				/*
				 * Attempt to find the method using getMethod with parameter
				 * types.
				 */
				java.lang.Class aParameterTypes[] = { ch.ehi.umleditor.application.MetaNamePanelListener.class };
				aMethod = getBeanClass().getMethod("removeMetaNamePanelListener", aParameterTypes);
			} catch (java.lang.Throwable exception) {
				/* Since getMethod failed, call findMethod. */
				handleException(exception);
				aMethod = findMethod(getBeanClass(), "removeMetaNamePanelListener", 1);
			}
			;
			try {
				/*
				 * Try creating the method descriptor with parameter
				 * descriptors.
				 */
				java.beans.ParameterDescriptor aParameterDescriptor1 = new java.beans.ParameterDescriptor();
				aParameterDescriptor1.setName("arg1");
				aParameterDescriptor1.setDisplayName("newListener");
				java.beans.ParameterDescriptor aParameterDescriptors[] = { aParameterDescriptor1 };
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
			/*
			 * aDescriptor.setDisplayName(
			 * "removeMetaNamePanelListener(ch.ehi.umleditor.application.MetaNamePanelListener)"
			 * );
			 */
			/*
			 * aDescriptor.setShortMetaName(
			 * "removeMetaNamePanelListener(ch.ehi.umleditor.application.MetaNamePanelListener)"
			 * );
			 */
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


}
