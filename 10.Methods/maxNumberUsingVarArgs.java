/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methods;

/**
 *
 * @author USER
 */
public class maxNumberUsingVarArgs {
    static int max(int ...x){
        int max=x[0];
        for (int i : x) {
            if(max<i) max=i;
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Max Element is:"+max(10,20,42,35));
    }
    
}
