/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author USER
 */
public class adding_2_matrices {
    public static void main(String[] args) {
        int A[][]={{1,2,3},{4,5,6},{8,9,0}};
        int B[][]={{8,9,0},{8,9,0},{4,5,6}};
        int C[][]=new int[A.length][A[0].length];
        
        for(int i=0,j=0,m=0;i<A.length;i++,j++,m++){
            for(int k=0,l=0,n=0;k<A[0].length;k++,l++,n++){
                C[m][n]=A[i][k]+B[j][l];
            }
        }
        for(int i=0;i<C.length;i++){
            for(int j=0;j<C[0].length;j++)
            {
                System.out.print(C[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
