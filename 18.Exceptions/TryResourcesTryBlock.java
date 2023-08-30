/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class TryResourcesTryBlock {
    static void divide() throws Exception{
        try (FileInputStream fi=new FileInputStream("D:\\Java_New\\Abdul Bari\\Exceptions\\Test.txt");Scanner sc=new Scanner(fi)){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            System.out.println(a/c);
        }
    }
    public static void main(String[] args) throws Exception {
        try {
            divide();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
    }
    
}
