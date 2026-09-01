package personajes;

public class Arquero extends Personaje {
    private String tipArco;
    private int flechasDisp;
    public Arquero(String nombre,int nivel,int puntosVida,String tipArco,int flechasDisp){
        super(nombre,nivel,puntosVida);
        this.tipArco=tipArco;
        setFlechasDisp(flechasDisp);
    }
    //getters y setters
    public String getTipArco(){
        return tipArco;
    }
    public void setTipoArco(String tipArco){
        this.tipArco=tipArco;
    }
    public int getFlechasDisp(){
        return flechasDisp;
    }
    public void setFlechasDisp(int flechasDisp){
        if (flechasDisp<1)
            this.flechasDisp=1;
        else
            this.flechasDisp=flechasDisp;
    }
    //metodos
    @Override
    public int atacar(){
        int dano=super.atacar();
        System.out.println(getNombre()+" ataco disparando "+getFlechasDisp()+" con un arco "+getTipArco());
        
        return dano*getFlechasDisp();
    }
    @Override
    public boolean defender(){
        boolean seDefendio=super.defender();
        if (seDefendio)
            System.out.println(getNombre()+" se defendio esquivando el ataque");
        else
            System.out.println(getNombre()+" no pudo defenderse");
        return seDefendio;
    }
    @Override
    public String toString(){
        return super.toString()+"\nTipo de Arco: "+getTipArco()+"| Flechas disponibles: "+getFlechasDisp();
    }
}
