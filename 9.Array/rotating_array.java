/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author USER
 */
public class rotating_array {
    public static void main(String[] args) {
        
        int[] array={1,2,3,4,5,-1,-5,6};
        int length = array.length;
        
        System.out.println("Normal Array");
        for(int i=0;i<length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        
        System.out.println("**********Left Rotation**************");
        /////----------Left Rotation----------
        int t=array[0];
        for(int i=1;i<length;i++){
            
            array[i-1]=array[i];
        }
        array[length-1]=t;
        
        for(int i=0;i<length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        
        
        
    }
    
}
