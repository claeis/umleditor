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

<<<<<<< HEAD

=======
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
import ch.ehi.interlis.associations.RoleDef;
import ch.ehi.uml1_4.foundation.core.Association;
import ch.ehi.umleditor.umlpresentation.PresentationNode;
import ch.softenvironment.util.Evaluator;
import ch.softenvironment.view.BaseDialog;
import ch.softenvironment.view.swingext.JComboBoxUtility;

import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Rectangle;
import java.util.Iterator;
import javax.swing.JLabel;
import javax.swing.JComboBox;

/**
<<<<<<< HEAD
 * When connecting an Association to a Linknode, it must
 * be confirmed whether it is an "n-ary" or "XOR" kind.
=======
 * When connecting an Association to a Linknode, it must be confirmed whether it
 * is an "n-ary" or "XOR" kind.
 * 
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
 * @author Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.2 $ $Date: 2008-04-08 09:59:17 $
 */
public class LinkNodeDialog extends BaseDialog implements Evaluator {
<<<<<<< HEAD
    private JPanel pnlMain = null;
    private JPanel jPanel = null;
    private JPanel pnlSouth = null;
    private JButton btnOk = null;
    private JButton btnCancel = null;
    private JPanel pnlCenter = null;
    private JRadioButton rbtNAry = null;
    private JRadioButton rbtXor = null;
    private JLabel lblLinkKind = null;
    private JLabel lblRole = null;
    private JComboBox cbxXorParticipant = null;

    /**
     * Choose whether Role is n-ary or XOR.
     * @param owner
     * @param assoc
     * @param xorNode
     */
    public LinkNodeDialog(Frame owner, ch.ehi.umleditor.umlpresentation.Association assoc, PresentationNode xorNode) {
        super(owner, true);
		initialize();

        try {
            java.util.Vector roles = new java.util.Vector();
            Iterator it = ((Association)assoc.iteratorSubject().next()).iteratorConnection();
            while (it.hasNext()) {
                RoleDef role = (RoleDef)it.next();
                if ((role.getParticipant() != null) && (!role.getParticipant().equals(xorNode.iteratorSubject().next()))) {
                    // do not XOR to xorNode itself
                    roles.add(role /*.getName().getValue()*/);
                }                
            }
            JComboBoxUtility.initComboBox(cbxXorParticipant, roles, "name", true, this);
        } catch(Throwable e) {
            handleException(e);
        }
    }

    /**
     * This method initializes this
     */
    private void initialize() {
    	try {
            this.setSize(new Dimension(567, 172));
            this.setContentPane(getPnlMain());
            this.setTitle("Association to Linknode");
    			
            ButtonGroup group = new ButtonGroup();
            group.add(getRbtNAry());
            group.add(getRbtXor());
            
            checkConsistency();
    	}
    	catch (java.lang.Throwable e) {
            handleException(e);
    	}
    }

