public class Canario extends Animal{
    private String colorPlumaje;
    private boolean cantaEnJaula;
    private float envergaduraAlas;

    public Canario(String nombre, int edad, float peso, String colorPlumaje,boolean cantaEnJaula,float envergaduraAlas){
        super(nombre,edad,peso);
        this.colorPlumaje=colorPlumaje;
        this.cantaEnJaula=cantaEnJaula;
        this.envergaduraAlas=envergaduraAlas;
    }

    public void cantar(){
        System.out.println("El canario esta cantando");
    }
    public void volar(){
        System.out.println("El canario esta volando");
    }
    public void picar(){
        System.out.println("El canario esta picando ");
    }
    public String getcolorPlumaje(){
        return colorPlumaje;
    }
    public void setcolorPLumaje(String colorPlumaje){
        this.colorPlumaje=colorPlumaje;
    }
    public boolean getcantaEnJaulas(){
        return cantaEnJaula;
    }
    public void setcantaEnJaula(boolean cantaEnJaula){
        this.cantaEnJaula=cantaEnJaula;
    }
    public float getenvergaduraAlas(){
        return envergaduraAlas;
    }
    public void setenvergaduraAlas(float envergaduraAlas){
        this.envergaduraAlas=envergaduraAlas;
    }

    @Override
    public String toString(){
        return "Canario{ Nombre:"+nombre+", edad: "+edad+",peso: "+peso+" Color de plumaje: "+ colorPlumaje+ "que "+(cantaEnJaula?"si":"no")+ " canta en jaulas y tiene una envergadura de alas de: "+envergaduraAlas+ " cm}";
    }
}
