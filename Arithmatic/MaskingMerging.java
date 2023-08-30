/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arithmatic;

/**
 *
 * @author USER
 */
public class MaskingMerging {
    public static void main(String[] args) {
        byte a=9,b=12;
        System.out.println(String.format("%s", Integer.toBinaryString(a)));
        System.out.println(String.format("%s", Integer.toBinaryString(b)));
        byte c=0b00000000;
        
        c=(byte)(c|a);
        c=(byte)(c<<4);
        c=(byte)(c|b);
        System.out.println(String.format("%8s", Integer.toBinaryString(c)));
        
        short f=10,g;
        byte h,i=2;
        g=i; //widening...implicitly...
        h=(byte)f; //narrowing
        
     
        
    }
    
}
