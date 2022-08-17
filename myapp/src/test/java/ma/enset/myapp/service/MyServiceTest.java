package ma.enset.myapp.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyServiceTest {

    @Test
    public void testCompute() {
        MyService myService = new MyService();
        double a=2;
        double b=3;
        double expected=5;
        double result=myService.compute(a, b);
        assertTrue(Math.abs(result-expected)<0.001);

    }

}
