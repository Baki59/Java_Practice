/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author USER
 */
interface member{
    void callback();
}
class customer implements member{
    String name;

    public customer(String n) {
        name=n;
    }
    @Override
    public void callback(){
        System.out.println("Ok, I will visit "+name);
    }
    
}
class store{
    member mem[]=new member[100];
    int count=0;
    public void register(member m){
        mem[count++]=m;
    }
    public void inviteSale(){
        for(int i=0;i<count;i++){
            mem[i].callback();
        }
    }
}
public class callBackMethodChallenge {
    public static void main(String[] args) {
        store s=new store();
        customer c1=new customer("Baki");
        customer c2=new customer("Billah");
        
        s.register(c1);
        s.register(c2);
        s.inviteSale(); 
    }
    
}
