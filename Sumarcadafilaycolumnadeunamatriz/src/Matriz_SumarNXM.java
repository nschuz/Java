import javax.swing.*;
import java.util.Scanner;

public class Matriz_SumarNXM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][] , nFilas, nColumnas , sumaFilas , sumaColumnas;

        nFilas=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas"));
        nColumnas=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas:"));
        matriz= new int[nFilas][nColumnas];

        for (int i = 0; i <nFilas ; i++) {
            for (int j = 0; j <nColumnas ; j++) {
                System.out.print("Inserte dato: ");
                matriz[i][j]=sc.nextInt();
            }
        }
        System.out.println("La matriz es: ");
        for (int i = 0; i <nFilas ; i++) {
            for (int j = 0; j <nColumnas ; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
        //Ahora sumamos la filas

        for (int i = 0; i <nFilas ; i++) {
            sumaFilas=0;
            for (int j = 0; j <nColumnas ; j++) {
                sumaFilas+=matriz[i][j];
            }
            System.out.println("La suma de la fila "+i+" es: "+sumaFilas);

        }
        System.out.println("");
        //suma Columnas
        for (int j= 0; j <nColumnas ; j++) {
        sumaColumnas=0;
            for (int i = 0; i <nFilas ; i++) {
                sumaColumnas+=matriz[i][j];
            }
            System.out.println("La suma de la columna "+j+" es: "+sumaColumnas);
        }
        System.out.println("");
/*
*   0   0   0    -> 0,0  0,1  0,2       0 0 , 1,0 2,0
*   1   2   3
*   3   2   1
*  */


    }
}
