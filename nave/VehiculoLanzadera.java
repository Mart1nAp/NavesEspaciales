public class VehiculoLanzadera extends NaveEspacial{

    public String carga;
    public int empuje;

    public VehiculoLanzadera(String nombre, String combustible, String pais, int anio, int peso, boolean activo, String carga, int empuje ){
        super(nombre, combustible, pais, anio, peso, activo);
        this.carga = carga;
        this.empuje = empuje;

    }
    public void orbitando(){
        this.activo = true;
    }
    public void aterrizo(){
        this.activo = false;
    }

}