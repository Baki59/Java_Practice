/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author USER
 */
public class CopyingArray {
    public static void main(String[] args) {
        int []array={1,2,3,4,5};
        int copied_array[]=new int[array.length];
        System.out.println("-------Normal Array-------\n");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        for(int i=0;i<array.length;i++){
            copied_array[i]=array[i];
        }
        System.out.println("-------Array After Copy-------\n");
        for(int i=0;i<array.length;i++){
            System.out.print(copied_array[i]+" ");
        }
        System.out.println("");
        
        
    }
}
