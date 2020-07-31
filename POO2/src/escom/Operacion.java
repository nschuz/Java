package escom;

import java.util.Scanner;

public class Operacion {
    //Atriutos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int  division;
    int multiplicacion;

    // Metodos
    public void leerNumero (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un numero:");
        numero1=sc.nextInt();
        numero2=sc.nextInt();
    }
    public  int  suma (int numero1 , int numero2){
    suma=numero1+numero2;
    return  suma;
    }
    public  int resta(int numero1 , int numero2){
        resta=numero1-numero2;
        return resta;
    }
    public void mostrar_resultados (int suma , int resta){
        System.out.println("Suma"+suma);
        System.out.println("Resta"+resta);
    }


}
