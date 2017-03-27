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
public class Director extends Empleado{
    private int añosexperiencia;

    public Director(int añosexperiencia, String nombre, int id, int edad, String estadocivil, int salario) {
        super(nombre, id, edad, estadocivil, salario);
        this.añosexperiencia = añosexperiencia;
    }

    public int getAñosexperiencia() {
        return añosexperiencia;
    }

    public void setAñosexperiencia(int añosexperiencia) {
        this.añosexperiencia = añosexperiencia;
    }

    @Override
    public String toString() {
        return "Director:"+super.toString() + "años de experiencia=" + añosexperiencia + '.';
    }
    
}
