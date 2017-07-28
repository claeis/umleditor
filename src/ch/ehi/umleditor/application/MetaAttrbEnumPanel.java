package ch.ehi.umleditor.application;

import ch.ehi.uml1_4.foundation.core.Element;
import ch.softenvironment.view.BasePanel;
import ch.softenvironment.view.DataPanel;
import ch.softenvironment.view.SimpleEditorPanel;
public class MetaAttrbEnumPanel extends BasePanel implements DataPanel  {
	
	private static final long serialVersionUID = 1628286338283254334L;
	private Element element = null;
	private SimpleEditorPanel ivjPnlEdit = null;
	protected transient ch.ehi.umleditor.application.MetaAttrbEnumPanelListener fieldMetaAttrbEnumPanelListenerEventMulticaster = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();

	class IvjEventHandler implements ch.softenvironment.view.SimpleEditorPanelListener {
		public void txaEditorKey_keyReleased(java.util.EventObject newEvent) {
			if (newEvent.getSource() == MetaAttrbEnumPanel.this.getPnlEdit()) 
				connEtoC1(newEvent);
		};
	};
	
	/**
	 * MetaAttrbEnumPanel constructor comment.
	 */
	public MetaAttrbEnumPanel() {
		super();
		initialize();
	}
	
	/**
	 * 
	 * @param newListener ch.ehi.umleditor.application.MetaAttrbPanelListener
	 */
	public void addMetaAttrbEnumPanelListener(ch.ehi.umleditor.application.MetaAttrbEnumPanelListener newListener) {
		fieldMetaAttrbEnumPanelListenerEventMulticaster = ch.ehi.umleditor.application.MetaAttrbEnumPanelListenerEventMulticaster.add(fieldMetaAttrbEnumPanelListenerEventMulticaster, newListener);
		return;
	}
	/**
	 * connEtoC1:  (PnlEditor.simpleEditorPanel.txaEditorKey_keyReleased(java.util.EventObject) --> MetaAttrbEnuPanel.firePnlEditorSimpleEditorPanel_txaEditorKey_keyReleased(Ljava.util.EventObject;)V)
	 * @param arg1 java.util.EventObject
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void connEtoC1(java.util.EventObject arg1) {
		try {
			// user code begin {1}
			// user code end
			this.firePnlEditSimpleEditPanel_txaEditKey_keyReleased(new java.util.EventObject(this));
			// user code begin {2}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {3}
			// user code end
			handleException(ivjExc);
		}
	}
	/**
	 * Method to support listener events.
	 * @param newEvent java.util.EventObject
	 */
	protected void firePnlEditSimpleEditPanel_txaEditKey_keyReleased(java.util.EventObject newEvent) {
		if (fieldMetaAttrbEnumPanelListenerEventMulticaster == null) {
			return;
		};
		fieldMetaAttrbEnumPanelListenerEventMulticaster.pnlEditSimpleEditPanel_txaEditKey_keyReleased(newEvent);
	}
	/**
	 * Return the changed object displayed.
	 */
	public java.lang.Object getObject() {
		element.setMetaAttrb(new ch.ehi.basics.types.NlsString(element.getMetaAttrb(), getPnlEdit().getText()));

		return element;
	}
	/**
	 * Return the PnlEditor property value.
	 * @return ch.softenvironment.view.SimpleEditorPanel
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private ch.softenvironment.view.SimpleEditorPanel getPnlEdit() {
		if (ivjPnlEdit == null) {
			try {
				ivjPnlEdit = new ch.softenvironment.view.SimpleEditorPanel();
				ivjPnlEdit.setName("PnlEditor");
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjPnlEdit;
	}
	
	/**
	 * Called whenever the part throws an exception.
	 * @param exception java.lang.Throwable
	 */
	protected void handleException(java.lang.Throwable exception) {
		LauncherView.getInstance().handleException(exception);
	}
	/**
	 * Initializes connections
	 * @exception java.lang.Exception The exception MetaAttrbEnu.
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void initConnections() throws java.lang.Exception {
		// user code begin {1}
		// user code end
		getPnlEdit().addSimpleEditorPanelListener(ivjEventHandler);
	}
	/**
	 * Initialize the class.
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void initialize() {
		try {
			// user code begin {1}
			// user code end
			setName("PnlMetaAttrbEnu");
			setBorder(new javax.swing.border.EtchedBorder());
			setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.X_AXIS));
			setSize(160, 120);
			add(getPnlEdit(), getPnlEdit().getName());
			initConnections();
		} catch (java.lang.Throwable ivjExc) {
			handleException(ivjExc);
		}
		// user code begin {2}
		// user code end
	}
	/**
	 * 
	 * @param newListener ch.ehi.umleditor.application.MetaAttrbEnumPanelListener
	 */
	public void removeMetaAttrbEnumPanelListener(ch.ehi.umleditor.application.MetaAttrbEnumPanelListener newListener) {
		fieldMetaAttrbEnumPanelListenerEventMulticaster = ch.ehi.umleditor.application.MetaAttrbEnumPanelListenerEventMulticaster.remove(fieldMetaAttrbEnumPanelListenerEventMulticaster, newListener);
		return;
	}
	
	/**
	 * Set the TextArea enabled or not.
	 */
	public void setEnabled(boolean enabled) {
		getPnlEdit().setEnabled(enabled);
		getPnlEdit().setEditable(enabled);
	}

	/**
	 * Set the Object to be displayed by panel.
	 */
	public void setObject(java.lang.Object object) {
		this.element = (Element)object;
		if (object == null) {
			getPnlEdit().setText(null);
		} else {
			getPnlEdit().setText(ElementUtils.mapNlsString(element.getMetaAttrb()));
		}
	}

}
