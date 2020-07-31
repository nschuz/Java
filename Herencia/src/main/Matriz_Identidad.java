package main;

public class Matriz_Identidad {
    public static void main(String[] args) {
        int matriz [][] = new int [7][7];
        for (int i = 0; i <7 ; i++) {
            for (int j = 0; j <7 ; j++) {
                    //elmentos digonal pricila
                if (i==j){
                    matriz[i][j]=1;
                }else {
                    matriz[i][j]=0;
                }
            }
        }

        //Imprimismos la matriz
        for (int i = 0; i <7 ; i++) {
            for (int j = 0; j <7; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }

    }
}
