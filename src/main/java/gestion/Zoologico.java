package gestion;

import zooAnimales.Animal;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private Zona[] zonas;

    public Zoologico(){
        
    }

    public Zoologico(String nombre,String ubicacion,Zona[] zonas){
        this.nombre=nombre;
        this.ubicacion=ubicacion;
        this.zonas=zonas;

    }

    public void agregarZonas(Zona zona) {
        Zona[] nuevoArray = new Zona[zonas.length + 1];
        for (int i = 0; i < zonas.length; i++) {
            nuevoArray[i] = zonas[i];
        }
        nuevoArray[zonas.length] = zona;
        zonas = nuevoArray;
    }



    public int cantidadTotalAnimales(){
        return Animal.getTotalAnimales();

    }
    //Metodos para nombre

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    //Metodos para ubicacion

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }



    //Metodos para Zonas

    public Zona[] getZonas() {
        return zonas;
    }

    public void setZonas(Zona[] zonas) {
        this.zonas = zonas;
    }



    
}