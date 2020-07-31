package paquete;

public class VehiculoTurismo extends  Vehiculo {
    private  int nPuertas;


    public VehiculoTurismo(String matricula, String marca, String modelo , int nPuertas) {
        super(matricula, marca, modelo);
        this.nPuertas=nPuertas;
    }
    public  int getnPuertas(){
        return nPuertas;
    }

    @Override
    public String mostrarDatos (){
        return "Marca: "+marca+
                "\nMatircula: "+matricula+
                "\nModelo: "+modelo+
                "\nPuetas"+nPuertas;
    }

}
