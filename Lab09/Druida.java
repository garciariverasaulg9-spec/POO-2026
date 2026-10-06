public class Druida extends Personaje {

    private int mana;

    public Druida(String nombre, int nivel, int puntosVida, int mana) {
        super(nombre, nivel, puntosVida);
        this.mana = Math.max(0, mana);
    }

    @Override
    public void atacar() {
        if (!isEstaVivo()) {
            System.out.println("[" + getNombre() + "] no puede atacar porque está derrotado.");
            return;
        }
        if (mana < 10) {
            System.out.println("[" + getNombre() + "] intenta invocar raíces, pero no tiene mana suficiente.");
            return;
        }
        mana -= 10;
        System.out.println("[" + getNombre() + "] invoca raíces del bosque y ataca con furia natural.");
    }

    @Override
    public int calcularDanio() {
        return 40;
    }

    public void curarAliado(Personaje aliado) {
        if (aliado == null) {
            System.out.println("[" + getNombre() + "] intenta curar a un aliado nulo.");
            return;
        }
        if (!aliado.isEstaVivo()) {
            System.out.println("[" + getNombre() + "] no puede curar a " + aliado.getNombre() + " porque está derrotado.");
            return;
        }
        int curacion = 30;
        System.out.println("[" + getNombre() + "] cura a " + aliado.getNombre() + " por " + curacion + " puntos de vida.");
    }

    public int getMana() {
        return mana;
    }
}
