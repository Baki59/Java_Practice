/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multithreading;

/**
 *ekhane duita while loop ache...duita e infinite loop...so main e
 * prothom display method call hoile oita e sudhu run korte thakbe..nicer
 * konokichu e r run korbena...single flow ba single thread e ei smssa...ekhon ami jodi
 * duita e simultaneously run koraite cai taile amar multithreading lagbe...
 */
public class Multithreading {

    static void display(){
        int i=1;
        while(true){
            System.out.println("Hello");
            i++;
        }
    }
    public static void main(String[] args) {
        display();
        int i=1;
        while(true){
            System.out.println("World.");
            i++;
        }
    }
    
}
