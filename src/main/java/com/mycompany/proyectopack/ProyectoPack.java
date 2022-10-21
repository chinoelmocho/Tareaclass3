/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectopack;

/**
 *
 * @author LAB-2
 */
public class ProyectoPack {
    public static void main(String[] args) {
        var lugarmatriculacion1 = new LugarMatriculacion();
        var lugarmatriculacion2 = new LugarMatriculacion();
        lugarmatriculacion1.ciudad="Cuenca";
        lugarmatriculacion1.provincia="Azuay";
        lugarmatriculacion1.telefono= "0984316775";
        lugarmatriculacion1.descripcion= "Capulispamba";
        
        lugarmatriculacion2.ciudad="Cuenca";
        lugarmatriculacion2.provincia="Azuay";
        lugarmatriculacion2.telefono= "0984348215";
        lugarmatriculacion2.descripcion= "Mayancela"; 
                
                
                
                
        var propietario1 = new Propietario();
        propietario1.nombre="Juan Pérez";
        propietario1.direccion="París y Oslo";
        propietario1.telefono="0984357604";
        propietario1.yearNacimiento=1981;
        
        var propietario2 = new Propietario();
        propietario2.nombre="Carlos López";
        propietario2.direccion="Gran Colombia y Lamar";
        propietario2.telefono="09843578596";
        propietario2.yearNacimiento=1980;
        
        
        var auto1 = new Auto();
        auto1.color="Amarillo";
        auto1.cilindrajeMotor=1600;
        auto1.marca="Toyota";
        auto1.placa="AGF0526";
        auto1.precio=18000;
        auto1.year=2018;
        auto1.owner=propietario2;
        auto1.provincia = lugarmatriculacion1 ;
        auto1.descripcion = lugarmatriculacion1 ;
        auto1.ciudad = lugarmatriculacion1 ;
        auto1.telefono = lugarmatriculacion1 ;
        
        
        var auto2 = new Auto();
        auto2.color="Azul";
        auto2.cilindrajeMotor=2500;
        auto2.marca="Chevrolet";
        auto2.placa="UAF0526";
        auto2.precio=18000;
        auto2.year=2010;
        auto2.owner=propietario1;
        auto2.provincia = lugarmatriculacion1 ;
        auto2.descripcion = lugarmatriculacion1 ;
        auto2.ciudad = lugarmatriculacion1 ;
        auto2.telefono = lugarmatriculacion1 ;
        
        System.out.println(auto1.mostrarInfo());
        System.out.println(auto2.mostrarInfo());
}}
