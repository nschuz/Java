package paquete;

public class NumeroComplejo {
    //Atributos
    private double a;  // parte real
    private  double b ; // parte imaginaria

    public NumeroComplejo (double a , double b){
        this.a=a;
        this.b=b;
    }

    //metos getters
    public double getA (){
        return a;
    }

    public double getB() {
        return b;
    }

    /*
    numero1 =  3+4i
    numero2=   2+5i
Lo que está sucediendo es que en vez de retornar un int, double, float como se ha visto en los videos anteriores, esta vez el método está retornando un objeto.
Es decir, está devolviéndo algo que fue creado con una clase. Por lo tanto, tiene métodos y atributos también.
Además, como parámetro del método, se le está pasando un número complejo también.
     */
    public NumeroComplejo calcularSuma (NumeroComplejo c) {
            NumeroComplejo suma= new NumeroComplejo(a+c.getA(),b+c.getB());
        return suma;
    }
    public NumeroComplejo multiplicacion (NumeroComplejo c){
        NumeroComplejo mult= new NumeroComplejo((a*c.getA()-b*c.getB()),(a*c.getB()+b*c.getA()));
        return  mult;
    }

    public boolean compararNumeros (NumeroComplejo c){
        boolean igualdad=false;
        if (a==c.getA() && (b==c.getB())){
            igualdad=true;
        }
        return  igualdad;
    }
    // multiplicar un numero complejo por un entero
    public NumeroComplejo multiEntero (int entero){
        NumeroComplejo multiplicacion = new NumeroComplejo(a*entero , b*entero);
        return multiplicacion;

    }


}
