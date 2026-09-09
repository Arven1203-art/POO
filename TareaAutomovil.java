package com.mycompany.tareaautomovil;
public class TareaAutomovil {

    public static void main(String[] args) {
        
        Automovil subaru = new Automovil("Subaru", "Impreza", "Blanco", 2.0, 40);
        Automovil mazda = new Automovil("Mazda", "BT-50", "Rojo", 3.0, 60);
        Automovil toyota = new Automovil("Toyota", "Corolla", "Gris", 1.8, 50);
        Automovil ford = new Automovil("Ford", "Mustang", "Negro", 5.0, 70);
        Automovil chevrolet = new Automovil("Chevrolet", "Spark", "Azul", 1.2, 35);

        System.out.println("Prueba verDetalle() ");
        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        
        System.out.println("Prueba de acelerar()");
        System.out.println("Toyota: " + toyota.acelerar(2500));
        
        System.out.println("Prueba de frenar()");
        System.out.println("Chevrolet: " + chevrolet.frenar());
        
        System.out.println("Prueba de acelerarFrenar() ");
        System.out.println("Ford: " + ford.acelerarFrenar(4000));

        System.out.println("Prueba de sobrecarga: calcularConsumo()");
        System.out.println("Consumo Subaru (con decimal): " + subaru.calcularConsumo(300, 0.60f) + " litros.");
        System.out.println("Consumo Subaru (con entero): " + subaru.calcularConsumo(300, 60) + " litros.");
    }
}
