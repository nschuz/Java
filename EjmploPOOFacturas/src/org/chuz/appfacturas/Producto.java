package org.chuz.appfacturas;

public class Producto {

    //atributos
    private int codigo;
    private String nombre;
    private float precio;
    private static int ultimoCodigo;

    public Producto( ) {
        this.codigo = ++ultimoCodigo;
    }


//Setts y gettes

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}