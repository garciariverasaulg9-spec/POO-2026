public class Sanador extends Personaje {

    private int mana;

    public Sanador(String nombre, int nivel, int puntosVida, int mana) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
    }

    @Override
    public void atacar() throws RpgException {

        if (!isEstaVivo()) {
            throw new PersonajeDerrotadoException(getNombre());
        }

        if (mana < 8) {
            throw new RecursoInsuficienteException("mana", mana);
        }

        mana -= 8;
        System.out.println("[" + getNombre() + "] golpea con su bastón sagrado.");
    }

    @Override
    public int calcularDanio() {
        return 20;
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

        System.out.println("[" + getNombre() + "] cura a " + aliado.getNombre() +
                           " por 25 puntos de vida.");
    }

    public int getMana() {
        return mana;
    }
}
