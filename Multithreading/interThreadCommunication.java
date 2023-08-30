/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

/**
 *Producer consumer problem....ekjon produce korbe arekjon consume korbe...ekjon write korbe arekjon read korbe....
 * ekhane Flag er maddhome eta maintain hoi...Flag true dekhle producer produce korbe ba likhbe...r flag false dekhle consumer read korbe ba consume korbe....
 * 
 * ekhon more than one consumer thakle race condition create hoite pare...mane ekjon jodi consumer kore ese wake up call kore 
 * taile kon consumer korbe eta niye tader moddhe race hoi..k age consume korbe eta r ki...
 *
 */
class myData{
     int value;
     boolean flag=true;
     synchronized public void set(int v){
         while(flag!=true){
             try {
                 wait();
             } catch (Exception e) {
             }
         }
         value=v;
         flag=false;
         notify();
     }
     synchronized public int get(){
         int x=0;
         while(flag!=false){
             try {
                 wait();
             } catch (Exception e) {
             }
         }
         
         x=value;
         flag=true;
         notify();
         return x;
     }    
}

class Producer extends Thread{
    myData data;
    public Producer(myData d){
        data=d;
    }
    public void run(){
        int count=1;
        while(true){
            data.set(count);
            System.out.println("Producer "+count);
            count++;
        }
    }
}
class Consumer extends Thread{
    myData data;
    public Consumer(myData d){
        data=d;
    }
    public void run(){
        int value;
        while(true){
            value=data.get();
            System.out.println("Consumer "+value);
        }
    }
}
public class interThreadCommunication {
    public static void main(String[] args) {
        myData data=new myData();
        Producer p=new Producer(data);
        Consumer c=new Consumer(data);
        
        p.start();
        c.start();
    }
    
}
