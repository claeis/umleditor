package ch.ehi.umleditor.application;

import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.extensionmechanisms.TaggedValue;
import ch.ehi.umleditor.interlis.iliimport.TransferFromIli2cMetamodel;
import ch.softenvironment.client.ResourceManager;
import ch.softenvironment.view.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.regex.Pattern;

/**
 * Panel to view and edit MetaAttributes.
 */
public class MetaAttributePanel extends BasePanel {
    private static final java.util.ResourceBundle resClassDefDialog = java.util.ResourceBundle.getBundle("ch/ehi/umleditor/application/resources/MetaAttributePanel");
    private final Dialog ownerDialog;
    private final List<String> ignoredMetaAttributes;

    private JTable metaAttributeTable;
    private JPopupMenu contextMenu;
    private MetaAttributeDialog metaAttributeEditDialog;

    /**
     * Creates a panel to view and edit MetaAttributes.
     *
     * @param owner The owner dialog of this panel
     */
    public MetaAttributePanel(java.awt.Dialog owner) {
        this(owner, Collections.<String>emptyList());
    }

    /**
     * Creates a panel to view and edit MetaAttributes.
     *
     * @param owner The owner dialog of this panel
     * @param ignoredMetaAttributes MetaAttribute names that are not displayed
     */
    public MetaAttributePanel(java.awt.Dialog owner, List<String> ignoredMetaAttributes) {
        this.ownerDialog = owner;
        this.ignoredMetaAttributes = ignoredMetaAttributes;
        initialize();
    }

