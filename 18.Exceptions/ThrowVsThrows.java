/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * jekhane amader exception occur korbe sekhane try catch block diye
 * setake handle korte hbe...jodi seta handle na kora hoi tahole seta calling method 
 * er kache pass kore dibe...main e o jodi try catch dara handle kora na hoi
 * tahole exceptionta jvm er kache jai and ultimately prog crash kore...
 * ei j exception kon function theke kon funtion e propagate korteche eta detail show korano hoi printStackTrace function dara..
 Amra nijeder exception nijera throw korte pari...kivabe, ekhn seta sikhbo...
 */
public class ThrowVsThrows {
    static int meth2(int a,int b){
        int c;
        c=a/b;
        return c;
    }
    static void meth1(){
        int r= meth2(10,0);
        System.out.println(r);
    }
    public static void main(String[] args) {
        //jodi kono method e handle na kore...then main e handle korleo hbe...
        try {
            meth1();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
}
