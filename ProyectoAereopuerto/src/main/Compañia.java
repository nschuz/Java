package main;

public class Compañia {
    private String nombre;
    private Vuelo listaVuelos[]= new Vuelo[10];
    private  int numVuelo=0;

    //1. Cosntructor
    public Compañia(String nombre) {
        this.nombre = nombre;
    }
    //2. Constructor


    public Compañia(String nombre, Vuelo[] listaVuelos) {
        this.nombre = nombre;
        this.listaVuelos = listaVuelos;
        numVuelo=listaVuelos.length;
    }

    //metodos
    public void insertarVuelo(Vuelo vuelo){
        listaVuelos[numVuelo]=vuelo;
        numVuelo++;
    }

    //getters


    public String getNombre() {
        return nombre;
    }

    public int getNumVuelo() {
        return numVuelo;
    }

    public Vuelo getVuelo (int i ){
        return  listaVuelos[i];
    }

    public Vuelo getVuelo(String id){
        boolean encontrado=false;
        int i=0;
        Vuelo v= null;

        while ((!encontrado)&&(i<listaVuelos.length)){
            if (id.equals(listaVuelos[i].getIdentificador())){
                encontrado=true;
                v=listaVuelos[i];
            }
           i++;
        }
        return v;

    }


}
