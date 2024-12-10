package zooAnimales;

import gestion.Zona;

public class Mamifero extends Animal {


    private Mamifero[] listado;
    public static int caballos=0;
    public static int leones=0;
    private Boolean pelaje=false;
    private int patas=0;
    public static int cantidadMamiferos=0;



    public Mamifero(){
        super("nombre",3,"habitat","genero");
        cantidadMamiferos++;
    
    }

    public Mamifero(int totalAnimales,String nombre,int edad,String habitat,String genero,Zona[] zona,Mamifero[] listado,int caballos,int leones,boolean pelaje, int patas){
        super(totalAnimales,nombre,edad,habitat,genero,zona);
        this.listado=listado;
        Mamifero.caballos=caballos;
        Mamifero.leones=leones;
        this.pelaje=pelaje;
        this.patas=patas;
        cantidadMamiferos++;

    }
    public Mamifero(String nombre,int edad,String habitat,String genero, boolean pelaje,int patas){
        super(nombre,edad,habitat,genero);
        this.pelaje=pelaje;
        this.patas=patas;
        cantidadMamiferos++;
    

    }


    public int cantidadMamiferos(){
        return cantidadMamiferos;
    
        

    }

    public static Mamifero crearCaballo(String nombre,int edad,String genero){
        caballos++;
        Mamifero M=new Mamifero();
        M.setPelaje(true);
        M.setPatas(4);
        M.setHabitat("pradera");
        M.setNombre(nombre);
        M.setEdad(edad);
        M.setGenero(genero);
        return M;
    }

    public static Mamifero crearLeon(String nombre,int edad,String genero){
        leones++;
        Mamifero M=new Mamifero();
        M.setPelaje(true);
        M.setPatas(4);
        M.setHabitat("selva");
        M.setNombre(nombre);
        M.setEdad(edad);
        M.setGenero(genero);
        return M;
    }
    //Metodos de listado

    public void setListado(Mamifero[] listado) {
        this.listado = listado;
    }
    public Mamifero[] getListado() {
        return listado;
    }

    //Metodos de pelaje

    public void setPelaje(Boolean pelaje) {
        this.pelaje = pelaje;
    }
    public Boolean isPelaje() {
        return pelaje;
    }

    //Metodos de patas

    public void setPatas(int patas) {
        this.patas = patas;
    }
    public int getPatas() {
        return patas;
    }


    
}
