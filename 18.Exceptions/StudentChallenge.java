/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author USER
 */
class stackOverFlowException extends Exception
{
    @Override
    public String toString(){
        return "Stack is full.";
    }
}
class stackUnderFlowException extends Exception
{
    @Override
    public String toString(){
        return "Stack is Empty.";
    }
}
class stack{
    private int size;
    private int top=-1;
    private int S[];
    
    public stack(int sz)
    {
        size=sz;
        S=new int[sz];
    }
    public void push(int x) throws stackOverFlowException
    {
        if(top==size-1){
            throw new stackOverFlowException();
        }
        top++;
        S[top]=x;
    }
    public int pop() throws stackUnderFlowException{
        int x=0;
        if(top==-1){
            throw new stackUnderFlowException();
        }
        x=S[top];
        top--;
        return x;
    }
    public void printStack(){
        System.out.println("The Present Stack is:");
        for(int i=0;i<size;i++){
            System.out.print(S[i]+" ");
        }
        System.out.println();
    }
}
public class StudentChallenge {
    public static void main(String[] args) {
        stack s=new stack(5);
        try {
            s.push(5);
            s.push(6);
            s.push(3);
            s.push(1);
            s.push(2);
            //s.push(10);
        } catch (stackOverFlowException e) {
            System.out.println(e);
        }
        s.printStack();
        
        try {
            s.pop();
            System.out.println(s.pop());
            
        } catch (stackUnderFlowException e) {
            System.out.println(e);
        }
        s.printStack();

    }
    
}
