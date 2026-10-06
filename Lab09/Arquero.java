public class Arquero extends Personaje {

    private String arma;
    private int flechasDisponibles;
    private int precision;

    public Arquero(String nombre, int nivel, int puntosVida,
                   String arma, int flechasDisponibles, int precision) {
        super(nombre, nivel, puntosVida);
        this.arma = arma;
        this.flechasDisponibles = Math.max(0, flechasDisponibles);
        this.precision = precision;
    }

    @Override
    public void atacar() {
        if (!isEstaVivo()) {
            System.out.println("[" + getNombre() + "] no puede atacar porque está derrotado.");
            return;
        }
        if (flechasDisponibles <= 0) {
            System.out.println("[" + getNombre() + "] intenta disparar, pero no tiene flechas.");
            return;
        }
        flechasDisponibles--;
        System.out.println("[" + getNombre() + "] dispara una flecha con " + arma + ". Flechas restantes: " + flechasDisponibles);
    }

    @Override
    public int calcularDanio() {
        return (int) (precision * 0.8);
    }

    public String getArma() {
        return arma;
    }

    public int getFlechasDisponibles() {
        return flechasDisponibles;
    }

    public int getPrecision() {
        return precision;
    }
}