    private void initialize() {
        setBorder(BorderFactory.createEmptyBorder(7, 11, 6, 7));
        setLayout(new BorderLayout());

        JScrollPane tableScrollPane = new JScrollPane(getMetaAttributeTable());
        tableScrollPane.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                genericPopupDisplay(e, getContextMenu());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                genericPopupDisplay(e, getContextMenu());
            }
        });
        this.add(tableScrollPane, BorderLayout.CENTER);
    }

    private JTable getMetaAttributeTable() {
        if (metaAttributeTable == null) {
            EditorTableModel tableModel = new EditorTableModel();
            tableModel.setColumnIdentifiers(new String[]{
                    resClassDefDialog.getString("TbcMetaAttributeName_text"),
                    resClassDefDialog.getString("TbcMetaAttributeValue_text"),
            });

            metaAttributeTable = new JTable();
            metaAttributeTable.setCellSelectionEnabled(false);
            metaAttributeTable.setRowSelectionAllowed(true);
            metaAttributeTable.setModel(tableModel);

            metaAttributeTable.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    handleMouseEvent(e);
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    handleMouseEvent(e);
                }

                private void handleMouseEvent(MouseEvent e) {
                    if (e.getClickCount() == 2) {
                        editMetaAttribute();
                    }

                    genericPopupDisplay(e, getContextMenu());
                }
            });
        }

        return metaAttributeTable;
    }

    private JPopupMenu getContextMenu() {
        if (contextMenu == null) {
            final JMenuItem edit = new JMenuItem(CommonUserAccess.getMniEditChangeWindowText());
            edit.setEnabled(false);
            edit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    editMetaAttribute();
                }
            });

            final JMenuItem newAttribute = new JMenuItem(CommonUserAccess.getMniFileNewText());
            newAttribute.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    newMetaAttribute();
                }
            });

            final JMenuItem delete = new JMenuItem(ResourceManager.getResource(BaseDialog.class, "BtnRemove_text"));
            delete.setEnabled(false);
            delete.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    deleteSelectedMetaAttribute();
                }
            });

            final JMenuItem moveDown = new JMenuItem(resClassDefDialog.getString("MniMoveDown_text"));
            moveDown.setEnabled(false);
            moveDown.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    moveDownMetaAttribute();
                }
            });

            // enable or disable menu items based on table selection
            getMetaAttributeTable().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    DefaultListSelectionModel selectionModel = (DefaultListSelectionModel) e.getSource();
                    boolean somethingSelected = !selectionModel.isSelectionEmpty();

                    edit.setEnabled(somethingSelected);
                    delete.setEnabled(somethingSelected);
                    moveDown.setEnabled(somethingSelected);
                }
            });

            contextMenu = new JPopupMenu();
            contextMenu.add(edit);
            contextMenu.add(new JSeparator());
            contextMenu.add(newAttribute);
            contextMenu.add(delete);
            contextMenu.add(moveDown);
        }

        return contextMenu;
    }

    private MetaAttributeDialog getMetaAttributeEditDialog() {
        if (metaAttributeEditDialog == null) {
            metaAttributeEditDialog = new MetaAttributeDialog(ownerDialog);
        }

        return metaAttributeEditDialog;
    }

    private void editMetaAttribute() {
        getMetaAttributeEditDialog().setCurrentObject(getMetaAttributeTable(), getMetaAttributeTable().getSelectedRow());
        getMetaAttributeEditDialog().setVisible(true);
    }

    private void newMetaAttribute() {
        EditorTableModel tableModel = (EditorTableModel)getMetaAttributeTable().getModel();

        tableModel.addRow(new Object[] {
                resClassDefDialog.getString("TbcMetaAttributeName_text"),
                resClassDefDialog.getString("TbcMetaAttributeValue_text")});
    }

    private void deleteSelectedMetaAttribute() {
        EditorTableModel tableModel = (EditorTableModel)getMetaAttributeTable().getModel();

        int[] selectedRows = getMetaAttributeTable().getSelectedRows();
        for (int i = selectedRows.length - 1; i >= 0; i--) {
            tableModel.removeRow(selectedRows[i]);
        }
    }

    private void moveDownMetaAttribute() {
        EditorTableModel tableModel = (EditorTableModel)getMetaAttributeTable().getModel();
        int selectedRow = getMetaAttributeTable().getSelectedRow();
        int targetRow = selectedRow + 1;

        if (targetRow < tableModel.getRowCount()) {
            tableModel.moveRow(selectedRow, selectedRow, targetRow);
        }
    }

    /**
     * Set the element, who's MetaAttributes are displayed inside this panel.
     */
    public void setCurrentObject(ModelElement element) {
        EditorTableModel tableModel = (EditorTableModel)(getMetaAttributeTable().getModel());

        // discard existing content
        tableModel.setRowCount(0);

        for (Iterator it = element.iteratorTaggedValue(); it.hasNext(); ) {
            TaggedValue metaAttribute = (TaggedValue)it.next();
            String name = getMetaAttributeName(metaAttribute);
            String value = metaAttribute.getDataValue();

            if (!ignoredMetaAttributes.contains(name)) {
                tableModel.addRow(new Object[] { name, value });
            }
        }
    }

    /**
     * Save the MetaAttributes from this panel to the specified element.
     */
    public void saveToObject(ModelElement element) {
        Vector newMetaAttributes = ((EditorTableModel) getMetaAttributeTable().getModel()).getDataVector();

        // remove deleted attributes
        for (Iterator it = element.iteratorTaggedValue(); it.hasNext(); ) {
            TaggedValue metaAttribute = (TaggedValue)it.next();
            String metaAttributeName = getMetaAttributeName(metaAttribute);

            boolean found = false;
            for (Object row : newMetaAttributes) {
                if (((Vector)row).get(0).equals(metaAttributeName)) {
                    found = true;
                    break;
                }
            }

            if (!found && !ignoredMetaAttributes.contains(metaAttributeName)) {
                it.remove();
            }
        }

        // set new values
        for (Object row : newMetaAttributes) {
            Vector rowVector = (Vector)row;
            ElementUtils.setIliTaggedValue(element, (String)rowVector.get(0), (String)rowVector.get(1));
        }
    }

    private static String getMetaAttributeName(TaggedValue metaAttribute) {
        return metaAttribute
                .getName()
                .getValue()
                .replaceFirst("^" + Pattern.quote(TransferFromIli2cMetamodel.TAGGEDVALUE_ILI_PREFIX), "");
    }

    private static class MetaAttributeDialog extends BaseDialog {
        private JTable currentTable;
        private int currentRow;

        private JTextField nameTextField;
        private JTextField valueTextField;

        public MetaAttributeDialog(java.awt.Dialog owner) {
            super(owner, true);
            initialize();
        }

        private void initialize() {
            setTitle(resClassDefDialog.getString("CTDialog"));
            setSize(new Dimension(426, 180));
            setLayout(new BorderLayout());

            JPanel content = new JPanel();
            content.setLayout(new GridBagLayout());
            content.setBorder(new EmptyBorder(new Insets(10, 10, 10, 10)));

            nameTextField = new JTextField();
            valueTextField = new JTextField();

            GridBagConstraints nameLabelConstraints = new GridBagConstraints();
            nameLabelConstraints.gridx = 0;
            nameLabelConstraints.gridy = 0;
            nameLabelConstraints.weightx = 0;
            nameLabelConstraints.fill = GridBagConstraints.HORIZONTAL;
            nameLabelConstraints.anchor = GridBagConstraints.BASELINE;
            nameLabelConstraints.insets = new Insets(0, 0, 10, 10);

            GridBagConstraints nameTextFieldConstraints = new GridBagConstraints();
            nameTextFieldConstraints.gridx = 1;
            nameTextFieldConstraints.gridy = 0;
            nameTextFieldConstraints.weightx = 2;
            nameTextFieldConstraints.fill = GridBagConstraints.HORIZONTAL;
            nameTextFieldConstraints.anchor = GridBagConstraints.BASELINE;
            nameTextFieldConstraints.insets = new Insets(0, 0, 10, 0);

            GridBagConstraints valueLabelConstraints = new GridBagConstraints();
            valueLabelConstraints.gridx = 0;
            valueLabelConstraints.gridy = 1;
            valueLabelConstraints.weightx = 0;
            valueLabelConstraints.weighty = 1;
            valueLabelConstraints.fill = GridBagConstraints.HORIZONTAL;
            valueLabelConstraints.anchor = GridBagConstraints.BASELINE;
            valueLabelConstraints.insets = new Insets(0, 0, 10, 10);

            GridBagConstraints valueTextFieldConstraints = new GridBagConstraints();
            valueTextFieldConstraints.gridx = 1;
            valueTextFieldConstraints.gridy = 1;
            valueTextFieldConstraints.weightx = 2;
            valueTextFieldConstraints.weighty = 1;
            valueTextFieldConstraints.fill = GridBagConstraints.HORIZONTAL;
            valueTextFieldConstraints.anchor = GridBagConstraints.BASELINE;
            valueTextFieldConstraints.insets = new Insets(0, 0, 10, 0);

            content.add(new JLabel(resClassDefDialog.getString("TbcMetaAttributeName_text")), nameLabelConstraints);
            content.add(nameTextField, nameTextFieldConstraints);
            content.add(new JLabel(resClassDefDialog.getString("TbcMetaAttributeValue_text")), valueLabelConstraints);
            content.add(valueTextField, valueTextFieldConstraints);

            add(content, BorderLayout.CENTER);

            JButton okButton = new JButton(getOKString());
            okButton.setPreferredSize(new Dimension(100, 25));
            okButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    okPressed();
                }
            });

            JButton cancelButton = new JButton(getCancelString());
            cancelButton.setPreferredSize(new Dimension(100, 25));
            cancelButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    cancelPressed();
                }
            });

            JButton applyButton = new JButton(getApplyString());
            applyButton.setPreferredSize(new Dimension(100, 25));
            applyButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    applyPressed();
                }
            });

            Box buttons = Box.createHorizontalBox();
            buttons.setBorder(new EmptyBorder(new Insets(10, 10, 10, 10)));

            buttons.add(Box.createGlue());
            buttons.add(okButton);
            buttons.add(Box.createHorizontalStrut(10));
            buttons.add(cancelButton);
            buttons.add(Box.createHorizontalStrut(10));
            buttons.add(applyButton);

            add(buttons, BorderLayout.SOUTH);
        }

        public void setCurrentObject(JTable tableModel, int row) {
            this.currentTable = tableModel;
            this.currentRow = row;
            nameTextField.setText((String) tableModel.getValueAt(row, 0));
            valueTextField.setText((String) tableModel.getValueAt(row, 1));
        }

        @Override
        protected boolean save() {
            currentTable.setValueAt(nameTextField.getText(), currentRow, 0);
            currentTable.setValueAt(valueTextField.getText(), currentRow, 1);
            return super.save();
        }
    }
}
