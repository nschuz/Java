package org.chuz.pooclasesabractas.validador;

public class RequeridoValidador extends Validador{


    protected String mnesaje = "El campo es requerido";


    @Override
    public void setMensaje(String mensaje) {
        this.mensaje=mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return (valor !=null && valor.length()>0);
    }
}
