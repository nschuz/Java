package escom;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Ler  5 numeros en un arreglo y mostrarlo en el mismo orden
        Scanner sc = new Scanner(System.in);
        float [] numeros = new float [5];
        for (int i = 0; i <numeros.length ; i++) {
            System.out.println((i+1)+"- Introduce el numero");
            numeros[i]=sc.nextFloat();
        }
        System.out.println("----Sus nuemros son----");
        for (float i : numeros) {
            System.out.print(i+"-");
        }
    }
}
