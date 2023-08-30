/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methods;

/**
 *
 * @author Baki
 * Finding Minimum  in an Array.......
 */
public class findingMin {
    static int min(int A[]){
        int min=A[0];
        for(int i=0;i<A.length;i++){
            if(min>A[i]) min=A[i];
        }
        return min;
    }
    
    public static void main(String[] args) {
        int A[]={9,10,6,7};
        System.out.println("Max element of the given array: "+min(A));
    }
    
}
