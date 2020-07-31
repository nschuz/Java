public class Bicicleta implements Rueda {

    public Bicicleta(){

    }

    @Override
    public void avanzar() {
        System.out.println("La bicicleta avanza");
    }

    @Override
    public void detenerse() {
        System.out.println("L biciclecta se detiene");
    }
}
