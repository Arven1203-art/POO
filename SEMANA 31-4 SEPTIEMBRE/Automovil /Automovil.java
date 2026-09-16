package com.mycompany.tareaautomovil;
public class Automovil {
    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;
    private int capacidadEstanque;

    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadEstanque) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
        this.capacidadEstanque = capacidadEstanque;
    }

    public String verDetalle() {
        return "Auto: " + this.fabricante + " " + this.modelo + ", Color: " + this.color + ", Cilindrada: " + this.cilindrada + ", Tanque: " + this.capacidadEstanque;
    }

    public String acelerar(int rpm) {
        return "El auto acelera a las " + rpm + " rpm.";
    }

    public String frenar() {
        return "El auto está frenando.";
    }

    public String acelerarFrenar(int rpm) {
        String mensajeAcelerar = this.acelerar(rpm);
        String mensajeFrenar = this.frenar();
        return mensajeAcelerar + " " + mensajeFrenar;
    }

    public float calcularConsumo(int km, float porcentajeGasolina) {
        return (km * porcentajeGasolina) / this.capacidadEstanque;
    }

    public float calcularConsumo(int km, int porcentajeGasolina) {
        float porcentajeDecimal = (float) porcentajeGasolina / 100f;
        return this.calcularConsumo(km, porcentajeDecimal);
    }
}
