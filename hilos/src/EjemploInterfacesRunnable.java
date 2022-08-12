import org.chuz.hilos.ejemplos.thread.ruunable.ViajeTarea;

import java.util.Arrays;

public class EjemploInterfacesRunnable {

    public static void main(String[] args) {

        System.out.println("Args: "+ Arrays.toString(args));

        //Cremoa la isnatncia y le pasamos la isntacia que implenta la intefaz
        new Thread(new ViajeTarea("Isla de Pascua")).start();
        new Thread(new ViajeTarea("Paris")).start();
        new Thread(new ViajeTarea("Patagonia")).start();


    }
}
