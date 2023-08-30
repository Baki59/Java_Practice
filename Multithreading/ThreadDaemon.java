/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
class MyThread extends Thread{
    @Override
    public void run()
    {
        int count=1;
        while(true){
            System.out.println(count+++" My Thread");
        }
    }
}
public class ThreadDaemon {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        //t.setDaemon(true); //main thread terminate korle etao terminate korbe...tokhon r thread run korbena...kichu print o korbe na....
        t.start();
        
        /*
        try {
            Thread.sleep(1000); //sleep call korai main method kichukkhon sleep e thakbe terminate korr age...oi time taile kichu number print hbe...
        } catch (Exception ex) {
            System.out.println(ex);
        }
        */
        
        /*
        //jodio main thread ekta daemon thread ekhon....kintu amra jodi join use kori
        //taile seta main method k baddho korbe onno method ses na houa porjonto wait korte....
        Thread mainThread=Thread.currentThread();
        try {
            mainThread.join();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        */
        
        int count=1;
        while(true){
            System.out.println(count+++" Main");
            Thread.yield(); //for this main method will give "MyThread" more time...
        //for this less "Main" will print than "My Thread"
        }
        
        //yield method used to give another method more time...

    }
    
}
