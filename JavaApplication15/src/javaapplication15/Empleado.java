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
public class Empleado {
    protected String nombre;
    protected int id;
    protected int edad;
    protected String estadocivil;
    protected int salario;

    public Empleado(String nombre, int id, int edad, String estadocivil, int salario) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.estadocivil = estadocivil;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado es " + nombre + ", id=" + id + ", edad=" + edad + ", estadocivil=" + estadocivil + ", salario=" + salario + '.';
    }

    
}
