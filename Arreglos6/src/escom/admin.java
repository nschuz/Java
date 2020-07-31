package escom;

public class admin {
    public static void main(String[] args) {
        // ordenau aun arreglo de 10 elemntos primer ultimo y asi
        int arreglo [] = {1,2,3,4,5,6,7,8,9,10};
        int areglo2 []= new int [10];
        int aux=0;
        for (int i=0 ,j=arreglo.length-1;  i<arreglo.length && j>=0; i++ , j--){
            if (aux==10)
                break;
            areglo2[aux]=arreglo[i];
            aux++;
            areglo2[aux]=arreglo[j];
            aux++;

        }
        for (int i = 0; i <areglo2.length ; i++) {
            System.out.print(areglo2[i]+" -  ");
        }
    }
}
