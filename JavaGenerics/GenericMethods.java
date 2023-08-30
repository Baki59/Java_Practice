/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javagenerics;

/**
 *
 * 1. Generic Methods
 * 2. WildCard?
 * 3. Lower Bound
 * 4. Upper Bound
 */

class myArray<T>{
    T t[]=(T[]) new Object[10];
    int length=0;
    
    public void append(T v){
        t[length++]=v;
    }
    public void display(){
        for(int i=0;i<length;i++){
            System.out.println(t[i]);
        }
    }
}

public class GenericMethods {
    //variabel argument use koreo amra etake declare korte pari...
    //E... list evbe define kore
    //Bounded generic method o somvob....
    static <E extends Number> void show_bound(E... list){
        for(E x:list){
            System.out.println(x);
        }
    }
    //Using Variable Arguments...
    static <E> void show(E... list){
        for(E x:list){
            System.out.println(x);
        }
    }
    
    //Generic Methods....
    static<E> void Display(E[] list){
        for(E x:list){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        System.out.println("Using Simple Generic Methods.");
        Display(new String[]{"Hi","Go","Bye"});
        System.out.println("Using Variable Arguments.");
        show(10,20,30);
        System.out.println("Using Bounded Generic Methods.");
        show_bound(10,20,30);
        
    }
    
}
