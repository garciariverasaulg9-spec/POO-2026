import personajes.Mago;
import personajes.Arquero;
import personajes.Guerrero;
import java.util.Random;
public class App {
    public static void main(String[] args) {
        // 1. Crear un objeto de cada tipo
        Guerrero guerrero = new Guerrero("Thorin", 5, 120, 25, "Cota de Espinas");
        Mago mago = new Mago("Gandalf", 6, 80, "vara de la edades", "Hogarts",30);
        Arquero arquero = new Arquero("haweye",10,140,"Flexible",10);

        System.out.println("=== ESTADO INICIAL DE LOS PERSONAJES ===");
        System.out.println(guerrero);
        System.out.println("----------------------------------------");
        System.out.println(mago);
        System.out.println("----------------------------------------");
        System.out.println(arquero);
        System.out.println("\n");

        // 2. Llamar a atacar() y defender() en cada uno (Polimorfismo)
        System.out.println("=== DEMOSTRACIÓN DE ATAQUES Y DEFENSAS ===");
        
        System.out.println("--- Guerrero ---");
        int danoGuerrero = guerrero.atacar();
        guerrero.defender();
        System.out.println();

        System.out.println("--- Mago ---");
        int danoMago = mago.atacar();
        mago.defender();
        System.out.println();

        System.out.println("--- Arquero ---");
        int danoArquero = arquero.atacar();
        arquero.defender();
        System.out.println("\n");

        // 3. Prueba de recibirDano() en al menos dos personajes (uno llega a 0 de vida)
        System.out.println("=== PRUEBA DE DAÑO Y ESTADO DE VIDA ===");
        
        System.out.println("-> " + mago.getNombre() + " recibe un ataque normal:");
        mago.recibirDano(30);

        System.out.println("\n-> " + arquero.getNombre() + " recibe un ataque letal:");
        arquero.recibirDano(150); // Recibe suficiente daño para llegar a 0 de vida
        System.out.println("\n");

        // 4. Imprimir la información final de cada personaje con toString()
        System.out.println("=== ESTADO FINAL DE LOS PERSONAJES ===");
        System.out.println(guerrero);
        System.out.println("----------------------------------------");
        System.out.println(mago);
        System.out.println("----------------------------------------");
        System.out.println(arquero);
    }
}
