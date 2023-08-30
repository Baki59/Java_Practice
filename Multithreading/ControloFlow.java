/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

/**
 *
 * Single Program Single Flow Single thread.....only one thread...main thread....
 */
public class ControloFlow {
    static void display(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        display();
        System.out.println("World.");
        
        /*
            jehetu single flow tai ektar por ekta run korbe...main method theke run shuru...
        first line e display() method call hbe...then display method e giye okahner sb execute hbe...then 
        display method close hoile main e abar display() er nic theke execute hbe...
        so ektar por ekta...evabe single flow colte thakbe...jodi display method e kono error dei ...taile 
        program crass korbe ebong porer linegulo r colbena...kono infinite loop asleo emon hbe...nicer gulo r run korbena...
        */
    }
}
