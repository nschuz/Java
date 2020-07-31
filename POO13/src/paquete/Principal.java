package paquete;

import java.util.Scanner;

public class Principal {
    public  static  int buscarSucursal (Sucursal t[] , int numeroSucursal , int contadorsucursal){
       int indice=0;
       boolean encontado =false;
        for (int i = 0; i <contadorsucursal ; i++) {
            if (t[i].getNumeroSucursal()== numeroSucursal){
                encontado=true;
                indice=i;
            }

        }
        if (encontado== false){
            indice = -1;

        }
        return indice;
    }

    public  static  int buscarpaqute  (Paquete t[] , int numeropaquete , int contadorpaquete){
        int indice=0;
        boolean encontado =false;
        for (int i = 0; i <contadorpaquete ; i++) {
            if (t[i].getNumeroPaquete()== numeropaquete){
                encontado=true;
                indice=i;
            }

        }
        if (encontado== false){
            indice = -1;

        }
        return indice;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion,numeroSucursal , numeropaquete , prioridad , indiceSucursal ;
        String direccion , ciudad , dni;
        double peso;
        int contadorsucursal=0 ,  contadorPaquete=0 , indicepaquete;
        double calcularprecio=0;
        //Creamos los objetos
        Sucursal sucursal[]=new Sucursal[50];
        Paquete paquete []= new Paquete[100];
        do {
            System.out.println("\t :MENU");
            System.out.println("1. Crear una nueva sucursal");
            System.out.println("2. Enviar Paquete");
            System.out.println("3. Consulatr sucursal");
            System.out.println("4 consulatar paquete");
            System.out.println("5. Mostrar todas las sucursales");
            System.out.println("6. Mostrar todos los paqutes");
            System.out.println("7. Salir");
            System.out.println("Digite la opcion de menu: ");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("\nDigite el numero de sucursal: ");
                    numeroSucursal=sc.nextInt();
                    sc.nextLine();
                    System.out.println("\nDigite la direccion: ");
                    direccion=sc.nextLine();
                    System.out.println("Digete la ciudad: ");
                    ciudad=sc.nextLine();
                    sucursal[contadorsucursal]= new Sucursal(numeroSucursal,direccion,ciudad);
                    contadorsucursal++;
                    break;
                case 2:
                    System.out.println("Digite el numero de sucursal");
                    numeroSucursal=sc.nextInt();
                    indiceSucursal = buscarSucursal(sucursal ,numeroSucursal ,contadorsucursal);
                    if (indiceSucursal==-1){
                        System.out.println("Sucursal no exite");
                    }else {
                        System.out.println("\nDigite el numeor de paqute: ");
                        numeropaquete=sc.nextInt();
                        sc.nextLine();
                        System.out.println("Digute el dni de la persona: ");
                        dni=sc.nextLine();
                        System.out.println("Digite el peso del paqute: ");
                        peso=sc.nextDouble();
                        System.out.println("Disgite priorida: ");
                        prioridad=sc.nextInt();
                        paquete [contadorPaquete]=new Paquete(numeropaquete,dni,peso,prioridad);
                        calcularprecio=   sucursal[indiceSucursal].calcular_precio(paquete[contadorPaquete]);
                        System.out.println("El precio del paqute es:"+calcularprecio);
                        contadorPaquete++;
                    }
                    break;

                case 3:
                    System.out.println("\nDigite el numero de sucursal: ");
                    numeroSucursal=sc.nextInt();
                    indiceSucursal=buscarSucursal(sucursal,numeroSucursal,contadorsucursal);
                    if (indiceSucursal==-1){
                        System.out.println("La cucursal no exite");
                    }else {
                        System.out.println("Los datos de la sucursla son :");
                        System.out.println(sucursal[indiceSucursal].mostrarDatosSucursal());
                    }
                break;
                case 4:
                    System.out.println("\nDigite el numero de paqute: ");
                    numeropaquete=sc.nextInt();
                    indicepaquete= buscarpaqute(paquete , numeropaquete , contadorPaquete);
                    if (indicepaquete==-1){
                        System.out.println("Pauqte no existente");
                    }
                    else {
                        System.out.println("Los datos del pauqte son ;");
                        System.out.println(paquete[indicepaquete].mostartDatospaquetes());
                    }
                    break;

                case  5:
                    for (int i = 0; i <sucursal.length ; i++) {
                        System.out.println("Los datos son: ");
                        System.out.println(sucursal[i].mostrarDatosSucursal());

                    }
                    break;
                case  6:
                    for (int i = 0; i <sucursal.length ; i++) {
                        System.out.println("Los datos son; ");
                        System.out.println(paquete[i].getNumeroPaquete());
                    }
                    break;

                case 7:
                    break;

                default:
                    System.out.println("Opcion incorrecta");

            }

        }while (opcion!= 7);



    }
}
