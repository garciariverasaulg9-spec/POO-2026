public class Nigromante extends Personaje {

    private int mana;

    public Nigromante(String nombre, int nivel, int puntosVida, int mana) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
    }

    @Override
    public void atacar() throws RpgException {

        if (!isEstaVivo()) {
            throw new PersonajeDerrotadoException(getNombre());
        }

        if (mana < 15) {
            throw new RecursoInsuficienteException("mana", mana);
        }

        mana -= 15;
        System.out.println("[" + getNombre() + "] invoca energía oscura " +
                           "y drena la vida del enemigo.");
    }

    @Override
    public int calcularDanio() {
        return 55;
    }

    public int getMana() {
        return mana;
    }
}
