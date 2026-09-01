import acuaticos.Barco;
import aereos.Avion;
import terrestre.Automovil;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--Automovil--");
        Automovil miAuto= new Automovil("Toyota","Corolla", 2012,10000000,4,true);
        System.out.println(miAuto.toString()+"\nCambio de valores: ");
        miAuto.setAnio(1800);
        miAuto.setAnio(2000);
        miAuto.setVelocidadMax(-100);
        System.out.println("\n");


        System.out.println("--Avion--");
        Avion miAvion=new Avion("Airbus","Boeing",2000,1500.4,5,400,"Viva Aerobus");
        System.out.println(miAvion.toString()+"\nCambio de valores: ");
        miAvion.setAnio(3000);
        miAvion.setNumMotores(10);
        miAvion.setAltMax(80);
        System.out.println("\n");


        System.out.println("--Barco---");
        Barco miBarco=new Barco("Beneteau","Yate",2010,500.90,"Desplazamiento",804,6);
        System.out.println(miBarco.toString()+"\nCambios: ");
        miBarco.setNumTripulantes(100);
        miBarco.setTonelajeMaxBote(169090);

    }
}
