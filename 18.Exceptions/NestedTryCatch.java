/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * for nested catch block or multiple catch block....firstly we have to handle the subclass exception
 * superclass exception should be handled in the last...cause it encompasses all types of exceptions....
 */
public class NestedTryCatch {
    public static void main(String[] args) {
        int A[]={20,30,40,50,0};
        try {
            int c=A[0]/A[2];
            System.out.println("Division is "+c);
            //Nested try-catch block...
            try {
                System.out.println(A[5]);
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Index is Invalid.");
            }
            
        } catch (ArithmeticException e) {
            System.out.println("Denominator should not be zero.");
        } 
        
        System.out.println("Bye");
        
    }
    
}
