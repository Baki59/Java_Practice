/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arithmatic;

/**
 *
 * @author USER
 */
public class Printing {
    public static void main(String[] args) {
        //***********************Format Specifier***************
        // "%[argument_index][flags][widtg][.precision]conversion
        int a=10;
        int x=10;
        float y=12.5f;
        char z='H';
        
        //**********Argument Index*****************
        //"%1$" means 1st argument that means argument type...."d" argument type
        System.out.printf("%1$d,%1$d,%1$d \n",x); //will print x three times
        
        System.out.printf("%1$d,%2$f,%1$d \n",x,y); //1st e x print korbe then y then abar x....
        
        System.out.printf("%3$c,%2$f,%1$d \n",x,y,z);
        
        //etar upokarita ki?? etar fole amra value je order e dei na kno...argument index order onujayi seta print hbe....
        
        //***********Conversion: Number format actually************
        
        System.out.printf("In Decimal %d= %d\n",x,x); //will print integer in decimal
        System.out.printf("In Octal %d= %o\n",x,x); //Octal
        System.out.printf("In Hexadecimal %d= %x\n",x,x); //Hexadecimal
        System.out.printf("In Binary %d= %b\n",x,x); //binary te evabe kora jai na...alada function use kora lage...
        
        //Same way te float etc.. er jnne "f,e,g" egula ache...
        //String er jnne "s"....Char er jnne "c"....
        
        //***********Width*************
        
        //System.out.printf("%d",a);
        System.out.printf("%5d \n",a); //a print korar age 5ta faka jayga print korbe...
        
        //*****************Flags*****************
        // "0", "-", "(", "+", " "
        int g=-10;
        System.out.printf("%05d \n",a); //it will fill up the empty spaces with "Zero"
        System.out.printf("%(5d \n",g); //(10)
        System.out.printf("%(5d \n",a); //10....So bracket only use for the negative number....
        
        System.out.printf("%5d \n",g); //-10
        System.out.printf("%+5d \n",g); //-10
        
        
        
        //*********Precision*************
        float f=123.45f;
        System.out.printf("%f\n",f); // will print a number nearly "f" not the exact "f"
        
        System.out.printf("%6.2f\n",f); // 123.45...precision
        
        String s="Java";
        System.out.printf("%20s\n",s);
        System.out.printf("%-20s\n",s); //Left Alligned...
        
        // printf and format function works as same...
        System.out.format("%20s\n",s);
        
    }
    
}
