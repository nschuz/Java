package org.chuz.poosobrecarga;
import static org.chuz.poosobrecarga.Calculadora.*;
public class EjemploSobrecarga {

    public static void main(String[] args) {


        //Calculadora cal = new Calculadora();
        System.out.println("Sumar int: "+ sumar(5,5));
        System.out.println("Sumar float: "+ sumar(10.0F,5F));
        System.out.println("Sumar float-int"+sumar(10f, 5));
        System.out.println("Sumar double : "+sumar(10D, 5.0));
        System.out.println("Sumar long: "+ sumar(10L, 10L));
        System.out.println("Sumar multiples int "+sumar(10,20,30,40,50,60));
    }
}
