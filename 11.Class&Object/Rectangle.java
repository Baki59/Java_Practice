/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgclass.object;

/**
 *
 * @author USER
 */
class RectangleClass{
    public double length;
    public double breadth;
    public double Area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
    public void isSquare(){
        if(length==breadth) System.out.println("The Rectangle is Square.");
        else System.out.println("It is not a Square.");
    }
    
}
public class Rectangle {
    public static void main(String[] args) {
        RectangleClass R1=new RectangleClass();
        R1.breadth=2;
        R1.length=2.00;
        
        System.out.println("The Area of the Rectangle: "+R1.Area());
        System.out.println("The Perimeter of the Rectangle: "+R1.perimeter());
        R1.isSquare();
    }
    
}
