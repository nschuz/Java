package escom;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Llenar un arreglo
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos elemntos desea tener ele arreglo");
        int numero = sc.nextInt();

        int[] arreglo = new int[numero];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println((i + 1) + " Introdice elementos ");
            arreglo[i] = sc.nextInt();
        }
        System.out.println("Su arreglo fue: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " -  ");
        }
        // Bucle For each
        String[] nombre = {"Alejandro", "MARIA", "JUAN"};
        for (String i : nombre) {
            System.out.println(i + " - ");

        }
    }
}
