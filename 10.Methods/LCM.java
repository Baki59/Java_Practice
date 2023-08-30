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
public class LCM {
    static int LCM(int x,int y){
        int m=x;
        int n=y;
        while(x!=y){
            if(x>y) x=x-y;
            else y=y-x;
        }
        return (m*n)/x;
    }
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        System.out.println("LCM is: "+LCM(num1, num2));
    }
    
}
