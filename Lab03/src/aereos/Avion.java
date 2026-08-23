package aereos;
import vehiculo.Vehiculo;
public class Avion extends Vehiculo{
    private int numMotores;
    private double altMax;
    private String aerolinea;

    public Avion(String marca, String modelo, int anio,double velocidadMax, int numMotores,double altMax,String aerolinea){
        super(marca,modelo,anio,velocidadMax);
        setNumMotores(numMotores);
        setAltMax(altMax);
        this.aerolinea=aerolinea;
    }
    //getters y setters
    public int getNumMotores(){
        return numMotores;
    }
    public double altMax(){
        return altMax;
    }
    public String getAerolinea(){
        return aerolinea;
    }
    final void setNumMotores(int numMotores){
        if (numMotores>1&&numMotores<=5)
            this.numMotores=numMotores;
        else
            System.out.println("Error: Los aviones tienen de 1 a 5 motores...");
    }
    final void setAltMax(double altMax){
        if (altMax>=300 &&altMax <=15000)
            this.altMax=altMax;
        else
            System.out.println("Error: Un avion puede estar de 300m a 15000m en el aire...");
    }
    public void setAerolinea(String aerolinea){
        this.aerolinea=aerolinea;
    }

    @Override
    public String toString(){
        return "Marca: "+getMarca()+
                        "| Modelo: "+getModelo()+
                        "| Anio: "+getAnio()+
                        "| VelocidadMax: "+getVelocidadMax()+"kg/h\nNumero de motores: "+getNumMotores()+"|Altitud maxima: "+altMax()+"metros| Aerolinea: "+getAerolinea();
    }
}
