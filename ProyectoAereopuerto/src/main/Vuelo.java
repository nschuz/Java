package main;

public class Vuelo {
    private String identificador;
    private String ciudadOrigen;
    private String  ciudadDeestino;
    private double precio;
    private  int numMaxPasajeros;
    private int numActualPasajeros;
    private Pasajero listaPasajero[];

    //Como es ele constcutpr se inicliza cero  numero Actual
    public Vuelo(String identificador, String ciudadOrigen, String ciudadDeestino, double precio, int numMaxPasajeros) {
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDeestino = ciudadDeestino;
        this.precio = precio;
        this.numMaxPasajeros = numMaxPasajeros;
        this.numActualPasajeros=0;
        this.listaPasajero = new Pasajero[numMaxPasajeros];
    }
    public  void insertarPasajero(Pasajero pasajero){
        listaPasajero[numActualPasajeros]=pasajero;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDeestino() {
        return ciudadDeestino;
    }

    public void setCiudadDeestino(String ciudadDeestino) {
        this.ciudadDeestino = ciudadDeestino;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumMaxPasajeros() {
        return numMaxPasajeros;
    }

    public void setNumMaxPasajeros(int numMaxPasajeros) {
        this.numMaxPasajeros = numMaxPasajeros;
    }

    public int getNumActualPasajeros() {
        return numActualPasajeros;
    }

    public void setNumActualPasajeros(int numActualPasajeros) {
        this.numActualPasajeros = numActualPasajeros;
    }


    //Metodos propios
    public Pasajero getPasajero (int i){
        return listaPasajero[i];
    }
    public  Pasajero getPasajero (String pasaporte){
        boolean encontrdado=false;
        int i=0;
        Pasajero pass=null;
        while ((!encontrdado) && (i<listaPasajero.length)){
                if (pasaporte==listaPasajero[i].getPasaporte()){
                    encontrdado=true;
                    pass=listaPasajero[i];
                }
                i++;
        }
        return pass;

    }


}
