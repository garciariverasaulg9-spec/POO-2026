public class Main {

    public static void main(String[] args) {

        System.out.println("=== RPG — Sistema con Manejo de Excepciones ===");

        MotorCombate motor = new MotorCombate();

        Druida druida = new Druida("Sylva", 8, 240, 60);
        Nigromante nigromante = new Nigromante("Malachar", 9, 240, 80);

        // Escenario 1 — Turno normal sin excepción
        motor.ejecutarTurno(druida, nigromante);

        // Escenario 2 — Personaje derrotado intenta atacar
        try {
            druida.recibirDanio(9999); // primero derrota a la druida
        } catch (AccionInvalidaException e) {
            System.out.println("ERROR " + e.getMessage());
        }
        motor.ejecutarTurno(druida, nigromante); // captura PersonajeDerrotadoException

        // Escenario 3 — Arquero sin flechas
        Arquero sinFlechas = new Arquero("Legolas", 6, 150, "Arco Largo", 0, 95);
        motor.ejecutarTurno(sinFlechas, nigromante); // captura RecursoInsuficienteException

        // Escenario 4 — Curar aliado derrotado
        Druida druida2 = new Druida("Elandra", 7, 200, 50);
        System.out.println("\n-- Intento de curar aliado derrotado --");
        try {
            druida2.curarAliado(druida); // druida ya está derrotada
        } catch (RpgException e) {
            System.out.println("No se pudo curar: " + e.getMessage());
        }

        // Escenario 5 — Daño negativo con finally
        System.out.println("\n-- Bloque manual try-catch-finally --");
        try {
            nigromante.recibirDanio(-50);
        } catch (AccionInvalidaException e) {
            System.out.println("Capturado: " + e.getMessage());
        } finally {
            System.out.println("El bloque finally siempre se ejecuta.");
        }

        // Escenario 6 — Mostrar bitácora completa
        motor.mostrarBitacora();
    }
}
