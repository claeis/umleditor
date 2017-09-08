// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:40:12 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3CD943D700CE package "TestLayout"
package ch.ehi.umleditor.format;
// -end- 3CD943D700CE package "TestLayout"

// -beg- preserve=no 3CD943D700CE stdimport "TestLayout"
import javax.swing.*;
// -end- 3CD943D700CE stdimport "TestLayout"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3CD943D700CE import "TestLayout"

// -end- 3CD943D700CE import "TestLayout"

public class TestLayoutPane extends JPanel implements javax.swing.event.ChangeListener {

	// attributes only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3CD943D700CE usrattr "TestLayout"

	// -end- 3CD943D700CE usrattr "TestLayout"

	private static final long serialVersionUID = -3527571267426396043L;

	// -beg- preserve=no 3CD943D700CE var3CD943D700CE "TestLayout"
	private Layout thismodel = null;
	// -end- 3CD943D700CE var3CD943D700CE "TestLayout"

	// -beg- preserve=no 3CD943F50117 var3CD943D700CE "delta1"
	private JLabel delta1Lbl = null;
	private JTextField delta1Txt = null;
	// -end- 3CD943F50117 var3CD943D700CE "delta1"

	// -beg- preserve=no 3CD943FA01D3 var3CD943D700CE "delta2"
	private JLabel delta2Lbl = null;
	private JTextField delta2Txt = null;
	// -end- 3CD943FA01D3 var3CD943D700CE "delta2"

	// -beg- preserve=no 3CD943FF00EA var3CD943D700CE "delta3"
	private JLabel delta3Lbl = null;
	private JTextField delta3Txt = null;
	// -end- 3CD943FF00EA var3CD943D700CE "delta3"

	// -beg- preserve=no 3CD944040372 var3CD943D700CE "delta4"
	private JLabel delta4Lbl = null;
	private JTextField delta4Txt = null;
	// -end- 3CD944040372 var3CD943D700CE "delta4"

	// -beg- preserve=no 3CD9440C02BF var3CD943D700CE "delta10"
	private JLabel delta10Lbl = null;
	private JTextField delta10Txt = null;
	// -end- 3CD9440C02BF var3CD943D700CE "delta10"

	// -beg- preserve=no 3CD94411019A var3CD943D700CE "delta11"
	private JLabel delta11Lbl = null;
	private JTextField delta11Txt = null;
	// -end- 3CD94411019A var3CD943D700CE "delta11"

