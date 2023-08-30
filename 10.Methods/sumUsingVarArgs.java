/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methods;

/**
 *
 * @author USER
 */
public class sumUsingVarArgs {
    static int sum(int ...x){
        int sum=0;
        for (int i : x) {
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("The Sum is:"+sum(10,20,42,35));
    }
}
