/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arithmatic;

/**
 *
 * @author USER
 */
public class StringMethods {
    public static void main(String[] args) {
        String str="Java "; //this is literal obejct..this is not created in heap..it is created in the loop....
        
        int length=str.length();
        System.out.println(length);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim()); //removing whitespaces..
        
    }
    
}
