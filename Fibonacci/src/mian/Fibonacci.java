package mian;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        long numero=0L;
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte numero: ");
        numero=sc.nextLong();
        int j=1;
        int k=1;

        for (int i = 2; i <=numero ; i++) {

            //System.out.print(k+" ");
           if(k%2==0){
               System.out.print(k +" ");
           }

            k=j+k;
            j=k-j;



        }

    }
}
