/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

/**
 *
 * @author USER
 */
class ATM{
    
    synchronized public void checkBalance(String name){
        System.out.println(name+" is checking his Account.");
    }
    synchronized public void withdrawn(String name,int amount){
        System.out.println(name+" is withdrawn "+amount+" taka");
    }

}
class customer extends Thread{
    ATM atm;
    String name;
    int amount;

    customer(ATM at,String n, int a) {
        atm=at;
        name=n;
        amount=a;
    }
    public void useATM(){
        atm.checkBalance(name);
        atm.withdrawn(name, amount);
    }
    @Override
    public void run(){
        useATM();
    }
    
}
public class StudentChallengeSynchronization {
    public static void main(String[] args) {
        ATM a=new ATM();
        customer c1=new customer(a,"Kabul",100);
        customer c2=new customer(a,"Babul",1000);
        
        c1.start();
        c2.start();
    }
    
}
