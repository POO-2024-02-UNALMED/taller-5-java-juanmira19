package gestion;

import zooAnimales.*;

public class Zona {
    private String nombre;
    private Zoologico[] zoo;
    private Animal[] animales;

    public Zona(){

    }

    public Zona(String nombre,Zoologico[] zoo,Animal[] animales){
        this.nombre=nombre;
        this.zoo=zoo;
        this.animales=animales;

    }

    public void agregarAnimales(Animal animal){
        Animal[] nuevoArray = new Animal[animales.length + 1];
        for (int i = 0; i < animales.length; i++){
            nuevoArray[i]=animales[i];
        }
        nuevoArray[animales.length]=animal;
        animales=nuevoArray;



    }

    public int cantidadAnimales(){
        return animales.length;
    }


    //Metodos para nombre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    //Metodos para Zoologico

    public void setZoo(Zoologico[] zoo) {
        this.zoo = zoo;
    }
    public Zoologico[] getZoo() {
        return zoo;
    }


    //Metodos para animales

    public void setAnimales(Animal[] animales) {
        this.animales = animales;
    }
    public Animal[] getAnimales() {
        return animales;
    }

    
}
