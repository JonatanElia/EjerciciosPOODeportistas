public abstract class Deportista {
    private String nombre;
    private int edad;
    private String pais;
    private int horasEntrenamiento;

    public Deportista() {
    }

    public Deportista(String nombre, int edad, String pais, int horasEntrenamiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.pais = pais;
        this.horasEntrenamiento = horasEntrenamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getHorasEntrenamiento() {
        return horasEntrenamiento;
    }

    public void setHorasEntrenamiento(int horasEntrenamiento) {
        this.horasEntrenamiento = horasEntrenamiento;
    }

    @Override
    public String toString() {
        return "Deportista{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", pais='" + pais + '\'' +
                ", horasEntrenamiento=" + horasEntrenamiento +
                '}';
    }

    public void MostrarInformacion(){
    }
    public abstract double calcularRendimiento();
}