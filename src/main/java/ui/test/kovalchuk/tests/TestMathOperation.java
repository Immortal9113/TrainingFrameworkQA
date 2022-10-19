package ui.test.kovalchuk.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMathOperation {

    @Test
    public void checkSum(){

        // summ(4, 5) == 9 expected 9
        Assert.assertTrue( summ(4, 5) == 9);
        // summ(20, 9) == 29 expected 29
        Assert.assertTrue( summ(20, 9) == 29);
        // summ(35, 25) == 60 expected 60
        Assert.assertTrue( summ(35, 25) == 60);

    }
    @Test
    public void checkMult(){
//        mult(3,10) == 30 expected 30
         Assert.assertTrue(mult(3,10) == 30);
//        mult(3,3) == 9 expected 9
         Assert.assertTrue(mult(3,3) == 9);
//         mult(3,5) == 15 expected 15
         Assert.assertTrue(mult(3,5) == 15);
//         mult(4,400) == 400 expected 400
         Assert.assertTrue(mult(4,100) == 400);

    }

    public int summ (int a, int b){
        return a + b;
    }
    public int mult(int a, int b){
        return a * b;
    }
}

