/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgfinal;

/*
A class which can create a single object!
 */

class coffeaMachine{
    private float coffeaQty;
    private float waterQty;
    private float milkQty;
    private float sugarQty;
    
    static private coffeaMachine my=null;

    private coffeaMachine() {
        coffeaQty = 1;
        waterQty = 1;
        milkQty=1;
        sugarQty=1;
    }
    public void fillWater(float qty){
        waterQty=qty;
    }
    public void fillSugar(float qty){
        sugarQty=qty;
    }
    public float getCoffea(){
        return 0.15f;
    }
    static coffeaMachine getInstance(){
        if(my==null){
            my=new coffeaMachine();
        }
        return my;
    }

    
    
}

public class SingletonClass {
    public static void main(String[] args) {
        coffeaMachine c=coffeaMachine.getInstance();
        coffeaMachine c2=coffeaMachine.getInstance();
        coffeaMachine c3=coffeaMachine.getInstance();
        System.out.println(c+" "+c2+" "+c3);
        if(c==c2&&c2==c3){
            System.out.println("Same");
        }
    }
    
}
