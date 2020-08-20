package main;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        int opcion=0,el;
        Lista lista = new Lista();


        do {

            try {
               opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"1.Agregar un elemnto al inicio\n 2.Mostrat los adtos de la lista" +
                       "\n3.Agregar un elemnto al final de la lista"+"\n4.Eliminar elemnto al inicio "+
                       "\n 5.Salir"));
            switch (opcion){
                case 1:
                    try {
                        el=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el Elemento: "));
                  //Agregando al nodo
                    lista.agregarAlInicio(el);
                    }catch (NumberFormatException n){
                        System.out.println(n);
                    }
                    break;
                case 2:
                    System.out.println("");
                    lista.mostrarLista();
                    break;
                case 3:
                    try {
                        el=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el Elemento: "));
                        //Agregando al nodo
                        lista.agregarAlFinal(el);
                    }catch (NumberFormatException n){
                        System.out.println(n);
                    }
                    break;

                case 4:
                    el= lista.borrarInicio();
                    System.out.println("El elemto eliminado es: "+el);
                    break;

                case 5:
                    break;
                default:
                    System.out.println("Error");
            }

            }catch (Exception e){
                System.out.println(e);

            }

        }while (opcion!=5);
    }
}
