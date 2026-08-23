package vehiculo;
public class Vehiculo{
    final String marca;
    final String modelo;
    private int anio;
    protected double velocidadMax;

    public Vehiculo(String marca, String modelo, int anio,double velocidadMax){
        this.marca=marca;
        this.modelo=modelo;
        setAnio(anio);
        setVelocidadMax(velocidadMax);
    }
    //getters y setters
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAnio(){
        return anio;
    }
    public double getVelocidadMax(){
        return velocidadMax;
    }
    final void setAnio(int anio){
        if (anio >= 1885 && anio <=2100)
            this.anio=anio;
        else
            System.out.println("Error: Anio no valido...");
    }
    final void setVelocidadMax(double velocidadMax){
        if (velocidadMax >0)
            this.velocidadMax=velocidadMax;
        else
            System.out.println("Error: La velocidad max no puede ser menor o igual a 0...");
    }

    //Metodos
    public void describir(){
        System.out.println("Marca: "+ getMarca()+"\n"+
                            "Modelo: "+ getModelo()+"\n"+
                            "Anio: "+ getAnio()+"\n"+
                            "VelocidadMax: "+getVelocidadMax()
                        );
    }
    @Override
    public String toString(){
        return "Marca: "+getMarca()+
                        "| Modelo: "+getModelo()+
                        "| Anio: "+getAnio()+
                        "| VelocidadMax: "+getVelocidadMax();
        
    }
}