package escom;

public class admin {
    public static void main(String[] args) {
     int []a ={2,2,2,2,2,2,2,2,2,2};
     boolean bandera = false ;

        for (int i = 0; i <9 ; i++) {


                if (a[i] > a[i + 1]) {
                    bandera = true;
                    if (i == 8) {
                        System.out.println("Esta en forma decreciente");
                    }
                }
                else if (a[i] < a[i + 1]) {
                    bandera = true;
                    if (i == 8) {
                        System.out.println("Esta en forma creciente");
                    }
                }
                else if (a[i] == a[i + 1]) {
                    bandera = true;
                    if (i == 8) {
                        System.out.println("Esta en son iguales");
                    }
                } else {

                    System.out.println("Esta desordenado");
                    break;

                }



        }



    }
}
