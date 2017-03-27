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
public class Arquitecto extends Empleado{
    private int cantidadproyectos;

    public Arquitecto(int cantidadproyectos, String nombre, int id, int edad, String estadocivil, int salario) {
        super(nombre, id, edad, estadocivil, salario);
        this.cantidadproyectos = cantidadproyectos;
    }

    public int getCantidadproyectos() {
        return cantidadproyectos;
    }

    public void setCantidadproyectos(int cantidadproyectos) {
        this.cantidadproyectos = cantidadproyectos;
    }
    
}
