public class Guerrero extends Personaje {

    private String arma;
    private int fuerza;

    public Guerrero(String nombre, int nivel, int puntosVida, String arma, int fuerza) {
        super(nombre, nivel, puntosVida);
        this.arma = arma;
        this.fuerza = Math.max(0, fuerza);
    }

    @Override
    public void atacar() {
        if (!isEstaVivo()) {
            System.out.println("[" + getNombre() + "] no puede atacar porque está derrotado.");
            return;
        }
        System.out.println("[" + getNombre() + "] golpea con " + arma + " y hace " + calcularDanio() + " de daño.");
    }

    @Override
    public int calcularDanio() {
        return 30 + fuerza;
    }

    public String getArma() {
        return arma;
    }

    public int getFuerza() {
        return fuerza;
    }
}
