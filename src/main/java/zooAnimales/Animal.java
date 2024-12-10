package zooAnimales;
import gestion.*;

public class Animal {
    private static int totalAnimales;
    private String nombre="None";
    private int edad=0;
    private String habitat="None";
    private String genero="None";
    private Zona[] zona;

    public Animal(){
        totalAnimales++;

    }



    public Animal(String nombre,int edad,String habitat,String genero){
        this();
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;


    }

    public String movimiento(){
        return "desplazarse";

    }

    public static String totalPorTipo(){
        return "Mamiferos: "+Mamifero.cantidadMamiferos+"\n" + 
				"Aves: "+ Ave.cantidadAves+"\n" + 
				"Reptiles: "+Reptil.cantidadReptiles+"\n" + 
				"Peces: "+Pez.cantidadPeces+"\n" + 
				"Anfibios: "+Anfibio.cantidadAnfibios;
        


    }

    public String toString(){
        return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero;
    }

    //Metodos para Total Animales

    public static void setTotalAnimales(int totalAnimales) {
        Animal.totalAnimales = totalAnimales;
    }
    public static int getTotalAnimales() {
        return totalAnimales;
    
    }

    //Metodos para Nombre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    //Metodos para edad

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }

    //Metodos para habitat

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public String getHabitat() {
        return habitat;
    }

    //Metodos para genero

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getGenero() {
        return genero;
    }

    //Metodos para zona
    
    public void setZona(Zona[] zona) {
        this.zona = zona;
    }
    public Zona[] getZona() {
        return zona;
    }

    
}
