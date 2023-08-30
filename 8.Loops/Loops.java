/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Loops;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int n;
        Scanner sc = new Scanner(System.in);
        
        //n=sc.nextInt();
        // TODO code application logic here
        
        for(int n=1;n<=10;n++){
            for(int i=1;i<=10;i++){
                System.out.println(n +" * "+i+" = "+n*i);
            }
            System.out.println();
        }
    }
    
}
