/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stattic_final;

/*
static members are shared by all objects...kono ekta object jodi 
static valueta change kore tahole seta sb object er jnne e change
hoye jabe....it is actually a shared data between all the objects
of a class....static member can be accessed by direct using class name...


 */
class HondaCity{
    static long price=10;
    int a,b;
    //but static method can not access non-static members...
    static double onRoadPrice(String city){
        switch(city)
        {
            case "Delhi":
                return price+price*0.1;
            case "Mumbai":
                return price+price*0.09;
            default:
                return price;
        }
        //int add=price+a; //eita error dekhabe...
    }
    //non-static method also can access static members of a class....
    void show_price(){
        System.out.println(price);
    }
}
public class Static_Variables {
    public static void main(String[] args) {
        HondaCity Honda=new HondaCity();
        System.out.println(Honda.price);
        //System.out.println(Honda.a=10);
        HondaCity Honda_Delhi=new HondaCity();
        System.out.println(Honda_Delhi.onRoadPrice("Delhi"));
        Honda_Delhi.show_price();
    }
    
}
