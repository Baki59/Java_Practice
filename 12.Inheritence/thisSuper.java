/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritence;

/**
 *
 * @author USER
 */
class Rectangle{
    int length;
    int breadth;
    int x=10;
    Rectangle(int l,int b){
        this.length=l;
        this.breadth=b;
    }
//    void display(){
//        System.out.println("Length: "+this.length);
//        System.out.println("Breadth: "+this.breadth);
//    }
        
}
class cuboid extends Rectangle{
    int height;
    int x=20;

    public cuboid(int height, int l, int b) {
        super(l, b);
        this.height = height;
    }
    void display(){
        System.out.println(x);
        System.out.println(super.x);
    }
}
public class thisSuper {
    public static void main(String[] args) {
//        Rectangle r1=new Rectangle(10,5);
//        r1.display();
//        Rectangle r2=new Rectangle(12,13);
//        r2.display();
        cuboid c1=new cuboid(10,20,30);
        c1.display();
    }
}
