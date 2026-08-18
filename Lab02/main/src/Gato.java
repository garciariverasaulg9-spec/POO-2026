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
        if (tieneUnas)
            System.out.println(nombre+" esta aranando algo");
        else    
            System.out.println(nombre+" no puede aranar nada porque no tiene unas largas");
    }
    public void jugar(){
        System.out.println(nombre +" esta jugando");
    }
    public void maullar(){
        System.out.println(nombre+" esta maullando");
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
        return "Nombre: "+nombre+"| Edad: "+edad+"| Peso: "+peso+"kg | Raza: "+ raza+ " | Color: "+color+" | "+ (tieneUnas?"Si": "No")+ " tiene unas largas";
    }

}
