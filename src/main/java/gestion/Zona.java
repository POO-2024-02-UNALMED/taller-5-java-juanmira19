package gestion;

import java.util.ArrayList;
import java.util.ArrayList;

import zooAnimales.*;

public class Zona {
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal> animales= new ArrayList<Animal>();

    public Zona(){

    }

    public Zona(String nombre,Zoologico zoo){
        this.nombre=nombre;
        this.zoo=zoo;

    }
    public void agregarAnimales(Animal animal){
        this.animales.add(animal);
    }



    public int cantidadAnimales(){
        return animales.size();
    }


    //Metodos para nombre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    //Metodos para Zoologico

    public void setZoo(Zoologico zoo) {
        this.zoo = zoo;
    }
    public Zoologico getZoo() {
        return zoo;
    }


    //Metodos para animales

    public void setAnimales(ArrayList<Animal> animales) {
        this.animales = animales;
    }
    
    public ArrayList<Animal> getAnimales() {
        return animales;
    }
}
