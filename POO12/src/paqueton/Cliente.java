package paqueton;

public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    Cuenta cuentas [];

    public Cliente (String nombre , String apellido , String dni , Cuenta [] cuentas){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.cuentas=cuentas;
    }

    public String getDni() {
        return dni;
    }

    public String getApellido() {
        return apellido;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }
    public double consultarSaldo (int n){
        return cuentas[n].getSaldo();
    }
    public void ingresarDinero (int n , double dinero){
        cuentas[n].ingresarDinero(dinero);
    }
    public void RetirarDinero (int n , double dinero){
        cuentas[n].retirarDinero(dinero);
    }
}
