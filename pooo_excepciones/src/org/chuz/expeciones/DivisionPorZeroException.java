package org.chuz.expeciones;


//Exceptio es uan excepcion checquesa
public class DivisionPorZeroException extends Exception{

    //implenatmos ,os constructores

    public DivisionPorZeroException() {
    }

    public DivisionPorZeroException(String message) {
        super(message);
    }
}
