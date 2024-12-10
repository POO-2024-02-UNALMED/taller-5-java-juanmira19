package zooAnimales;

import gestion.Zona;

public class Ave extends Animal{

    private Ave[] listado;
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;
    public static int cantidadAves;

    public Ave(){
        cantidadAves++;

    }
    public Ave(String nombre,int edad,String habitat,String genero, String color){
        super(nombre,edad,habitat,genero);
        this.colorPlumas=color;


    }

    
    public Ave(int totalAnimales,String nombre,int edad,String habitat,String genero,Zona[] zona,Ave[] listado,int halcones,int aguilas,String colorPlumas){
        super(totalAnimales,nombre,edad,habitat,genero,zona);
        this.listado=listado;
        Ave.halcones=halcones;
        Ave.aguilas=aguilas;
        this.colorPlumas=colorPlumas;
        cantidadAves++;

    }

    public void cantidadAves(){

    }

    public String movimiento(){
        return "volar";

    }

    public static Ave crearHalcon(String nombre,int edad,String genero){
        halcones++;
        Ave M=new Ave();
        M.setColorPlumas("cafe glorioso");
        M.setHabitat("montañas");
        M.setNombre(nombre);
        M.setEdad(edad);
        M.setGenero(genero);
        return M;
    }

    public static Ave crearAguila(String nombre,int edad,String genero){
        aguilas++;
        Ave M=new Ave();
        M.setColorPlumas("blanco y amarillo ");
        M.setHabitat("montañas");
        M.setNombre(nombre);
        M.setEdad(edad);
        M.setGenero(genero);
        return M;
    }

    public void crearAguila(){
        aguilas++;
    }
     
    // Metodos de listado
    public void setListado(Ave[] listado) {
        this.listado = listado;
    }
    public Ave[] getListado() {
        return listado;
    }

    // Metodos de colorPlumas

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
    public String getColorPlumas() {
        return colorPlumas;
    }
    
}
