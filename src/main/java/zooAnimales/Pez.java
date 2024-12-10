package zooAnimales;

import gestion.Zona;

public class Pez extends Animal{

    private Pez[] listado;
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;
    public static int cantidadPeces;

    public Pez(){
        super("nombre",3,"habitat","genero");
        cantidadPeces++;
        

    }


    public Pez(String nombre,int edad,String habitat,String genero, String colorEscamas,int cantidadAletas){
        super(nombre,edad,habitat,genero);
        this.colorEscamas=colorEscamas;
        this.cantidadAletas=cantidadAletas;
        cantidadPeces++;


    }

    public int cantidadPeces(){
        return cantidadPeces;
        
    }

    public String movimiento(){
        return "nadar";

    }
    public static Pez crearSalmon(String nombre,int edad,String genero){
        salmones++;
        Pez M=new Pez();
        M.setColorEscamas("rojo");
        M.setCantidadAletas(6);
        M.setHabitat("oceano");
        M.setNombre(nombre);
        M.setEdad(edad);
        M.setGenero(genero);
        return M;
    }

    public static Pez crearBacalao(String nombre,int edad,String genero){
        bacalaos++;
        Pez M=new Pez();
        M.setColorEscamas("gris");
        M.setCantidadAletas(6);
        M.setHabitat("oceano");
        M.setNombre(nombre);
        M.setEdad(edad);
        M.setGenero(genero);
        return M;
    }


    // Metodos para listado
    public void setListado(Pez[] listado) {
        this.listado = listado;
    }
    public Pez[] getListado() {
        return listado;
    }


     // Metodos para color escamas
    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }
    public String getColorEscamas() {
        return colorEscamas;
    }


     // Metodos para cantidad aletas
    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }
    public int getCantidadAletas() {
        return cantidadAletas;
    }


    


    
}
