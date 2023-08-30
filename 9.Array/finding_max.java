/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author USER
 */
public class finding_max {
    public static void main(String[] args) {
        int array[]={-12,-34,-21,-23,-12};
        int max=array[0];
        for(int i=0;i<array.length;i++)
        {
            if(max<array[i]) max=array[i];
        }
        System.out.println("The max element of the Array:"+max);
    }
    
}
