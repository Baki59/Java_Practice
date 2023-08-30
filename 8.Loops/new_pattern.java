/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loops;

/**
 *
 * @author USER
 */
public class new_pattern {
    public static void main(String[] args) {
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=5;j++){
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }


/* ---------Printing this Pattern------------
 *****
  ****
   ***
    **
     *
*/

/*
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=5;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
*/

///-----------Printing Otherr One--------------------
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=5-i;j<5;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
