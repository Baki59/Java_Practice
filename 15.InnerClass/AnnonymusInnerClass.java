/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package innerclass;

/**
 *
 * @author USER
 */
abstract class my
{
    abstract public void show();
}
//abstract class er poriborte amra interface niye o kaj korte parbo...
interface my_{
    public void show();
}
class Outer{
    public void display()
    {
        my m=new my(){@Override
        public void show(){System.out.println("Hello");}};
        m.show();
        my_ mu=new my_(){@Override
        public void show(){System.out.println("Hello from Interface.");}};
        mu.show();
    }
    
}
public class AnnonymusInnerClass {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.display();
    }
    
}
