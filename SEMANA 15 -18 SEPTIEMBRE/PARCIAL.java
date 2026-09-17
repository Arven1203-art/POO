package parcial;

public class Empleado {
    private String nombre;
    private String cargo;
    private double SalarioBase;
    private int anosExperiencia;

    public Empleado() {
    }

    public Empleado(String nombre, String cargo, double SalarioBase, int anosExperiencia) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.SalarioBase = SalarioBase;
        this.anosExperiencia = anosExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalarioBase(double SalarioBase) {
        this.SalarioBase = SalarioBase;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
    public String verDetalle(){
    return "Nombre:" + this.nombre + "\nCargo:" + this.cargo + "\nSalario Base:" + this.SalarioBase + "\nAnos de experiencia:" + this.anosExperiencia;
}
    public String trabajar(int horas){
        return "El empleado esta trabajando" + horas + "horas";
    }
    public String TomarDescanso(){
        return "\nEl empleado esta descansando";
    }
    public String TrabajarYDescansar(int horas){
        return "El empleado esta trabajando" + horas+ "horas" + "\nEl empleado esta descansando";
    }
    public double CalcularBono(float porcentaje){
        
        return SalarioBase*porcentaje;
        
    }   
    public double CalcularBono(int porcentaje){
        return SalarioBase*porcentaje;
    
    }
    public double calcularSalarioTotal(double bono, int diasTrabajados){
        return (SalarioBase/30)* diasTrabajados + bono ;        
    }
}
IKER ESTEBAN FUENTES TORRES
DANIEL ALEJANDRO GUEVARA ROSAS
