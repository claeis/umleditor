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
import ch.ehi.interlis.modeltopicclass.*;
import ch.ehi.uml1_4.foundation.core.*;
import ch.softenvironment.util.*;
import ch.softenvironment.view.*;
import ch.ehi.interlis.domainsandconstants.basetypes.*;
/**
 * INTERLIS BaseType representation of <b>BasketType</b>.
 *
 * @author Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.5 $ $Date: 2006-11-29 17:48:52 $
 */
public class IliBaseTypeBasketPanel extends BasePanel implements DataPanel {
private ReferencableComboBox ivjCbxTopicDef = null;
private javax.swing.JLabel ivjLblAccordingTo = null;
private javax.swing.JLabel ivjLblKind = null;
private javax.swing.JRadioButton ivjRbtBase = null;
private javax.swing.JRadioButton ivjRbtData = null;
private javax.swing.JRadioButton ivjRbtGraphic = null;
private javax.swing.JRadioButton ivjRbtView = null;
private javax.swing.JRadioButton ivjRbtUndefined = null;
/**
 * IliBaseTypeTextPanel constructor comment.
 */
public IliBaseTypeBasketPanel() {
        super();
        initialize();
}
/**
 * Return the CbxTopicDef property value.
 * @return ch.ehi.umleditor.application.ReferencableComboBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private ReferencableComboBox getCbxTopicDef() {
        if (ivjCbxTopicDef == null) {
                try {
                        ivjCbxTopicDef = new ch.ehi.umleditor.application.ReferencableComboBox();
                        ivjCbxTopicDef.setName("CbxTopicDef");
                        ivjCbxTopicDef.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
                        // user code begin {1}
                        // user code end
                } catch (java.lang.Throwable ivjExc) {
                        // user code begin {2}
                        // user code end
                        handleException(ivjExc);
                }
        }
        return ivjCbxTopicDef;
}
/**
 * Return Kind.
 */
private int getkind() {
        /*
           if (getRbtUnspecified().isSelected()) {
           return TextKind.ABSTRACT;
           } else if (getRbtLength().isSelected()) {
           return TextKind.MAXLEN;
           } else if (getRbtName().isSelected()) {
           return TextKind.NAME;
           } else if (getRbtURI().isSelected()) {
           return TextKind.URI;
           } else {*/
        throw new DeveloperException("nothing choosed");//$NON-NLS-1$
//	}
}
/**
 * Return the LblAccordingTo property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblAccordingTo() {
        if (ivjLblAccordingTo == null) {
                try {
                        ivjLblAccordingTo = new javax.swing.JLabel();
                        ivjLblAccordingTo.setName("LblAccordingTo");
                        ivjLblAccordingTo.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
                        ivjLblAccordingTo.setText("Gemäss:");
                        // user code begin {1}
                        ivjLblAccordingTo.setText(getResourceString("LblAccordingTo_text"));
                        // user code end
                } catch (java.lang.Throwable ivjExc) {
                        // user code begin {2}
                        // user code end
                        handleException(ivjExc);
                }
        }
        return ivjLblAccordingTo;
}
/**
 * Return the LblKind property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblKind() {
        if (ivjLblKind == null) {
                try {
                        ivjLblKind = new javax.swing.JLabel();
                        ivjLblKind.setName("LblKind");
                        ivjLblKind.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
                        ivjLblKind.setText("Art:");
                        ivjLblKind.setVerticalAlignment(javax.swing.SwingConstants.TOP);
                        // user code begin {1}
                        ivjLblKind.setText(getResourceString("LblKind_text"));
                        // user code end
                } catch (java.lang.Throwable ivjExc) {
                        // user code begin {2}
                        // user code end
                        handleException(ivjExc);
                }
        }
        return ivjLblKind;
}
/**
 * Return the changed object displayed.
 */
public java.lang.Object getObject() {
        BasketType type = ElementFactory.createBasketType();

        // kind
        if (getRbtData().isSelected()) {
                type.setKind(BasketKind.DATA);
        } else if (getRbtView().isSelected()) {
                type.setKind(BasketKind.VIEW);
        } else if (getRbtBase().isSelected()) {
                type.setKind(BasketKind.BASE);
        } else if (getRbtGraphic().isSelected()) {
                type.setKind(BasketKind.GRAPHIC);
        } else {
                type.setKind(BasketKind.UNDEFINED);
        }


        if (getCbxTopicDef().hasElementChanged()) {
                if (getCbxTopicDef().getElement() == null) {
                        // remove TopicDef
                        if (type.containsBasketSchema()) {
                                type.detachBasketSchema();
                        }
                } else {
                        // set TopicDef
                        if (type.containsBasketSchema()) {
                                type.detachBasketSchema();
                        }
                        type.attachBasketSchema((TopicDef)getCbxTopicDef().getElement());
                }
        }

        return type;
}
/**
 * Return the RbtBase property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbtBase() {
        if (ivjRbtBase == null) {
                try {
                        ivjRbtBase = new javax.swing.JRadioButton();
                        ivjRbtBase.setName("RbtBase");
                        ivjRbtBase.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
                        ivjRbtBase.setText("Base");
                        ivjRbtBase.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                        ivjRbtBase.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
                        // user code begin {1}
                        ivjRbtBase.setText(getResourceString("RbtBase_text"));
                        // user code end
                } catch (java.lang.Throwable ivjExc) {
                        // user code begin {2}
                        // user code end
                        handleException(ivjExc);
                }
        }
        return ivjRbtBase;
}
/**
 * Return the RbtData property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbtData() {
        if (ivjRbtData == null) {
                try {
                        ivjRbtData = new javax.swing.JRadioButton();
                        ivjRbtData.setName("RbtData");
                        ivjRbtData.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
                        ivjRbtData.setText("Data");
                        ivjRbtData.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                        ivjRbtData.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
                        // user code begin {1}
                        ivjRbtData.setText(getResourceString("RbtData_text"));
                        // user code end
                } catch (java.lang.Throwable ivjExc) {
                        // user code begin {2}
                        // user code end
                        handleException(ivjExc);
                }
        }
        return ivjRbtData;
}
/**
 * Return the RbtGraphic property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbtGraphic() {
        if (ivjRbtGraphic == null) {
                try {
                        ivjRbtGraphic = new javax.swing.JRadioButton();
                        ivjRbtGraphic.setName("RbtGraphic");
                        ivjRbtGraphic.setToolTipText("");
                        ivjRbtGraphic.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
                        ivjRbtGraphic.setText("Graphic");
                        ivjRbtGraphic.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
                        ivjRbtGraphic.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                        // user code begin {1}
                        ivjRbtGraphic.setText(getResourceString("RbtGraphic_text"));
                        // user code end
                } catch (java.lang.Throwable ivjExc) {
                        // user code begin {2}
                        // user code end
                        handleException(ivjExc);
                }
        }
        return ivjRbtGraphic;
}
/**
 * Return the RbtUndefined property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbtUndefined() {
        if (ivjRbtUndefined == null) {
                try {
                        ivjRbtUndefined = new javax.swing.JRadioButton();
                        ivjRbtUndefined.setName("RbtUndefined");
                        ivjRbtUndefined.setToolTipText("");
                        ivjRbtUndefined.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
                        ivjRbtUndefined.setText("Undefined");
                        ivjRbtUndefined.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
                        ivjRbtUndefined.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                        // user code begin {1}
                        ivjRbtUndefined.setText(getResourceString("RbtUndefined_text"));
                        // user code end
                } catch (java.lang.Throwable ivjExc) {
                        // user code begin {2}
                        // user code end
                        handleException(ivjExc);
                }
        }
        return ivjRbtUndefined;
}
/**
 * Return the RbtView property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbtView() {
        if (ivjRbtView == null) {
                try {
                        ivjRbtView = new javax.swing.JRadioButton();
                        ivjRbtView.setName("RbtView");
                        ivjRbtView.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
                        ivjRbtView.setText("VIEW");
                        ivjRbtView.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                        ivjRbtView.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
                        // user code begin {1}
                        ivjRbtView.setText(getResourceString("RbtView_text"));
                        // user code end
                } catch (java.lang.Throwable ivjExc) {
                        // user code begin {2}
                        // user code end
                        handleException(ivjExc);
                }
        }
        return ivjRbtView;
}
/**
 * Called whenever the part throws an exception.
 * @param exception java.lang.Throwable
 */
protected void handleException(java.lang.Throwable exception) {
        LauncherView.getInstance().handleException(exception);
}
/**
 * Initialize the class.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initialize() {
        try {
                // user code begin {1}
                // user code end
                setName("IliBaseTypeTextPanel");
                setToolTipText("INTERLIS Basistyp <BASKET>");
                setLayout(new java.awt.GridBagLayout());
                setSize(363, 164);

                java.awt.GridBagConstraints constraintsRbtData = new java.awt.GridBagConstraints();
                constraintsRbtData.gridx = 2; constraintsRbtData.gridy = 2;
                constraintsRbtData.anchor = java.awt.GridBagConstraints.NORTHWEST;
                constraintsRbtData.ipadx = 169;
                constraintsRbtData.ipady = 1;
                constraintsRbtData.insets = new java.awt.Insets(0, 5, 0, 13);
                add(getRbtData(), constraintsRbtData);

                java.awt.GridBagConstraints constraintsRbtView = new java.awt.GridBagConstraints();
                constraintsRbtView.gridx = 2; constraintsRbtView.gridy = 3;
                constraintsRbtView.anchor = java.awt.GridBagConstraints.NORTHWEST;
                constraintsRbtView.ipadx = 135;
                constraintsRbtView.insets = new java.awt.Insets(1, 5, 2, 13);
                add(getRbtView(), constraintsRbtView);

                java.awt.GridBagConstraints constraintsRbtBase = new java.awt.GridBagConstraints();
                constraintsRbtBase.gridx = 2; constraintsRbtBase.gridy = 4;
                constraintsRbtBase.anchor = java.awt.GridBagConstraints.NORTHWEST;
                constraintsRbtBase.ipadx = 169;
                constraintsRbtBase.ipady = 1;
                constraintsRbtBase.insets = new java.awt.Insets(2, 5, 1, 13);
                add(getRbtBase(), constraintsRbtBase);

                java.awt.GridBagConstraints constraintsRbtGraphic = new java.awt.GridBagConstraints();
                constraintsRbtGraphic.gridx = 2; constraintsRbtGraphic.gridy = 5;
                constraintsRbtGraphic.anchor = java.awt.GridBagConstraints.NORTHWEST;
                constraintsRbtGraphic.ipadx = 169;
                constraintsRbtGraphic.ipady = 1;
                constraintsRbtGraphic.insets = new java.awt.Insets(2, 5, 3, 13);
                add(getRbtGraphic(), constraintsRbtGraphic);

                java.awt.GridBagConstraints constraintsLblAccordingTo = new java.awt.GridBagConstraints();
                constraintsLblAccordingTo.gridx = 1; constraintsLblAccordingTo.gridy = 6;
                constraintsLblAccordingTo.anchor = java.awt.GridBagConstraints.NORTHWEST;
                constraintsLblAccordingTo.ipadx = 90;
                constraintsLblAccordingTo.insets = new java.awt.Insets(8, 10, 12, 5);
                add(getLblAccordingTo(), constraintsLblAccordingTo);

                java.awt.GridBagConstraints constraintsCbxTopicDef = new java.awt.GridBagConstraints();
                constraintsCbxTopicDef.gridx = 2; constraintsCbxTopicDef.gridy = 6;
                constraintsCbxTopicDef.fill = java.awt.GridBagConstraints.HORIZONTAL;
                constraintsCbxTopicDef.anchor = java.awt.GridBagConstraints.NORTHWEST;
                constraintsCbxTopicDef.weightx = 1.0;
                constraintsCbxTopicDef.ipadx = 64;
                constraintsCbxTopicDef.insets = new java.awt.Insets(4, 5, 7, 13);
                add(getCbxTopicDef(), constraintsCbxTopicDef);

                java.awt.GridBagConstraints constraintsLblKind = new java.awt.GridBagConstraints();
                constraintsLblKind.gridx = 1; constraintsLblKind.gridy = 1;
                constraintsLblKind.anchor = java.awt.GridBagConstraints.NORTHWEST;
                constraintsLblKind.ipadx = 120;
                constraintsLblKind.insets = new java.awt.Insets(17, 10, 0, 5);
                add(getLblKind(), constraintsLblKind);

                java.awt.GridBagConstraints constraintsRbtUndefined = new java.awt.GridBagConstraints();
                constraintsRbtUndefined.gridx = 2; constraintsRbtUndefined.gridy = 1;
                constraintsRbtUndefined.anchor = java.awt.GridBagConstraints.NORTHWEST;
                constraintsRbtUndefined.ipadx = 169;
                constraintsRbtUndefined.ipady = 1;
                constraintsRbtUndefined.insets = new java.awt.Insets(8, 5, 1, 13);
                add(getRbtUndefined(), constraintsRbtUndefined);
        } catch (java.lang.Throwable ivjExc) {
                handleException(ivjExc);
        }
        // user code begin {2}
        setToolTipText(getResourceString("PnlBaseType_toolTipText"));
        javax.swing.ButtonGroup group = new javax.swing.ButtonGroup();
        group.add(getRbtUndefined());
        group.add(getRbtBase());
        group.add(getRbtData());
        group.add(getRbtGraphic());
        group.add(getRbtView());
        getRbtUndefined().setSelected(true);
        // user code end
}
/**
 * Set the Object to be displayed by panel.
 */
public final void setObject(java.lang.Object object) throws DeveloperException {
        throw new DeveloperException("call setObject(Object, ModelElement) instead");//$NON-NLS-1$
}
/**
 * Set the Object to be displayed by panel.
 */
public void setObject(java.lang.Object object, ModelElement modelElement) {
        BasketType type = (BasketType)object;

        // kind
        switch (type.getKind()) {
        case BasketKind.UNDEFINED: {
                getRbtUndefined().setSelected(true);
                break;
        }
        case BasketKind.DATA: {
                getRbtData().setSelected(true);
                break;
        }
        case BasketKind.VIEW: {
                getRbtView().setSelected(true);
                break;
        }
        case BasketKind.BASE: {
                getRbtBase().setSelected(true);
                break;
        }
        case BasketKind.GRAPHIC: {
                getRbtGraphic().setSelected(true);
                break;
        }
        default: {
                throw new ch.softenvironment.util.DeveloperException("Unknown Kind <" + type.getKind() + ">");//$NON-NLS-1$
        }
        }

        if (type.containsBasketSchema()) {
                getCbxTopicDef().setElement(TopicDef.class, modelElement, type.getBasketSchema());
        } else {
                getCbxTopicDef().setElement(TopicDef.class, modelElement, null);
        }
}
}
