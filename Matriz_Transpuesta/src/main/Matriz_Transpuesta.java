package main;

import java.util.Scanner;

public class Matriz_Transpuesta {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[3][3];

        System.out.println("Digite la matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Matriz: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatriz Original: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);

            }
            System.out.println("");
        }

        //Matriz transpuesta
        int aux;
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <i ; j++) {
                aux=matriz[i][j];
                matriz[i][j]=matriz[j][i];
                matriz[i][j]=aux;

                /*
                0 1 2  0 2 3
                2 3 1  1 3 5
                3 5 5  2 1 5

                i=0 j=0
                aux= 0
                0,0 = 0
                0,0 = 0

                i=1 j=0


                * */

            }
        }

    }
}
