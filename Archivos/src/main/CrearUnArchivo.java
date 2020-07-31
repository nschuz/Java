package main;

import java.io.*;
import java.util.jar.JarOutputStream;

public class CrearUnArchivo {
    File archivo;

    private void crearArchivo(){
        archivo=new File("hola2.txt");
        try {
            if (archivo.createNewFile()){
                System.out.println("El archivo se creao correctamente ");
            }
        } catch (IOException e) {
            System.err.println("No se pudo crear el archivo");
        }
        //true si se creo correctamente
    }

    private void crearDirectorio(){
        archivo= new File("carpetitaPrueba");
        if (archivo.mkdir()){
            //retortna tru si fue creado con exito
            System.out.println("Se ha creado el directorio corrrectamente");
        }else {
            System.out.println("No se pudo crear el directorio");
        }
    }

    private void escribirTexto(){
        try {
            FileWriter escribir = new FileWriter("hola2.txt");
            escribir.write("Hola Chuz Guapo");
            escribir.write("\r\nMas Texto");
            escribir.close();// siempre cerra el objeto escribir
        } catch (IOException e) {
            System.out.println("Erro no se pudo escribir sobre el archivo");
        }
    }

    private void añadirTexto(){
        try {
            FileWriter escribir = new FileWriter("hola2.txt",true);
            //el booleano true avisa que añdade el texto  o sea que no sobr escriba
            escribir.write("\r\nHola gabs");
            escribir.write("\r\nerro no es verdad ya no se borra estoy sobre escribiendo mas texto");
            escribir.close();// siempre cerra el objeto escribir
        } catch (IOException e) {
            System.out.println("Erro no se pudo escribir sobre el archivo");
        }
    }

    private void leerArchivo(){
    String cadena="";
        try {
            FileReader lector = new FileReader(archivo);
            BufferedReader lectura = new BufferedReader(lector);

             while (cadena!= null){
                 System.out.println(cadena);
                 cadena=lectura.readLine();

             }


        } catch (FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error");
        }
    }


    public static void main(String[] args) {
        CrearUnArchivo archivos = new CrearUnArchivo();
        archivos.crearArchivo();
       // archivos.escribirTexto();
        //archivos.crearDirectorio();
        archivos.añadirTexto();
        archivos.leerArchivo();
    }
}
