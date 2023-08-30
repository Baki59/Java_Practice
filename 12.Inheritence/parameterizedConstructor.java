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
        System.out.println("Parent Non-param Constructor.");
    }
    public parent(int n){
        System.out.println("Parent Param-Constructor."+n);
    }
}
class child extends parent{
    public child(){
        System.out.println("Child non-param Constructor.");
    }
    public child(int y){
        System.out.println("Child param-constructor.");
    }
    public child(int x,int y){
        super(x);
        System.out.println("Calling the Parent's parameterized constructor."+y);
    }
}
public class parameterizedConstructor {
    public static void main(String[] args) {
        //child c=new child(10); //I can't call parent's parameterized constructor by this..for calling that i need to create a new const.
                                //with the first line as super()....
        //parent p=new parent(10);
        child c=new child(23,12);
        
    }
    
}
