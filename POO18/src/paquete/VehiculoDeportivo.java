package paquete;

public class VehiculoDeportivo extends  Vehiculo {
    private int cilindros;

    public VehiculoDeportivo(String matricula, String marca, String modelo , int cilindros) {
        super(matricula, marca, modelo);
    this.cilindros=cilindros;
    }

    public int getCilindros() {
        return cilindros;
    }
    public String mostrarDatos (){
        return "Marca: "+marca+
                "\nMatircula: "+matricula+
                "\nModelo: "+modelo+
                "\nCilindros: "+cilindros;
    }

}
