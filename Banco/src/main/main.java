package main;

import java.util.Scanner;

public class main {
        public static void main(String[] args) {

            impmir();




        }

        public static   void  impmir (){
            Scanner sc = new Scanner(System.in);
            int opcion ;
            double dinero, contador=0;
            String nombre ,numeroCuneta, nip, prestamo;
            boolean prestamo2=false;
            System.out.println("---Hola Bienvenido al Banco--- ");
            //Cremoas uan cuenta
            System.out.println("Inserte su nombre: ");
            nombre=sc.next();
            sc.next(); //limpio el buffer
            System.out.println("Inserte un numero de cuenta: ");
            numeroCuneta=sc.next();
            System.out.println("Inserte un nip: ");
            nip = sc.next();
            System.out.println("Inserte su deposito inicial: ");
            dinero=sc.nextDouble();

//Cremos un objeto con todos sus atributos y metoods que estan definidos en la clase banco
            //al final le pongo un cero porque al crera una cuenta no tienes prestamos es decir no debes nada
            Banco cuenta = new Banco(dinero,numeroCuneta,nombre,nip,prestamo2,0);

            do {
                System.out.println("Selecciona una Opcion: ");
                System.out.println("1.Ver datos.");
                System.out.println("2.Cambio de Nip.");
                System.out.println("3.Rettiro de Efectivo.");
                System.out.println("4.Consultar Moviemientos. (No funciona no lo hice)");
                System.out.println("5.Solicitar Prestamo.");
                System.out.println("6.Salir");
                opcion=sc.nextInt();




                switch (opcion){
                    case 1:
                    boolean bandera =ModuloSeguridad(cuenta);
                    if(bandera){
                        System.out.println(cuenta.MostrarDatos());
                        System.out.println("");
                    }else {
                        System.out.println("Datos Erroneos Intente de nuevo");
                        System.out.println("");
                    }
                        break;
//en cada caso puedes pone el if de aarriba lo que hace es copribar tus datos pero aveces es molesto xd
                    case 2:
                        System.out.println("Inserte el nuevo nip: ");
                        String nipNuevo= sc.next();
                        cuenta.setNip(nipNuevo);
                        break;
                    case 3:
                        System.out.println("Inserte el monto a retirrar ");
                        dinero=sc.nextDouble();
                        if (dinero<=cuenta.getDinero()){
                            contador=cuenta.getDinero();
                            contador=contador-dinero;
                            cuenta.setDinero(contador);

                        }else {
                            System.out.println("Saldo insuficiente.....");
                        }

                    case  4:
                        System.out.println("No funciona......perdon axel pero en este punto si es medio tardado puedes gusradar las operaciones " +
                                "en un arraylist o en un array  y luego imprimirlas es una opcion :) ");
                        break;


                    case 5:
                        System.out.println("Desea un pretamo escriba si o no");
                        prestamo=sc.next();

                        if (prestamo.equalsIgnoreCase("si")){
                            prestamo2=true;

                            System.out.println("Inserte el monto del prestamo: ");
                            contador=sc.nextDouble();
                            cuenta.setPrestamo(prestamo2);
                            cuenta.setDeuda(contador);

                        }




                }




            }while (opcion!=6);

        }

        public static  boolean ModuloSeguridad (Banco cuenta){
            Scanner sc = new Scanner(System.in);
            boolean bandera=false;
            String numerocuenta, nip;
            System.out.println("Inserte su numero de cuenta para poder acceder: ");
            numerocuenta=sc.next();
            System.out.println("Inserte su nip para poder acceder ");
            nip=sc.next();

            if (numerocuenta.equals(cuenta.getNumeroCuenta()) &&  nip.equals(cuenta.getNip())){
                bandera=true;
            }else {
                bandera=false;
            }
            return bandera;

        }


}
