package herencia30sept;

public class Gato extends Animal {

    private String raza;
    private String color;

    public Gato() {
    }

    public Gato(String especie, String raza, String color) {
        super(especie);
        this.raza = raza;
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void maullar() {
        System.out.println("El gato maulla: miau miau");
    }

    public void jugar() {
        System.out.println("El gato está jugando");
    }

    public void mostrarInformacion() {
        System.out.println("Especie: " + getEspecie());
        System.out.println("Raza: " + raza);
        System.out.println("Color: " + color);
    }
}
