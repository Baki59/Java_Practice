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
    public Rectangle(){
        length=1;
        breadth=1;
    }
    public Rectangle(int l,int b){
        length=l;
        breadth=b;
    }
}
class Cuboid extends Rectangle{
    int height;
    public Cuboid(){
        
    }
    public Cuboid(int h){
        height=h;
    }
    public Cuboid(int l,int b,int h){
        super(l,b);
        height=h;
    }
    public int volume(){
        return length*breadth*height;
    }
}
public class SuperclassExample {
    public static void main(String[] args) {
        //Rectangle r=new Rectangle();
        Cuboid c=new Cuboid(10,4,5);
        System.out.println(c.volume());
    }
}
