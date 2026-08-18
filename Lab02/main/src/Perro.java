public class Perro extends Animal{
    private String raza;
    private boolean estaVacunado;

    public Perro(String nombre,int edad, float peso, String raza, boolean estaVacunado){
        super(nombre,edad,peso);
        this.raza=raza;
        this.estaVacunado=estaVacunado;
    }

    public void ladrar(){
        System.out.println(nombre+" esta ladrando");
    }
    public void buscarPelota(){
        System.out.println(nombre+" esta buscando la pelota");
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
        return "Nombre: "+nombre+"| Edad: "+edad+" | Peso: "+peso + "kg | Raza: "+ raza+ " | "+ (estaVacunado?"Si":"No")+ " esta vacunado";
    }

}
