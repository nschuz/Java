
package mian;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ArchivosBinarios {
    public static void main(String[] args) {
        ArchivosBinarios archivos = new ArchivosBinarios();
      //  archivos.escribirBinario();
      archivos.LeerBinario();
      archivos.LeerBinario();
    }
    
    private void escribirBinario (){
        try {
            FileOutputStream archivo = new FileOutputStream("persona.bin");
            AñadirContenido escritura = new AñadirContenido(archivo);
            
            Persona persona1 = new Persona("Chuz", 20);
            Persona persona2 = new Persona("MIke", 20);
            Persona persona3 = new Persona("Gabz", 20);
            //Escibimos objeto s 
            escritura.writeObject(persona1);
            escritura.writeObject(persona2);
            escritura.writeObject(persona3);
            escritura.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivosBinarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArchivosBinarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    private void LeerBinario (){
        Persona objetoPersona;
        try {
            FileInputStream archivo = new FileInputStream("persona.bin");
            ObjectInputStream lectura = new ObjectInputStream(archivo);
            while(true){//coclo infininito reccoriendo el archivo
                objetoPersona=(Persona) lectura.readObject();
                objetoPersona.mostrarDatos();
            }
        }catch (EOFException ex){
                    return; // rompemos el ciclo  hasta que termine el archivo
             
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivosBinarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArchivosBinarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ArchivosBinarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
        
        private void AñadirBinario (){
        try {
            FileOutputStream archivo = new FileOutputStream("persona.bin",true);
            ObjectOutputStream escritura = new ObjectOutputStream(archivo);
            
            Persona persona1 = new Persona("Chuz", 20);
            Persona persona2 = new Persona("MIke", 20);
           
            //Escibimos objeto s 
            escritura.writeObject(persona1);
            escritura.writeObject(persona2);
      
            escritura.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivosBinarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArchivosBinarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        
        
    
}
