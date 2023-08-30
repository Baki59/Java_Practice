/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionframework;
import java.util.*;
import java.util.function.Consumer;

/**
 *
 * @author USER
 */

public class ArrayList_Iterator {
    
    public static void main(String[] args) {
        ArrayList<Integer> al1=new ArrayList<>(20);
        
        ArrayList<Integer> al2=new ArrayList<>(List.of(13,1,3,4,5));
        
        al1.add(10);
        al1.add(0, 11);
        
        al1.addAll(al2);
        al1.addAll(0, al2);
        
        ArrayList<Integer> al3 = (ArrayList<Integer>) al1.clone();
        //System.out.println(al3);
        //System.out.println(al1.contains(50));//false
        //System.out.println(al1.containsAll(al3));//true
        //System.out.println(al1.equals(al3));//true
        //System.out.println(al1.retainAll(al2));
        /*
        for(int i=0;i<al1.size();i++){
        System.out.println(al1.get(i));
        }
         */
        //using for-each loop
        /*
        al1.forEach((Integer x) -> {
            System.out.println(x);
        }); //System.out.println(al1);
        */
        //same as above
        for(Integer x:al1){
            //System.out.println(x);
        }
        
        for(var x:al1){
            //System.out.println(x);
        }
        
        for (Iterator<Integer> it = al1.iterator(); it.hasNext();) {
            Integer x = it.next();
            //System.out.println(x);
        }
        
        Iterator<Integer> it=al1.iterator();
        //iterator is like a reference on all the element...it is holding the reference the first element now....
        while(it.hasNext())
        {
            //System.out.println(it.next());
        }
        
        for(ListIterator<Integer> it1=al1.listIterator();it1.hasNext();){
            System.out.println(it1.next());
        }
        
        //lamda expression
        //al1.forEach(n ->System.out.println(n););
        //al1.forEach(System.out::println);
        
        al1.forEach(n->show(n));
    }
    
    static void show(int n){
        if(n>60)
            System.out.println(n);
    }
    
}
