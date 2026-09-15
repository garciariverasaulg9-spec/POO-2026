public class Bardo extends Personaje implements Sanador{
    private int podCura;
    private String instrumento;
    public Bardo(String nombre, int nivel, int puntosVida, int podCura, String instrumento) {
        super(nombre, nivel, puntosVida);
        this.podCura = podCura;
        this.instrumento = instrumento;
    }
    @Override 
    public int getPodCura() {
        return podCura;
    }
    public void setPodCura(int podCura){
        this.podCura=podCura;
    }   
    public String getInstrumento() {
        return instrumento;
    }
    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }
    @Override 
    public void atacar() {
        System.out.println("El bardo " + getNombre() + " ataca con su instrumento: " + instrumento);
    }
    @Override    
    public int calcularDanio() {
        int danioBase = 8;
        int danioTotal = danioBase + (getNivel() * 1);
        return danioTotal;
    }

    @Override
    public void curarAliado(Personaje personaje) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
