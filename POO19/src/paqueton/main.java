package paqueton;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
   static ArrayList <Poligono> poligono = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
   public static void main(String[] args) {
        // un solo arreglo apara almacenar triangulos y rectangulo entonces deb ser de tipo
        //Poligono
       //llenar un poligono
    llenarPoligono();

    // mostrar los datos y arear del
       //una clase abtracta no se puede isntaciar pero subcalse si
       mostrarResultados();

    }
    public static  void llenarPoligono (){
       int opcion;
       char respuetsa;
       do {
           do {


               System.out.println("Digite que poligono desea: ");
               System.out.println("1. triangulo");
               System.out.println("2. Rectangulo");
               System.out.println("Opcion: ");
               opcion = sc.nextInt();
           } while (opcion < 1 || opcion > 2);
           switch (opcion) {
               case 1: // lenar un triangulo
                   llenarTiangulo();
                   break;

               case 2: // lenar un rectangulo
                   llenarRectangulo();
                   break;


           }
           System.out.println("Desea introducir otro poligo (s/n");
           respuetsa = sc.next().charAt(0);
       }while (respuetsa=='s' || respuetsa=='S');
    }
    public  static  void llenarTiangulo (){
       double lado1 , lado2 , lado3;
        System.out.println("Digiate lado1: ");
        lado1=sc.nextDouble();
        System.out.println("Digiate lado2: ");
        lado2=sc.nextDouble();
        System.out.println("Digiate lado3: ");
        lado3=sc.nextDouble();
        Triangulo triangulo =new Triangulo(lado1 ,lado2 , lado3);
        poligono.add(triangulo); // alamcenos en mi objeto poligono un objeto  triangulo

    }
    public  static  void llenarRectangulo (){
        double lado1 , lado2;
       System.out.println("Digiate lado1: ");
        lado1=sc.nextDouble();
        System.out.println("Digiate lado2: ");
        lado2=sc.nextDouble();
        Rectangulo rectangulo = new Rectangulo(lado1 ,lado2);
        poligono.add(rectangulo);
    }
    //recorresmo el area
    public static  void mostrarResultados (){
       for (Poligono poli : poligono){
           System.out.println(poli.toString());
           System.out.println("Area: "+poli.area());
           System.out.println("");
       }
    }
}
