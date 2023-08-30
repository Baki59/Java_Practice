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
    int x=10;
    class Inner{
        int y=20;
        void innerDisplay(){
            System.out.println("----In Inner Class----");
            System.out.println(x);
            System.out.println(y);
        }
    }
    void outerDisplay(){
        Inner i=new Inner();
        System.out.println("----In Outer Class----");
        System.out.println(x);
        System.out.println(i.y);
    }
}
public class NestedInnerClass {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.outerDisplay();
        System.out.println(o.x);
        
        Outer.Inner i=new Outer().new Inner();
        i.innerDisplay();
        
    }
    
}
