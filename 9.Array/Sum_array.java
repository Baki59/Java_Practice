/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author USER
 */
public class Sum_array {
    public static void main(String[] args) {
        int array[]={2,3,4,5,7};
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
        System.out.println("The sum: "+sum);
    }
    
}
