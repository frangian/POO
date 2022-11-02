public class Perro {
    //atributos
    private String raza;
    private int anioNacimiento;
    private String nombre;
    private double peso;
    private boolean enAdopcion;
    private boolean tieneChip;
    private boolean estaLastimado;

    //constructor

    public Perro(String raza, int anioNacimiento, String nombre, double peso,
                 boolean enAdopcion, boolean tieneChip, boolean estaLastimado) {
        this.raza = raza;
        this.anioNacimiento = anioNacimiento;
        this.nombre = nombre;
        this.peso = peso;
        this.enAdopcion = enAdopcion;
        this.tieneChip = tieneChip;
        this.estaLastimado = estaLastimado;
    }

    public Perro(String raza, int anioNacimiento, String nombre, boolean enAdopcion, boolean estaLastimado){
        this.raza = raza;
        this.anioNacimiento = anioNacimiento;
        this.nombre = nombre;
        this.enAdopcion = enAdopcion;
        this.estaLastimado = estaLastimado;
    }

    //getters y setters

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public void setEnAdopcion(boolean enAdopcion) {
        this.enAdopcion = enAdopcion;
    }

    public void setEstaLastimado(boolean estaLastimado) {
        this.estaLastimado = estaLastimado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setTieneChip(boolean tieneChip) {
        this.tieneChip = tieneChip;
    }
    //metodos

    public int edadPerro(int anioNacimiento){
        return 2022 - anioNacimiento;
    }
    public boolean factiblePerderse(){
        if (this.tieneChip){
            return false;
        } else {
            return true;
        }
    }
    public boolean enviarAdopcion(){
        if (this.estaLastimado == false && this.peso > 5){
            return true;
        } else {
            return false;
        }
    }

}
