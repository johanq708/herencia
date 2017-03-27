/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

/**
 *
 * @author Estudiante
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e1=new Empleado("yo", 99, 17,"soltero",500);
        Programador p1=new Programador(100, "java","ella", 101,30,"casada",2000);
        Director d1=new Director(20,"el",19,50,"casado",10000);
        Empresa empresa=new Empresa();
        empresa.adicionarEmpleado(e1);
        empresa.adicionarEmpleado(p1);
        empresa.adicionarEmpleado(d1);
        empresa.imprimirEmpleados();
    }
}
