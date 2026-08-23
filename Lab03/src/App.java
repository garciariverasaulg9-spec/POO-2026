import acuaticos.Barco;
import aereos.Avion;
import terrestre.Automovil;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--Automovil--");
        Automovil miAuto= new Automovil("Toyota","Corolla", 2012,10000000,10,true);
        System.out.println(miAuto.toString()+"\n\n");

        System.out.println("--Avion--");
        Avion miAvion=new Avion("Airbus","Boeing",7000,15000.4,8,80,"Viva Aerobus");
        System.out.println(miAvion.toString()+"\n\n");

        System.out.println("--Barco---");
        Barco miBarco=new Barco("Beneteau","Yate",2010,500.90,"Desplazamiento",700000,6);
        System.out.println(miBarco.toString());

    }
}
