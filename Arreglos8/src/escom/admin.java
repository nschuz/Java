package escom;

public class admin {
    public static void main(String[] args) {
        int a []={1,2,3,4,5,6,7,8,9,10,11,12};
        int b[]={12,11,10,9,8,7,6,5,4,3,2,1};
        int c[]= new int [a.length + b.length];
        int i=0 , j=0;

        while( i<12){
            for (int k = 0; k <3 ; k++) {
                c[j]= a[i+k];
                j++;

            }
            for (int k = 0; k <3 ; k++) {
                if (j==24)
                    break;
                c[j]= b[i+k];
                j++;
            }
    i+=3;

        }
        for (int hola :c) {
            System.out.print(hola + " - ");
        }


    }
}
