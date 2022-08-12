package org.chuz.expeciones;

public class Calculadora {


    //trhwo le decimoq eue ste metodo posiblente va lanzar una error
    // throws es obligado por que nuestro throw hay uan excepcion chqueda
    //si fuera unckcj¿ked es decir de la clase tuntimeexcepcion no es ncesario utilizar throws
    public double dividir(int numerador , int dividiendo) throws DivisionPorZeroException {

        if (dividiendo == 0){
            //lanzamos la execpion y eta obliga amengar a propgara la excepcion
            throw new DivisionPorZeroException("No se pde dividir por cero");
        }

        return numerador/(double)dividiendo;
    }

    public double dividir(String numerador , String divisor) throws DivisionPorZeroException, FormatoNumeroException {


        try {
            int num = Integer.parseInt(numerador);
            int div = Integer.parseInt(divisor);
            return this.dividir(num , div);
        }catch (NumberFormatException e){
            throw  new FormatoNumeroException("Dbe ingresa un numero en el nmerador y divisor");
        }





    }

}
