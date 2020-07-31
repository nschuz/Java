package excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class Excepciones2 {

    public static void main(String[] args) throws FileNotFoundException {
//Exceocion verificada (IOExcepcion)
        BufferedReader  bf= new BufferedReader(new FileReader("C:\\Users\\nschu\\Desktop\\curp.txt"));
        String linea="";
        while(true){
            try {
                if (!((linea=bf.readLine())!=null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(linea);
        }

        //RunaTime Excepcion (eerores mios)
        //java no me dice. solo dice al compilar
        //solucionarlo manulamnte no es como el de aarriba que
       //excepcion para runtimeExcepcoo
        int num1=5 , num2=0;
        try{
            int reulstado= num1/num2;
            System.out.println(reulstado);
        }catch (ArithmeticException e){
            System.out.println("Error del tipo:  "+e);
        }


    }
}
