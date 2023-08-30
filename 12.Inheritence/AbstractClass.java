/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritence;

/**
 *
 * @author USER
 */
abstract class Super{
    public Super(){
        System.out.println("Super Constructor.");
    }
    public void meth1(){
        System.out.println("Meth1 of Super.");
    }
    abstract public void meth2();
}
class sub extends Super{
    /*
    If a class inherited any class which has abstract methods 
    it should override that methods..
    */
    public void meth2(){
        System.out.println("Sub Meth2.");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Super s=new sub(); //Dynamic Method Dispatch...
        s.meth1();
        s.meth2();
    }
    
}
