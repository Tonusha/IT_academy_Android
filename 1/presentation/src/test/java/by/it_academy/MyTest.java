package by.it_academy;

import org.junit.Assert;
import org.junit.Test;

public class MyTest {

    @Test
    public void test(){
        int a = plus(2,2);
        Assert.assertEquals(4,a);
    }

    private int plus(int a, int b) {
        return a+b;
    }
}
