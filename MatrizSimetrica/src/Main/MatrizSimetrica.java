package Main;

import java.util.Scanner;

public class MatrizSimetrica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int filas=0 , columnas=0;
        int matriz1[][], matriz2[][];
        System.out.println("Inserta filas  y columnas matriz1");
        filas=sc.nextInt();
        columnas=sc.nextInt();
        matriz1= new int [filas][columnas];
        //System.out.println("Inserta filas  y columnas matriz2");
        //filas=sc.nextInt();
        //columnas=sc.nextInt();
        // matriz2= new int [filas][columnas];

        //Lenmaos matriz
        System.out.println("Inserta datos matriz1: ");
        for (int i = 0; i <matriz1.length; i++) {
            for (int j = 0; j <matriz1[i].length ; j++) {
                matriz1[i][j]=sc.nextInt();
            }
        }
        /*
        System.out.println("Inserta datos matriz2: ");
        for (int i = 0; i <matriz2.length; i++) {
            for (int j = 0; j <matriz2[i].length ; j++) {
                matriz2[i][j]=sc.nextInt();
            }
        }




        System.out.println("i: "+matriz1.length);
        System.out.println("j: "+matriz1[matriz1.length-1].length);

        if (matriz1.length!=matriz2.length || matriz1[matriz1.length-1].length==matriz2[matriz2.length-1].length){
            System.out.println("Su matriz no puede ");
        }
        */

        if(matriz1.length !=matriz1[matriz1.length-1].length){
            System.out.println("Su matriz no puede se siemtrica");
        }else {
            matriz2= new int [filas][columnas];
            for (int i = 0; i <matriz1.length; i++) {
                for (int j = 0; j <matriz1[i].length ; j++) {
                    matriz2[j][i]=matriz1[i][j];
                }
            }

            System.out.println("Matriz 1");
            for (int i = 0; i <matriz1.length; i++) {
                for (int j = 0; j <matriz1[i].length ; j++) {
                    System.out.print(matriz1[i][j]);
                }
                System.out.println("");
            }

            System.out.println("Matriz 2");
            for (int i = 0; i <matriz2.length; i++) {
                for (int j = 0; j <matriz2[i].length ; j++) {
                    System.out.print(matriz2[i][j]);
                }
                System.out.println("");
            }

        }



        /*------------Version 2 -----------*/
        boolean simetrica= false;
        if (filas==columnas){
            int i,j;
            i=0;
            while(i<filas && simetrica==true){
                j=0;
                while(j<i && simetrica==true){
                    if (matriz1[i][j]!=matriz1[j][i]){
                        simetrica=false;
                        j++;
                    }
                    i++;
                }
            }
        }







    }
}
