package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ventana extends JFrame {

    private JButton boton;
    private JPanel panel;
    private  JLabel saludo;
    private  int contador=0;

    public ventana (){
        setBounds(50,50,500,500);
        setTitle("Eventos");
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        colocarPanel();
        iniciarSaludo();
        inciarBoton();
    }

    private void inciarBoton() {
        boton = new JButton();
    boton.setBounds(50,200,100,70);
    boton.setText("Click ");
    panel.add(boton);

        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                contador++;
                saludo.setText(contador+" Veces Clikeado");
            }
        };

    boton.addActionListener(oyente);

    }

    private void iniciarSaludo() {
        saludo= new JLabel();
        saludo.setText("Hola ");
        saludo.setBounds(50,50, 100,100);
        saludo.setFont(new Font("arial",Font.BOLD,15));
        panel.add(saludo);
    }

    private void colocarPanel() {
        panel= new JPanel();
        panel.setLayout(null);
        this.add(panel);

        //eventoDeMoviemintoDeRaton();
        //eventoDeLaReudaDeRaton();
    }
}
