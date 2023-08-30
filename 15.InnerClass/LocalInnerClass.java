/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package innerclass;

/**
 *
 * @author USER
 */
class Outer{
    public void Display(){
        class Inner
        {
            public void innerDisplay()
            {
                System.out.println("Hello");
            }
        }
        Inner i=new Inner();
        i.innerDisplay();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.Display();
    }
    
}
