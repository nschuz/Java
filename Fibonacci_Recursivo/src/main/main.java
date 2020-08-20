package main;

public class main {
    public static void main(String[] args) {

        System.out.println("Fibonacci: "+Fibonaccio(4));
    }

    public static int Fibonaccio (int n){
        if (n==1  || n==2){
            return 1;//caso base (Respuesta explicita)
        }else{
            //dominio (problema -1)
            return  Fibonaccio(n-1)+ Fibonaccio(n-2);
        }
        
    }
}
