package package1;

public class Triangulo {
    //Atributos
    private double base;
    private double lado;

    //constructor
    public Triangulo (double base , double lado){
        this.base=base;
        this.lado=lado;
    }
    public double Perimetro(){
        double perimetro= 2*lado+base;
                return perimetro;
    }
    public double Area(){
        double area= (base*Math.sqrt((lado*lado)-((base*base)/4)))/2;

        return  area;
    }
    public  String  mostrarDatos (){
        return  "Base: "+base +"\nLado: "+lado+"\nPerimetro"+Perimetro()+"\nArea:"+Area()+"\n";
    }


}
