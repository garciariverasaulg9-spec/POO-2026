public class App {
    public static void main(String[] args) throws Exception {
        Perro miPerro= new Perro("Wera",6,10.4f,"Criolla",true);
        Canario miAve= new Canario("jose", 2,10.2f,"Azul",true,10);
        Gato miGato= new Gato("Michi",67,11.4f,"Siames",true,"Naranja");
        miPerro.buscarPelota();
        System.out.println(miPerro.toString()+"\n");
        miAve.volar();
        System.out.println(miAve.toString()+"\n");
        miGato.maullar();
        System.out.println(miGato.toString());
    }
}
