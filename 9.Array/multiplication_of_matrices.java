/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author USER
 */
public class multiplication_of_matrices {
    public static void main(String[] args) {
        int A[][]={{1,2},{4,5}};
        int B[][]={{8,9},{8,9}};
        int sari1=A.length;
        int column1=A[0].length;
        int sari2=B.length;
        int column2=B[0].length;
        int C[][]=new int[sari1][column2];
        if(column1==sari2){
            for(int i=0;i<A.length;i++){
                for(int j=0;j<B[0].length;j++){
                    int sum=0;
                    for(int k=0;k<A[0].length;k++)
                    {
                        sum=sum+A[i][k]*B[k][j];
                    }
                    C[i][j]=sum;
                }
                //System.out.println(sum);
            }
            for(int i=0;i<C.length;i++){
                for(int j=0;j<C[0].length;j++)
                {
                    System.out.print(C[i][j]+" ");
                }
                System.out.println("");
            }

        }
        else System.out.println("It is impossible to multiply.");
        

    }
    
}
