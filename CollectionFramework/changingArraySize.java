/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionframework;

/**
 *
 * major drawback of an array...its size is fixed...it can't change it's size by itself...programmer needs to do that..
 * so we want such type of array who can change its size by itself...
 * #built in variable size collection class ArrayList,LinkedList
 */

public class changingArraySize {
    public static void main(String[] args) {
        int A[]={2,3,5,4,6};
        //if we want to make this array bigger...that means if we want to add more elements in the array then we need to declare a new array...
        int B[]=new int[10];
        for(int i=0;i<A.length;i++){
            B[i]=A[i];
        }
        A=B;
        for(int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }
        System.out.println();
    }
    
}
