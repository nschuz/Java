package paquete;

public class Vehiculo {
    protected  String matricula ;
    protected  String marca;
    protected  String modelo;

    public Vehiculo (String matricula , String marca ,String modelo)
    {
        this.matricula=matricula;
        this.modelo=modelo;
        this.marca=marca;
    }

    public String getMarca() {
        return marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }
    public String mostrarDatos (){
        return "Marca: "+marca+
                "\nMatircula: "+matricula+
                "\nModelo: "+modelo;
    }
}
