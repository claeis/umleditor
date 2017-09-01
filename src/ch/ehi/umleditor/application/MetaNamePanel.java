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
import ch.ehi.uml1_4.foundation.core.Element;
import ch.softenvironment.view.BasePanel;
import ch.softenvironment.view.DataPanel;
import ch.softenvironment.view.SimpleEditorPanel;

public class MetaNamePanel extends BasePanel implements DataPanel{
	
	private static final long serialVersionUID = 1629508891527519069L;
	//private Element element = null;
	private Element element = null;
	private SimpleEditorPanel ivjPnlEdit = null;
	protected transient ch.ehi.umleditor.application.MetaNamePanelListener fieldMetaNamePanelListenerEventMulticaster = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();

	class IvjEventHandler implements ch.softenvironment.view.SimpleEditorPanelListener {
		public void txaEditorKey_keyReleased(java.util.EventObject newEvent) {
			if (newEvent.getSource() == MetaNamePanel.this.getPnlEdit())
				connEtoC1(newEvent);
		};
	};

	/**
	 * MetaAttrbEnumPanel constructor comment.
	 */
	public MetaNamePanel() {
		super();
		initialize();
	}

	/**
	 *
	 * @param newListener
	 *            ch.ehi.umleditor.application.MetaAttrbPanelListener
	 */
	public void addMetaNamePanelListener(ch.ehi.umleditor.application.MetaNamePanelListener newListener) {
		fieldMetaNamePanelListenerEventMulticaster = ch.ehi.umleditor.application.MetaNamePanelListenerEventMulticaster
				.add(fieldMetaNamePanelListenerEventMulticaster, newListener);
		return;
	}

	/**
	 * connEtoC1:
	 * (PnlEditor.simpleEditorPanel.txaEditorKey_keyReleased(java.util.EventObject)
	 * -->
	 * MetaAttrbEnuPanel.firePnlEditorSimpleEditorPanel_txaEditorKey_keyReleased(Ljava.util.EventObject;)V)
	 * 
	 * @param arg1
	 *            java.util.EventObject
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
	 * 
	 * @param newEvent
	 *            java.util.EventObject
	 */
	protected void firePnlEditSimpleEditPanel_txaEditKey_keyReleased(java.util.EventObject newEvent) {
		if (fieldMetaNamePanelListenerEventMulticaster == null) {
			return;
		}
		;
		fieldMetaNamePanelListenerEventMulticaster.pnlEditSimpleEditPanel_txaEditKey_keyReleased(newEvent);
	}

	/**
	 * Return the changed object displayed.
	 */
	public java.lang.Object getObject() {
		element.setMetaName(new ch.ehi.basics.types.NlsString(element.getMetaName(), getPnlEdit().getText()));

		return element;
	}

	/**
	 * Return the PnlEditor property value.
	 * 
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
	 * 
	 * @param exception
	 *            java.lang.Throwable
	 */
	protected void handleException(java.lang.Throwable exception) {
		LauncherView.getInstance().handleException(exception);
	}

	/**
	 * Initializes connections
	 * 
	 * @exception java.lang.Exception
	 *                The exception MetaAttrbEnu.
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
			setName("PnlMetaName");
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
	 * @param newListener
	 *            ch.ehi.umleditor.application.MetaAttrbEnumPanelListener
	 */
	public void removeMetaNamePanelListener(ch.ehi.umleditor.application.MetaNamePanelListener newListener) {
		fieldMetaNamePanelListenerEventMulticaster = ch.ehi.umleditor.application.MetaNamePanelListenerEventMulticaster.remove(fieldMetaNamePanelListenerEventMulticaster, newListener);
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
		this.element = (Element) object;
		if (object == null) {
			getPnlEdit().setText(null);
		} else {
			getPnlEdit().setText(ElementUtils.mapNlsString(element.getMetaName()));
		}
	}
}
