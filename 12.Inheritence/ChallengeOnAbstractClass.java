/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritence;

/**
 *
 * @author USER
 */
abstract class shape{
    abstract public double perimeter();
    abstract public double Area();
}
class Circle extends shape{
    double radious;

    public Circle(double radious) {
        this.radious = radious;
    }
    
    public double perimeter(){
        return 2*Math.PI*this.radious;
    }
    public double Area(){
        return Math.PI*this.radious*this.radious;
    }
}
class Rectangle extends shape{
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    @Override
    public double perimeter(){
        return this.length+this.breadth;
    }
    @Override
    public double Area(){
        return this.length*this.breadth;
    }
}
public class ChallengeOnAbstractClass {
    public static void main(String[] args) {
        shape rectangle=new Rectangle(12.3,3.4);
        System.out.println("The Area of the Rectangle: "+rectangle.Area());
        System.out.println("The Perimeter of the Rectangle: "+rectangle.perimeter());
        
        shape circle=new Circle(2.0);
        System.out.println("The Area of the Circle: "+circle.Area());
        System.out.println("The Perimeter of the Circle: "+circle.perimeter());
        
    }
    
}
