package org.chuz.hilos.ejemplos.thread.ruunable;

import static org.chuz.hilos.ejemplos.thread.ruunable.EjemploSincronizaeHilos.ImprimirFrasesMethod;

public class ImprimirFrases  implements  Runnable {


    //Atributos
    private String frase1, frase2;

    //constructor
    public ImprimirFrases(String frase1, String frase2) {
        this.frase1 = frase1;
        this.frase2 = frase2;
    }

    //impentamos los metodos del interfaz
    @Override
    public void run() {


        ImprimirFrasesMethod(this.frase1, this.frase2);

    }
}
