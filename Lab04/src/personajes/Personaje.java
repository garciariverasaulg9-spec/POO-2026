package personajes;
import combatiente.ICombatiente;
import java.util.Random;
public class Personaje implements ICombatiente{
    private String nombre;
    private int nivel;   
    private int puntosVida;
    private boolean estaVivo;

    public Personaje(String nombre,int nivel,int puntosVida){
        this.nombre=nombre;
        setNivel(nivel);
        setPuntosVida(puntosVida);
    }
    //getters y setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getNivel(){
        return nivel;
    }
    public void setNivel(int nivel){
        if (nivel >= 1)
            this.nivel=nivel;
        else
            this.nivel=1;

    }
    public int getPuntosVida(){
        return puntosVida;
    }
    public void setPuntosVida(int puntosVida){
        if (puntosVida<=0 ){
            System.out.println(getNombre()+" esta muerto...");
            this.puntosVida=0;
            this.estaVivo=false;
        }
        else{
            this.puntosVida=puntosVida;
            this.estaVivo=true;
        }
    }
    public boolean isEstaVivo(){
        return estaVivo;
    }
    public void setEstaVivo(boolean estaVivo){
        this.estaVivo=estaVivo;
    }

    //Metodos
    public void recibirDano(int dano){
        int vidaRes=this.puntosVida;
        vidaRes-=dano;
        if (vidaRes<=0){
            vidaRes=0;
            this.estaVivo=false;
            System.out.println(getNombre()+" esta muerto...");
        }
        else
            System.out.println(getNombre()+ " recibio "+dano+" de daño, vida restante: "+vidaRes);
        
        this.puntosVida=vidaRes;
            
            
    }

    @Override
    public String toString(){
        return "Nombre: "+getNombre()+"| Nivel: "+getNivel()+"| Puntos de vida: "+getPuntosVida()+"| "+
        (isEstaVivo()?"Si":"No")+" esta vivo";
    }
    @Override
    public int atacar(){
        int golpe=20;
        Random aleatorio= new Random();
        int num= aleatorio.nextInt(10);
        if (num>=0 && num<=1)
            golpe-=10;        
        else if(num>=2 && num<=6)
            golpe=20;
        else
            golpe+=30;
        System.out.println(getNombre()+" ataco");
        return golpe; //Este sera el daño, si entre un numero del 0 al 9 si sale 0,1 es un golpe debil,2,3,4,5,6 golpe normal, 7,8,9 golpe critico
    }
    @Override
    public boolean defender(){ // El personaje tiene 10% de probabilidad de defenderse de un ataque
        Random aleatorio=new Random();
        int num= aleatorio.nextInt(10);
        boolean seDefendio=(num==5);
        if (seDefendio)
            System.out.println(getNombre()+" logro defenderse");
        else
            System.out.println(getNombre()+" no logro defenderse");
        return seDefendio;
    }
}
