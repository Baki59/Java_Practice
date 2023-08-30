/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loops;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class reverse_a_number {
    public static void main(String[] args) {
        int n;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int number_of_digits=0;
        int x=n;
        while(n>0){
            if(n%10==0) System.out.print("Zero ");
            else if(n%10==1) System.out.print("One ");
            else if(n%10==2) System.out.print("Two ");
            else if(n%10==3) System.out.print("Three ");
            else if(n%10==4) System.out.print("Four ");
            else if(n%10==5) System.out.print("Five ");
            else if(n%10==6) System.out.print("Six ");
            else if(n%10==7) System.out.print("Seven ");
            else if(n%10==8) System.out.print("Eight ");
            else if(n%10==9) System.out.print("Nine ");
            //System.out.println(n%10);
            n=n/10;
            number_of_digits++;
        }
        System.out.println(" ");
        int m=number_of_digits;
        int k;
        int rev=0;
        int n1=x;
        while(n1>0){
            k=n1%10;
            rev=rev+(int)(k*Math.pow(10, m-1));
            n1=n1/10;
            m=m-1;
        }
        System.out.println("Reversed Number: "+rev);
        
        if(x==rev){
            System.out.println("It is a pallindrome number.");
        }
        else System.out.println("It is not a pallindrome number.");
    }
    
}
