package main;

public class AereoPuertoPrivado extends AereoPuerto {

    private String listaempresas []= new String[10];
    private int numEmpresa=0;

    //Dos conscturctores


    public AereoPuertoPrivado(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AereoPuertoPrivado(String nombre, String ciudad, String pais, Compañia[] c, String[] listaempresas) {
        super(nombre, ciudad, pais, c);
        this.listaempresas = listaempresas;
        numEmpresa=listaempresas.length;
    }


    // metodos
    //estoy copiando arreglo hacia arreglo
    public void insertarEmpresas(String e[]){
        this.listaempresas=e;
        this.numEmpresa=e.length;
    }

    public void insertarEmpresa (String e){
        listaempresas[numEmpresa]=e;
        numEmpresa++;
    }

    public String[] getListaempresas() {
        return listaempresas;
    }

    public int getNumEmpresa() {
        return numEmpresa;
    }
}
