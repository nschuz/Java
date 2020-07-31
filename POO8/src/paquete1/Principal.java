package paquete1;

import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;

public class Principal {
    public static  int indiceCocheMBarato (Vehiculo coches[]){
        float precio=0;
        int indice=0;
        precio=coches[0].getPrecio();
        for (int i = 0; i <coches.length ; i++) {
            if (coches[i].getPrecio()<precio){
                precio=coches[i].getPrecio();
                indice=i;
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String marca , modelo;
        float precio;
        int numeroVejiculos=0;
        System.out.println("Digite la cantidad de veiculos");
        numeroVejiculos=sc.nextInt();
        // creamos un objeto para cada vehiculo
        // se puede crear un objeto por cada hejciuo
        Vehiculo coches[] = new Vehiculo[numeroVejiculos];
        //creamos los objetos para los coches n objetos

        for (int i = 0; i <coches.length ; i++) {
            sc.nextLine(); // limpiamos buffer
            System.out.println("Inserte las carcateristicas del Coche "+(i+1)+":");
            System.out.println("Marca: ");
            marca=sc.nextLine();
            System.out.println("Introce el Modelo:");
            modelo=sc.nextLine();
            System.out.println("Introduce el precio: ");
            precio=sc.nextFloat();
            coches[i]=new Vehiculo(marca, modelo, precio);
        }
        int IndiceBarato=0;
        IndiceBarato=Principal.indiceCocheMBarato(coches);
        System.out.println("El auto mas barato es: "+coches[IndiceBarato].mostrarDatos());




    }
}
