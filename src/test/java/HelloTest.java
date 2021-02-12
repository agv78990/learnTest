import mathematic.Hello;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class HelloTest {
    @Test

    public static void sumTest(){
        Hello hello=new Hello();
        int actual=hello.sum(23,23);
        int expected=46;
        Assert.assertNotEquals(actual,expected);
        System.out.println("good job "+ actual+ " "+ expected);
    }



    @Test
    public static void sumNegativeTest(){
        Hello hello=new Hello();
        int actual=hello.sum(20,20);
        int expected =50;
        Assert.assertNotEquals(actual,expected);
        System.out.println("this is negative "+ 50);
    }
    @BeforeTest
    public static void minusTest(){
        Hello hello=new Hello();
        int actual= hello.minus(54,54);
        int expected=0;
        Assert.assertEquals(actual,expected);
        System.out.println("great "+ expected);
    }




}
