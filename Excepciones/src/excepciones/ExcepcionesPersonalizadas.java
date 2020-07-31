package excepciones;

import java.util.Scanner;

public class ExcepcionesPersonalizadas {

    private static int numeor;
    private static Scanner sc;

    public static void introducirNumero() throws Excepcion0 {
       sc= new Scanner(System.in);
        do {
            System.out.println("Inserte un numero: ");
            numeor=sc.nextInt();
            if (numeor==0){
            //Quiero que se produza una excepcion personaliza
                throw  new Excepcion0();
            }
        }while (numeor!=0);
    }

    public static void main(String[] args) throws Excepcion0 {
       try {
           introducirNumero();
       }catch (Excepcion0 e){
           System.out.println("Ha introcucido el numero cero");
       }
    }
}
