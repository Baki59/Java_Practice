/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javagenerics;

/**
 *
 * 2. WildCard ? -- Unbounded
 * 3. LowerBound -- super
 * 4. Upper Bound-- extends
 */
class A{}
class B extends A{}
class C extends A{}

class myArray<T>{
    T t[]=(T[]) new Object[10];
    int length=0;
    
    public void append(T v){
        t[length++]=v;
    }
    public void display(){
        for(int i=0;i<length;i++){
            System.out.println(t[i]);
        }
    }
}
public class GenericMethodsWLU {
    //by using general object
    public static void fun(myArray arr){
        arr.display();
    }
    //wildCard
    public static void fun1(myArray<?> arr){
        arr.display();
    }
    //UpperBound
    //bound er somoi only extends is allowed...implements is not allowed...emonki interface er jnne holeo implement allowed na...sekhetreo extends keyword use kora lagbe...
    public static void fun2(myArray<? extends Number> arr){
        arr.display();
    }
    //LowerBound
    public static void fun3(myArray<? super C> arr){
        arr.display();
    }
    public static void main(String[] args) {
        myArray<Integer> ma1=new myArray<>();
        myArray<String> ma2=new myArray<>();
        
        ma1.append(10);
        ma1.append(20);
        ma2.append("Hi");
        ma2.append("Hello");
        
        System.out.println("Using Simple Object Generic");
        fun(ma1);
        fun(ma2);
        
        System.out.println("Using WildCard:Unbounded...");
        fun1(ma1);
        fun1(ma2);
        
        System.out.println("Using Upper Bound....");
        fun2(ma1);
        //fun2(ma2); //this will cause error...because this function is upperbounded by extending Number...
        
        System.out.println("Lower Bound...");
        myArray<B> ma=new myArray<>();
        //fun3(ma);// eta error dekhabe karon B C er super na...
        myArray<A> maa=new myArray<>();
        fun3(maa);//eta error dekhabe na karon A C er super....
    }
    
}

/*
Do's and Dont's in generics...
1. Only extends is allowed in Generic Class Definiton..
2. Extends is used for interfaces also..
3. Only one class can be extended and can be multiple interface but then first one must be a class... 
4. extends and super are allowed in ? methods
5. <?> will accept all types but cannot access.
6. Base type object should be same or ? type
*/
