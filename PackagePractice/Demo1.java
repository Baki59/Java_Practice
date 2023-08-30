package mypack1;

/*
 * there are 4 types of access modifier.....
 * 1.Default
 * 2.Private
 * 3.Protected
 * 4.Public
 * 
 * And there is 5 types of possible cases...
 * 
 * 1. Same class----------------------> All are accessible
 * 2. Same package Sublass------------> Only Private is not accessible
 * 3. Samle Package Non-subclass------> Only Private is not accessible
 * 4. Different Package Subclass------> Private and Default are not accessible
 * 5. Different Package Non-Subclass--> Only Public is accessible
 */

public class Demo1{
    int a=10;
    private int b=20;
    protected int c=30;
    public int d=40;

    public void display(){

        System.out.println(a+b+c+d);
        /*
         * it is in the same class that's why all types of variable is accessible.....
         */
    }
} 