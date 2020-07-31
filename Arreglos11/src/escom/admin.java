package escom;

public class admin {
    public static void main(String[] args) {

        int  a [ ] = {1,2,3,4,5,6,7,8,9,10};
        int ultimo= a[a.length-1];

        for (int i = 8 ; i >=0 ; i--) {
            a[i+1]=a[i];
        }
        a[0]=ultimo;
        for (int i:a) {
            System.out.print(i + "-");
        }



    }
}
