package main;

public class Banco {

//Atirbutos
    private double dinero;
    private String numeroCuenta;
    private  String nombreCuenta;
    private String nip;
    private  boolean prestamo;
    private  double deuda;

    //construtor
    public Banco(double dinero, String numeroCuenta, String nombreCuenta, String nip, boolean prestamo , double deuda) {
        this.dinero = dinero;
        this.numeroCuenta = numeroCuenta;
        this.nombreCuenta = nombreCuenta;
        this.nip = nip;
        this.prestamo=prestamo;
        this.deuda=deuda;
    }

    public boolean isPrestamo() {
        return prestamo;
    }

    public void setPrestamo(boolean prestamo) {
        this.prestamo = prestamo;
    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }
//setter y gettetr para mantener el encapsulamiento


    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }




    public  String MostrarDatos(){
        return "Hola "+nombreCuenta+"\nNumero de cuenta: "+numeroCuenta+"\nTu Saldo: "+dinero+"\nTu nip: "+nip+"" +
                "\nTines prestamos: "+prestamo+"\nDebes: "+deuda +"\n";
    }

}
