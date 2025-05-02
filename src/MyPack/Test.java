/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyPack;

/**
 *
 * @author Sohan
 */
public class Test {
    private int a=10;
    public void message(){
        System.out.println("This is a message from package A!");
    }
    protected int getA(){
        return a;
    } 
    /*In main:
        Test t = new Test();
        t.message();
        FirstJava f = new FirstJava();
        //System.out.println(t.a); //a has private access specifiers
        System.out.println("a: "+f.getA());//getA method is protected only be accessed via sub classes 
    */
}
