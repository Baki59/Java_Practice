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
public class isPrime {
    static int isPrime(int n){
        //int prime=1;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        if(isPrime(number)==1) System.out.println("It is a prime number");
        else System.out.println("It is not a prime number.");
    }
    
}
