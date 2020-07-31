package Herencia;

 public class FiguraCerrada extends Figura {
 private int nLados;

    public FiguraCerrada(double tamaño , int nLados) {
        super(tamaño);
        this.nLados=nLados;
    }

    public  final  void  dibujar1 (){
        System.out.println("Dibujo de una figura cerrada ");
    }
}