	private void initialize() {
		// initialize sub panes
		// please fill in/modify the following section
		// -beg- preserve=no 3CD943D700CE initPanes3CD943D700CE "TestLayout"
		java.awt.GridBagConstraints constraints = new java.awt.GridBagConstraints();
		java.awt.GridBagConstraints constraints2 = new java.awt.GridBagConstraints();
		setLayout(new java.awt.GridBagLayout());
		constraints.gridx = 1;
		constraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		constraints2.gridx = 0;
		constraints2.anchor = java.awt.GridBagConstraints.NORTHWEST;
		// -end- 3CD943D700CE initPanes3CD943D700CE "TestLayout"

		// -beg- preserve=no 3CD943F50117 initLayoutConstr3CD943D700CE "delta1"
		constraints.gridy += 1;
		constraints2.gridy += 1;
		// -end- 3CD943F50117 initLayoutConstr3CD943D700CE "delta1"
		// -beg- preserve=no 3CD943F50117 init3CD943D700CE "delta1"
		delta1Lbl = new JLabel("node distribution");
		add(delta1Lbl, constraints2);
		delta1Txt = new JTextField();
		add(delta1Txt, constraints);
		delta1Lbl.setLabelFor(delta1Txt);
		// -end- 3CD943F50117 init3CD943D700CE "delta1"
		// set additional properties
		// please fill in/modify the following section
		// -beg- preserve=no 3CD943F50117 usrinit3CD943D700CE "delta1"
		delta1Txt.setColumns(10);
		// -end- 3CD943F50117 usrinit3CD943D700CE "delta1"

		// -beg- preserve=no 3CD943FA01D3 initLayoutConstr3CD943D700CE "delta2"
		constraints.gridy += 1;
		constraints2.gridy += 1;
		// -end- 3CD943FA01D3 initLayoutConstr3CD943D700CE "delta2"
		// -beg- preserve=no 3CD943FA01D3 init3CD943D700CE "delta2"
		delta2Lbl = new JLabel("borderline");
		add(delta2Lbl, constraints2);
		delta2Txt = new JTextField();
		add(delta2Txt, constraints);
		delta2Lbl.setLabelFor(delta2Txt);
		// -end- 3CD943FA01D3 init3CD943D700CE "delta2"
		// set additional properties
		// please fill in/modify the following section
		// -beg- preserve=no 3CD943FA01D3 usrinit3CD943D700CE "delta2"
		delta2Txt.setColumns(10);
		// -end- 3CD943FA01D3 usrinit3CD943D700CE "delta2"

		// -beg- preserve=no 3CD943FF00EA initLayoutConstr3CD943D700CE "delta3"
		constraints.gridy += 1;
		constraints2.gridy += 1;
		// -end- 3CD943FF00EA initLayoutConstr3CD943D700CE "delta3"
		// -beg- preserve=no 3CD943FF00EA init3CD943D700CE "delta3"
		delta3Lbl = new JLabel("edgelength");
		add(delta3Lbl, constraints2);
		delta3Txt = new JTextField();
		add(delta3Txt, constraints);
		delta3Lbl.setLabelFor(delta3Txt);
		// -end- 3CD943FF00EA init3CD943D700CE "delta3"
		// set additional properties
		// please fill in/modify the following section
		// -beg- preserve=no 3CD943FF00EA usrinit3CD943D700CE "delta3"
		delta3Txt.setColumns(10);
		// -end- 3CD943FF00EA usrinit3CD943D700CE "delta3"

		// -beg- preserve=no 3CD944040372 initLayoutConstr3CD943D700CE "delta4"
		constraints.gridy += 1;
		constraints2.gridy += 1;
		// -end- 3CD944040372 initLayoutConstr3CD943D700CE "delta4"
		// -beg- preserve=no 3CD944040372 init3CD943D700CE "delta4"
		delta4Lbl = new JLabel("edgecrossing");
		add(delta4Lbl, constraints2);
		delta4Txt = new JTextField();
		add(delta4Txt, constraints);
		delta4Lbl.setLabelFor(delta4Txt);
		// -end- 3CD944040372 init3CD943D700CE "delta4"
		// set additional properties
		// please fill in/modify the following section
		// -beg- preserve=no 3CD944040372 usrinit3CD943D700CE "delta4"
		delta4Txt.setColumns(10);
		// -end- 3CD944040372 usrinit3CD943D700CE "delta4"

		// -beg- preserve=no 3CD9440C02BF initLayoutConstr3CD943D700CE "delta10"
		constraints.gridy += 1;
		constraints2.gridy += 1;
		// -end- 3CD9440C02BF initLayoutConstr3CD943D700CE "delta10"
		// -beg- preserve=no 3CD9440C02BF init3CD943D700CE "delta10"
		delta10Lbl = new JLabel("delta10");
		add(delta10Lbl, constraints2);
		delta10Txt = new JTextField();
		add(delta10Txt, constraints);
		delta10Lbl.setLabelFor(delta10Txt);
		// -end- 3CD9440C02BF init3CD943D700CE "delta10"
		// set additional properties
		// please fill in/modify the following section
		// -beg- preserve=no 3CD9440C02BF usrinit3CD943D700CE "delta10"
		delta10Txt.setColumns(10);
		// -end- 3CD9440C02BF usrinit3CD943D700CE "delta10"

		// -beg- preserve=no 3CD94411019A initLayoutConstr3CD943D700CE "delta11"
		constraints.gridy += 1;
		constraints2.gridy += 1;
		// -end- 3CD94411019A initLayoutConstr3CD943D700CE "delta11"
		// -beg- preserve=no 3CD94411019A init3CD943D700CE "delta11"
		delta11Lbl = new JLabel("delta11");
		add(delta11Lbl, constraints2);
		delta11Txt = new JTextField();
		add(delta11Txt, constraints);
		delta11Lbl.setLabelFor(delta11Txt);
		// -end- 3CD94411019A init3CD943D700CE "delta11"
		// set additional properties
		// please fill in/modify the following section
		// -beg- preserve=no 3CD94411019A usrinit3CD943D700CE "delta11"
		delta11Txt.setColumns(10);
		// -end- 3CD94411019A usrinit3CD943D700CE "delta11"

	}

	private double getValueDelta1(Layout object) {
		// -beg- preserve=no 3CD943F50117 getValue3CD943D700CE "delta1"
		return object.delta1;
		// -end- 3CD943F50117 getValue3CD943D700CE "delta1"
	}

	private double getValueDelta2(Layout object) {
		// -beg- preserve=no 3CD943FA01D3 getValue3CD943D700CE "delta2"
		return object.delta2;
		// -end- 3CD943FA01D3 getValue3CD943D700CE "delta2"
	}

