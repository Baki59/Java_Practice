/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgfinal;

/*
-Final Method Can't be overrided....
-Final Class can't be Extended...
 */
class Super{
    final void meth1(){
        System.out.println("Hello.");
    }
}
class sub extends Super{
    //this can't be done
    /*
    void meth1(){
        System.out.println("Hi Hi!!");
    }
    */
    void meth2(){
        System.out.println("It's not an error!.");
    }
}
public class FinalMethods {
    
}
