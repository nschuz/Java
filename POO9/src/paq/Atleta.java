package paq;

public class Atleta {
    private  int numero;
    private String nombre;
    private float tiempoCarrera;

    //Constructor
    public Atleta (int numero ,String nombre , float tiempoCarrera){
        this.numero=numero;
        this.nombre=nombre;
        this.tiempoCarrera=tiempoCarrera;
    }

    public float getTiempoCarrera (){
        return  tiempoCarrera;
    }
    public String mostrarDatosGanador (){
        return "Numero Atleta: "+numero+"\nNombre de atleta: "+nombre+"\nTiempo de Carrera: "+tiempoCarrera+"\n";
    }

}
