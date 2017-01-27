/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssp2.lsosab.a0302;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class SSP2LSosaBA0302 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Componentes rectangulares de una fuerza ");
        System.out.println("Se utlizara el método de seno y coseno");
        
        Scanner teclado = new Scanner (System.in);
        
        double F,angulo,compx, compy;
        
        
        
        
        System.out.println("Ingresa el valor de la fuerza");
        F= teclado.nextDouble();
        
        System.out.println("Ingresa el valor del angulo con respecto al eje positivo de x");
        angulo= teclado.nextDouble();
        double anguloR = Math.toRadians(angulo);//Las funciones de cos y sin trabajan con radianes por eso debemos convertir a radianes el angulo en grados normales
        
        
        compx= F* Math.cos((anguloR));
        compy= (F* (Math.sin (anguloR)));
        
        System.out.println("La fuerza del componente en x es " + compx);
        System.out.println("La fuerza en el componente en y es " + compy);
        
    }
    
}
