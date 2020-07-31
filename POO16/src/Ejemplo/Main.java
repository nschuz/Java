package Ejemplo;

public class Main {
    public static void main(String[] args) {
        Pesona pesona = new Pesona();
        Pero perro  = new Pero();

        pesona.comer();
        perro.comer();
        // ahora si llego que override la sobrescritura me imprime el metodo
        //de la clase padre  que es la clas e ANIMl

    }
}
