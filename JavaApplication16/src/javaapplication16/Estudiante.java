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
public class Estudiante extends Persona{
    Scanner teclado=new Scanner(System.in);
    private Profesor profasignado;
    private String materia;
    private double[] notas;
    private double promedio;

    public Estudiante(Profesor profasignado, String materia, String nombre, int telefono, String direccion) {
        super(nombre, telefono, direccion);
        this.profasignado = profasignado;
        this.materia = materia;
        this.notas = notas;
        this.promedio = promedio;
    }

    public Profesor getProfasignado() {
        return profasignado;
    }

    public void setProfasignado(Profesor profasignado) {
        this.profasignado = profasignado;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    public void notas(){
        for(int i=0;i<4;i++){
            System.out.println("ingrese la nota: "+(i+1));
            int n=teclado.nextInt();
            notas[i]=n;
        }
    }
    
    public void calculo(){
        for(int i=0;i<4;i++){
            promedio+=notas[i];
        }
        promedio/=4;
    }

    @Override
    public String toString() {
        return "El estudiante es "+ super.toString()+" ve" + materia + "con" + profasignado + "y su promedio es " + promedio + '.';
    }
    
    
}
