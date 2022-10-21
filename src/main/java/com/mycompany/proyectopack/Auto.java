/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopack;

/**
 *
 * @author LAB-2
 */
public class Auto {
    
    String placa;
    String marca;
    int year;
    String color;
    double precio;
    int cilindrajeMotor;
    Propietario owner;
    LugarMatriculacion descripcion;
    LugarMatriculacion telefono;
    LugarMatriculacion ciudad;
    LugarMatriculacion provincia;

    public String mostrarInfo() {
        var retorno = " El auto tiene placa: " + this.placa + " es de marca: "
                + this.marca + ". El propietario es: " + this.owner.nombre
                + " la dirección del propietario es: " + this.owner.direccion
                + " . El auto cuesta "+this.precio+ " USD y es modelo: " + this.year
                + " El lugar de matriculacion es: "+this.descripcion+ " ,que se encuntra en la provincia de: "
                +this.provincia+ " en la ciudad de:"+this.ciudad+ " se puede contactarlo al numero:" +this.telefono;

        return retorno;
    }
}
