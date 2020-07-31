package admin;

public class ClasesyObjetos {

//Atributos
        String color;
        String nombre;
        int km;
        // Metodo
        public static void main(String[] args) {
            ClasesyObjetos objeto1 = new ClasesyObjetos();
            objeto1.color="rojo";
            objeto1.nombre="ferrarri";
            objeto1.km=0;
            System.out.println("El color: "+objeto1.color);
            System.out.println("La marca del coche 1 es: "+objeto1.nombre);
            System.out.println("Km: "+objeto1.km);
            ClasesyObjetos objeto2 = new ClasesyObjetos();
        }



}
