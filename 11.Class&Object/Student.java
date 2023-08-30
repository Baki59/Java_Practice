/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgclass.object;

/**
 *
 * @author USER
 */
class Subjects{
    String subId;
    String name;
    short maxMarks;
    public Subjects(String s,String n,short m){
        subId=s;
        name=n;
        maxMarks=m;
    }
    public String toString(){
        return "\nSubjectID: "+subId+"\nName: "+name+"\nmaxMarks: "+maxMarks;
    }
}
class student{
    int rollNo;
    String name;
    String dept;
    Subjects subjects;
    public student(int r,String n,String d){
        rollNo=r;
        name=n;
        dept=d;
    }

    public Subjects getSubjects() {
        return subjects;
    }
    
}
public class Student {
    
}
