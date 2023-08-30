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
public class Displaying_Digits_of_a_Number {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        int n = num.nextInt();
        int m=n;
        int number_of_digits=0;
        
        while(n>0){
//            System.out.println(n%10);
            n=n/10;
            number_of_digits++;
        }
        System.out.println("Number of Digits are: "+number_of_digits);
        int n1=m;
        int armstrong=0;
//        System.out.println(n1);
//        System.out.println(m);
        while(n1>0){
            int r=n1%10;
            armstrong=(int) (armstrong+Math.pow(r, number_of_digits));
            n1=n1/10;
        }
//        System.out.println(armstrong);
//        System.out.println(m);
        if(m==armstrong){
            System.out.println("It is an armstrong number...");
        }
        else System.out.println("It is not...");
        
        }
    }
    

