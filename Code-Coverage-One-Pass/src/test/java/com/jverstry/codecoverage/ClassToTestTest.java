
package com.jverstry.codecoverage;

import static org.junit.Assert.*;
import org.junit.Test;

public class ClassToTestTest {
	
	public ClassToTestTest() {
	}

	@Test
	public void testCoveredMethod() {
		assertEquals(4,ClassToTest.coveredMethod(2));
	}

}
