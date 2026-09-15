public class Nigromante extends Personaje implements Hechicero{
    private int mana;
    private int podCura;
    public Nigromante(String nombre, int nivel, int puntosVida, int mana, int podCura) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
        this.podCura = podCura;
    }
    @Override
    public int getMana() {
        return mana;
    }   
    public void setMana(int mana){
        this.mana=mana;
    }
    public int getPodCura() {
        return podCura;
    }
    public void setPodCura(int podCura){
        this.podCura=podCura;
    }
    
    @Override 
    public void atacar() {
            System.out.println("El nigromante " + getNombre() + " ataca con su hechizo oscuro");
        }   
    
    @Override
    public int calcularDanio() {
        int danioBase = 15;
        int danioTotal = danioBase + (getNivel() * 3);
        return danioTotal;
    }

    @Override
    public void lanzarHechizo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
