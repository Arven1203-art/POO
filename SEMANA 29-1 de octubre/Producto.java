package producto;
public class Main {
    private String nombre;
    private String categoria;
    private double precio;
    private int cantidadstock;

    public Main() {
    }

    public Main(String nombre, String categoria, double precio, int cantidadstock) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidadstock = cantidadstock;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadstock() {
        return cantidadstock;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidadstock(int cantidadstock) {
        this.cantidadstock = cantidadstock;
    }
    public String verDetalle (){
        return "el nombre de el producto es:"+ this.nombre + 
                "\n la categoria de el producto es:" +this.categoria +
                "\n el precio de este producto:" + this.precio +
                "\n la cantidad de este producto:" + this.cantidadstock;
     }
    public double calcularDescuento (int porcentaje){
        double descuento = this.precio * porcentaje/100;
        return descuento; 
    }
    public double calcularDescuento (float porcentaje){
        double descuento = this.precio * porcentaje/100;
        return descuento; 
    }
    // tiene error, la profe lo revisa no lo califica y lo explica la proxima clase
    public double calcularPrecioFinal (double porcentaje){
        return this.precio- this.calcularDescuento(cantidadstock);
    }
    public String vender(int cantidad) {
        if (cantidad <= this.cantidadstock) {
            this.cantidadstock -= cantidad; 
            return "Venta realizada. Quedan " + this.cantidadstock + " unidades.";
        } else {
            return "No hay suficiente inventario para realizar la venta.";
        }
    }   
}
