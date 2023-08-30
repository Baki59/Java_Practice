/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

import java.io.*;
import java.util.*;

/**
 * Program+Stack=Program
 * resources: Heap,Keyboard,File,Network etc...
 * rule hoilo j program jodi kono resource use kore tahole take kaj sese
 * abar setake ferot dite hbe....mane free kore dite hbe..
 * notuba onnera vabbe j se ekhono seta use korteche...fole
 * resource er scarcity dekha dibe...amra protinioto j "new" use kori...
 * etar fole amra "heap" theke resource use korte pari..garbage collector jeta pore
 * auto free kore dei...
 * 
 * ekhon finally or try block diye amra ei resource free korr kajta korte pari...
 * karon exception ghotuk r na ghotuk finally block ta execute hoi...then porer line execute hoi...
 */
public class TryWithResources {
    static FileInputStream fi;
    static Scanner sc;
    static void divide() throws Exception{
        fi=new FileInputStream("D:\\Java_New\\Abdul Bari\\Exceptions\\Test.txt");
        sc=new Scanner(fi);
        try {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            System.out.println(a/c);
        }finally{
            /*
            ei duitake jodi "finally" block er moddhe neoa jai taile jehetu exception hok ba na hok
            finally block execute hbe e hbe... fole resource close hbe...ebong bairer keu r access korte parbe na..
            */
            fi.close();
            sc.close();
        }
        
        
    }
    public static void main(String[] args) throws Exception {
        try {
            divide();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        //jodi ami error handle kori...taile porer dui line o execute hbe...knona error khaoai....
        //"divide" method e (a/c) er porer closing er dui line r execute hoi nai...
        
        //finally block dara handle korle ei line error dekhabe...karon tokhon amar resource close hoiye geche tao ami access korr try kortechi....
        int x=sc.nextInt(); //jodi ami sc.close() k comment out na kori taile general obosthay ei line error dekhabe...karon resource amar close hoia geche...tao ami setake use korte cacchi...
        System.out.println(x);
        
    }
    
}
