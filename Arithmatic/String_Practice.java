/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arithmatic;

/**
 *
 * @author USER
 */
public class String_Practice {
     /*
    String Constructors:
    
        String(char[])
    
            char b[]={'A','B','C','D'};
            then we can write....: 
            String str1 = new String(b);
    
        String(byte[])
    
            byte c[]={1,2,3,4}
            String str2 = new String(c);
    
        String(String)
    
            String str3= new String("Java"); 
    
            String str4="Java Prog" //it will work like a literals...like "int n=10"
    
    */
    public static void main(String[] args) {
        String str1="Java Program"; //it will store only in "Pool"
        System.out.println(str1);
        
        String str2=new String("Java"); //it will store in the heap...
        System.out.println(str2);
        
        char c[]={'H','e','l','l','o'};
        String str3=new String(c);
        
        System.out.println(c);
        
        byte b[]={65,66,67,68};
        String str4=new String(b);
        System.out.println(str4);
        
        //**********String Pooling....Heap.....************
        //same value hoile same object hold korbe mane memory te eki jaygay thakbe...eki object k refer korbe
        String s1="Java";
        String s2="Java";
        
        System.out.println(s1==s2);//true
        
        String st1="Java";
        String st2="java";
        System.out.println(st1==st2); //false
        
        String sb1="Java"; //create an object in the pool
        String sb2=new String("Java"); //create an object in the heap....different jaygake refer korbe
        
        System.out.println(sb1==sb2); //false
        
          
        
        
        
    }
    
   
    

}
