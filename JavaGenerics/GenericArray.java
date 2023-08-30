/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javagenerics;

/**
 *
 * @author USER
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
public class GenericArray {
    public static void main(String[] args) {
        myArray<String> m=new myArray<>();
        m.append("Hi");
        m.append("Hello");
        
        m.display();

    }
    
    
    
}
