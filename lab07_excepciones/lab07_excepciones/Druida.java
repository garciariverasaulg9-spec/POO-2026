public class Druida extends Personaje {

    private int mana;

    public Druida(String nombre, int nivel, int puntosVida, int mana) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
    }

    @Override
    public void atacar() throws RpgException {

        if (!isEstaVivo()) {
            throw new PersonajeDerrotadoException(getNombre());
        }

        if (mana < 10) {
            throw new RecursoInsuficienteException("mana", mana);
        }

        mana -= 10;
        System.out.println("[" + getNombre() + "] invoca raíces del bosque " +
                           "y ataca con furia natural.");
    }

    @Override
    public int calcularDanio() {
        return 40;
    }

    public void curarAliado(Personaje aliado) throws RpgException {

        if (aliado == null) {
            throw new PersonajeNuloException("curarAliado");
        }

        if (!aliado.isEstaVivo()) {
            throw new AccionInvalidaException(
                "curarAliado",
                "No se puede curar a un personaje derrotado"
            );
        }

        int curacion = 30;
        System.out.println("[" + getNombre() + "] cura a " + aliado.getNombre() +
                           " por " + curacion + " puntos de vida.");
    }

    public int getMana() {
        return mana;
    }
}
