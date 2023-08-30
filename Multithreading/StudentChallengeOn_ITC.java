/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

/**
 *
 * @author USER
 */
class whiteBoard{
     String text;
     int numberOfStudent=0;
     int count=0;
     public void attendance(){
         numberOfStudent++;
     }
     synchronized public void write(String msg){
         System.out.println("Teacher is writing: "+msg);
         while(count!=0){
             try {
                 wait();
             } catch (Exception e) {
             }
         }
         text=msg;
         count=numberOfStudent;
         notifyAll();
     }
     synchronized public String read(){
         while(count==0){
             try {
                 wait();
             } catch (Exception e) {
             }
         }
         
         String t=text;
         count--;
         if(count==0){
             notify();
         }
         
         return t;
     }    
}

class Teacher extends Thread{
    whiteBoard w;
    String notes[]={"Java is a language","It is OOPs","It is Platform Independent.","It supports Thread.","end"};
    public Teacher(whiteBoard wb){
        w=wb;
    }
    @Override
    public void run(){
        int count=0;
        while(count<notes.length){
            w.write(notes[count]);
            System.out.println("Teacher writes: "+notes[count]);
            count++;
        }
    }
}
class Student extends Thread{
    String name;
    whiteBoard wb;
    public Student(String nam,whiteBoard w){
        name=nam;
        wb=w;
    }
    @Override
    public void run(){
        String text;
        wb.attendance();
        do{
            text=wb.read();
            System.out.println(name+"Reading "+text);
            System.out.flush();
        }while((!text.equals("end")));
    }
}
public class StudentChallengeOn_ITC {
    public static void main(String[] args) {
        whiteBoard wb=new whiteBoard();
        Teacher t=new Teacher(wb);
        
        Student s1=new Student("1. Kuba",wb);
        Student s2=new Student("2. Buba",wb);
        Student s3=new Student("3. Tuba",wb);
        Student s4=new Student("4. Muba",wb);
        
        t.start();
        
        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
    
}
