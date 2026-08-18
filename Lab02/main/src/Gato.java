public class Gato extends Animal{
    private String raza;
    private boolean tieneUnas;
    private String color;

    public Gato(String nombre,int edad, float peso, String raza,boolean tieneUnas, String color){
        super(nombre,edad,peso);
        this.raza=raza;
        this.tieneUnas=tieneUnas;
        this.color=color;
    }
    public void aranar(){
        System.out.println("El gato esta aranando algo");
    }
    public void jugar(){
        System.out.println("El gato esta jugando");
    }
    public void maullar(){
        System.out.println("El gato esta maullando");
    }
    public  String getRaza(){
        return raza;
    }
    public void setRaza(String raza){
        this.raza=raza;
    }
    public boolean gettieneUnas(){
        return tieneUnas;
    }
    public void settieneUnas(boolean tieneUnas){
        this.tieneUnas=tieneUnas;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }

    @Override
    public String toString(){
        return "Gato{ Nombre: "+nombre+",edad: "+edad+",peso: "+peso+", raza: "+ raza+ " y color: "+color+", ademas "+ (tieneUnas?"si": "no")+ " tiene unas largas}";
    }

}
