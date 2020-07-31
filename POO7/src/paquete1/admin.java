package paquete1;

import java.util.Scanner;

public class admin {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Tablero objeto1;
        int x,y;
        System.out.println("Inserte X");
        x=sc.nextInt();
        System.out.println("Inserte Y");
        y=sc.nextInt();
        objeto1= new Tablero(x,y);
        int opcion=0 , incremento1=0;
        do{
            System.out.println("\n Menu: ");
            System.out.println("1.Mover Arriba");
            System.out.println("2.Mover Abajo");
            System.out.println("3. Mover Dercha");
            System.out.println("4. Mover izquierda");
            System.out.println("5.Salir");
            opcion=sc.nextInt();
            if(opcion!=5){
                System.out.println("Digite la cantida de espacios a moverse: ");
                incremento1=sc.nextInt();
            }
            switch (opcion){
                case 1:objeto1.moverArriba(incremento1);
                    break;
                case 2: objeto1.moverAbajo(incremento1);
                    break;
                case 3:objeto1.moverDerecha(incremento1);
                    break;
                case  4: objeto1.moverIzquierda(incremento1);
                case 5: break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
            System.out.println("Posicion Actual del objeto; ");
            System.out.println("X: "+objeto1.getX());
            System.out.println("Y: "+objeto1.getY());
        }while (opcion!=5);

    }
}
