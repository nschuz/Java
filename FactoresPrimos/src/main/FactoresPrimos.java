package main;

import java.util.ArrayList;
import java.util.Scanner;

public class FactoresPrimos {
    public static void main(String[] args) {
        /*
        The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
        * */

        long numero =0L;
        Scanner  sc = new Scanner(System.in);
        System.out.println("Intoduce numero: ");
        numero=sc.nextLong();
        int contador=1;
        ArrayList<Integer> factores = new ArrayList<Integer>();
        for (long i = 1; i <=numero ; i++) {
            if(numero%i==0 ){
                System.out.print(i+ " ");
                contador*=i;
                //factores.add(i);
                if (contador==numero)
                    break;
            }
        }


    }
}
