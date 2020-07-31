package main;

public class MusicoEstudiante implements Musico, Estudiante {
    @Override
    public void estudiar() {
        System.out.println("Estoy estudiando");
    }

    @Override
    public void TocarMusica() {
        System.out.println("Estoy tocando la guitarra");
    }

    @Override
    public void habal() {
        System.out.println("Estoy Hbalndo Español");
    }
}
