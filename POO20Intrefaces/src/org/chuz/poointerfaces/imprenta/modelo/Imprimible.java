package org.chuz.poointerfaces.imprenta.modelo;

public interface Imprimible {


    final static String TEXTO_DEFECTO = "Imprimiendo un valor por defecto";


    //no tiene sentido un metodo private siempre deben ser default o public

    default String imprimir(){
        return TEXTO_DEFECTO;
    }

    static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }


}
