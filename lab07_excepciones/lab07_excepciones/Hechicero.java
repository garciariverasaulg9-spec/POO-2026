public class Hechicero extends Personaje {

    private int mana;

    public Hechicero(String nombre, int nivel, int puntosVida, int mana) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
    }

    @Override
    public void atacar() throws RpgException {

        if (!isEstaVivo()) {
            throw new PersonajeDerrotadoException(getNombre());
        }

        if (mana < 12) {
            throw new RecursoInsuficienteException("mana", mana);
        }

        mana -= 12;
        System.out.println("[" + getNombre() + "] lanza una bola de fuego.");
    }

    @Override
    public int calcularDanio() {
        return 45;
    }

    public int getMana() {
        return mana;
    }
}
