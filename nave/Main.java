import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        NoTripulada soho ;
        Tripulada space ;
        VehiculoLanzadera atlas ;
        NoTripulada pionerox = null;

        Scanner scanner = new Scanner(System.in);
        int isNave = 4;
        boolean romper = true;

        /**
         * Se ejecuta el ciclo while con un if-else anidado
         */
        while (romper) {
            System.out.print("Seleccione un opcion para ver: 1) Vehiculos lanzadera  2) No Tripulados 3) Tripulados 4) Salir:  ");
            isNave = scanner.nextInt();

            if(isNave == 1){
                atlas = new VehiculoLanzadera("Atlas","liquido", "china", 1977, 15000, true, "satelites", 2567);
                System.out.println("Nombre: " + atlas.nombre + ", Combustible:  " + atlas.combustible + ", País: " + atlas.pais + ", Año Lanzamiento: " + atlas.anio + ", Peso: "+  atlas.peso + ", Se encuentra activa: " + atlas.activo + ", Tipo de carga: " + atlas.carga + ", Empuje(ton): " + atlas.empuje );
            } else if (isNave == 2) {
                soho = new NoTripulada("Soho","solido", "rusia", 1999, 16000, true, "Jupiter", 5);
                pionerox = new NoTripulada("Pionero X","solido", "eeuu", 1986, 12000, false, "marte", 3);
                System.out.println("Nombre: " + soho.nombre + ", Combustible: " + soho.combustible + ", País: " + soho.pais + ", Año Lanzamiento:  " + soho.anio + ", Peso:  "+  soho.peso + ", Se encuentra activa:  " + soho.activo + ", Lugar de orbita: " + soho.lugarOrbita + ", Numero de motores: " + soho.motores);
                System.out.println("Nombre: " + pionerox.nombre + ", Combustible: " + pionerox.combustible + ", País:  " + pionerox.pais + ", Año Lanzamiento:  " + pionerox.anio + ", Peso:  "+  pionerox.peso + ", Se encuentra activa:  " + pionerox.activo + ", Lugar de orbita:  " + pionerox.lugarOrbita + ", Numero de motores:  " + pionerox.motores);
            } else if (isNave == 3){
                space = new Tripulada("Space","liquido", "china", 2000, 3400, false, 6, "Mision lunar");
                System.out.println(space.nombre + ", Combustible: " +space.combustible + ", País:  " + space.pais + ", Año Lanzamiento:  " + space.anio + ", Peso:  "+  space.peso + ", Se encuentra activa:  " + space.activo + ", Cantidad de pasajeros: " + space.cantidadPasajeros + ", Utilidad: " + space.utilidad);
            } else if (isNave == 4) {
                romper = false;
                break;
            }else {
                System.out.println("Selección incorrecta");
            }

        }
        System.out.println("Finalizo programa");



        pionerox.aterrizo();

}
}