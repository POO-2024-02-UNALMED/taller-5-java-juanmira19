package zooAnimales;

import gestion.Zona;

public class Anfibio extends Animal{

    private Anfibio[] listado;
    public static int ranas=0;
    public static int salamandras=0;
    private String colorPiel="None";
    private boolean venenoso=false;
    public static int cantidadAnfibios;

    public Anfibio(){
        super("nombre",0,"habitat","genero");
        cantidadAnfibios++;

    }

    public Anfibio(int totalAnimales,String nombre,int edad,String habitat,String genero,Zona[] zona,Anfibio[] listado,int ranas,int salamandras,String colorPiel , boolean venenoso){
        super(totalAnimales,nombre,edad,habitat,genero,zona);
        this.listado=listado;
        Anfibio.ranas=ranas;
        Anfibio.salamandras=salamandras;
        this.colorPiel=colorPiel;
        this.venenoso=venenoso;
        cantidadAnfibios++;
    }
    public Anfibio(String nombre,int edad,String habitat,String genero, String color,boolean venenoso){
        super(nombre,edad,habitat,genero);
        this.colorPiel=color;
        this.venenoso=venenoso;
        cantidadAnfibios++;

    }

    public int cantidadAnfibios(){
        return cantidadAnfibios;
        

    }

    public String movimiento(){
        return "saltar";

    }
    public static Anfibio crearRana(String nombre,int edad,String genero){
        ranas++;
        Anfibio M=new Anfibio();
        M.setColorPiel("rojo");
        M.setVenenoso(true);
        M.setHabitat("selva");
        M.setNombre(nombre);
        M.setEdad(edad);
        M.setGenero(genero);
        return M;
    }

    public static Anfibio crearSalamandra(String nombre,int edad,String genero){
        salamandras++;
        Anfibio M=new Anfibio();
        M.setColorPiel("negro y amarillo");
        M.setVenenoso(false);
        M.setHabitat("selva");
        M.setNombre(nombre);
        M.setEdad(edad);
        M.setGenero(genero);
        return M;
    }


    public void setListado(Anfibio[] listado) {
        this.listado = listado;
    }
    public Anfibio[] getListado() {
        return listado;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }
    public String getColorPiel() {
        return colorPiel;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }
    public boolean isVenenoso() {
        return venenoso;
    }
}
