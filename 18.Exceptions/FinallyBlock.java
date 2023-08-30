/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * exception thakuk ba na thakuk finally block will be executed all time...
 * kokhon lage?--> jokhon kono method exception handle na kore tokhon resource closing er jnne finally block lekha lage...
 *jokhon keu confirm j se sob exception handle korche taile r finally block er drkr nai...
 * jodi koekta handle korche ebong koekta kore nai emn hoi taile finally block er drkr ache....
 * mane exception sob handle kora hoiche ei bapare confirm na hoile finally block use korte pare..
 */
public class FinallyBlock {
    static void meth1() throws Exception{
        try{
           throw new Exception(); 
        }
        finally{
           System.out.println("Final Message."); 
        }
        
    }
    public static void main(String[] args) throws Exception{
        meth1();
        
        /*
        try{
            System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Finally Block Message..");
        }
        */

        
    }
    
}
