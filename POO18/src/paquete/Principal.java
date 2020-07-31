package paquete;

public class Principal {
    public static void main(String[] args) {
        Vehiculo misVehiculos [] = new Vehiculo[4];
        misVehiculos[0]= new Vehiculo("gda" , "Ferara ", "2010");
        misVehiculos[1]= new VehiculoTurismo("34","audi","2010",4);
        misVehiculos[2]= new VehiculoDeportivo("ada","bwm","2020",12);
        //for (Vehiculo vehiculo: misVehiculos) {
          //  System.out.println(vehiculo.mostrarDatos());
        //}
        VehiculoTurismo  miVehiculo = new VehiculoTurismo("140", "DT3S","Ferrarri",4);
        ////refrencia del obteto     /// intaciacion del objeto
        // puedo hacer un objeto de vehiculo turismo sea de turismos
        Vehiculo vehiculo = miVehiculo;// se esta guarado como un objeto de vehiculo turismo
        System.out.println(vehiculo);
        // la version norma
         Vehiculo vehiculo1 = new VehiculoTurismo("140", "DT3S","Ferrarri",4); //upcasting
        // downcating previamnete debe de haber un upcasting
        //para downcationg ya no es tan directo
        VehiculoTurismo nuevoVehiculo = (VehiculoTurismo) vehiculo1;
        System.out.println(nuevoVehiculo);


        /// otro ejemplo
        // uppcasting
        Vehiculo coche = new VehiculoDeportivo("1asd","adui", "bmw",4);
        System.out.println(coche);
        // dowcating
        VehiculoDeportivo cochenuevo = (VehiculoDeportivo) coche;
        System.out.println(coche);
    }
}
