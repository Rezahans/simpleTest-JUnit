/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittest;

/**
 *
 * @author Reza Hans
 */
public class JUnitTest {

   private String text_a;
   private String text_b;
        
   JUnitTest(){
        text_a = "CCIT";
        text_b = "FTUI";
   }
   
    public String formMessage(){
        String message;
        message = text_a + " " + text_b;
        return message;
    }
    
    public static void main(String[] args){
        JUnitTest helloWord = new JUnitTest();
        System.out.println(helloWord.formMessage());
    }
    
    
}
