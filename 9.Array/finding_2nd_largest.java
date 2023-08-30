/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author USER
 */
public class finding_2nd_largest {
    public static void main(String[] args) {
        int array[]={23,43,12,21,-12,0};
        int max1=array[0];
        int second_max=array[0];
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>max1) 
            {
                max1=array[i];
            }
            else if(array[i]>second_max)
            {
                second_max=array[i];
            }
        }
        System.out.println("The max element of the Array:"+max1);
        System.out.println("The second max element is: "+second_max);
    }
    
}
