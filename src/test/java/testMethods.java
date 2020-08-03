import  Lesson6.MainClass;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class testMethods {
    MainClass mainClass;
    private int[] a1 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
    private int[] a2 = {1,4,4};
    private int[] a3 = {1, 2, 1, 7};
    private int[] a4 = {};

    @Before
    public void beforeMethod(){
        mainClass = new MainClass();
    }

    @Test
    public void test1(){
        Assert.assertArrayEquals(mainClass.method1(a1), new int[]{1, 7});
    }
    @Test
    public void test2(){
        Assert.assertNull(mainClass.method1(a2));
    }
    @Test(expected = RuntimeException.class)
    public void test3(){
        mainClass.method1(a3);
    }
    @Test
    public void test4(){
        Assert.assertTrue(mainClass.method2(a2));
    }
    @Test
    public void test5(){
        Assert.assertFalse(mainClass.method2(a3));
    }
    @Test
    public void test6(){
        Assert.assertFalse(mainClass.method2(a4));
    }

}

