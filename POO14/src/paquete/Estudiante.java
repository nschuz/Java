package paquete;
// indicamos que estudiante hereda de la clase persona
public class Estudiante extends Pesona {
//Yano no es encesario usar sus atributos
   private int codigoEstudiante;
   private float notaFinal;

   //Costructor de la clase hija
    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante , float notaFinal) {
        super(nombre, apellido, edad); // ya estan inicializado dentro de la clase persona
    // pero estos atributos si tenemos que inicializar
        this.codigoEstudiante=codigoEstudiante;
        this.notaFinal=notaFinal;
    }
    // ya tiene sus getter esta clas eno es necesario

    // no puedo imprimimir nombre porque en la clase tiene private
    // podemos usar los getter o cambiar a protected en vez de rpivate
    //proctected ya puede se accedidos por la clase heredada
    public void mostrarDatos (){
        System.out.println("Nombre: "+nombre + "\nApellido: " +getApellido()+
                "\nEdad: "+getEdad()+ "\nCodigo Estudnaite: "+codigoEstudiante+
                "\nNota final: "+notaFinal);
    }


}
