package ch.ehi.umleditor.test;


import junit.framework.Test;
import junit.framework.TestSuite;
import junit.swingui.TestRunner;

import ch.softenvironment.util.Tracer;
/**
 * Run this class for UmlEditor TestCases.
 * @author Peter Hirzel
 */
public class UmlEditorTestSuite extends TestSuite {
/**
 * DemoTestSuite constructor comment.
 */
public UmlEditorTestSuite() {
	super();
}
/**
 * DemoTestSuite constructor comment.
 * @param arg1 java.lang.Class
 */
public UmlEditorTestSuite(Class arg1) {
	super(arg1);
}
/**
 * DemoTestSuite constructor comment.
 * @param arg1 java.lang.String
 */
public UmlEditorTestSuite(String arg1) {
	super(arg1);
}
/**
 * Insert the method's description here.
 * Creation date: (10.05.2001 12:14:54)
 * @return junit.framework.Test
 */
public static void main(String[] args) {
	Tracer.start(args);
	//junit.textui.TestRunner.run(suite());
	//junit.awtui.TestRunner.run(UmlEditorTestSuite.class);
	TestRunner.run(UmlEditorTestSuite.class);
}
/**
 * Insert the method's description here.
 * Creation date: (10.05.2001 12:14:54)
 * @return junit.framework.Test
 */
public static Test suite() {
	TestSuite suite =  new TestSuite("Testing: ch.ehi.* in Project <UmlEditor>");
	suite.addTest(new TestSuite(MultiplicityConverterTestCase.class));
	suite.addTest(new TestSuite(ColorConverterTestCase.class));

	/* in non VAJ environments:
		suite.addTest(new TestSuite(TestTestCaseClassLoader.class));
	*/
	
	return(suite);
}
}
