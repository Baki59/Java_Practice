/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 1.Checked Exception--> that must be handled....you must to handle them by using try and catch..
 * 2. Unchecked Exception--> it is not compulsory to handle...it is your choice...
 * Runtime exceptions are unchecked exceptions.....
 */
//self defined Exception class...
class LowBalanceException extends Exception{
    public String toString(){
        return "Balance should not be less than 5000";
    }
}
public class ChekcedUnchecked {
    static void fun1(){
        
        try {
            throw new LowBalanceException();
        } catch (LowBalanceException e) {
            System.out.println(e);
        }
        
        /*
        try {
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
        */
        
        
    }
    static void fun2(){
        fun1();
    }
    static void fun3(){
        fun2();
    }
    public static void main(String[] args) {
        fun3();
    }
    
}
