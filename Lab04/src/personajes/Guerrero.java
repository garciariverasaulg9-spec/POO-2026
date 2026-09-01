package personajes;

public class Guerrero extends Personaje{
    private int fuerza;
    private String armadura;

    public Guerrero(String nombre,int nivel,int puntosVida,int fuerza, String armadura){
        super(nombre,nivel,puntosVida);
        setFuerza(fuerza);
        this.armadura=armadura;
    }
    //getters y setters
    public int getFuerza(){
        return fuerza;
    }
    public void setFuerza(int fuerza){
        if (fuerza<0)
            this.fuerza=0;
        else
            this.fuerza=fuerza;
    }
    public String getArmadura(){
        return armadura;
    }
    public void setArmadura(String armadura){
        this.armadura=armadura;
    }
    //metodos

    @Override
    public int atacar(){
        int dano=super.atacar();
        System.out.println(getNombre()+" ataco con su espada usando "+getFuerza()+" de fuerza!");
        double danoFinal=dano*(1+(getFuerza()/100));
        return (int) danoFinal;
    }
    @Override
    public boolean defender(){
        boolean seDefendio=super.defender();
        if (seDefendio)
            System.out.println(getNombre()+" se defendio con la armadura de "+getArmadura());
        else
            System.out.println(getNombre()+" no logro defenderse");
        return seDefendio;
    }

    @Override
    public String toString(){
        return super.toString()+"\nFuerza: "+getFuerza()+"| Armadura: "+getArmadura();
    }

}