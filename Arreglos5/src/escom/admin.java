package escom;

import java.util.Scanner;

public class admin {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // sacar  la medio de un arreglo de 5 elemento s
        float [] arreglo = new float [5];
        float positivo=0 , negativo=0 , j =0 , k=0;
        for (int i = 0; i <arreglo.length ; i++) {
            System.out.println("Introduce numero");
            arreglo[i]= sc.nextFloat();
            if (arreglo[i]>0){
                positivo+=arreglo[i];
                j++;
            }else {
                negativo+=arreglo[i];
                k++;
            }
            System.out.print (arreglo[i]+" - ");

        }
        System.out.println("La media de numeros positivos es: "+(positivo/j));
        System.out.println("La media de numeros negativos  es: "+(negativo/k));


    }
}
