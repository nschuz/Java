package main;
public class Lista {
    //creamos dos punteros
    protected  Nodo inicio, fin; //punteros para saber donde esta el inicio y el fin
    public Lista (){
        //inicializamos los punteros
        inicio=null;
        fin=null;
    }
    //Metodod para Agregar un Nodo al inicio de la lista
    public void agregarAlInicio(int elemento){
        //permimite agregar un nodo

        //Creandoun nuevo nodo asiganandolo a inicio
        inicio = new Nodo(elemento, inicio);
        if (fin==null){
            //si fin es null quiere decir que esta vacio y lo apunto al inicio
            fin=inicio;
        }
    }

    //Metood paa mostrar Datos
    public void mostrarLista (){
        Nodo recorrer = inicio;
        while (recorrer!=null){
            System.out.print("["+recorrer.dato+"]-->");
            recorrer=recorrer.siguinte;
        }
    }

    //Metodo para saber si la lista esta vacia
    public boolean estaVacia(){
        if (inicio== null){
            return true;
        }else {
            return false;
        }
    }

    //Metodo para insertar al Final de la lista
    public void agregarAlFinal(int elemento){
        if (!estaVacia()){
            fin.siguinte=new Nodo(elemento);
            fin=fin.siguinte;
        }else {
            inicio=fin=new Nodo(elemento);
        }
    }
//Metodo para eleliminar uun nodo del inicio
    public int borrarInicio (){
        int elemnto = inicio.dato;
        if (inicio==fin){
            fin=null;
        }else {
        inicio=inicio.siguinte;

        }
        return elemnto;
    }
}
