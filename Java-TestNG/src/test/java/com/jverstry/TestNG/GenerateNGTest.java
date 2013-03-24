package com.jverstry.TestNG;

import static org.testng.Assert.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GenerateNGTest {
    
    public GenerateNGTest() {
    }

    @Test(groups = {"testGroupA"})
    public void testAOne() {
        assertEquals(1,Generate.aOne());
    }

    @Test(groups = {"testGroupA", "testGroupB", "windows.QTests"})
    public void testATwo() {
        assertEquals(2,Generate.aTwo());
    }
    
    @Test(groups = {"testGroupA", "testGroupC", "windows.PTests"})
    public void testAThree() {
        assertEquals(3,Generate.aThree());
    }

    @Parameters({ "testNgParam" })    
    @Test(groups = {"testGroupA"})
    public void testAFour(@Optional("4") String testNgParam) {
        assertEquals(Integer.parseInt(testNgParam),Generate.aFour());
    }

    @Parameters({ "testNgParam2" })    
    @Test(groups = {"testGroupA"})
    public void testASix(String testNgParam2) {
        assertEquals(Integer.parseInt(testNgParam2),Generate.aSix());
    }

    public class DataForTests {
    
        @DataProvider(name = "forTestAFive")
        public Object[][] forTestAFive() {
            return new Object[][] {
                { new Integer(5) },
                { new Integer(6) }
            };
        }
        
    }
    
    @Test(dataProvider = "forTestAFive", dataProviderClass = DataForTests.class)
    public void testAFive(int param) {
        assertEquals(param,Generate.aFive());
    }

    // Not covered, factories and automatic test generation
    // Programmatic exectution of tests
    // Test method interceptor
    
    // Suite with multiple threads
    
    @Test(dependsOnGroups = { "windows.*" })
    public void testASeven() {
        assertEquals(7,Generate.aSeven());
    }

}