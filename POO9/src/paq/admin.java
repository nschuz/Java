package paq;

import java.util.Scanner;

public class admin {
    Scanner sc= new Scanner(System.in);
    public  static int indiceGanador (Atleta atleta[]){
        float tiempodeCarrera=0;
        int indidce=0;
        tiempodeCarrera= atleta[indidce].getTiempoCarrera();
        for (int i = 0; i <atleta.length ; i++) {
            if (atleta[i].getTiempoCarrera()<tiempodeCarrera){
                tiempodeCarrera=atleta[i].getTiempoCarrera();
                indidce=i;
            }
        }
        return indidce;
    }

    public static void main(String[] args) {
        String nombre ;
        Scanner sc= new Scanner(System.in);
        int numero , natletas, indiceGanador;
        float tiempoCarrera;
        System.out.println("Inserte el numero de atletas: ");
        natletas=sc.nextInt();
        Atleta atleta []= new Atleta[natletas]; // creamos un objeto por cada carrera

        for (int i = 0; i <atleta.length ; i++) {

            System.out.println("Inserta los datos del atleta "+(i+1));
            System.out.println("Introce el numero de atleta: ");
            numero=sc.nextInt();
            sc.nextLine();
            System.out.println("Introduce el nombre del atleta");
            nombre=sc.nextLine();
            System.out.println("introduce el tiempo dde carrera: ");
            tiempoCarrera=sc.nextFloat();

            atleta[i]= new Atleta(numero,nombre,tiempoCarrera);
        }

    indiceGanador=indiceGanador(atleta);
        System.out.println("El taleta ganador es:");
        System.out.println(atleta[indiceGanador].mostrarDatosGanador());

    }

}
