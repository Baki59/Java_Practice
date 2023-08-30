/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class deletion {
    public static void main(String[] args) {
        int array[]=new int[10];
        int actual_length=6;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<actual_length;i++){
            array[i]=sc.nextInt();
        }
        //int new_element=10;
        int position;
        System.out.println("Please give the desired position...");
        position=sc.nextInt();
        System.out.println("---------Normal Array---------");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        
        
        for(int i=position;i<actual_length;i++){
            array[i]=array[i+1];
        }
        //array[position]=new_element;
        System.out.println("Array After Deleting...");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        
    }
    
}
