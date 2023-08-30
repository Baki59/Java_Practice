/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arithmatic;

/**
 *
 * @author USER
 */
public class Swapping {
    public static void main(String[] args) {
        int a=12,b=5;
        System.out.println("Before Swapping: a="+a+", b="+b);
        a=a^b;
        b=a^b;
        a=a^b;
        
        System.out.println("After swapping: a="+a+", b="+b);
    }
    
}
