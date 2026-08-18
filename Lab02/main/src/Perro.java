public class Perro extends Animal{
    private String raza;
    private boolean estaVacunado;

    public Perro(String nombre,int edad, float peso, String raza, boolean estaVacunado){
        super(nombre,edad,peso);
        this.raza=raza;
        this.estaVacunado=estaVacunado;
    }

    public void ladrar(){
        System.out.println("El perro esta ladrando");
    }
    public void buscarPelota(){
        System.out.println("El perro esta buscando la pelota");
    }
    public String getRaza(){
        return raza;
    }
    public void setRaza(String raza){
        this.raza=raza;
    }
    public boolean getestaVacunado(){
        return estaVacunado;
    }
    public void setestaVacunado(boolean estaVacunado){
        this.estaVacunado=estaVacunado;
    }
    @Override
    public String toString(){
        return "Perro{ Nombre: "+nombre+", edad: "+edad+",Peso: "+peso + ",raza: "+ raza+ " y "+ (estaVacunado?"si":"no")+ " esta vacunado}";
    }

}
