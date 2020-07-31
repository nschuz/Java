package paqueton;

import java.util.Scanner;

public class admin {
    public static int busquedanumerodecuenta(Cuenta cuentas[] , int numerodecuenta){
        int i=0, indice=0;
        boolean encontrado = false;
        //busqueda secuencial
        while ((i<cuentas.length) && (encontrado==false)){
            if(cuentas[i].getNumeroCuenta()==numerodecuenta){
                encontrado=true;
                indice=i;
            }
            i++;
        }
        if (encontrado==false){
            indice=-1;
        }
        return indice;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  nombre , apellido , dni;
        int numerodecuenta , ncuentas , opcion ,indiceCuenta;
        double saldo,  cantidad;
        Cuenta cuentas[];
        Cliente cliente;
        System.out.println("Digite el nombre del cliente: ");
        nombre=sc.nextLine();
        System.out.println("Digite el apellido del cliente: ");
        apellido=sc.nextLine();
        System.out.println("Digite el DNI del Cliente");
        dni=sc.nextLine();
        System.out.println("Cunatas cuentas cuentas en el banco tienes");
        ncuentas=sc.nextInt();
        cuentas= new Cuenta [ncuentas];
        for (int i = 0; i <cuentas.length ; i++) {
            System.out.println("Digite lso datos para la cuenta "+(i+1)+":");
            System.out.println("Digite el numeor de cuenta: ");
            numerodecuenta=sc.nextInt();
            System.out.println("Digite el saldo de la cuenta: ");
            saldo=sc.nextDouble();
            cuentas[i]= new Cuenta(numerodecuenta , saldo);
        }
        cliente= new Cliente(nombre, apellido,dni,cuentas);
        do {
            System.out.println("\tMENU");
            System.out.println("1. Ingresar dinero en la cuenta");
            System.out.println("2. Retirar dienero de la cuenta");
            System.out.println("3. Consultar dineor de la cuenta");
            System.out.println("4. Salir");
            System.out.println("Digite la opcion a elegir..");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Digite el numero de  cuenta: ");
                    numerodecuenta=sc.nextInt();
                    indiceCuenta=busquedanumerodecuenta(cuentas , numerodecuenta);
                    if (indiceCuenta==-1){
                        System.out.println("El numero de cuenta ingresado no existe");
                    }else {
                        System.out.println("\nDigite la cantidad de dineor a ingresar");
                        cantidad=sc.nextDouble();
                        cliente.ingresarDinero(indiceCuenta, cantidad);
                        System.out.println("\nIngreso realizado correctamente ");
                        System.out.println("Saldo disponible:"+cliente.consultarSaldo(indiceCuenta));
                    }
                    break;
                case 2:
                    System.out.println("Digite el numero de  cuenta: ");
                    numerodecuenta=sc.nextInt();
                    indiceCuenta=busquedanumerodecuenta(cuentas , numerodecuenta);
                    if (indiceCuenta==-1){
                        System.out.println("El numero de cuenta ingresado no existe");
                    }else {
                        System.out.println("Digite la cantida que desea retirar: ");
                        cantidad=sc.nextDouble();
                        if(cantidad>cliente.consultarSaldo(indiceCuenta)){
                            System.out.println("Saldo insuficiente");
                        }else
                        {
                            cliente.RetirarDinero(numerodecuenta ,cantidad);
                            System.out.println("\nRetiro  realizado correctamente ");
                            System.out.println("Saldo disponible:"+cliente.consultarSaldo(indiceCuenta));
                        }
                    }
                    break;

                case 3:
                    System.out.println("Digite el numero de  cuenta: ");
                    numerodecuenta=sc.nextInt();
                    indiceCuenta=busquedanumerodecuenta(cuentas , numerodecuenta);
                    if (indiceCuenta==-1){
                        System.out.println("El numero de cuenta ingresado no existe");
                    }else {
                        System.out.println("Saldo disponible:"+cliente.consultarSaldo(indiceCuenta));
                    }
                    break;

                case  4: break;
                default:
                    System.out.println("Opcion invalida: ");
            }
        }while (opcion!=4);

    }
}
