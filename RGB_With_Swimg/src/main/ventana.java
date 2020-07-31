package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.nio.channels.NotYetBoundException;

public class ventana extends JFrame {
    private JPanel panel;
    private JLabel etiqueta;
    private JButton rojo , verde , azul;
    private int pulsado=0;
    private int contadorRojo=0 , contadorVerde=0, contadorAzul=0;
    public ventana(){
        setSize(600,400);
        setTitle("Ejerciico RGB");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        inicarComponentes();
    //sobre el panel
        eventoRuedaRaton();
    }

    private void eventoRuedaRaton() {
        MouseWheelListener evento = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent mouseWheelEvent) {
                if(pulsado!=0){ //se ha pulsado un boton
                    if (pulsado==1){
                        contadorRojo+=mouseWheelEvent.getWheelRotation();
                        if (contadorRojo<0){
                            contadorRojo=0;
                        }
                        if(contadorRojo>255){
                            contadorRojo=255;
                        }
                    }else if(pulsado==2){
                        contadorVerde+=mouseWheelEvent.getWheelRotation();
                        if (contadorVerde<0){
                            contadorVerde=0;
                        }
                        if(contadorVerde>255){
                            contadorVerde=255;
                        }

                    }else{
                        contadorAzul+=mouseWheelEvent.getWheelRotation();
                        if (contadorAzul<0){
                            contadorAzul=0;
                        }
                        if(contadorAzul>255){
                            contadorAzul=255;
                        }

                    }
                }
                etiqueta.setText("Color Rojo: "+contadorRojo+", Color Verde: "+
                        contadorVerde+", Color AZUL: "+contadorAzul);
                panel.setBackground(new Color(contadorRojo,contadorVerde,contadorAzul));
            }
        };
        panel.addMouseWheelListener(evento);


    }

    private void inicarComponentes() {
    colocarPanel();
     colocarEtiqueta();
     colocarBotones();

    }

    private void colocarBotones() {
        /*
        pulsado->1 rojo
        pulsado->2 verde
        pulsado->3 azul
        */


        rojo= new JButton("Rojo");
        rojo.setBounds(50,230,130,50);
        rojo.setForeground(Color.red);
        rojo.setFont(new Font("arial rounded mt bold",0,20));
        panel.add(rojo);
        rojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
             pulsado=1;
            }
        });

        verde= new JButton("Verde");
        verde.setBounds(230,230,130,50);
        verde.setForeground(Color.green);
        verde.setFont(new Font("arial rounded mt bold",0,20));
        panel.add(verde);
        verde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                pulsado=2;
            }
        });

        azul= new JButton("Azul");
        azul.setBounds(410,230,130,50);
        azul.setForeground(Color.blue);
        azul.setFont(new Font("arial rounded mt bold",0,20));
        panel.add(azul);
        azul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                pulsado =3;
            }
        });
    }

    private void colocarEtiqueta() {
    etiqueta= new JLabel("Color (ROJO , VERDE , AZUL) ");
    etiqueta.setBounds(70,30,500,50);
    etiqueta.setFont(new Font("arial",0,20));
    //centramos
      etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
    panel.add(etiqueta);

    }

    private void colocarPanel() {
        panel= new JPanel();
        panel.setLayout(null);//desabilita el estilo por defecto
        this.add(panel);

    }
}
