package ui.test.mykhaliuk.tests.annotationsTests;

import org.testng.annotations.Test;

public class annotationAttributesTests {
    @Test(description = "asd")
    public void testcase1(){
        System.out.println("Executed testcase1 with description \"asd\" ");
    }
    @Test(  description = "testcase2",
            dependsOnMethods = {"testcase3"},
            priority = 0,
            enabled = true)
    public void testcase2(){
        System.out.println("Executed testcase2 with dependsOn attribute after testcase3 ");
    }
    @Test
    public void testcase3(){
        System.out.println("");
    }
    @Test
    public void testcase4(){
        System.out.println("");
    }
    @Test
    public void testcase5(){
        System.out.println("");
    }
}
