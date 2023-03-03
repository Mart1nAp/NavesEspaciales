public class NoTripulada extends NaveEspacial{

    public String lugarOrbita;
    public int motores;
    public NoTripulada(String nombre, String combustible, String pais, int anio, int peso, boolean activo, String lugarOrbita, int motores){
        super(nombre, combustible, pais, anio, peso, activo);
        this.lugarOrbita = lugarOrbita;
        this.motores = motores;
    }

    public void orbitando(){
        this.activo = true;
    }
    public void aterrizo(){
        this.activo = false;
    }
}