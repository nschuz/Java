package paquete;

public class Pesona {
  protected String nombre;
    protected String apellido;
    protected int edad;

    public  Pesona (String nombre , String apellido , int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }
}
