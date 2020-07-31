package paquete;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c,d;
        int opcion;
        NumeroComplejo numero1 , numero2 , suma , mult;
        do {
            System.out.println("Operaciones con numeros complejos: ");
            System.out.println("1. SUMAR dos numeros complejos ");
            System.out.println("2. Multiplixar 2 numeros complejos ");
            System.out.println("3. Comparar dos numeros compeljos ");
            System.out.println("4. Multiplicar un numero complejo por un enetero");
            System.out.println("5. Salir");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Inserte un numero complejo");
                    System.out.println("Digite la parate real");
                    a=sc.nextDouble();
                    System.out.println("Inserte parte imaginaria: ");
                    b=sc.nextDouble();
                    System.out.println("Digite la parate real");
                    c=sc.nextDouble();
                    System.out.println("Inserte parte imaginaria: ");
                    d=sc.nextDouble();
                    numero1= new NumeroComplejo(a,b);
                    numero2= new NumeroComplejo(c,d);
                    suma=numero1.calcularSuma(numero2);
                    System.out.println("La suma es:  "+suma.getA()+"+"+suma.getB()+"i");
                case 2:System.out.println("Inserte un numero complejo");
                    System.out.println("Digite la parate real");
                    a=sc.nextDouble();
                    System.out.println("Inserte parte imaginaria: ");
                    b=sc.nextDouble();
                    System.out.println("Digite la parate real");
                    c=sc.nextDouble();
                    System.out.println("Inserte parte imaginaria: ");
                    d=sc.nextDouble();
                    numero1= new NumeroComplejo(a,b);
                    numero2= new NumeroComplejo(c,d);
                    mult=numero1.multiplicacion(numero2);
                    System.out.println("La multiplicacion es: "+mult.getA() +"+"+mult.getB()+"i");
                    break;
                case 3:
                    System.out.println("Digite la parate real");
                    a=sc.nextDouble();
                    System.out.println("Inserte parte imaginaria: ");
                    b=sc.nextDouble();
                    System.out.println("Digite la parate real");
                    c=sc.nextDouble();
                    System.out.println("Inserte parte imaginaria: ");
                    d=sc.nextDouble();
                    numero1= new NumeroComplejo(a,b);
                    numero2= new NumeroComplejo(c,d);
                    if (numero1.compararNumeros(numero2)==true){
                        System.out.println("los numeross complejos son iuales ");
                    }else {
                        System.out.println("Los numeros complejos no son iguales");
                    }
                    break;
                case  4:
                    System.out.println("Digite la parate real");
                    a=sc.nextDouble();
                    System.out.println("Inserte parte imaginaria: ");
                    b=sc.nextDouble();
                    numero1=new NumeroComplejo(a,b);
                    int entero= sc.nextInt();
                    mult=numero1.multiEntero(entero);
                    System.out.println("La multiplicacion resultante es :"+mult.getA()+"+"+mult.getB()+"i");
                    break;
            }
        }while (opcion!=5);
    }
}
