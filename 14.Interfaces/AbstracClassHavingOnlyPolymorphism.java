/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author USER
 */
abstract class test1{
        abstract public void meth1();
        abstract public void meth2();
    }
    
class test2 extends test1{
    @Override
    public void meth1(){
        System.out.println("In Method 1");
    }
    @Override
    public void meth2(){
        System.out.println("In Mehtod 2");
    }
}

public class AbstracClassHavingOnlyPolymorphism {
    
    
    public static void main(String[] args) {
        test1 t=new test2();
        t.meth1();
        t.meth2();
    }
    
}
