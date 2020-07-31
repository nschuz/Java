package mian;

public class Pruebas {

    public static void main(String[] args) {

        Empleados trabajador1 = new Empleados("Paco");
        Empleados trbajador2 = new Empleados("Ana");

        trabajador1.setCambiaSeccion("RRHH");
       // trabajador1.CambiaNombre("Chuz");
        System.out.println(trabajador1.getDatos());
        System.out.println(trbajador2.getDatos());

    }

}

class  Empleados {

    //Constructor
    public Empleados (String nombre){
        this.nombre=nombre;
        seccion="administracion";
        ID=IDSiguient;
        IDSiguient++;
    }

    //Atributos
    private final String nombre; //lo velevemos contantes y le damos el nombre
    //enel el costructor
    private String seccion;
    private  int   ID; ///pertence a la clase
    private  static  int IDSiguient=1;

    public void setCambiaSeccion(String seccion){
        this.seccion=seccion;
    }

    public String getDatos(){
        return "El nombre es: "+nombre +"\nSeccion: "+seccion+
                "\nId: "+ID+"\n";
    }




}
