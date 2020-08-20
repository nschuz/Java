package main;

public class main {
    public static void main(String[] args) {
        torresHanoi(3,1,2,3);
        System.out.println("Jueco completado");
    }

    //creanod el  metodo recursivo para solucionar las torres de hanoi
    public static void torresHanoi (int discos , int torre1 , int torre2 , int torre3){
        //Caso Base
        if(discos==1){
            System.out.println("Mover Disco de Torre "+torre1+" a Torre:  "+torre3);
        }else{
            //Dominio
            torresHanoi(discos-1 , torre1 , torre3 , torre2);
            System.out.println("Mover Disco de Torre "+torre1+" a Torre:  "+torre3);
            torresHanoi(discos-1 , torre2 ,torre2 ,torre3);
        }
    }
}
