/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author USER
 */
public class two_D_Array {
    public static void main(String[] args) {
        int A[][]=new int[3][4]; //valid
        int B[][]={{1,2,3},{4,5,6},{7,8,9}}; //valid
        //A = {{1,2,3},{4,5,6},{7,8,9}}; not valid
        int C[][];
        C=new int[4][4];
        int [][]D=new int[4][4]; //valid
        int []E[]=new int[2][2]; //valid
        int[][] f; //valid
        
        int[] G,H[]; //G is int[] type array...H is 2 dimensional array..
        G=new int[4];
        H=new int[3][4];
        
        int[] a,b,c,d; // I can declare multiple 1D array by int[]
        
        //Displaying the element of the Matrix
        for(int i=0;i<B.length;i++){
            for(int j=0;j<B[0].length;j++)
            {
                System.out.print(B[i][j]+" ");
            }
            System.out.println("");
        }
        
        //Using For each loop
        System.out.println("Using For each Loop");
        for(int x[]:B){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }
}
