package main;

public class Concatenacion {
    public static void main(String[] args) {

        //Obtengo el milisegundo actual
        long hi =System.currentTimeMillis();

        //instaciomos un string buffrer vacio
        StringBuffer sb  = new StringBuffer();
        // voy a concatnar n caracteres
        int n=100000000;
        char c;

        for (int i = 0; i <n ; i++) {
            //obtengo valores entre a y z
            c =(char)  ('A' + i%('Z'-'A'+1));

            //concatenos los carcatres en el string buffer
            sb.append(c);


        }
        //obtenego el milsegundo actual
        long hf =System.currentTimeMillis();
        //muestro la cadena resulatante
        System.out.println(sb.toString());

        //muestro la cantida de segundo insumidos
        System.out.println((hf-hi)+" milisegundos");


    }
}
