public class Tripulada extends NaveEspacial{

    public int cantidadPasajeros;
    public String utilidad;
    public Tripulada(String nombre,String combustible, String pais, int anio, int peso, boolean activo, int cantidadPasajeros, String utilidad){
        super(nombre, combustible, pais, anio, peso, activo);
        this.cantidadPasajeros = cantidadPasajeros;
        this.utilidad = utilidad;
    }
    public void orbitando(){
        this.activo = true;
    }
    public void aterrizo(){
        this.activo = false;
    }
}