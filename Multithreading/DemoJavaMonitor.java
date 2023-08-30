/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

/**
 *
 * Monitor bananor 2ta method ache...ekta 
 * 1. Synchronize block
 * 2. Synchronize Method
 */

class Mydata{
    
    //synchronizing mehtod
    synchronized void display(String str){
        //critical section
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
        /*
        //synchronizing block
        synchronized(this){
            for(int i=0;i<str.length();i++){
                System.out.println(str.charAt(i));
            }
        }
        */
        
    }
}
class MyThread1 extends Thread
{
    Mydata d;

    MyThread1(Mydata dat) {
        d=dat;
    }
    @Override
    public void run(){
        d.display("Hello World\n");
    }
}

class MyThread2 extends Thread{
    Mydata data;

    MyThread2(Mydata dat) {
        data=dat;
    }
    @Override
    public void run(){
        data.display("Welcome\n");
    }
    
}
public class DemoJavaMonitor {
    public static void main(String[] args) {
        Mydata d=new Mydata();
        
        MyThread1 t1=new MyThread1(d);
        MyThread2 t2=new MyThread2(d);
        
        t1.start();
        t2.start();
    }
    
}
