/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arithmatic;

/**
 *
 * @author USER
 */
public class IncDec {
    public static void main(String[] args) {
        int x=5;
        //x++; //6
        //int c = x++; //c=5,x=6..... ekhane duita operation ache
        //prothome assign then increment....tai c er value 5 then
        //bere x er value 6 hoiche
        
        int c=++x; // c=6, x=6....ekhane age x er value increment hoiche
        // tai c er value 6 then x inc hoiche tai x er value o 6
        
        System.out.println(x);
        
        System.out.println(c);
        
        float x1 = 5.3f;
        //x1++; //6.3
        float x3 = x1++; // x3=5.3, x1=6.3
        //float x2 = ++x1; // x2 =6.3, x1= 6.3
        //System.out.println(x1);
        //System.out.println(x3);
        
        byte m1=4;
        m1++;
        //System.out.println(m1);
        
        int a=5,b=4,z;
        
        //c=2*a++ + 3* ++b; // 2*5 + 3*5
        
        z = 2*a++ + 3* ++a; // 2*5 + 3*7
        
        //System.out.println(c);
        System.out.println(z);
    }
    
}
