package mian;

import java.util.Scanner;

public class Trasponer_Matriz {
    public static void main(String[] args) {

        int matriz1[][] , matriz2[][];

        matriz1= new int [5][9];
        matriz2= new int[9][5];
        Scanner sc=  new Scanner(System.in);
        System.out.println("Digite la matriz: ");
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <9 ; j++) {
                System.out.println("Inserte dato: ");
                matriz1[i][j]=sc.nextInt();
            }
        }
        System.out.println("La matriz original es: ");
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <9 ; j++) {
                System.out.print(matriz1[i][j]+" ");
            }
            System.out.println("");
        }

        //Trasponemos la matriz
        for (int i = 0; i <5 ; i++) {
            for (int j= 0; j <9 ; j++) {
                matriz2[j][i]= matriz1[i][j];
            }
        }
// 1 2 3 4 5 6 7 8 9
        System.out.println("Matriz Traspuesta es: ");
        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j <5 ; j++) {
                System.out.println(matriz2[i][j] +" ");
            }
            System.out.println(" ");
        }

    }
}
