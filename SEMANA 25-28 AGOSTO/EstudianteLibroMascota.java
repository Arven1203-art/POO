// Clase Estudiante
class Estudiante {
    String nombre;
    int edad;
    int numeroMaterias;

    public Estudiante(String nombre, int edad, int numeroMaterias) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroMaterias = numeroMaterias;
    }

    public void mostrarInfo() {
        System.out.println("Estudiante Nombre: " + nombre + ", Edad: " + edad + ", Materias: " + numeroMaterias);
    }
}

// Clase Libro
class Libro {
    String titulo;
    String autor;
    int numeroPaginas;

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void mostrarInfo() {
        System.out.println("Libro Título: " + titulo + ", Autor: " + autor + ", Páginas: " + numeroPaginas);
    }
}

// Clase Mascota
class Mascota {
    String nombre;
    String especie;
    int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Mascota Nombre: " + nombre + ", Especie: " + especie + ", Edad: " + edad);
    }
}
