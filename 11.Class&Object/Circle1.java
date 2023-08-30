/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgclass.object;

/**
 *
 * @author USER
 */
class Circle{
    public double radius;
    //private double height;

    /*
    public Circle(double r) {
        radius=r;
        //height=h;
    }
    */
    public double area(){
        return Math.PI*radius*radius;
    }
}
class Cylinder extends Circle{
    public double height;
    /*
    public Cylinder(double h){
        height=h;
    }
    */
    public double volume(){
        return area()*height;
    }
}
public class Circle1 {
    public static void main(String[] args) {
        //Circle c1=new Circle(10.0);
        Cylinder c2=new Cylinder();
        c2.height=10.0;
        c2.radius=20.0;
        
       // System.out.println(c1.area());
        System.out.println(c2.area());
        System.out.println(c2.volume());
    }
    
}
