/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stattic_final;

/**
 *
 * @author USER
 */
class My{
    //static int s;
    
    static {
        System.out.println("Block1");
        //s=10;
    }
    static {
        System.out.println("Block2");
           
    }
}

public class staticBlock {
    /*
    static {
        System.out.println("Block1");
    }
    */
    public static void main(String[] args) {
        My m=new My();
        System.out.println("Main");
        
    }
    /*
    static {
        System.out.println("Block2");
           
    }
*/
    
}
