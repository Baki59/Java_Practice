/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javagenerics;

/**
 * 1. No Parameters
 * 2. Multiple Parameters--> ami caile multiple template use korte pari... <T,K>...erokom r ki...<String,Integer>.....
 * 3. Subtypes ----> class MyArray2 extends MyArray<String>, or class MyArray2<T> extends MyArray<T>
 * 4. Bounded Types---> class MyArray<T extends Number>
 * 
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

public class BoundsOnGenerics {
    public static void main(String[] args) {
        myArray<String> m=new myArray<>();
        //jodi kono type mention na kori tao eta kaj korbe...
        //myArray m=new myArray<>();//that will work perfectly...
        m.append("Hi");
        m.append("Hello");
        
        m.display();

    }
    
}
