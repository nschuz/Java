
package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivo {
    private File archivo;
    
    public void crearArchivo(){
        archivo = new File ("agendaContactos.txt");
        try {
            if(archivo.createNewFile()){
                
            }
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void escribirTexto (Persona persona){
        try {
            FileWriter escribir = new FileWriter(archivo,true);
            escribir.write(persona.getNombre()+ "%" +persona.getCorreo()+ "%" + persona.getCelular()+"\r\n");
            escribir.close();
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
