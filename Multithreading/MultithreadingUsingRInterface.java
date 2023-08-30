/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

/**
 * when a class implements it's interface it overrides all of its methods...
 * otherwise that class will be abstract....
 */

class My implements Runnable{
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+"Hello");
            i++;
        }
    }
}
public class MultithreadingUsingRInterface {
    public static void main(String[] args) {
        My m=new My();
        /*
        My class nije kintu kono thread na..eta just ekta class
        jeta Runnable k implement korteche..so etake thread e pass korte hbe...
        */
        Thread t=new Thread(m);
        t.start();
        int i=1;
        while(true){
            System.out.println(i+"World.");
            i++;
        }
    }
    
}
