public class Animal {
    public String nombre;
    public int edad;
    public float peso;
    
    public Animal(String nombre, int edad,float peso){
        this.nombre=nombre;
        this.edad=edad;
        this.peso=peso;
    }

    public void comer(){
        System.out.println(nombre+ " esta comiendo");

    }

    public void dormir(){
        System.out.println(nombre+ " esta durmiendo");
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public float getPeso(){
        return peso;
    }
    public void setPeso(float peso){
        this.peso=peso;
    }
    @Override
    public String toString(){
        return "Animal{Nombre: "+ nombre+ ", Edad: "+edad+ " años, Peso: "+peso+ "kg}";
    }
}
