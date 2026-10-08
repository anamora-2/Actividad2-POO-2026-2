/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3;

/**
 *
 * @author anamo
 */
public class Automovil {
    String marca;
    int modelo;
    int motor;
    public enum tipoCom {GASOLINA, BIOETANOL, DIESEL, BIODISESEL,GAS_NATURAL}
    tipoCom tipoCombustible;
    public enum tipoA {CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV}
    tipoA tipoAutomovil;
    int numeroPuertas;
    int cantidadAsientos;
    int velocidadMaxima;
    public enum tipoColor {BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA}
    tipoColor color;
    int velocidadActual = 0;
    boolean automatico = false;
    double multa = 0;
    static final double VALOR_MULTA_BASE = 100000;
    
    Automovil(String marca, int modelo, int motor, tipoCom tipoCombustible, tipoA tipoAutomovil, int numeroPuertas,
    int cantidadAsientos, int velocidadMaxima, tipoColor color, boolean automatico){
    this.marca = marca;
    this.modelo = modelo;
    this.motor = motor;
    this.tipoCombustible = tipoCombustible;
    this.tipoAutomovil = tipoAutomovil;
    this.numeroPuertas = numeroPuertas;
    this.cantidadAsientos = cantidadAsientos;
    this.velocidadMaxima = velocidadMaxima;
    this.color = color;
    this.automatico = automatico;
    this.multa = 0;
    }
    
    String getMarca() {
        return marca;
    }
    
    int getModelo() {
        return modelo;
    }
    
    int getMotor() {
        return motor;
    }
    
    tipoCom getTipoCombustible() {
        return tipoCombustible;
    }
    
    tipoA getTipoAutomovil() {
        return tipoAutomovil;
    }
    
    int getNumeroPuertas() {
        return numeroPuertas;
    }
    
    int getCantidadAsientos() {
        return cantidadAsientos;
    }
    
    int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    
    tipoColor getColor() {
        return color;
    }
    
    int getVelocidadActual() {
        return velocidadActual;
    }
    
    public boolean getAutomatico() {
        return automatico;
    }
    
    void setMarca(String marca) {
        this.marca = marca;
    }
    
    void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
    void setMotor(int motor) {
        this.motor = motor;
    }
    
    void setTipoCombustible(tipoCom tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    
    void setTipoAutomovil(tipoA tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }
    
    void setNumeroPuertas(int númeroPuertas) {
        this.numeroPuertas = númeroPuertas;
    }
    
    void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }
    
    void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    
    void setColor(tipoColor color) {
        this.color = color;
    }
    
    void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    
    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }
    
    public void acelerar(int incrementoVelocidad) {
        if (velocidadActual + incrementoVelocidad <= velocidadMaxima) {
            velocidadActual = velocidadActual + incrementoVelocidad;
        } else {
            System.out.println("No se puede incrementar a una velocidad superior a la máxima del automóvil.");
            this.multa += VALOR_MULTA_BASE;
            System.out.println("Infracción: Se ha generado una multa de $" + VALOR_MULTA_BASE);
        }
    }
    
    void desacelerar(int decrementoVelocidad){
        if ((velocidadActual - decrementoVelocidad) > 0){
            velocidadActual = velocidadActual - decrementoVelocidad;
        } else {
            System.out.println("No se puede decrementar a una velocidad negativa.");
        }
    }
    
    void frenar() {
        velocidadActual = 0;
    }
    
    double calcularTiempoLlegada(int distancia) {
        return distancia/velocidadActual;
    }
    
    public boolean tieneMultas() {
        return this.multa > 0;
    }
    
    public double getMulta() {
        return this.multa;
    }
    
    void imprimir() {
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Motor = " + motor);
        System.out.println("Tipo de combustible = " + tipoCombustible);
        System.out.println("Tipo de automóvil = " + tipoAutomovil);
        System.out.println("Número de puertas = " + numeroPuertas);
        System.out.println("Cantidad de asientos = " + cantidadAsientos);
        System.out.println("Velocidad máxima = " + velocidadMaxima);
        System.out.println("Color = " + color);
        System.out.println("Es automático = " + automatico);
        System.out.println("Tiene multas = " + tieneMultas());
        System.out.println("Valor total de multas = $" + multa);
    }
}


