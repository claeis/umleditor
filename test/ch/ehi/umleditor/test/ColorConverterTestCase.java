package ch.ehi.umleditor.test;

import ch.ehi.umleditor.umldrawingtools.ColorConverter;
/**
 * Test class ColorConverter
 * @author Peter Hirzel
 */
public class ColorConverterTestCase extends junit.framework.TestCase {
	int red;
	int green;
	int blue;

	java.awt.Color awtColor = null;
	ch.ehi.umleditor.umlpresentation.Color presentationColor = null;
/**
 * ColorConverterTestCase constructor comment.
 * @param name java.lang.String
 */
public ColorConverterTestCase(String name) {
	super(name);
}
/**
 * Sets up the fixture, for example, open a network connection.
 * This method is called before a test is executed.
 */
protected void setUp() throws Exception {
	red = 34;
	green = 104;
	blue = 99;
	
	awtColor = new java.awt.Color(red, green, blue);
	
	presentationColor = new ch.ehi.umleditor.umlpresentation.Color();
	presentationColor.setRed(red);
	presentationColor.setGreen(green);
	presentationColor.setBlue(blue);
}
/**
 * Test static Creators.
 */
public void testCreateAwtColor() {
	awtColor = ColorConverter.createColor(presentationColor);
	
	assertTrue("create awtColor->red", awtColor.getRed() == red);
	assertTrue("create awtColor->green", awtColor.getGreen() == green);
	assertTrue("create awtColor->blue", awtColor.getBlue() == blue);
}
/**
 * Test static Creators.
 */
public void testCreatePresentationColor() {
	presentationColor = ColorConverter.createColor(awtColor);
	
	assertTrue("create PresentationColor->red", presentationColor.getRed() == red);
	assertTrue("create PresentationColor->green", presentationColor.getGreen() == green);
	assertTrue("create PresentationColor->blue", presentationColor.getBlue() == blue);
}
/**
 * Test static comparison.
 */
public void testIsSame() {
	assertTrue("isSame(<equal color>)", ColorConverter.isSame(presentationColor, awtColor));
	assertTrue("isSame(null, null)", ColorConverter.isSame(null, null));
	assertTrue("!isSame(color, null)", !ColorConverter.isSame(presentationColor, null));
	assertTrue("!isSame(null, color)", !ColorConverter.isSame(null, awtColor));	
}
}
