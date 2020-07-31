package Matrices;

import java.util.Scanner;

public class Matirces {
    public static void main(String[] args) {
        int matriz [][]= {{1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");

        }

        Scanner sc = new Scanner(System.in);
        int filas;
        int columnas;
        System.out.println("Inserta numero de filas: ");
        filas=sc.nextInt();
        System.out.println("Inserta el nuemero de Columnas: ");
        columnas=sc.nextInt();

        int matriz2 [][] = new int [filas][columnas];
        for (int i = 0; i <filas ; i++) {
            for (int j = 0; j <columnas ; j++) {
                System.out.println("Inserte dato: ");
                matriz2[i][j]=sc.nextInt();
            }

        }

        System.out.println("Imprimiendo matriz ");

        for (int i = 0; i <filas ; i++) {
            for (int j = 0; j <columnas ; j++) {
                System.out.print(matriz2[i][j]+ " - ");
            }
            System.out.println("");
        }

    }
}
