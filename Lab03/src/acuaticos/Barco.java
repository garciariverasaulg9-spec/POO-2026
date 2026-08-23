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
    final void setTonelajeMaxBote(double tonelajeMax){
        if (tonelajeMax>0 && tonelajeMax<=160000)
            this.tonelajeMaxBote=tonelajeMax;
        else    
            System.out.println("Error: un bote no es capaz de levantar mas de 16 toneladas, tampoco se aceptan valores menores a 0");
    }
    final void setNumTripulantes(int numTripulantes){
        if (numTripulantes>=1 && numTripulantes<=8)
            this.numTripulantes=numTripulantes;
        else
            System.out.println("Error: un baroc no puede poseer mmas de 8 tripulantes o menos de 1");
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