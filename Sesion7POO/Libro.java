package com.mycompany.sesion7.poo;
public class Sesion7POO {

    public static void main(String[] args) {
        Libro libro1=new Libro();
        libro1.setTitulo("El Quijote De La Mancha");
        libro1.setAutor("Cervantes");
        libro1.setTitulo("El Quijote De La Mancha");
        libro1.setGenero("Novela");
        libro1.setNumPaginas(600);
        System.out.println(libro1.getTitulo());
        System.out.println(libro1.getGenero());
        System.out.println(libro1.getNumPaginas());
        libro1.setTitulo("Don Quijote De La Mancha");
        System.out.println(libro1.getTitulo());
        System.out.println("\n DETALLES DEL LIBRO:");
        System.out.println(libro1.verDetalle());
        
        System.out.println("\nLIBRO PRESTADO A:");
        System.out.println(libro1.prestar("Iker"));
        System.out.println("\nPRESTADO Y DEVUELTO");
        System.out.println(libro1.prestarYDevolver("Iker"));
        System.out.println("\nTIEMPO");
        System.out.println(libro1.calcularTiempoLectura(30, 2.5f));
    }
}

package com.mycompany.sesion7.poo;
public class Libro {
  // ATRIBUTOS: privados, solo la propia clase
    // Libro puede leer o modificarlos directamente.
    private String titulo;
    private String autor;
    private String genero;
    private int numPaginas;
 
    // CONSTRUCTOR: llena la "ficha" del libro al crear el objeto.

    public Libro() {
        
    }

    public Libro(String titulo, String autor, String genero, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.numPaginas = numPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
   
    
 
    // Devuelve un texto con todos los datos del libro.
    // Concatenacion directa con "+": cada "+" crea un String nuevo en memoria,
    // por eso en clases con muchos atributos se prefiere StringBuilder,
    // pero aqui se hace asi para verlo de forma explicita.
    public String verDetalle() {
        String detalle = "libro.titulo = " + this.titulo;
        detalle = detalle + "\nlibro.autor = " + this.autor;
        detalle = detalle + "\nlibro.genero = " + this.genero;
        detalle = detalle + "\nlibro.numPaginas = " + this.numPaginas;
        return detalle;
    }
 
    // Recibe el nombre de la persona y devuelve un mensaje de prestamo.
    public String prestar(String nombrePersona) {
        String mensaje = "El libro \"" + this.titulo + "\" ";
        mensaje = mensaje + "fue prestado a " + nombrePersona + ".";
        return mensaje;
    }
 
    // No recibe parametros: devolver no depende de ningun dato externo.
    public String devolver() {
        return "El libro \"" + this.titulo + "\" fue devuelto.";
    }
 
    // No repite la logica de prestar y devolver: los llama y combina los mensajes.
    public String prestarYDevolver(String nombrePersona) {
        String mensajePrestamo = this.prestar(nombrePersona);
        String mensajeDevolucion = this.devolver();
        return mensajePrestamo + "\n" + mensajeDevolucion;
    }
 
    // SOBRECARGA: mismo nombre "calcularTiempoLectura", distinto tipo de segundo parametro.
 
    // Version 1: las horas disponibles por dia llegan en decimal (ej. 1.5f)
    public float calcularTiempoLectura(int paginasPorDia, float horasDisponibles) {
        float diasNecesarios = (float) this.numPaginas / paginasPorDia;
        return diasNecesarios;
    }
 
    // Version 2: las horas disponibles por dia llegan en entero (ej. 2)
    public float calcularTiempoLectura(int paginasPorDia, int horasDisponibles) {
        float horasDecimal = (float) horasDisponibles;
        return this.calcularTiempoLectura(paginasPorDia, horasDecimal);
    }
}  

