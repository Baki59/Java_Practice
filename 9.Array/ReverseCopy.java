/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author USER
 */
public class ReverseCopy {
    public static void main(String[] args) {
        int []array={1,2,3,4,5};
        int reverse_array[]=new int[array.length];
        System.out.println("-------Normal Array-------");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        System.out.println("------Reverse Copy------");
        for(int i=array.length-1,j=0;i>=0;i--,j++){
            reverse_array[j]=array[i];
        }
        System.out.println("-------Array After Reverse Copy-------");
        for(int i=0;i<array.length;i++){
            System.out.print(reverse_array[i]+" ");
        }
        System.out.println("");
    }
}
