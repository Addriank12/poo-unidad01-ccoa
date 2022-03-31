/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_unidad01_ccoa;
/**
 *
 * @author PC-07
 */
public class Estudiante {
    String nombre;
    int calificacion;
    String carrera;
    double peso;
    
   static boolean aprueba(int calificacion)
   {
       boolean result = false;
       if (calificacion >=70)
       {
           result=true;
       }
       return result;
   }
   
    static String equivalencia(int calificacion) 
    {
        String result = "";
        if (calificacion <70)
        {
            result = "Insuficiente";   
        }
        else
        {
            if (calificacion < 80)
            {
                result = "Bueno";
            }
            else
            {
                if (calificacion < 90)
                {
                    result = "Muy bueno";
                }
                else
                {
                result = "Sobresaliente";
                }
            }
        
        }
        return result;    
    }
    static double calcIMC(double peso, double altura)
    {
        return peso/(altura*altura);
    }
}
