import javax.swing.*;
import java.util.Arrays;

public class TDA_MemoriaEstatica {
    public static void main(String[] args) {
         int numeros [] = new int [5];
         int i=0;
         int numeros2[] = new int [numeros.length];

        for (int j = 0; j <5 ; j++) {
            numeros[j]=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte un numero"));
        }
        System.out.println("\nTamaño del arreglo: "+numeros.length);
        //MOstrando los datos como los ingresamos
        System.out.println("\nDATOS SIN ORDENAR: ");
        for (int j = 0; j <5 ; j++) {
            System.out.print(numeros[j]+" , ");
        }
        System.out.println("\nLos datos ordenados son: ");
        Arrays.sort(numeros);
        for (int j = 0; j <5 ; j++) {
            if (j==4){
                System.out.print(numeros[j]);
            }else {
                System.out.print(numeros[j]+" , ");
            }
        }
        //copiando una arregloa otro
        numeros2=Arrays.copyOf(numeros,5);
        System.out.println("\nArreglo copiado:");
        for (int j = 0; j <numeros2.length ; j++) {
            System.out.print(numeros2[j]+" , ");
        }

    }
}