	private double getValueDelta3(Layout object) {
		// -beg- preserve=no 3CD943FF00EA getValue3CD943D700CE "delta3"
		return object.delta3;
		// -end- 3CD943FF00EA getValue3CD943D700CE "delta3"
	}

	private double getValueDelta4(Layout object) {
		// -beg- preserve=no 3CD944040372 getValue3CD943D700CE "delta4"
		return object.delta4;
		// -end- 3CD944040372 getValue3CD943D700CE "delta4"
	}

	private double getValueDelta10(Layout object) {
		// -beg- preserve=no 3CD9440C02BF getValue3CD943D700CE "delta10"
		return object.delta10;
		// -end- 3CD9440C02BF getValue3CD943D700CE "delta10"
	}

	private double getValueDelta11(Layout object) {
		// -beg- preserve=no 3CD94411019A getValue3CD943D700CE "delta11"
		return object.delta11;
		// -end- 3CD94411019A getValue3CD943D700CE "delta11"
	}

	private void setValueDelta1(Layout object, double value) {
		// -beg- preserve=no 3CD943F50117 setValue3CD943D700CE "delta1"
		object.delta1 = value;
		// -end- 3CD943F50117 setValue3CD943D700CE "delta1"
	}

	private void setValueDelta2(Layout object, double value) {
		// -beg- preserve=no 3CD943FA01D3 setValue3CD943D700CE "delta2"
		object.delta2 = value;
		// -end- 3CD943FA01D3 setValue3CD943D700CE "delta2"
	}

	private void setValueDelta3(Layout object, double value) {
		// -beg- preserve=no 3CD943FF00EA setValue3CD943D700CE "delta3"
		object.delta3 = value;
		// -end- 3CD943FF00EA setValue3CD943D700CE "delta3"
	}

	private void setValueDelta4(Layout object, double value) {
		// -beg- preserve=no 3CD944040372 setValue3CD943D700CE "delta4"
		object.delta4 = value;
		// -end- 3CD944040372 setValue3CD943D700CE "delta4"
	}

	private void setValueDelta10(Layout object, double value) {
		// -beg- preserve=no 3CD9440C02BF setValue3CD943D700CE "delta10"
		object.delta10 = value;
		// -end- 3CD9440C02BF setValue3CD943D700CE "delta10"
	}

	private void setValueDelta11(Layout object, double value) {
		// -beg- preserve=no 3CD94411019A setValue3CD943D700CE "delta11"
		object.delta11 = value;
		// -end- 3CD94411019A setValue3CD943D700CE "delta11"
	}

	public TestLayoutPane() {
		super();
		initialize();
	}

	public void setModel(Layout model) {
		thismodel = model;
		updateView();
	}

	private java.awt.Frame getFrame() {
		java.awt.Container parent = getParent();
		while (parent != null) {
			if (parent instanceof java.awt.Frame)
				return (java.awt.Frame) parent;
			parent = parent.getParent();
		}
		return null;
	}

	private boolean ignoreModelChanges = false;

	public void stateChanged(javax.swing.event.ChangeEvent event) {
		if (!ignoreModelChanges)
			updateView();
	}

	public void updateView() {
		String txt = "";
		// -beg- preserve=no 3CD943F50117 updateViewFmt3CD943D700CE "delta1"
		if (thismodel != null)
			txt = Double.toString(getValueDelta1(thismodel));
		// -end- 3CD943F50117 updateViewFmt3CD943D700CE "delta1"
		// -beg- preserve=no 3CD943F50117 updateView3CD943D700CE "delta1"
		delta1Txt.setText(txt);
		// -end- 3CD943F50117 updateView3CD943D700CE "delta1"
		// -beg- preserve=no 3CD943FA01D3 updateViewFmt3CD943D700CE "delta2"
		if (thismodel != null)
			txt = Double.toString(getValueDelta2(thismodel));
		// -end- 3CD943FA01D3 updateViewFmt3CD943D700CE "delta2"
		// -beg- preserve=no 3CD943FA01D3 updateView3CD943D700CE "delta2"
		delta2Txt.setText(txt);
		// -end- 3CD943FA01D3 updateView3CD943D700CE "delta2"
		// -beg- preserve=no 3CD943FF00EA updateViewFmt3CD943D700CE "delta3"
		if (thismodel != null)
			txt = Double.toString(getValueDelta3(thismodel));
		// -end- 3CD943FF00EA updateViewFmt3CD943D700CE "delta3"
		// -beg- preserve=no 3CD943FF00EA updateView3CD943D700CE "delta3"
		delta3Txt.setText(txt);
		// -end- 3CD943FF00EA updateView3CD943D700CE "delta3"
		// -beg- preserve=no 3CD944040372 updateViewFmt3CD943D700CE "delta4"
		if (thismodel != null)
			txt = Double.toString(getValueDelta4(thismodel));
		// -end- 3CD944040372 updateViewFmt3CD943D700CE "delta4"
		// -beg- preserve=no 3CD944040372 updateView3CD943D700CE "delta4"
		delta4Txt.setText(txt);
		// -end- 3CD944040372 updateView3CD943D700CE "delta4"
		// -beg- preserve=no 3CD9440C02BF updateViewFmt3CD943D700CE "delta10"
		if (thismodel != null)
			txt = Double.toString(getValueDelta10(thismodel));
		// -end- 3CD9440C02BF updateViewFmt3CD943D700CE "delta10"
		// -beg- preserve=no 3CD9440C02BF updateView3CD943D700CE "delta10"
		delta10Txt.setText(txt);
		// -end- 3CD9440C02BF updateView3CD943D700CE "delta10"
		// -beg- preserve=no 3CD94411019A updateViewFmt3CD943D700CE "delta11"
		if (thismodel != null)
			txt = Double.toString(getValueDelta11(thismodel));
		// -end- 3CD94411019A updateViewFmt3CD943D700CE "delta11"
		// -beg- preserve=no 3CD94411019A updateView3CD943D700CE "delta11"
		delta11Txt.setText(txt);
		// -end- 3CD94411019A updateView3CD943D700CE "delta11"
	}

