public class Nigromante extends Personaje {

    private int mana;

    public Nigromante(String nombre, int nivel, int puntosVida, int mana) {
        super(nombre, nivel, puntosVida);
        this.mana = Math.max(0, mana);
    }

    @Override
    public void atacar() {
        if (!isEstaVivo()) {
            System.out.println("[" + getNombre() + "] no puede atacar porque está derrotado.");
            return;
        }
        if (mana < 15) {
            System.out.println("[" + getNombre() + "] intenta invocar energía oscura, pero no tiene mana suficiente.");
            return;
        }
        mana -= 15;
        System.out.println("[" + getNombre() + "] invoca energía oscura y drena la vida del enemigo.");
    }

    @Override
    public int calcularDanio() {
        return 55;
    }

    public int getMana() {
        return mana;
    }
}
