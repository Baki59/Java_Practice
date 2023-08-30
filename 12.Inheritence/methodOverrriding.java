/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritence;

/*
method overloading vs method overriding:
when the more than one method is unique in respect of name and parameters
then it is overriding...and overloading is when the methods differ either in repspect of parameter or return type 
 */

class sup{
   public void display(){
       System.out.println("Hello.");
   }
}

class sub extends sup{
    //method overrided.......
    @Override
    public void display(){
        System.out.println("Hello welcome");
    }
    public void message(){
        System.out.println("This is in subclass....");
    }
}

public class methodOverrriding {
    public static void main(String[] args) {
        sup su=new sup();
        su.display();
        sub s=new sub();
        s.display();
        
        /*
        ********Runtime Polymorphism************DYnamic Method Dispatch***********
        when a superclass reference holding a object of subclass and called the overrided method then the method 
        of the object will be called not the method of the reference....
        */
         
        sup s1=new sub(); //dynamic method dispatch
        s1.display(); //hello welcome
        //s1.message(); 
        /*
          as it is not overrided ...so i can not call it by the subclass object which is referenced by the super class..
         --tar mane hoilo j amar tv dekhte smart but sekhane sadharon tv er propertygulo ache just...extra featur gulo nai...
        */
        //sub s2=new sup(); //it is not valid.....
    }
    
}
