package zooAnimales;

import gestion.Zona;

public class Reptil extends Animal {

    private Reptil[] listado;
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;
    public static int cantidadReptiles;

    public Reptil(){
        super("nombre",3,"habitat","genero");
        cantidadReptiles++;
    
    }


    
    public Reptil(String nombre,int edad,String habitat,String genero,String colorEscamas,int largoCola){
        super(nombre,edad,habitat,genero);
        this.colorEscamas=colorEscamas;
        this.largoCola=largoCola;
        cantidadReptiles++;
    }

    public int cantidadReptiles(){
        return cantidadReptiles;
        
    }

    public String movimiento(){
        return "reptar";

    }

    public static Reptil crearIguana(String nombre,int edad,String genero){
        iguanas++;
        Reptil M=new Reptil();
        M.setColorEscamas("verde");
        M.setLargoCola(3);
        M.setHabitat("humedal");
        M.setNombre(nombre);
        M.setEdad(edad);
        M.setGenero(genero);
        return M;
    }

    public static Reptil crearSerpiente(String nombre,int edad,String genero){
        serpientes++;
        Reptil M=new Reptil();
        M.setColorEscamas("blanco");
        M.setLargoCola(1);
        M.setHabitat("jungla");
        M.setNombre(nombre);
        M.setEdad(edad);
        M.setGenero(genero);
        return M;
    }


    //Metodos de listado
    public void setListado(Reptil[] listado) {
        this.listado = listado;
    }
    public Reptil[] getListado() {
        return listado;
    }

    //Metodos de colorEscamas

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }
    public String getColorEscamas() {
        return colorEscamas;
    }


    //Metodos de largoCola

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }
    public int getLargoCola() {
        return largoCola;
    }


}
