/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *for multi threading in java there are two class...Thread & Runnable Interface...
 * when which i will use?
 * In java to use thread class we need to extend that...if a function already extends another method...
 * then it can not extend thread class..because java only allow extending one method at time...that time
 * we can use Runnable Interface...we can implement Runnable Interface...cause java 
 * allows multiple interface....
 */

class myThread extends Thread{
    /*
    thread k extend korle run method k override korte hoi...ja korar
    ei run method er moddhe e kora lagbe...
    */
    @Override
    public void run(){
        int i=1;
        while (true) {            
            System.out.println(i+"Hello");
            i++;
        }
    }
}

public class MultithreadingClasses1 {
    public static void main(String[] args) {
        myThread t=new myThread();
        //kono thread k start korte start() method ke call korte hoi...
        t.start();
        
        int i=1;
        while (true) {            
            System.out.println(i+"World.");
            i++;
        }
        
    }
    
}
