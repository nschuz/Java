package escom;

public class Clase1 {
    private int edad;
    private String nombre;
    private final String nombre2; // nombre cosntante



    // un atrbituos publico puede ser accedico dentro del mismo paquete
    // private solo puede se accedido desde metodos desde la la misma clase
    // encapsulamiento oculatar datos para que no todos puedad modificar  y que solo se puedan acceder
    // dor metodos de la misma clase

    //los metodos accesores son los metodos setter y getter

    //Etablelcer la edad
    public void SetEdad(int edad){
    this.edad=edad;
    }
    //metodo getter
    public int getEdad(){
        return edad;
    }

    // Constructor
    public  Clase1 (String nombre2){
        this.nombre2= nombre2;
    }
    public void setNombre (String nombre2){
        this.nombre2=nombre;
    } // Vemos un eroro porque no ya no puedo modificar el nombre
    public  String getNombre (){
        return  nombre2;
    }
    public void mostrar (){
        System.out.println("nombre :"+nombre2);
    }


}
