/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TUF
 */
public class JUnitTestTest {
    
    JUnitTest obj; 
    
    @Before
    public void setUp() {
        System.out.println(" Test Aplikasi Sebelum Fungsi setUP()");
        obj = new JUnitTest();
    }
    
    @After
    public void tearDown() {
        System.out.println(" Test Aplikasi Sebelum Fungsi tearDown()");
        obj = null;
    }

    /**
     * Test of formMessage method, of class JUnitTest.
     */
    @Test
    public void testFormMessage() {
        
        String expResult = "CCIT FTUI";
        String result = obj.formMessage();
        System.out.println(" Test Aplikasi: test fungsi 1 testFormMessage()");
        assertEquals(expResult, result);
    }

}
