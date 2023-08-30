/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methods;

/**
 *
 * @author USER
 */
public class Methods {

    static void change(int A[],int index,int value){
        A[index]=value;
    }
    static void change2(int x,int value){
        x=value;
    }
    public static void main(String[] args) {
        int A[]={2,4,6,8,10};
        change(A,2,20); //ekhane reference pass hoiche tai value o change hoiche....knona reference jei address k nirdesh kore setake change korle main memory te change houar karone amar array te effect porteche...
        for (int i : A) {
            System.out.println(i);
        }
        int x=15;
        change2(x, 20); // but primitive type er jnne refernce na jaoai value change hoi na...
        System.out.println(x);
    }
    
}
