package escom;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Operacion objeto = new Operacion();
        //objeto.leerNumero();
        Scanner sc= new Scanner(System.in);
        System.out.println("Isnerte numeros");
        int numero1= sc.nextInt();
        int numero2= sc.nextInt();
       int suma=  objeto.suma(numero1 , numero2);
       int diferencia=  objeto.resta(numero1 , numero2);
        objeto.mostrar_resultados(suma , diferencia);
    }
}
