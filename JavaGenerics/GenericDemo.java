/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javagenerics;

/**
 *
 * So, Object use kore age javate generalization kora hoto..ekhon er kichu drawback dhora porai use kora hoi na...
 * main drawbacks:
 * - jodi ekbar Object er ekta reference create kora hai then sob type er object e assign kora jai...
 * - typeCasting er jhamela ache....actual reference e ferot jaite hoile typecasting kora lage....
 */
public class GenericDemo {
    public static void main(String[] args) {
        //class object
        Object obj=new String("Hello.");
        
        //String str=obj; //not allowed
        
        obj=new Integer(10); //eta korai compile time compiler kono error dekhabe na...but runtime e jeye porer line er jnne error dekhabe...
        //classCastException dekhabe...class thikvabe cast korte partechena....
        
        String str=(String)obj;
        
        //Array of Object
        Object ob[]=new Object[3];
        ob[0]="Hi";
        ob[1]="Bye";
        ob[2]=new Integer(10);
        
        //ami ekhane object arrays moddhe jekono type er elemnt nite partechi error dicche na...but print er somoi typecast error dekhabe...
        
        String str1;
        for(int i=0;i<3;i++){
            str1=(String)ob[i];
            System.out.println(str1);
        }
    }
    
}
