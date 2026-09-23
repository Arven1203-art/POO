public class empleado {
    private String nombre;
    private String cargo;
    private double SalarioBase;
    private int anosExperiencia;

    public empleado() {
    }

    public empleado(String nombre, String cargo, double SalarioBase, int anosExperiencia) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.SalarioBase = SalarioBase;
        this.anosExperiencia = anosExperiencia;
    }

    public empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(double SalarioBase) {
        this.SalarioBase = SalarioBase;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public String verDetalle(){
        return "Nombre:" + this.nombre +
                "\nCargo" + this.cargo +
                "Salario Base;" + this.SalarioBase +
                "\nAnos de experiencia" + this.anosExperiencia;
    }
    public String trabajar (int horas){
        return "El empleado"+ this.nombre + "esta trabajando" + horas + "horas";
    }
 public String descansar () {
     return "El empleado"+ this.nombre + "esta descansando";
 }   
 public String descansarTrabajar (int horas){
     String trabajo = this.trabajar(horas);
     String descanso = this.descansar();
     return this.descansar() + this.trabajar(horas);
 }
 
}
