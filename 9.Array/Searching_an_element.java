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
public class Searching_an_element {
    public static void main(String[] args) {
        int array[]={12,23,43,56};
        Scanner sc=new Scanner(System.in);
        int find=sc.nextInt();
        int found=0;
        for(int i=0;i<array.length;i++){
            if(find==array[i]) found=1;
        }
        if(found==1) System.out.println("It belongs to the Array.");
        else System.out.println("It doesn't belong to the Array.");
        
    }
    
}
