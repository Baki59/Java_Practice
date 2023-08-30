/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

/**
 *
 * @author USER
 */
public class MultithreadingUsingRInterface1 implements Runnable{
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+"Hello");
            i++;
        }
    }
    public static void main(String[] args) {
        MultithreadingUsingRInterface1 m=new MultithreadingUsingRInterface1();
        Thread t=new Thread(m);
        t.start();
        
        int i=1;
        while(true){
            System.out.println(i+"World.");
            i++;
        }
        
    }
    
}
