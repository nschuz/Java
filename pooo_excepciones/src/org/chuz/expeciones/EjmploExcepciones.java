package org.chuz.expeciones;

public class EjmploExcepciones {


    public static void main(String[] args) {


        Calculadora cal= new Calculadora();

        String valor = "10";
        int divisor = Integer.parseInt(valor);








        try {
            //como este metodo dividir tien un throw lode vemos manhear ocn tryctah o mandarlo al main
            //si lo propagamso al meain lo maneja la maquina virtual de java
            //throws pude lanzar muchas excepciones

            //double division =cal.dividir(10,divisor);
            //System.out.println(division);

            double division2 = cal.dividir("10a", "5");

            System.out.println(division2);

            //int divisor = Integer.parseInt(valor);
            //donde se lanza la expcion
            ///int division = 10 / divisor;

            //podemos tenerr multples ctah
        }catch (NumberFormatException e){
            System.out.println("Se detecto una excepcion por fa ingrese un numero valido: "+ e.getMessage());
            //main(args);
        }catch(DivisionPorZeroException e){
            System.out.println("Capturamos la execpcion en tiempo de jecucuin: "+e.getMessage());
            e.printStackTrace(System.out);
        } catch (FormatoNumeroException e) {
            System.out.println("Se detetco un numero ibvalido ingrese un numero valido: "+e.getMessage());
            e.printStackTrace(System.out);
            //main(args);
        } finally{
            System.out.println("Siempre se ejecuta quiza cerramos conexion o cerramos archivo");

        }
        System.out.println("Continua el flujo");




    }

}
