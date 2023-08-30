/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methods;

/**
 *
 * @author USER
 */
public class findinfMax {
    static int max(int A[]){
        int max=A[0];
        for(int i=0;i<A.length;i++){
            if(max<A[i]) max=A[i];
        }
        return max;
    }
    
    public static void main(String[] args) {
        int A[]={-9,-6,-6,-7};
        System.out.println("Max element of the given array: "+max(A));
    }
    
}
