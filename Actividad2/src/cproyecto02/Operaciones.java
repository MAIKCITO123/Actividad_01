/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cproyecto02;

/**
 *
 * @author USER 17
 */
public class Operaciones {
    
    public float suma(float num1, float num2){
        return num1 + num2;
    }
    
    public float resta(float num1, float num2){
        return num1 - num2;
    }
    
    public float multi(float num1, float num2){
        return num1 * num2;
    }
    
    public float div(float num1, float num2){
        if(num2 != 0){
        return num1 / num2;
            } else {
        System.out.println("Error: División por cero");
        return 0;
        }
    }
    
    public float raiz(float num1){
        if(num1 < 0){
            System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo");
            return -1;
        }
        return (float) Math.sqrt(num1);
    }
    
    public float pot(float num1, float num2){
        if(num1 == 0 && num2 <= 0){
            System.out.println("Error: Indeterminación 0 elevado a 0 o a un número negativo");
            return -1;
        }
        return (float) Math.pow(num1, num2);
    }
    
    public float sen(float num1){
        return (float) Math.sin(num1);
    }
    
    public float cos(float num1){
        return (float) Math.cos(num1);
    }
    
    public float raiz3(float num1){
        if(num1 < 0){
            System.out.println("Error: No se puede calcular la raíz cúbica de un número negativo");
            return -1;
        }
        return (float) Math.cbrt(num1);
    }
    
    public float max(float num1, float num2){
        return Math.max(num1, num2);
    }
    
}
