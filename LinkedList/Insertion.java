/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist;

/**
 *
 * @author USER
 */

class node{
    int data;
    node next;

    node(int value) {
        data = value;
        next = null;
    }
    node head;
    
    
    void printlist(){
        node p=head;
        System.out.print("[");
        
        while(p!=null){
            System.out.print(" "+p.data+" ");
            p=p.next;
        }
        System.out.print("]");
    }
    void insertatBegin(int data){
        node lk=new node(data);
        lk.next=head;
        head=lk;
    }
    void insertatEnd(int data){
        node lk=new node(data);
        node EndNode=head;
        while(EndNode.next != null){
            EndNode=EndNode.next;
        }
        EndNode.next=lk;
    }
    void insertAtaFixedPos(int data,node pos){
        node lk=new node(data);
        lk.next=pos.next;
        pos.next=lk;
    }
}
public class Insertion {
    
    public static void main(String[] args) {
        node n = new node(11);
        node head;
        n.insertatBegin(12);
        n.insertatBegin(22);
        n.insertatBegin(30);
        n.insertatBegin(44);
        n.insertatBegin(50);
        n.insertatBegin(33);
        System.out.println("Linked List: ");
        
        n.insertatEnd(23);
        
        n.insertAtaFixedPos(21, head.next);
        
        n.printlist();
    }
}
