/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author Nicolás
 */
public class Comparador {
    public static String comparar(double a, double b){
        String c;
        c="valor";
        if (a<b){
            c="a es menor a b";
        }else if (a>b){
            c="a es mayor a b";
        }else if (Double.compare(a,b)==0){
            c="a y b son iguales";    
        }
    return c;
    }    
}   



       
        
      
    
    
    

