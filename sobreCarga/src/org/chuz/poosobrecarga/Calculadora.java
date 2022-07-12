package org.chuz.poosobrecarga;

public class Calculadora {


    //hacemos que no se pueda crear una instancia
    private Calculadora(){

    }

    public static int sumar (int a, int b){
        return a+b;
    }

    public static  int sumar (int ... arguementos){
        int total =0;
        for (int element : arguementos){
            total+=element;
        }
        return  total;
    }

    public static float sumar  (float x , float y ){
        return x+y;
    }

    public static long sumar  (long x , long y ){
        return x+y;
    }

    public static float sumar(int i , float j){
        return i +j ;
    }

    public static float sumar(float i , int j){
        return i + j;
    }

    public static double sumar (double a , double b){
        return a+b;
    }

    public static int sumar (String a , String b){
        int resultado;
        try{
            resultado = Integer.parseInt(a) + Integer.parseInt(b);
        }catch(NumberFormatException e){
            resultado =0;
        }
        return resultado;
    }

}
