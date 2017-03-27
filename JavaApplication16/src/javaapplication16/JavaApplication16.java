/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;
import java.util.Scanner;
/**
 *
 * @author Estudiante
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("ingrese nombre del profesor");
        String np=teclado.next();
        System.out.println("ingrese su telefono");
        int tp=teclado.nextInt();
        System.out.println("ingrese su direccion");
        String dp=teclado.next();
        Profesor p1=new Profesor(np,tp,dp);
        System.out.println("ingrese nombre del estudiante");
        String ne=teclado.next();
        System.out.println("ingrese la materia que ve");
        String m=teclado.next();
        System.out.println("ingrese su telefono");
        int te=teclado.nextInt();
        System.out.println("ingrese su direccion");
        String de=teclado.next();
        Estudiante yo=new Estudiante(p1,m,ne,te,de);
        yo.notas();
        yo.calculo();
        System.out.println(yo);
        
    }
    
}
