/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arithmatic;

import java.util.regex.Pattern;

/**
 *
 * @author USER
 */
public class StringMethodsPracticeExample {
    public static void main(String[] args) {
        String str="programmer@gmail.com";
        
        
        /*
        //valid gmail or not.....
        
        String[] parts = str.split("@");
        if(str.matches("\\w.*@gmail.*")){
            System.out.println("The mail is Valid.");
            System.out.println("The user name is: "+parts[0]);
            System.out.println("The domain name is: "+parts[1]);
        }
        */
        
        /*
        //binary or not
        
        String bin="1010101";
        
        if (bin.matches("[0-1]+")) {
            System.out.println("Yes,The given number is in Binary.");
        }
        else    System.out.println("Not Binary");
        */
        
        
        /*
        //Hexadecimal or not....
        String hex="A9B";
        if (hex.matches("/[0-9a-f]+/i")) {
            System.out.println("Yes, it is hexadecimal number.");
        }
        else    System.out.println("Not,it is not a hexadecimal number.");
        
        
        */
        
        /*
        //find a date format is proper or not....
        
        String date="23-33-2023";
        
        if(date.matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$")){
            System.out.println("Yes, This is a valid Date format.");
        }
        else System.out.println("Not valid");
        */
        
        
        //Removing special characters using regex....
        
        String str1 = "a!@b12%$&*";
        
        System.out.println(str1.replaceAll("[^A-Za-z0-9]",""));
        
        String s2= "Baki      billah khan      ";
        System.out.println(s2.replaceAll(" ", ""));
        
    }
    
    

    
    
    
    
}
