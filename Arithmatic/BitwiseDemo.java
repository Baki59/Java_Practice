/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arithmatic;

/**
 *
 * @author USER
 */
public class BitwiseDemo {
    public static void main(String[] args) {
        int x=10,y=6,z;
        
        //z=x&y;
        //z=x|y;
        //z=x^y;
        //System.out.println(z);
        
        int m=-0b1010,n,h;
        n=m>>1;
        h=m>>>1; //signed right shift
        System.out.println(m);
        System.out.println(String.format("Binary form of m: %s",Integer.toBinaryString(m)));
        System.out.println(n);
        System.out.println(String.format("Binary form of n: %s",Integer.toBinaryString(n)));
        System.out.println(h); //for signed shift operation it will become positive number
        System.out.println(String.format("Binary form of h: %32s",Integer.toBinaryString(h)));

    }
    
}
