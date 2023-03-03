public abstract class NaveEspacial{

    public String nombre;
    public String combustible;
    public String pais;
    public int anio;
    public int peso;
    public boolean activo;

    public NaveEspacial(String nombre, String combustible, String pais, int anio, int peso, boolean activo) {
        this.nombre = nombre;
        this.combustible = combustible;
        this.pais = pais;
        this.anio = anio;
        this.peso = peso;
        this.activo = activo;
    }
    public abstract void aterrizo();
    public abstract void orbitando();
}