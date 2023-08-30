/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritence;

/**
 *
 * @author USER
 */
class parent{
    public parent(){
        System.out.println("In Parent Constructor.");
    }
}
class child extends parent{
    public child(){
        System.out.println("In child Constructor.");
    }
}
public class ConstructorInInheritence {
    public static void main(String[] args) {
        parent p=new parent();
        System.out.println("***********For child:Inherits Parent's Property.************");
        child c=new child();
    }
    
}
