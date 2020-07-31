package escom;

import java.util.Scanner;

public class admind {
    public static void main(String[] args) throws InterruptedException {
Scanner sc = new Scanner(System.in);
        int [] a= {1,2,3,4,5,6,7,8,0,0};
        System.out.println("Introducie un numero");
        int  num =sc.nextInt();
        System.out.println("Inserte la posicion: ");
        int pos= sc.nextInt();
        System.out.println("MOviendo arreglo.");
        for (int i=7; i<10; i++)
        {
            System.out.print(".");
           // java.util.concurrent.TimeUnit.SECONDS.sleep(1);
        }
        for (int j=0,  i =7; i>=pos ; i--) {
          a[i+1]=a[i];

        }
        a[pos]=num;

        for (int i:a) {
            System.out.print(i + " - ");
        }

    }
}
