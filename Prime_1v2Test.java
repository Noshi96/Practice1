package spoj;

import junit.framework.TestCase;

/**
 * Created by To moje on 2019-01-06.
 */
public class Prime_1Test extends TestCase {
    public void testIsPrime() throws Exception {
        String s = "5 7 11 13 17 19 ";
        assertEquals(s,Prime_1.isPrime(4, 20));
    }

}