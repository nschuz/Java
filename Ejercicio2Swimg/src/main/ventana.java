package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventana extends JFrame {
private  JPanel panel;
private  JLabel imagen;
private  String [] ruta;
private JRadioButton radioButton;
private JRadioButton radioButton2;
private JRadioButton radioButton3;
private ButtonGroup grupoRadioBotones;

    public ventana (){
        setBounds(50,50,500,500);
        setTitle("Eventos");
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        colocarPanel();
        checkBoxes();
        colocarImagen();


    }

    private void colocarImagen() {
        ruta = new String[3];
        ruta[0]="src/main/download.jpg";
        ruta[1]="src/main/futbol-1-e1550783405750.jpg";
        ruta[2]="src/main/tennis.jpg";
        imagen= new JLabel();
        imagen.setBounds(200,100,200,200);

        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                imagen.setIcon(new ImageIcon(ruta[2]));
            }
        };
        radioButton2.addActionListener(oyente);

        ActionListener oyente2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                imagen.setIcon(new ImageIcon(ruta[1]));
            }
        };
        radioButton.addActionListener(oyente2);

        ActionListener oyente3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                imagen.setIcon(new ImageIcon(ruta[0]));
            }
        };
        radioButton3.addActionListener(oyente3);

        if (radioButton.isSelected()){

            imagen.setIcon(new ImageIcon(ruta[1]));
        }else if (radioButton2.isSelected()){
            imagen.setIcon(new ImageIcon(ruta[2]));
        }else {
            imagen.setIcon(new ImageIcon(ruta[0]));
        }


        panel.add(imagen);
    }

    private void checkBoxes() {
        radioButton = new JRadioButton("Futbol", false);
        radioButton.setBounds(50,100,100,50);
        radioButton.setActionCommand("Futbol");
        panel.add(radioButton);



        radioButton2 = new JRadioButton("Tenis",false);
        radioButton2.setBounds(50,150,100,50);
        radioButton2.setActionCommand("Tenis");
        panel.add(radioButton2);

        radioButton3 = new JRadioButton("F1",false);
        radioButton3.setBounds(50,200,100,50);
       radioButton3.setActionCommand("F1");
        panel.add(radioButton3);

        grupoRadioBotones = new ButtonGroup();
        grupoRadioBotones.add(radioButton);
        grupoRadioBotones.add(radioButton2);
        grupoRadioBotones.add(radioButton3);


    }

    private void colocarPanel() {
        panel= new JPanel();
        panel.setLayout(null);
        this.add(panel);

        //eventoDeMoviemintoDeRaton();
        //eventoDeLaReudaDeRaton();
    }

}
