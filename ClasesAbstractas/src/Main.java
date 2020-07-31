public class Main {
    public static void main(String[] args) {
        Perro p = new Perro();
        p.moverse();
        p.comer();

        Ave ave = new Ave();
        ave.moverse();
        ave.comer();
//Por lo gneral las clases abstractas se usan como un padre
        System.out.println("------");
        System.out.println(ave.toString());

    }
}

