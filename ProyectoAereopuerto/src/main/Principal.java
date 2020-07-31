package main;

import java.util.Scanner;

public class Principal {
  static   Scanner sc = new Scanner(System.in);
  final static  int num = 2; //Numero de aeropuertos
  static AereoPuerto aereoPuerto[]= new AereoPuerto[num];
  static   String nombreAereopuerto;
   static AereoPuerto aero;

    public static void main(String[] args) {

        //Insertar datos de los aereopuertos
      insertarDataosAereopurto(aereoPuerto);
      menu();
    }
    public  static  void insertarDataosAereopurto(AereoPuerto aero[]){
        aero[0]=new AereoPuertoPublico("JOAQUIN VALDEZ","Lima","Peru",8000000);
        aero[0].insertarComapñia(new Compañia("AereoPeru"));
        aero[0].insertarComapñia(new Compañia("LATAM"));
        aero[0].getCompañia("AereoPeru").insertarVuelo(new Vuelo("IB20","Lima","CDMX",150.90,150));
        aero[0].getCompañia("AereoPeru").insertarVuelo(new Vuelo("IB21","LIMA","BJS",190.08,120));
        aero[0].getCompañia("LATAM").insertarVuelo(new Vuelo("FC12","Lima","Paris",450.90,180));
        aero[0].getCompañia("AereoPeru").getVuelo("IB20").insertarPasajero(new Pasajero("CHUZ","20384","Mexicana"));
        aero[0].getCompañia("AereoPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Maria","39721","Mexicana"));
        aero[0].getCompañia("LATAM").getVuelo("FC12").insertarPasajero(new Pasajero("Raul","jh162","Español"));
        aero[1]=new AereoPuertoPrivado("Mexico T1","CDMX","Mexico");
        aero[1].insertarComapñia(new Compañia("AereoPeru"));
        aero[1].insertarComapñia(new Compañia("LATAM"));
        aero[1].getCompañia("AereoPeru").insertarVuelo(new Vuelo("IB20","Lima","CDMX",150.90,150));
        aero[1].getCompañia("AereoPeru").insertarVuelo(new Vuelo("IB21","LIMA","BJS",190.08,120));
        aero[1].getCompañia("LATAM").insertarVuelo(new Vuelo("FC12","Lima","Paris",450.90,180));
        aero[1].getCompañia("AereoPeru").getVuelo("IB20").insertarPasajero(new Pasajero("CHUZ","20384","Mexica"));
        aero[1].getCompañia("AereoPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Maria","39721","Mexicana"));
        aero[1].getCompañia("LATAM").getVuelo("FC12").insertarPasajero(new Pasajero("Raul","jh162","Español"));




    }
    public static  void menu(){
      int opcion;
      do{
        System.out.println("\t Menu");
        System.out.println("1. Ver aereopuertos gestionados (Publicos o Privados)");
        System.out.println("2. Ver empresas(Privado) o subvencios(Publico");
        System.out.println("3. Lista de compañias de un Aereopuerto");
        System.out.println("4. Lista de vuelos por comapñia");
        System.out.println("5. Listar posibles vuelos de Oriegen a Destino");
        System.out.println("6. Salir");
        System.out.println("Opcion: ");
        opcion=sc.nextInt();

        switch (opcion){
          case 1:  mostrarDatosAereopurtos(aereoPuerto); break;
          case 2: mostrarPatrocinio(aereoPuerto); break;
          case 3:
              sc.nextLine();
              System.out.println("Didige el nombre del aereopuerto: ");
                nombreAereopuerto=sc.next();
                aero=buscarAereopuerto(nombreAereopuerto,aereoPuerto);
                if (aero==null){
                    System.out.println("Aereopuerto no existe");
                } else {
                //    mostratCompalia(aero);
                }

              break;
          case 4: break;
          case 5: break;
          case 6: break;
          default:
            System.out.println("Error see quivo de opcion de menu");

        }
        System.out.println("");

      } while (opcion!=6);
    }

    public static  void mostrarDatosAereopurtos(AereoPuerto aereoouertos[]){
      for (int i = 0; i <aereoouertos.length ; i++) {
          if (aereoouertos[i] instanceof  AereoPuertoPrivado ){
            System.out.println("Es un aereoPuerto Privado. ");
            System.out.println("Nombre: "+aereoouertos[i].getNombre());
            System.out.println("Ciudad: "+aereoouertos[i].getCiudad());
            System.out.println("Pais: "+aereoouertos[i].getPais());
          } else {
            System.out.println("Es un aereoPuerto Publico. ");
            System.out.println("Nombre: "+aereoouertos[i].getNombre());
            System.out.println("Ciudad: "+aereoouertos[i].getCiudad());
            System.out.println("Pais: "+aereoouertos[i].getPais());

          }

            
      }
    }

    public static  void mostrarPatrocinio(AereoPuerto aereoPuerto[]){
        String empresas[];
        for (int i = 0; i <aereoPuerto.length ; i++) {
            if (aereoPuerto[i] instanceof AereoPuertoPrivado){
                System.out.println("Areopurto Privado: "+aereoPuerto[i].getNombre());
                 empresas=((AereoPuertoPrivado)aereoPuerto[i]).getListaempresas();
                System.out.println("Empresas: ");
                for (int j = 0; j <empresas.length ; j++) {
                    System.out.println(empresas[j]);
                }
            }    else{
                System.out.println("AereoPuerto Publico: "+aereoPuerto[i].getNombre());
                System.out.println("SUbvencion"+((AereoPuertoPublico)aereoPuerto[i]).getSubvencion());
            }
            System.out.println("");
        }
    }

    public static  AereoPuerto  buscarAereopuerto(String nombre, AereoPuerto aereoPuerto[]){
        boolean encontrado = false;
        int i=0;
        AereoPuerto aereo = null;
        while((!encontrado)&&  i<aereoPuerto.length){
            if (nombre.equals(aereoPuerto[i].getNombre())){
            encontrado=true;
            aereo=aereoPuerto[i];
            }
            i++;
        }
        return aereo;

    }

    public static  void mostratCompalia(AereoPuerto aereoPuerto){
        System.out.println("\n las compañias del aerorpurto: "+aereoPuerto.getNombre());
        for (int i = 0; i <aereoPuerto.getNumCompañia() ; i++) {
            System.out.println(aereoPuerto.getCompañia(i).getNombre());
        }
    }

}
