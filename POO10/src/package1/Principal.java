package package1;

import java.util.Scanner;

public class Principal {
    public static  double indiceMayorArea  (Triangulo triangulos[]){
        double area;
        area=triangulos[0].Area();
        for (int i = 0; i <triangulos.length ; i++) {
            if (triangulos[i].Area()>area){
                area=triangulos[i].Area();

            }
        }
        return area;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base , lado;
        int nTriangulos;

        System.out.println("Digite el numero de triangulos: ");
        nTriangulos=sc.nextInt();
        Triangulo triangulos[]= new Triangulo[nTriangulos];

        for (int i = 0; i <triangulos.length ; i++) {
            System.out.print("Inserte los valosres del triangulo "+(i+1));
            System.out.println("Base: ");
            base=sc.nextDouble();
            System.out.print("Introduce el lado: ");
            lado=sc.nextDouble();
            //alamcenamos los objetos
            triangulos[i]= new Triangulo(base,lado);
            System.out.println("\nEl preimetro del tairangulo es:"+triangulos[i].Perimetro());
            System.out.println("\nEl area del tringulo es: "+triangulos[i].Area());
        }
        System.out.println("El area de mayor superficie es:"+Principal.indiceMayorArea(triangulos));


    }

}
