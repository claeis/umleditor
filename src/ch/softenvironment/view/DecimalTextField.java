package ch.softenvironment.view;

/**
 * Extended JTextField to show formated Decimal values.
 * Allows visual connection of Attribute-to-Attribute connection from e.g.
 * a Double-Property of a Model to this Components value-Property. Make sure
 * to trigger <b>propertyChange</b>-Event from this Component towards the Model.
 * The Model will be updated after a focusLost-Event.
 * @author: Peter Hirzel (©2002)
 */
public class DecimalTextField extends javax.swing.JTextField implements java.awt.event.FocusListener {
	private static java.util.ResourceBundle resDecimalTextField = java.util.ResourceBundle.getBundle("ch/softenvironment/nls/DecimalTextField");
	private java.lang.Double fieldValue = null;
	private ch.softenvironment.util.AmountFormat decimalFormat = null;
	private int fractionPartLength = 2;
/**
 * DecimalTextField constructor comment.
 */
public DecimalTextField() {
	super();
	addFocusListener(this);
}
/**
 * Invoked when a component gains the keyboard focus.
 */
public void focusGained(java.awt.event.FocusEvent e) {
    // not of interest
}
/**
 * Invoked when this component loses the keyboard focus.
 * Reformat the value according the applied pattern.
 * @see setValue (causes a visual update by setText)
 */
public void focusLost(java.awt.event.FocusEvent e) {
	try {
		if (getText().length() > 0) {
			setValue(new Double(getDecimalFormat().parse(getText()).doubleValue()));
		} else {
			setValue(null);
		}
	} catch (Throwable exception) {
		Object parent = getRootPane().getParent();
		String title = resDecimalTextField.getString("CTInvalidInput"); //$NON-NLS-1$
		String message = resDecimalTextField.getString("CICorrectInput"); //$NON-NLS-1$
		if (parent instanceof java.awt.Dialog) {
			new ErrorDialog((java.awt.Dialog)parent, title, message, exception);
		} else {
			new ErrorDialog((java.awt.Frame)parent, title, message, exception);
		}
	}
}
/**
 * @return the DecimalFormat applied to value.
 */
public java.text.DecimalFormat getDecimalFormat() {
	if (decimalFormat == null) {
		decimalFormat = new ch.softenvironment.util.AmountFormat();
	}
	return decimalFormat;
}
/**
 * Gets the value property (java.lang.Double) value.
 * @return The value property value.
 * @see #setValue
 */
public java.lang.Double getValue() {
	return fieldValue;
}
/**
 * Sets the value property (java.lang.Double) value.
 * @param value The new value for the property.
 * @see #getValue
 */
public void setValue(java.lang.Double value) {
	Double oldValue = fieldValue;
	fieldValue = value;
	firePropertyChange("value", oldValue, value);//$NON-NLS-1$

	// display text
	if (value == null) {
		setText("");//$NON-NLS-1$
	} else {
		setText(getDecimalFormat().format(value.doubleValue()));
	}
}
}
