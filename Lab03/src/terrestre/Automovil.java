package terrestre;
import vehiculo.Vehiculo;
public class Automovil extends Vehiculo{
    private int numPuertas;
    private boolean isElectrico;

    public Automovil(String marca, String modelo,int anio,double velocidadMax,int numPuertas,boolean isElectrico){
        super(marca,modelo,anio,velocidadMax);
        setNumPuertas(numPuertas);
        this.isElectrico=isElectrico;
    }

    //getters y setters
    public int getNumPuertas(){
        return numPuertas;
    }
    public boolean getIsElectrico(){
        return isElectrico;
    }
    final void setNumPuertas(int numPuertas){
        if (numPuertas>=2 && numPuertas <=6)
            this.numPuertas=numPuertas;
        else
            System.out.println("Error: No pueden haber menos de 2 o mas de 6 puertas");
    }
    public void setIsElectrico(boolean isElectrico){
        this.isElectrico=isElectrico;
    }
    @Override
    public String toString(){
        return "Marca: "+getMarca()+
                        "| Modelo: "+getModelo()+
                        "| Anio: "+getAnio()+
                        "| VelocidadMax: "+getVelocidadMax()+"km/h\nPuertas: "+getNumPuertas()+ "| Es electrico: "+ (getIsElectrico()?"Si": "No");
    }
}