    /**
     * This method initializes pnlMain	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getPnlMain() {
        if (pnlMain == null) {
            try {
                pnlMain = new JPanel();
                pnlMain.setLayout(new BoxLayout(getPnlMain(), BoxLayout.Y_AXIS));
                pnlMain.add(getJPanel(), null);
            } catch (java.lang.Throwable e) {
                handleException(e);
            }
        }
        return pnlMain;
    }

    /**
     * This method initializes jPanel	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getJPanel() {
        if (jPanel == null) {
            try {
                jPanel = new JPanel();
                jPanel.setLayout(new BorderLayout());
                jPanel.add(getPnlSouth(), BorderLayout.SOUTH);
                jPanel.add(getPnlCenter(), BorderLayout.CENTER);
            } catch (java.lang.Throwable e) {
                handleException(e);
            }
        }
        return jPanel;
    }

    /**
     * This method initializes pnlSouth	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getPnlSouth() {
        if (pnlSouth == null) {
            try {
                pnlSouth = new JPanel();
                pnlSouth.setLayout(new FlowLayout());
                pnlSouth.setPreferredSize(new Dimension(0, 30));
                pnlSouth.add(getBtnOk(), null);
                pnlSouth.add(getBtnCancel(), null);
            } catch (java.lang.Throwable e) {
                handleException(e);
            }
        }
        return pnlSouth;
    }

    /**
     * This method initializes btnOk	
     * 	
     * @return javax.swing.JButton	
     */
    private JButton getBtnOk() {
        if (btnOk == null) {
            try {
                btnOk = new JButton();
                btnOk.setText(getOKString());
                btnOk.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent e) {
                        okPressed();
                    }
                });
            } catch (java.lang.Throwable e) {
                handleException(e);
            }
        }
        return btnOk;
    }

    /**
     * This method initializes btnCancel	
     * 	
     * @return javax.swing.JButton	
     */
    private JButton getBtnCancel() {
        if (btnCancel == null) {
            try {
                btnCancel = new JButton();
                btnCancel.setText(getCancelString());
                btnCancel.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent e) {
                        cancelPressed();
                    }
                });
            } catch (java.lang.Throwable e) {
                handleException(e);
            }
        }
        return btnCancel;
    }

    /**
     * This method initializes pnlCenter	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getPnlCenter() {
        if (pnlCenter == null) {
            try {
                lblRole = new JLabel();
                lblRole.setBounds(new Rectangle(121, 67, 82, 15));
                lblRole.setToolTipText("Involved XOR-Role");
                lblRole.setText("Participant:");
                lblLinkKind = new JLabel();
                lblLinkKind.setBounds(new Rectangle(22, 5, 164, 24));
                lblLinkKind.setText("Choose type of Link:");
                pnlCenter = new JPanel();
                pnlCenter.setLayout(null);
                pnlCenter.add(getRbtNAry(), null);
                pnlCenter.add(getRbtXor(), null);
                pnlCenter.add(lblLinkKind, null);
                pnlCenter.add(lblRole, null);
                pnlCenter.add(getCbxXorParticipant(), null);
            } catch (java.lang.Throwable e) {
                handleException(e);
            }
        }
        return pnlCenter;
    }

    /**
     * This method initializes rbtNAry	
     * 	
     * @return javax.swing.JRadioButton	
     */
    private JRadioButton getRbtNAry() {
        if (rbtNAry == null) {
            try {
                rbtNAry = new JRadioButton();
                rbtNAry.setBounds(new Rectangle(24, 38, 106, 21));
                rbtNAry.setSelected(true);
                rbtNAry.setText("n-ary");
                rbtNAry.addItemListener(new java.awt.event.ItemListener() {
                    public void itemStateChanged(java.awt.event.ItemEvent e) {
                        checkConsistency();
                    }
                });
            } catch (java.lang.Throwable e) {
                handleException(e);
            }
        }
        return rbtNAry;
    }

    /**
     * This method initializes rbtXor	
     * 	
     * @return javax.swing.JRadioButton	
     */
    private JRadioButton getRbtXor() {
        if (rbtXor == null) {
            try {
                rbtXor = new JRadioButton();
                rbtXor.setBounds(new Rectangle(24, 61, 62, 23));
                rbtXor.setText("XOR");
                rbtXor.addItemListener(new java.awt.event.ItemListener() {
                    public void itemStateChanged(java.awt.event.ItemEvent e) {
                        checkConsistency();
                    }
                });
            } catch (java.lang.Throwable e) {
                handleException(e);
            }
        }
        return rbtXor;
    }

    /**
     * This method initializes cbxXorParticipant	
     * 	
     * @return javax.swing.JComboBox	
     */
    private JComboBox getCbxXorParticipant() {
        if (cbxXorParticipant == null) {
            try {
                cbxXorParticipant = new JComboBox();
                cbxXorParticipant.setBounds(new Rectangle(222, 64, 321, 19));
                cbxXorParticipant.addItemListener(new java.awt.event.ItemListener() {
                    public void itemStateChanged(java.awt.event.ItemEvent e) {
                        checkConsistency();
                    }
                });
            } catch (java.lang.Throwable e) {
                handleException(e);
            }
        }
        return cbxXorParticipant;
    }
    public boolean isNAry() {
        return (isSaved() && getRbtNAry().isSelected());
    }
    public boolean isXor() {
        return (isSaved() && getRbtXor().isSelected() && (getCbxXorParticipant().getSelectedItem() != null));
    }
    public RoleDef getXorParticipant() {
        return (RoleDef)getCbxXorParticipant().getSelectedItem();
    }

    public Object evaluate(Object owner, final String property) {
        if (owner != null) {
            return ((RoleDef)owner).getName().getValue();
        }
        return null;
    }
    private void checkConsistency() {
        getCbxXorParticipant().setEnabled(getRbtXor().isSelected());
        getBtnOk().setEnabled(getRbtNAry().isSelected() ||
                getCbxXorParticipant().getSelectedItem() != null);
    }
}  //  @jve:decl-index=0:visual-constraint="10,10"
=======
	
	private static final long serialVersionUID = 6152453762848517925L;
	private JPanel pnlMain = null;
	private JPanel jPanel = null;
	private JPanel pnlSouth = null;
	private JButton btnOk = null;
	private JButton btnCancel = null;
	private JPanel pnlCenter = null;
	private JRadioButton rbtNAry = null;
	private JRadioButton rbtXor = null;
	private JLabel lblLinkKind = null;
	private JLabel lblRole = null;
	private JComboBox cbxXorParticipant = null;

	/**
	 * Choose whether Role is n-ary or XOR.
	 * 
	 * @param owner
	 * @param assoc
	 * @param xorNode
	 */
	public LinkNodeDialog(Frame owner, ch.ehi.umleditor.umlpresentation.Association assoc, PresentationNode xorNode) {
		super(owner, true);
		initialize();

		try {
			java.util.Vector roles = new java.util.Vector();
			Iterator it = ((Association) assoc.iteratorSubject().next()).iteratorConnection();
			while (it.hasNext()) {
				RoleDef role = (RoleDef) it.next();
				if ((role.getParticipant() != null)
						&& (!role.getParticipant().equals(xorNode.iteratorSubject().next()))) {
					// do not XOR to xorNode itself
					roles.add(role /* .getName().getValue() */);
				}
			}
			JComboBoxUtility.initComboBox(cbxXorParticipant, roles, "name", true, this);
		} catch (Throwable e) {
			handleException(e);
		}
	}

	/**
	 * This method initializes this
	 */
	private void initialize() {
		try {
			this.setSize(new Dimension(567, 172));
			this.setContentPane(getPnlMain());
			this.setTitle("Association to Linknode");

			ButtonGroup group = new ButtonGroup();
			group.add(getRbtNAry());
			group.add(getRbtXor());

			checkConsistency();
		} catch (java.lang.Throwable e) {
			handleException(e);
		}
	}

	/**
	 * This method initializes pnlMain
	 *
	 * @return javax.swing.JPanel
	 */
	private JPanel getPnlMain() {
		if (pnlMain == null) {
			try {
				pnlMain = new JPanel();
				pnlMain.setLayout(new BoxLayout(getPnlMain(), BoxLayout.Y_AXIS));
				pnlMain.add(getJPanel(), null);
			} catch (java.lang.Throwable e) {
				handleException(e);
			}
		}
		return pnlMain;
	}

	/**
	 * This method initializes jPanel
	 *
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			try {
				jPanel = new JPanel();
				jPanel.setLayout(new BorderLayout());
				jPanel.add(getPnlSouth(), BorderLayout.SOUTH);
				jPanel.add(getPnlCenter(), BorderLayout.CENTER);
			} catch (java.lang.Throwable e) {
				handleException(e);
			}
		}
		return jPanel;
	}

	/**
	 * This method initializes pnlSouth
	 *
	 * @return javax.swing.JPanel
	 */
	private JPanel getPnlSouth() {
		if (pnlSouth == null) {
			try {
				pnlSouth = new JPanel();
				pnlSouth.setLayout(new FlowLayout());
				pnlSouth.setPreferredSize(new Dimension(0, 30));
				pnlSouth.add(getBtnOk(), null);
				pnlSouth.add(getBtnCancel(), null);
			} catch (java.lang.Throwable e) {
				handleException(e);
			}
		}
		return pnlSouth;
	}

	/**
	 * This method initializes btnOk
	 *
	 * @return javax.swing.JButton
	 */
	private JButton getBtnOk() {
		if (btnOk == null) {
			try {
				btnOk = new JButton();
				btnOk.setText(getOKString());
				btnOk.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent e) {
						okPressed();
					}
				});
			} catch (java.lang.Throwable e) {
				handleException(e);
			}
		}
		return btnOk;
	}

	/**
	 * This method initializes btnCancel
	 *
	 * @return javax.swing.JButton
	 */
	private JButton getBtnCancel() {
		if (btnCancel == null) {
			try {
				btnCancel = new JButton();
				btnCancel.setText(getCancelString());
				btnCancel.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent e) {
						cancelPressed();
					}
				});
			} catch (java.lang.Throwable e) {
				handleException(e);
			}
		}
		return btnCancel;
	}

	/**
	 * This method initializes pnlCenter
	 *
	 * @return javax.swing.JPanel
	 */
	private JPanel getPnlCenter() {
		if (pnlCenter == null) {
			try {
				lblRole = new JLabel();
				lblRole.setBounds(new Rectangle(121, 67, 82, 15));
				lblRole.setToolTipText("Involved XOR-Role");
				lblRole.setText("Participant:");
				lblLinkKind = new JLabel();
				lblLinkKind.setBounds(new Rectangle(22, 5, 164, 24));
				lblLinkKind.setText("Choose type of Link:");
				pnlCenter = new JPanel();
				pnlCenter.setLayout(null);
				pnlCenter.add(getRbtNAry(), null);
				pnlCenter.add(getRbtXor(), null);
				pnlCenter.add(lblLinkKind, null);
				pnlCenter.add(lblRole, null);
				pnlCenter.add(getCbxXorParticipant(), null);
			} catch (java.lang.Throwable e) {
				handleException(e);
			}
		}
		return pnlCenter;
	}

	/**
	 * This method initializes rbtNAry
	 *
	 * @return javax.swing.JRadioButton
	 */
	private JRadioButton getRbtNAry() {
		if (rbtNAry == null) {
			try {
				rbtNAry = new JRadioButton();
				rbtNAry.setBounds(new Rectangle(24, 38, 106, 21));
				rbtNAry.setSelected(true);
				rbtNAry.setText("n-ary");
				rbtNAry.addItemListener(new java.awt.event.ItemListener() {
					public void itemStateChanged(java.awt.event.ItemEvent e) {
						checkConsistency();
					}
				});
			} catch (java.lang.Throwable e) {
				handleException(e);
			}
		}
		return rbtNAry;
	}

	/**
	 * This method initializes rbtXor
	 *
	 * @return javax.swing.JRadioButton
	 */
	private JRadioButton getRbtXor() {
		if (rbtXor == null) {
			try {
				rbtXor = new JRadioButton();
				rbtXor.setBounds(new Rectangle(24, 61, 62, 23));
				rbtXor.setText("XOR");
				rbtXor.addItemListener(new java.awt.event.ItemListener() {
					public void itemStateChanged(java.awt.event.ItemEvent e) {
						checkConsistency();
					}
				});
			} catch (java.lang.Throwable e) {
				handleException(e);
			}
		}
		return rbtXor;
	}

	/**
	 * This method initializes cbxXorParticipant
	 *
	 * @return javax.swing.JComboBox
	 */
	private JComboBox getCbxXorParticipant() {
		if (cbxXorParticipant == null) {
			try {
				cbxXorParticipant = new JComboBox();
				cbxXorParticipant.setBounds(new Rectangle(222, 64, 321, 19));
				cbxXorParticipant.addItemListener(new java.awt.event.ItemListener() {
					public void itemStateChanged(java.awt.event.ItemEvent e) {
						checkConsistency();
					}
				});
			} catch (java.lang.Throwable e) {
				handleException(e);
			}
		}
		return cbxXorParticipant;
	}

	public boolean isNAry() {
		return (isSaved() && getRbtNAry().isSelected());
	}

	public boolean isXor() {
		return (isSaved() && getRbtXor().isSelected() && (getCbxXorParticipant().getSelectedItem() != null));
	}

	public RoleDef getXorParticipant() {
		return (RoleDef) getCbxXorParticipant().getSelectedItem();
	}

	public Object evaluate(Object owner, final String property) {
		if (owner != null) {
			return ((RoleDef) owner).getName().getValue();
		}
		return null;
	}

	private void checkConsistency() {
		getCbxXorParticipant().setEnabled(getRbtXor().isSelected());
		getBtnOk().setEnabled(getRbtNAry().isSelected() || getCbxXorParticipant().getSelectedItem() != null);
	}
} // @jve:decl-index=0:visual-constraint="10,10"
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
