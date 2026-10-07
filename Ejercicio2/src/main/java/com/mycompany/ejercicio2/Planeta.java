/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author anamo
 */
public class Planeta {
    String nombre = null;
    int cantidadSatelites = 0;
    double masa = 0;
    double volumen = 0;
    int diametro = 0;
    int distanciaSol = 0;
    public enum tipoPlaneta { GASEOSO, TERRESTRE, ENANO }
    tipoPlaneta tipo;
    boolean esObservable = false;
    double periodoOrbital = 0;
    double periodoRotacion = 0;
    
    Planeta(String nombre, int cantidadSatélites, double masa, double volumen,
        int diámetro, int distanciaSol, tipoPlaneta tipo, boolean esObservable,
        double periodoOrbital, double periodoRotacion) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatélites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diámetro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.esObservable = esObservable;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
    }
    void imprimir() {
        System.out.println("Nombre del planeta = " + nombre);
        System.out.println("Cantidad de satélites = " + cantidadSatelites);
        System.out.println("Masa del planeta = " + masa);
        System.out.println("Volumen del planeta = " + volumen);
        System.out.println("Diámetro del planeta = " + diametro);
        System.out.println("Distancia al sol = " + distanciaSol);
        System.out.println("Tipo de planeta = " + tipo);
        System.out.println("Es observable = " + esObservable);
        System.out.println("Periodo Orbital = " + periodoOrbital  + " años" );
        System.out.println("Periodo de Rotación = " + periodoRotacion + " días");
    }
    double calcularDensidad() {
        return masa/volumen;
    }
    boolean esPlanetaExterior(){
        float límite = (float) (149597870 * 3.4);
        if (distanciaSol > límite) {
            return true;
        }else{
            return false;
        }
    }
}
    



