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
import ch.softenvironment.view.*;
/**
 * Text-Editing Panel.
 * 
 * @author: Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:38:39 $
 */
public class DescriptionPanel extends DataPanel {
	private Element element = null;
	private SimpleEditorPanel ivjPnlEditor = null;
	protected transient ch.ehi.umleditor.application.DescriptionPanelListener fieldDescriptionPanelListenerEventMulticaster = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();

class IvjEventHandler implements ch.softenvironment.view.SimpleEditorPanelListener {
		public void txaEditorKey_keyReleased(java.util.EventObject newEvent) {
			if (newEvent.getSource() == DescriptionPanel.this.getPnlEditor()) 
				connEtoC1(newEvent);
		};
	};
/**
 * DescriptionPanel constructor comment.
 */
public DescriptionPanel() {
	super();
	initialize();
}
/**
 * 
 * @param newListener ch.ehi.umleditor.application.DescriptionPanelListener
 */
public void addDescriptionPanelListener(ch.ehi.umleditor.application.DescriptionPanelListener newListener) {
	fieldDescriptionPanelListenerEventMulticaster = ch.ehi.umleditor.application.DescriptionPanelListenerEventMulticaster.add(fieldDescriptionPanelListenerEventMulticaster, newListener);
	return;
}
/**
 * connEtoC1:  (PnlEditor.simpleEditorPanel.txaEditorKey_keyReleased(java.util.EventObject) --> DescriptionPanel.firePnlEditorSimpleEditorPanel_txaEditorKey_keyReleased(Ljava.util.EventObject;)V)
 * @param arg1 java.util.EventObject
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC1(java.util.EventObject arg1) {
	try {
		// user code begin {1}
		// user code end
		this.firePnlEditorSimpleEditorPanel_txaEditorKey_keyReleased(new java.util.EventObject(this));
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
protected void firePnlEditorSimpleEditorPanel_txaEditorKey_keyReleased(java.util.EventObject newEvent) {
	if (fieldDescriptionPanelListenerEventMulticaster == null) {
		return;
	};
	fieldDescriptionPanelListenerEventMulticaster.pnlEditorSimpleEditorPanel_txaEditorKey_keyReleased(newEvent);
}
/**
 * Return the changed object displayed.
 */
public java.lang.Object getObject() {
	element.setDocumentation(new ch.ehi.basics.types.NlsString(element.getDocumentation(), getPnlEditor().getText()));

	return element;
}
/**
 * Return the PnlEditor property value.
 * @return ch.softenvironment.view.SimpleEditorPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private ch.softenvironment.view.SimpleEditorPanel getPnlEditor() {
	if (ivjPnlEditor == null) {
		try {
			ivjPnlEditor = new ch.softenvironment.view.SimpleEditorPanel();
			ivjPnlEditor.setName("PnlEditor");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlEditor;
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
 * @exception java.lang.Exception The exception description.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initConnections() throws java.lang.Exception {
	// user code begin {1}
	// user code end
	getPnlEditor().addSimpleEditorPanelListener(ivjEventHandler);
}
/**
 * Initialize the class.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("PnlDescription");
		setBorder(new javax.swing.border.EtchedBorder());
		setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.X_AXIS));
		setSize(160, 120);
		add(getPnlEditor(), getPnlEditor().getName());
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	// user code end
}
/**
 * 
 * @param newListener ch.ehi.umleditor.application.DescriptionPanelListener
 */
public void removeDescriptionPanelListener(ch.ehi.umleditor.application.DescriptionPanelListener newListener) {
	fieldDescriptionPanelListenerEventMulticaster = ch.ehi.umleditor.application.DescriptionPanelListenerEventMulticaster.remove(fieldDescriptionPanelListenerEventMulticaster, newListener);
	return;
}
/**
 * Set the TextArea enabled or not.
 */
public void setEnabled(boolean enabled) {
	getPnlEditor().setEnabled(enabled);
	getPnlEditor().setEditable(enabled);
}
/**
 * Set the Object to be displayed by panel.
 */
public void setObject(java.lang.Object object) {
	this.element = (Element)object;
	if (object == null) {
		getPnlEditor().setText(null);
	} else {
		getPnlEditor().setText(ElementUtils.mapNlsString(element.getDocumentation()));
	}
}
}
