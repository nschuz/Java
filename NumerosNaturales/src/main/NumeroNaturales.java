package main;

import java.util.Scanner;

public class NumeroNaturales {
    /* If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.*/

    public static void main(String[] args) {
        int suma =0 , numero=0;
        Scanner sc= new Scanner(System.in);

        System.out.println("Introdece un numero: " );
        numero=sc.nextInt();

        for (int i = 1; i <=numero ; i++) {
            if ((i%3==0 || i%5==0) && numero!=i){
                System.out.print(i+" ");
                suma=i+suma;
            }
        }
        System.out.println("LA SUMA ES: "+suma);


    }
}
