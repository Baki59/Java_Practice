/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

/**
 *
 * @author USER
 */

class MyThread extends Thread
{
    public MyThread(String name){
        super(name);
        setPriority(MIN_PRIORITY);
    }
    @Override
    public void run(){
        int count=1;
        while(true){
            System.out.println(count++);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            
        }
        
    }
}

/*
class MyRun implements Runnable
{
    @Override
    public void run(){
        
    }
}
*/
public class ThreadClass {
    public static void main(String[] args) {
       // Thread t=new Thread(new MyRun(),"My Name");
       
       MyThread t=new MyThread("My Thread 1");
       t.start();
       t.interrupt();
       /*
        System.out.println("Id: "+t.getId());
        System.out.println("Name: "+t.getName());
        System.out.println("Priority: "+t.getPriority());
        t.start();
        System.out.println("State: "+t.getState());
        System.out.println("Alive: "+t.isAlive());
        */
    }
    
}
