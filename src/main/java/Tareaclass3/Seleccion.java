/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tareaclass3;

/**
 *
 * @author LAB-2
 */
public class Seleccion {
    String codigoFIFA;
    String nombre;
    String pais;
    String jugador;
    int participacionEnElMundial;
    String Tecnico;
    
 public String obtienePais(){
    var retorno="Desconocido";
    switch(codigoFIFA){
        case "ECU":
            retorno="Ecuador";
            break;
        case "ARG":
            retorno="Aregentina";
            break;
        case "CHL":
            retorno="Chile";
            break;
        case "HON":
            retorno="Honduras";
            break;
        default :
            break;
    }
    return retorno;

 }
 

}
