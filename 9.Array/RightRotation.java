/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author USER
 */
public class RightRotation {
    public static void main(String[] args) {
        System.out.println("**********Right Rotation**************");
        
        //------------Right Rotation-------------
        int[] new_array={1,2,3,4,5,-1,-5,6};
        int new_length = new_array.length;
        System.out.println(new_length);
        System.out.println("Array Before Rotation:");
        for(int i=0;i<new_length;i++){
            System.out.print(new_array[i]+" ");
        }
        
        System.out.println("\nArray After Rotation:");
        
        int temp=new_array[new_length-1];
       
        for(int i=new_length-1;i>0;i--){
            
            new_array[i]=new_array[i-1];
            //System.out.println(new_array[i]);
        }
        //array[0]=t;
        //System.arraycopy(new_array, 0, new_array, 1, new_length-1);
        new_array[0]=temp;
        for(int i=0;i<new_length;i++){
            System.out.print(new_array[i]+" ");
        }
        System.out.println();
        
    }
    
}
