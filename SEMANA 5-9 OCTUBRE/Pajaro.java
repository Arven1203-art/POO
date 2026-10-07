package herencia30sept;

public class Pajaro extends Animal {

    private String nombre;
    private String colorPlumas;

    public Pajaro() {
    }

    public Pajaro(String especie, String nombre, String colorPlumas) {
        super(especie);
        this.nombre = nombre;
        this.colorPlumas = colorPlumas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    public void volar() {
        System.out.println("El pajaro esta volando");
    }

    public void cantar() {
        System.out.println("El pajaro esta cantando");
    }

    public void mostrarInformacion() {
        System.out.println("Especie: " + getEspecie());
        System.out.println("Nombre: " + nombre);
        System.out.println("Color de plumas: " + colorPlumas);
    }
}
