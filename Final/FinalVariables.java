/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgfinal;

/*
The fixed/constant value....we can't modify their value...
Final Variables written in Capital Letters.....
Final Variables can be initialized in three methods....
-Direct initialization
-Initialization by static block
-Initialization by creating constructor of a class....
 */
class My{
    final int MIN=1;
    static final int NORMAL;
    final int MAX;
    static 
    {
        NORMAL=5; //it will be possible if i make the variable as static...
    }

    public My() {
        //this.NORMAL = 0;
        this.MAX = 0;
    }
    
}
public class FinalVariables {
    public static void main(String[] args) {
        final int x=10;
        System.out.println(x);
    }
    
}
