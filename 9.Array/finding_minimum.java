/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author USER
 */
public class finding_minimum {
    public static void main(String[] args) {
        int array[]={12,-3,23,12,0,-12};
        int min=array[0];
        for(int i=0;i<array.length;i++)
        {
            if(min>array[i]) min=array[i];
        }
        System.out.println("The minimum Element: "+min);
    }
    
}
