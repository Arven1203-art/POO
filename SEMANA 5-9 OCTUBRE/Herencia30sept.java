package herencia30sept;

public class Herencia30sept {

    public static void main(String[] args) {

        Animal animal1 = new Animal();
        animal1.setEspecie("mamifero");

        System.out.println(animal1.getEspecie());
        animal1.comer();
        animal1.dormir();

        Perro perro1 = new Perro();
        perro1.setEspecie("mamifero");
        perro1.setRaza("Pitbull");

        System.out.println(perro1.getRaza());
        System.out.println(perro1.getEspecie());
        perro1.comer();
        perro1.dormir();
        perro1.hacer_sonido();

        Perro perro2 = new Perro("mamifero", "Pincher");

        System.out.println(perro2.getEspecie());
        System.out.println(perro2.getRaza());
        perro2.comer();
        perro2.dormir();
        perro2.hacer_sonido();
        
Gato gato1 = new Gato("Mamifero", "Siames", "Blanco");
Gato gato2 = new Gato("Mamifero", "Persa", "Gris");
Gato gato3 = new Gato("Mamifero", "Angora", "Negro");

gato1.maullar();
gato1.jugar();
gato1.mostrarInformacion();
gato2.maullar();
gato2.jugar();
gato2.mostrarInformacion();
gato3.maullar();
gato3.jugar();
gato3.mostrarInformacion();

Pajaro pajaro1 = new Pajaro("Ave", "Loro", "Verde");
Pajaro pajaro2 = new Pajaro("Ave", "Canario", "Amarillo");
Pajaro pajaro3 = new Pajaro("Ave", "Aguila", "Cafe");

pajaro1.volar();
pajaro1.cantar();
pajaro1.mostrarInformacion();
pajaro2.volar();
pajaro2.cantar();
pajaro2.mostrarInformacion();
pajaro3.volar();
pajaro3.cantar();
pajaro3.mostrarInformacion();
    }
}
