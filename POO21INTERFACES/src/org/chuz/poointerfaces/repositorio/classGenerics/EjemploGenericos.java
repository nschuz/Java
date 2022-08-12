package org.chuz.poointerfaces.repositorio.classGenerics;

public class EjemploGenericos {


    public static <T> void  imprimirCambion (Camion<T> camion){
        for (T o : camion){

            if (o instanceof Animal) {
                System.out.println(((Animal) o).getNombre()+ "  tipo: "+ ((Animal) o).getTipo());
            }

            else if (o instanceof  Automovil){
                System.out.println(((Automovil) o).getMarca());
            }

            else if (o instanceof Maquinaria){
                System.out.println(((Maquinaria) o).getTipo());
            }

        }

    }


    public static void main(String[] args) {



        //vemsoq ue camio no es uan lista ni nada se puede ietar prque impleta la interfaz iterable
        //list es iterable
        Camion<Animal> trasnporteCaballos = new Camion<>(5);
        trasnporteCaballos.add(new Animal("Peregrino", "Caballo"));
        trasnporteCaballos.add(new Animal("grillo", "caballo"));
        trasnporteCaballos.add(new Animal("Tuquen", "caballo"));
        trasnporteCaballos.add(new Animal("Lgontoma", "caballo"));

        imprimirCambion(trasnporteCaballos);


        Camion<Maquinaria> transMaquinas = new Camion<>(3);
        transMaquinas.add(new Maquinaria("bulldozer"));
        transMaquinas.add(new Maquinaria("Gruas Horquilla"));
        transMaquinas.add(new Maquinaria("Perfodora"));


        for (Maquinaria o : transMaquinas){
            System.out.println(o.getTipo());
        }


        Camion<Automovil> transAuto = new Camion<>(3);
        transAuto.add(new Automovil("Toyota"));
        transAuto.add(new Automovil("Mitsubishi"));
        transAuto.add(new Automovil("chevrolet"));


        for (Automovil a : transAuto){
            System.out.println(a.getMarca());
        }






    }



}
