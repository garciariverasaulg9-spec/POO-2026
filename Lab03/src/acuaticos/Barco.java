package acuaticos;
import vehiculo.Vehiculo;
public class Barco extends Vehiculo{
    private String tipoCasco;
    private double tonelajeMaxBote;
    private int numTripulantes;

    public Barco(String marca, String modelo, int anio,double velocidadMax,String tipoCasco, double tonelajeMaxBote,int numTripulantes){
        super(marca,modelo,anio,velocidadMax);
        this.tipoCasco=tipoCasco;
        setTonelajeMaxBote(tonelajeMaxBote);
        setNumTripulantes(numTripulantes);
    }
    //getters y setters
    public String getTipoCasco(){
        return tipoCasco;
    }
    public double getTonelajeMaxBote(){
        return tonelajeMaxBote;
    }
    public int getNumTripulantes(){
        return numTripulantes;
    }
    public void setTipoCasco(String tipoCasco){
        this.tipoCasco=tipoCasco;
    }
    public void setTonelajeMaxBote(double tonelajeMax){
        if (tonelajeMax>0 && tonelajeMax<=160000)
            this.tonelajeMaxBote=tonelajeMax;
        else    
            System.out.println("Error: Un bote no es capaza de cargar: "+tonelajeMax+ "kg");
    }
    public void setNumTripulantes(int numTripulantes){
        if (numTripulantes>=1 && numTripulantes<=8)
            this.numTripulantes=numTripulantes;
        else
            System.out.println("Error: Un Barco no puede tener "+numTripulantes);
    }
    @Override
    public String toString(){
        return "Marca: "+getMarca()+
                "| Modelo: "+getModelo()+
                        "| Anio: "+getAnio()+
                        "| VelocidadMax: "+getVelocidadMax()+ "kg/h\nTipo de casco: "+ getTipoCasco()+ "| Tonelaje maximo del barco: "+getTonelajeMaxBote()+"kg| "+
                        "| Numero de triupulantes: "+getNumTripulantes();
    }


}