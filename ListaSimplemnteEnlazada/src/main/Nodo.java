package main;

public class Nodo {
    public  int dato;
    public Nodo siguinte; //Puntero enlace

    //constuctor  para insertar al final
    public Nodo(int d){
        this.dato=d;
        this.siguinte=null;
    }

    //Cosntructor para insertar al inicio
    public Nodo(int d , Nodo n){
        dato=d;
        siguinte=n;
    }


}
