package escom;

public class Persona {
    //Atributos
    String nombre;
    int edad;
    String DNI;

    //Metodo Construvtor no se pone void
    public Persona (String nombre , int edad){
        this.nombre= nombre;
        this.edad = edad; // el this es edad es el del atributos
    }
    public Persona(String dni){
        this.DNI=dni;
    }
    public void correr (){
        System.out.println("Soy "+nombre +"tengo"+edad);
    }
    public void correr (int km){
        System.out.println("He corriedo tantos km:  "+km);
    }


    public void MostrarNombre (){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es:"+edad);
    }

}
