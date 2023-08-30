/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgclass.object;

/**
 *
 * @author USER
 */

class CircleClass{
    public double r;
    
    public double area(){
        return (Math.PI)*r*r;
    }
    public double perimeter(){
        return 2*(Math.PI)*r;
    }
    public double circumference(){
        return perimeter();
    }
}
public class Circle {
    public static void main(String[] args) {
        CircleClass c1=new CircleClass();
        CircleClass c2=new CircleClass();
        c1.r=12.25;
        c2.r=10;
        System.out.println("The Area is: "+c1.area());
        System.out.println("The Perimeter is: "+c1.perimeter());
        System.out.println("The Circumference: "+c1.circumference());
        System.out.println("The Area of circle2 is: "+c2.area());
        System.out.println("The Perimeter of circle2 is: "+c2.perimeter());
        System.out.println("The Circumference of circle2 is: "+c2.circumference());
    }
    
}