	public void updateModel() {
		String txt = "";
		int kind = 0;
		ignoreModelChanges = true;
		// -beg- preserve=no 3CD943F50117 updateModelCheck3CD943D700CE "delta1"
		txt = delta1Txt.getText();
		// -end- 3CD943F50117 updateModelCheck3CD943D700CE "delta1"
		// -beg- preserve=no 3CD943F50117 updateModel3CD943D700CE "delta1"
		setValueDelta1(thismodel, Double.parseDouble(txt));
		// -end- 3CD943F50117 updateModel3CD943D700CE "delta1"
		// -beg- preserve=no 3CD943FA01D3 updateModelCheck3CD943D700CE "delta2"
		txt = delta2Txt.getText();
		// -end- 3CD943FA01D3 updateModelCheck3CD943D700CE "delta2"
		// -beg- preserve=no 3CD943FA01D3 updateModel3CD943D700CE "delta2"
		setValueDelta2(thismodel, Double.parseDouble(txt));
		// -end- 3CD943FA01D3 updateModel3CD943D700CE "delta2"
		// -beg- preserve=no 3CD943FF00EA updateModelCheck3CD943D700CE "delta3"
		txt = delta3Txt.getText();
		// -end- 3CD943FF00EA updateModelCheck3CD943D700CE "delta3"
		// -beg- preserve=no 3CD943FF00EA updateModel3CD943D700CE "delta3"
		setValueDelta3(thismodel, Double.parseDouble(txt));
		// -end- 3CD943FF00EA updateModel3CD943D700CE "delta3"
		// -beg- preserve=no 3CD944040372 updateModelCheck3CD943D700CE "delta4"
		txt = delta4Txt.getText();
		// -end- 3CD944040372 updateModelCheck3CD943D700CE "delta4"
		// -beg- preserve=no 3CD944040372 updateModel3CD943D700CE "delta4"
		setValueDelta4(thismodel, Double.parseDouble(txt));
		// -end- 3CD944040372 updateModel3CD943D700CE "delta4"
		// -beg- preserve=no 3CD9440C02BF updateModelCheck3CD943D700CE "delta10"
		txt = delta10Txt.getText();
		// -end- 3CD9440C02BF updateModelCheck3CD943D700CE "delta10"
		// -beg- preserve=no 3CD9440C02BF updateModel3CD943D700CE "delta10"
		setValueDelta10(thismodel, Double.parseDouble(txt));
		// -end- 3CD9440C02BF updaten3CD943D700CE "delta10"
		// -beg- preserve=no 3CD94411019A updateModelCheck3CD943D700CE "delta11"
		txt = delta11Txt.getText();
		// -end- 3CD94411019A updateModelCheck3CD943D700CE "delta11"
		// -beg- preserve=no 3CD94411019A updateModel3CD943D700CE "delta11"
		setValueDelta11(thismodel, Double.parseDouble(txt));
		// -end- 3CD94411019A updateModel3CD943D700CE "delta11"
		ignoreModelChanges = false;
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3CD943D700CE detail_end "TestLayout"

	// -end- 3CD943D700CE detail_end "TestLayout"

}
