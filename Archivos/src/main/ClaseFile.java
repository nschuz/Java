package main;

        import java.io.File;

public class ClaseFile {
    public static void main(String[] args) {
        File archivo = new File("Carpetita");// ya no e suna rchivo ahora es una carpeta
        //objejto archivo de tipo File
        if (archivo.exists()){
            //si el e l archivo existe
            System.out.println("El archivo existe");
            System.out.println("Su ruta absioluta: "+archivo.getAbsolutePath());
            System.out.println("¿Esu un archivo? "+archivo.isFile());
            System.out.println("¿Se puede leer? "+archivo.canRead());
        }else {
            System.out.println("El archivo NO existe");
        }
    }
}
