package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLOutput;

public class ventana extends  JFrame {
    private JTextField cajaTexto;
    private JButton boton;
    private JPanel panel;
    private  JLabel saludo;
    private  JTextArea  areatexto;

    public ventana (){
        setBounds(50,50,500,500);
        setTitle("Eventos");
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        colocarPanel();
        //colocarEtieuqta();
        colocarCaja();
       //colocarBoton();
        colocarTextArea();
       // colocarBoton2();
    }

    private void colocarTextArea() {
        areatexto= new JTextArea();
        areatexto.setBounds(100,200,200,200);
        panel.add(areatexto);
        evnetosDeTeclado();
    }

    private void evnetosDeTeclado() {
        KeyListener oyente = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {
                areatexto.append("KeyTyped\n");
                //catacter unicode no admite alt ctrl
            }

            @Override
            public void keyPressed(KeyEvent keyEvent) {
            areatexto.append("KeyPressed\n");
            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {
                areatexto.append("KeyRealesed");
                if (keyEvent.getKeyChar()=='P'){
                    System.out.println("Letra P");
                }
                if (keyEvent.getKeyChar()=='\n'){
                    System.out.println("Enter");
                }
            }
        };
        cajaTexto.addKeyListener(oyente);
    }

    private void colocarBoton() {
            boton= new JButton("Pulse");
                boton.setBounds(250,100,150,40);
                boton.setFont(new Font("arial",0,15));
                panel.add(boton);
        
                saludo= new JLabel();
                saludo.setBounds(50,200,300,40);
                panel.add(saludo);
        
                //Action listener
              // oyenteBoton();
             // oyenteRaton();

    }

    private void oyenteRaton() {

        MouseListener oyenteraton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                areatexto.append("Mouse Cliked\n");
                if (mouseEvent.isAltDown()){
                    areatexto.append("AlT");
                }else if (mouseEvent.isControlDown()){
                    areatexto.append("CTRL");
                }else if (mouseEvent.isShiftDown()){
                    areatexto.append("SHFIT");
                }
                if (mouseEvent.getClickCount()==2){
                    areatexto.append("Doble Click");
                }
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                //areatexto.append("Mouse Pressed\n");
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
            //areatexto.append("Mouse Released\n");
            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                //areatexto.append("Mouse Entered\n");
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
               // areatexto.append("Mouse Exited\n");
            }
        };
        boton.addMouseListener(oyenteraton);
    }

    private  void oyenteBoton(){

        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                saludo.setText("Hola "+cajaTexto.getText());
            }
        };
        boton.addActionListener(oyente);

    }

    private void colocarBoton2() {
        boton= new JButton("Borre ");
        boton.setBounds(250,200,150,40);
        boton.setFont(new Font("arial",0,15));
        panel.add(boton);

        saludo= new JLabel();
        saludo.setBounds(50,200,300,40);
        panel.add(saludo);

        //Action listener
        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                saludo.setText("");
            }
        };
        boton.addActionListener(oyente);

    }


    private void colocarCaja() {
    cajaTexto= new JTextField();
    cajaTexto.setBounds(30,50,300,30);
    panel.add(cajaTexto);
    }

    private void colocarEtieuqta() {
    JLabel etqueita = new JLabel("Ingrese nombre: ");
    etqueita.setBounds(30,10,200,30);
    etqueita.setFont(new Font("arial",Font.BOLD,20));
   panel.add(etqueita);
    }

    private void colocarPanel() {
        panel= new JPanel();
        panel.setLayout(null);
        this.add(panel);

        //eventoDeMoviemintoDeRaton();
        //eventoDeLaReudaDeRaton();
    }

    private void eventoDeLaReudaDeRaton() {
        MouseWheelListener oyente = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent mouseWheelEvent) {
                areatexto.append("Moviendo la rueda del raton\n");
                if (mouseWheelEvent.getPreciseWheelRotation()==-1){
                    System.out.println("Rueda Hacia arriba");
                }
                if (mouseWheelEvent.getPreciseWheelRotation()==1){
                    System.out.println("Rueda hacia abajo");
                }

            }
        };
        panel.addMouseWheelListener(oyente);
    }

    private void eventoDeMoviemintoDeRaton() {
        MouseMotionListener oyenteMovieminto = new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent mouseEvent) {
                areatexto.append("mouseDaggred\n");
            }

            @Override
            public void mouseMoved(MouseEvent mouseEvent) {
                areatexto.append("mouseMoved\n");
            }
        };
        panel.addMouseMotionListener(oyenteMovieminto);
    }


}
