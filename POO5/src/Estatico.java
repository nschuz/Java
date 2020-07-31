public class Estatico {
    private static  String frase ="Priemra frase";
    public  static  int Suamar (int n1 , int n2){
        int suma= n1+n2;
        return suma;
    }

    public static void main(String[] args) {
        Estatico obj1 = new Estatico();
        Estatico obj2 = new Estatico();

        obj2.frase="Segunda frase";
        System.out.println(obj1.frase);
        System.out.println(obj2.frase);
        System.out.println(Estatico.frase);
        System.out.println("La suma es :"+Estatico.Suamar(5,5));
    }


}
