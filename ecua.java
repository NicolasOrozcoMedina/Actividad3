/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio23;

/**
 *
 * @author Nicolás
 */
public class ecua {
    public static double sola(double a,double b,double c){
        double e,f;
        e=Math.pow(b, 2)-(4*a*c);
        f=(-b+Math.sqrt(e))/(2*a);
    return f;
    }
    public static double solb(double a,double b,double c){
        double e,f;
        e=Math.pow(b, 2)-(4*a*c);
        f=(-b-Math.sqrt(e))/(2*a);
    return f;
    }
}
