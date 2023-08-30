/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javagenerics;

/**
 *
 * Type Safety
 * Compile-time Checking
 * No Typecasting
 */
public class GenericTypeArray<T> { //generic class declare korte amra <> use kori....
    //ekhane T onkta ekta template er moton jeta jkono type er data store korte pare...
    T data[]=(T[]) new Object[3]; //it is a generic type array and capable of storing any type of elements.
    public static void main(String[] args) {
        GenericTypeArray<String> gt=new GenericTypeArray();
        
        gt.data[0]="hi";
        gt.data[1]="Bye";
        
        //gt.data[2]=new Integer(10); //eta error dekhabe...karon ami prothome etake String hisebe declare korechi....
        
        String str=gt.data[0];
    }
    
}
