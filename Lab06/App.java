public class App {
    public static void main(String[] args) {
        Personaje[] personajes = {
            new Druida("Elaria", 3, 100, 30, 12, "oso"),
            new Nigromante("Mortis", 3, 100, 30, 0),
            new Bardo("Lirio", 3, 100, 10, "laud")
        };

        System.out.println("=== COMIENZA LA BATALLA ===");
        int ronda = 1;

        while (hayMasDeUnSuperviviente(personajes)) {
            System.out.println("\n--- Ronda " + ronda + " ---");

            for (int indice = 0; indice < personajes.length; indice++) {
                Personaje atacante = personajes[indice];
                if (!atacante.isEstaVivo()) {
                    continue;
                }

                Personaje objetivo = buscarObjetivo(atacante, personajes);
                if (objetivo == null) {
                    break;
                }

                atacante.atacar();
                int danio = atacante.calcularDanio();
                objetivo.recibirDanio(danio);
                System.out.println(atacante.getNombre() + " inflige " + danio
                        + " de dano a " + objetivo.getNombre() + ". Vida restante: "
                        + objetivo.getPuntosVida());

                if (!objetivo.isEstaVivo()) {
                    System.out.println(objetivo.getNombre() + " ha sido derrotado.");
                }
            }

            mostrarEstado(personajes);
            ronda++;
        }

        System.out.println("\n=== FIN DE LA BATALLA ===");
        for (Personaje personaje : personajes) {
            if (personaje.isEstaVivo()) {
                System.out.println("Ganador: " + personaje.getNombre());
                break;
            }
        }
    }

    private static Personaje buscarObjetivo(Personaje atacante, Personaje[] personajes) {
        for (Personaje personaje : personajes) {
            if (personaje != atacante && personaje.isEstaVivo()) {
                return personaje;
            }
        }
        return null;
    }

    private static boolean hayMasDeUnSuperviviente(Personaje[] personajes) {
        int supervivientes = 0;
        for (Personaje personaje : personajes) {
            if (personaje.isEstaVivo()) {
                supervivientes++;
            }
        }
        return supervivientes > 1;
    }

    private static void mostrarEstado(Personaje[] personajes) {
        System.out.println("Estado:");
        for (Personaje personaje : personajes) {
            System.out.println("- " + personaje.getNombre() + ": "
                    + personaje.getPuntosVida() + " PV"
                    + (personaje.isEstaVivo() ? " (vivo)" : " (derrotado)"));
        }
    }
}
