/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javagenerics;

/**
 *
 * @author USER
 */
class myData<T>{
    T obj;
    public void seTData(T t){
        obj=t;
    }
    public T getData(){
        return obj;
    }
            
}
public class GenereicClass {
    public static void main(String[] args) {
        myData<Integer> d=new myData<>();
        
        d.seTData(10);
        System.out.println(d.getData());
        
        myData<String> s=new myData<>();
        s.seTData("String");
        System.out.println(s.getData());
        
        //thus generic class can store any type of data...
    }
    
}
