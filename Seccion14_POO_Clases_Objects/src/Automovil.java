public class Automovil {
    //las clases solo pueden ser public o default
    String fabricante;
    String modelo;
    String color;
    double cilindrada;

    //modifcador public
    //elthis se puede omitir
    public String detalle(){
        //variable local si tenemos una igual debemos utilizar this
        String modelo="";
        return "Auto.fabricante: " + this.fabricante +
                "auto.modelo: " + this.modelo +
                "Auto.cilindros: " + this.cilindrada;
    }

    public String acelerar(int rpm){
        return "El auto "+ fabricante + " acelerando  a "+ rpm + "rpm";
    }

    public String frenar(){
        return this.fabricante + " " + this.modelo + " frenado!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

}
