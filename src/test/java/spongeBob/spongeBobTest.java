package spongeBob;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class spongeBobTest extends TestCase {
    public spongeBobTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(spongeBobTest.class);
    }

    public void testApp() {
        assertTrue(true);
    }
}
