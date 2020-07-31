package escom;

import java.util.Scanner;

public class admin {
    public static void main(String[] args) {
        int n_posiciones=0, ultimo=0;
        int a []={1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner (System.in);

        System.out.println("Digiete las n psociones: ");
        n_posiciones=sc.nextInt();

        for (int i = 1; i <=n_posiciones ; i++) {
            ultimo=a[9];
            for (int j = 8; j >=0 ; j--) {
                a[j+1]=a[j];
            }
            a[0]=ultimo;
        }
        System.out.println("Arreglo resultante es: ");
        for (int i: a) {
            System.out.print(i+" -  ");
        }

    }
}
