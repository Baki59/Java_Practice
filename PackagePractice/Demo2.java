package mypack1;

public class Demo2{
    Demo1 d=new Demo1();

    public void show(){
        System.out.println(d.a+d.b+d.c+d.d);

        /*
         * Demo2 is in same package like Demo1 but it is not the subclass of Demo1...that's why it can not access the private properties of Demo1
         */
    }
}