package org.chuz.pooclasesabractas.validador;

public class LargoValidador extends Validador{

    protected String mensaje = "El campo debe tener minimo %d caracteres y maximo %d caracateres";
    //pordefectod eun primitivo int es 0
    private int min;
    private int max = Integer.MAX_VALUE;

    public LargoValidador() {
    }

    public LargoValidador(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

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
        //el emnsae queda personalizado con gacia %d
        this.mensaje = String.format(this.mensaje, this.min, this.max);
        //nos interesa validar por null y asi evitamos null pooter excepcio
        if(valor == null){
            return true;
        }
        int largo = valor.length();
        return (largo >= min && largo <=max);

    }
}
