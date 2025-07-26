package nit.GITProj01;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase {

    public AppTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    // Actual test for the sum() method
    public void testSum() {
        App app = new App();
        int result = app.sum(10, 20);
        assertEquals(30, result); // this will pass if sum(10, 20) == 30
    }
}
