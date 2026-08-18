public class App {
    public static void main(String[] args) throws Exception {
        Perro miPerro= new Perro("Wera",6,10.4f,"Criolla",true);
        Canario miAve= new Canario("Pico", 2,0.4f,"Azul",true,10);
        Gato miGato= new Gato("Michi",67,11.4f,"Siames",true,"Naranja");
        System.out.println("--Perro--");
        System.out.println(miPerro.toString());
        miPerro.buscarPelota();
        miPerro.dormir();
        System.out.println("\n");

        System.out.println("--Canario--");
        System.out.println(miAve.toString());
        miAve.volar();
        miAve.dormir();
        miAve.cantar();
        miAve.picar();
        System.out.println("\n");


        System.out.println("--Gato--");
        System.out.println(miGato.toString());
        miGato.maullar();
        miGato.dormir();
        miGato.jugar();
        miGato.aranar();
        System.out.println("\n");
    }
}
