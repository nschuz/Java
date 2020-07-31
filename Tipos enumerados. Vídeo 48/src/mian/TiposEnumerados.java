package mian;

import java.util.Scanner;

public class TiposEnumerados {
    enum Talla{MINI, MEDIANO , GRANDE , MUY_GRADE};

    enum Tallita {

        mini("s"), mediano("M"), grande("L");

        //Atributo
        //una de las carctericas enumerados no podemos crear instaciar objetos
        //debiado a eso tiene que ser priavte
        // ose ano poemos usar la palabra reservada new
        private String abreviatura;

        //creamos el constrcutor
        private Tallita (String abreviatura){
            this.abreviatura=abreviatura;
        }
        //el setter en este caso seria el constructor

        //setter y gettrs
        public String getAbreviatura() {
            return abreviatura;
        }
    }

    public static void main(String[] args) {
        //una instacia a la clase enum para que le objeto talla solo puede alamcenar esos valores
        Talla s=Talla.MINI;
        //el objeto s es mini
        Talla m=Talla.MEDIANO;

        Talla l= Talla.GRANDE;

        //
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una Talla");
        String entrdadDatos = sc.next();

        Tallita la_talla  = Enum.valueOf(Tallita.class, entrdadDatos);
        System.out.println("La talla: "+la_talla);
        System.out.println("Abreviatura: "+la_talla.getAbreviatura());


    }

}
