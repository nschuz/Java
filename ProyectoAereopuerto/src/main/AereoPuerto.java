package main;

public class AereoPuerto {
    private String nombre;
    private String ciudad;
    private String pais;
    private Compañia listaCompañias[]= new Compañia[10];
    private int numCompañia;

    public AereoPuerto(String nombre, String ciudad, String pais) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.numCompañia=0;
    }
    public AereoPuerto(String nombre, String ciudad, String pais, Compañia c[]) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        listaCompañias=c;
        this.numCompañia=c.length;
    }

    public void insertarComapñia(Compañia compañia){
        listaCompañias[numCompañia]=compañia;
        numCompañia++;
    }

    public Compañia getCompañia(int i){
        return  listaCompañias[i];
    }

    public  Compañia getCompañia (String nombre){
        boolean encontado= false;
        int i=0;
        Compañia c=null;
        while ((!encontado)&& (i<listaCompañias.length)){
            if (nombre.equals(listaCompañias[i].getNombre())){
                encontado=true;
                c= listaCompañias[i];
            }
            i++;
        }
        return c;
    }


    //getters
    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public Compañia[] getListaCompañias() {
        return listaCompañias;
    }

    public int getNumCompañia() {
        return numCompañia;
    }
}
