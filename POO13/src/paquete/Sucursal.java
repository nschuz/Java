package paquete;

public class Sucursal {
    private int  numeroSucursal;
    private String direccion;
    private String ciudad;

    public Sucursal (int  numeroSucursal , String direccion , String ciudad){
        this.numeroSucursal=numeroSucursal;
        this.direccion=direccion;
        this.ciudad=ciudad;
    }

    /// getters
    public String getCiudad() {
        return ciudad;
    }

    public int getNumeroSucursal() {
        return numeroSucursal;
    }
    public String getDireccion (){
        return  direccion;
    }
    public String mostrarDatosSucursal (){
        return "Numero Sucursal: "+numeroSucursal+
                "\nDireccion: "+direccion+
                "\nCiudad: "+ciudad;
    }

    public double calcular_precio (Paquete t)
    {
        double precio;
        precio=t.getPeso();
        if(t.getPrioridad()==1){
            precio+=10;
        }
        if (t.getPrioridad()==2){
            precio+=20;
        }
        return precio;
    }


}
