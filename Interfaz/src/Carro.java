public class Carro implements Rueda{
    public Carro(){

    }

    @Override
    public void avanzar() {
        System.out.println("El carro avanza");
    }

    @Override
    public void detenerse() {
        System.out.println("el carro detiene");
    }
}
