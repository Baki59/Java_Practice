/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgfinal;

import java.util.Date;

/**
 *
 * @author USER
 */
class student{
    private String rollNo;
    private String deptName;
    private static int count=1;
    private static String DeptCode=null;
    private String generateRollNo(){
        Date d=new Date();
        
        switch (deptName){
            case "CSE":
                DeptCode="05";
                break;
            case "EEE":
                DeptCode="04";
                break;
            default:
                DeptCode="00";
        }
        String rn="BUET-"+(d.getYear()+1900)+"-"+DeptCode+"-"+count;
        count++;
        return rn;
    }
    public student(String Dept){
        deptName=Dept;
        rollNo=generateRollNo();
    }
    public String getRollNo(){
        return rollNo;
    }
    
}
public class StudentChallenge {
    public static void main(String[] args) {
        student std1=new student("CSE");
        student std2=new student("MME");
        student std3=new student("EEE");
        
        System.out.println("Student1 Roll No is: "+std1.getRollNo());
        System.out.println("Student2 Roll No is: "+std2.getRollNo());
        System.out.println("Student3 Roll No is: "+std3.getRollNo());
        
    }
    
}
