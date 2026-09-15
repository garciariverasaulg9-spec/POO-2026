public class Druida extends Personaje implements Sanador,Hechicero{
    private int mana;
    private int podCura;
    private String formaAnimal;
    public Druida(String nombre, int nivel, int puntosVida, int mana, int podCura, String formaAnimal) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
        this.podCura = podCura;
        this.formaAnimal = formaAnimal;
    }
    @Override
    public int getMana() {
        return mana;
    }   
    public void setMana(int mana){
        this.mana=mana;
    }
    @Override
    public int getPodCura() {
        return podCura;
    }
    public void setPodCura(int podCura){
        this.podCura=podCura;
    }
    public String getFormaAnimal() {
        return formaAnimal;
    }
    public void setFormaAnimal(String formaAnimal) {
        this.formaAnimal = formaAnimal;
    }
    @Override 
    public void atacar() {
            System.out.println("El druida " + getNombre() + " ataca con su forma animal: " + formaAnimal);
        }   
    
    @Override
    public int calcularDanio() {
        int danioBase = 10;
        int danioTotal = danioBase + (getNivel() * 2);
        return danioTotal;
    }

    @Override
    public void curarAliado(Personaje personaje) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void lanzarHechizo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
