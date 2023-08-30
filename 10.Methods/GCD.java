/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methods;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class GCD {
    static int GCD(int x,int y){
        while(x!=y){
            if(x>y) x=x-y;
            else y=y-x;
        }
        return x;
    }
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        System.out.println("GCD is: "+GCD(num1, num2));
    }
    
}
