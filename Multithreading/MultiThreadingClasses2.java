/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

/**
 *
 * MultiThreadingClasses1 er moto eki kaj amra eki class er under e o korte pari...
 */
public class MultiThreadingClasses2 extends Thread{
    @Override
    public void run(){
        int i=1;
        while (true) {            
            System.out.println(i+"Hello");
            i++;
        }
    }
    public static void main(String[] args) {
        MultiThreadingClasses2 t=new MultiThreadingClasses2();
        //kono thread k start korte start() method ke call korte hoi...
        t.start();
        
        int i=1;
        while (true) {            
            System.out.println(i+"World.");
            i++;
        }
    }
    
}
