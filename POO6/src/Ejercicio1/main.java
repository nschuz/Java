package Ejercicio1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Cuadrilatero c1 ; // creamos un objeto porque no se que constructo voy a usar
        float lado1 , lado2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte lado1 ");
        lado1 = sc.nextFloat();
        System.out.println("INserte el lado 2");
        lado2= sc.nextFloat();

        if (lado1== lado2 ){ //Es un cuadrado
            c1= new Cuadrilatero(lado1);
        }else {
            c1= new Cuadrilatero(lado1 , lado2);
        }
        System.out.println("El perimetos es "+c1.getPerimetro());
        System.out.println("Ela area es:"+c1.getArea());

    }
}
