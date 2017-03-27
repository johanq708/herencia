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
public class Programador extends Empleado{
    private int lineasph;
    private String lenguaje;

    public Programador(int lineasph, String lenguaje, String nombre, int id, int edad, String estadocivil, int salario) {
        super(nombre, id, edad, estadocivil, salario);
        this.lineasph = lineasph;
        this.lenguaje = lenguaje;
    }

    public int getLineasph() {
        return lineasph;
    }

    public void setLineasph(int lineasph) {
        this.lineasph = lineasph;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    @Override
    public String toString() {
        return "Programador:"+ super.toString() + "lineasph=" + lineasph + ", lenguaje=" + lenguaje + '.';
    }
    
}
