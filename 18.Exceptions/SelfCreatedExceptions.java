/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author USER
 */
class NegativeDimensionException extends Exception{
    @Override
    public String toString(){
        return "Dimension can not be negative.";
    }
}

public class SelfCreatedExceptions {
    static int area(int l,int b) throws NegativeDimensionException{
        if(l<0||b<0){
            throw new NegativeDimensionException();
        }
        int a=l*b;
        return a;
    }
    static void meth1()throws NegativeDimensionException{
        int a=area(-10, 5);
        System.out.println(a);
    }
    public static void main(String[] args) {
        try {
            meth1();
        } catch (NegativeDimensionException e) {
            System.out.println(e);
        }
        
    
    }
    
}
