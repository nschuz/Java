package main;

public class Factorial {
    public static void main(String[] args) {

    }
    public int  factorialCiclo( int n){
        int factor =1;
        if (n<0){
            return 0;
        }else{
            while (n!=0){
                factor = n* factor;
                n--;
            }
            return factor;
        }
    }
}
