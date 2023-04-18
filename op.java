/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author Nicolás
 */
public class op {
    public static double ac(double a){
    return Math.PI*Math.pow(a,2);
    }
    public static double pc(double a){
    return 2*Math.PI*a;
    }
    public static double ar(double a,double b){
    return a*b;
    }
    public static double pr(double a,double b){
    return (2 * a) + (2 * b);
    }
    public static double acu(double a){
    return a*a;
    }
    public static double pcu(double a){
    return a*4;
    }
    public static double hipo(double ladoa, double ladob){
        double hipotenusa;
        hipotenusa=Math.sqrt(Math.pow(ladoa,2)+Math.pow(ladob,2));
        return hipotenusa;
    }
    public static double at(double a,double b){
    return (a * b / 2);
    }
    public static double pt(double a,double b){
    return (a + b + hipo(a,b));
    }
}
