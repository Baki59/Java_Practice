/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaces;

/**
 Interfaces are mainly abstract class having all method abstract.....purpose of the interfaces is to have polymorphism....
 */

interface test{
    void meth1(); //these are by-default abstract method and public....
    void meth2();
}
class my implements test{
    @Override
    public void meth1(){
        System.out.println("Meth1 of class My");
    }
    public void meth2(){
        System.out.println("Meth2 of class My");
    }
    public void meth3(){
        System.out.println("Meth3 of class My");
    }
          
}
public class Interfaces {

    /**
     Abstract Classes use for polymorphism and also for inheriting....if you want to do only polymorphism then
     u have to use interfaces....
     ---tai emon jodi kono abstract class thake jar dara shudhu polymorphism hcce....taile tar poriborte amra sudhu interface use korte pari...
     * The purpose of interfaces is to achieve polymorphism....
     */
    public static void main(String[] args) {
        test t;
        //test t1=new test(); //it is not allowed....
        test t2=new my();
        t2.meth1(); //Dynamic Method Dispatch....Runtime Polymorphism
        t2.meth2();
        
    }
    
}
