package mian;

import java.util.Scanner;

public class SumaMatriz {
    public static void main(String[] args) {
        int mariz [][]= new int [3][3];
        int mariz2 [][]= new int [3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Insertar Valores: ");
        for (int i = 0; i <mariz.length ; i++) {
            for (int j = 0; j <mariz[i].length ; j++) {
                System.out.println("Inserte dato: ");
                mariz[i][j]=sc.nextInt();
            }
        }
        System.out.println("Insertar Valores: ");
        for (int i = 0; i <mariz2.length ; i++) {
            for (int j = 0; j <mariz2[i].length ; j++) {
                System.out.println("Inserte dato: ");
                mariz2[i][j]=sc.nextInt();
            }
        }
        int matriz3[][]= new int[3][3];

        for (int i = 0; i <matriz3.length ; i++) {
            for (int j = 0; j <matriz3[i].length ; j++) {
                matriz3[i][j]=mariz[i][j] + mariz2[i][j];
            }
        }

        System.out.println("-------------------------");
        imprimirMatriz(mariz);
        imprimirMatriz(mariz2);
        imprimirMatriz(matriz3);
    }

    public static void imprimirMatriz(int matriz[][]){
        for (int i = 0; i <matriz.length ; i++) {
            for (int j = 0; j <matriz[i].length ; j++) {

                System.out.print(matriz[i][j] +" ");
            }
            System.out.println("");
        }
    }
}
