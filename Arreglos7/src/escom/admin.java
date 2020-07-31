package escom;

public class admin {
    public static void main(String[] args) {
        int a []={1,2,3,4,5,6,7,8,9,10};
        int b []= {11,22,33,44,55,66,77,88,99,111};
        int c[] = new int [a.length +b.length];
        for (int i = 0 , j=0 ,k=0; i <10 && j<10   ;j++, i++) {
            c[k]=a[i];
            k++;
            c[k]=b[j];
            k++;
            System.out.print(k);
        }
        System.out.println();
        for (int i: c) {
            System.out.print(i+" - ");
        }

    }
}
