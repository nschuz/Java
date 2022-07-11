public class EjemploAutomovil {

    public static void main(String[] args) {
        Automovil auto = new Automovil();

        auto.fabricante="Subaru";
        auto.modelo="Impresa";
        auto.cilindrada=2.0;
        auto.color="Balnco";

        String respuesta =auto.detalle();
        System.out.println(respuesta);
        System.out.println(auto.acelerar(300));
        System.out.println(auto.frenar());


    }
}
