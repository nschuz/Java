package paqueton;

public abstract class Poligono {
    protected  int  numeroLados;

    public  Poligono (int numeroLados){
        this.numeroLados=numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public  String mostrarDtos (){
        return  "Numero de lados es: "+numeroLados;
    }

    @Override  // significa que estamos sobrescribiedo porque hereda de object de la clase java object
    public String toString() {
        return "Poligono{" +
                "numeroLados=" + numeroLados +
                '}';
    }
        // declaramos el metodo asbtract
        public abstract  double  area ();
        // porque es inlogico sacar el area aqui  es muy general

}
