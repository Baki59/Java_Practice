/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * Throw: jodi kono method perfectly value return korte pare taile to korlo...r jodi na pare taile
 * calling method re janai dite hbe j na ami e karone partechi na..exception throwing er maddhome eta kora hoi....
 * eta onkta return er alternate....so throw basically method er moddhe kajer somoi
 * kono vul paile okhane ekta message propagate kora...ekhane exception er ekta object create kora hoi....
 * 
 * Throws: r throws hoilo kon method j exception throw korteche etake tar
 * definition er somoi address kore deoa...janai deoa...ebong etake j handle korte hbe setar 
 * ekta sotorkotbarta deoa...so j method e eta call kora hbe sei method er responsibility eta handle kora....kothao
 * handle na korleo at least main e jaia eta handle kora lagbe....
 * 
 * tar mane sohoj kotha hoilo nije handle na korle throws koire onner ghare capai deoa lagbe...
 * but eta must to be handles otherwise the program will be crushed..
 */
public class ThrowExample {
    static int area(int l,int b) throws Exception{
        if(l<0||b<0){
            throw new Exception();
        }
        int a=l*b;
        return a;
    }
    static void meth1()throws Exception{
        int a=area(-10, 5);
        System.out.println(a);
    }
    public static void main(String[] args){
        //ekhane ami handle na kore ekhaneo throws use korte partam...then it would be handled by JVM...
        try {
            meth1();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }
    
}
