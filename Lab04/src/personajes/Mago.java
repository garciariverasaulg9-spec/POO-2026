package personajes;

public class Mago extends Personaje{
    private String varita;
    private String escuelaMagia;
    private int mana;

    public Mago(String nombre,int nivel,int puntosVida,String varita,String escuelaMagia,int mana){
        super(nombre,nivel,puntosVida);
        this.varita=varita;
        this.escuelaMagia=escuelaMagia;
        setMana(mana);
    }
    //setters getters
    public String getVarita(){
        return varita;
    }
    public void setVarita(String varita){
        this.varita=varita;
    }
    public String getEscuelaMagia(){
        return escuelaMagia;
    }
    public void setEscuelaMagia(String escuelaMagia){
        this.escuelaMagia=escuelaMagia;
    }
    public int getMana(){
        return mana;
    }
    public void setMana(int mana){
        if (mana<1)
            this.mana=1;
        else
            this.mana=mana;
    }
    //metodos
    @Override
    public int atacar(){
        int dano=super.atacar();
        System.out.println(getNombre()+" ataco con un hechizo magico");
        float danoFinal=dano*(1+(getMana()/100));
        return (int ) danoFinal;
    }
    @Override
    public boolean defender(){
        boolean seDefendio=super.defender();
        if (seDefendio)
            System.out.println(getNombre()+" lanzo un hechizo de escudo con exito");
        else
            System.out.println(getNombre()+ " fallo el hechizo");
        return seDefendio;
    }
    @Override
    public String toString(){
        return super.toString() + "\nVarita: " + getVarita() + " | Escuela de magia: " + getEscuelaMagia() + " | Mana: " + getMana();
    }

}
