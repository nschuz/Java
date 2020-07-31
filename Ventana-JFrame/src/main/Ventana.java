package main;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Ventana extends JFrame {
 //creamos un panel
          public JPanel panel = new JPanel();
    public Ventana (){
        this.setSize(500,500);//etsblaecemos el ancho de la mentana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//terminale porcesos cuando lo cerramos
        this.setTitle("Ventana"); // le damos un titulo al ala ventana
        //this.setLocation(500,200); //centamos la ventana en la pantalla
        //this.setBounds(500,200,500,500);
        this.setLocationRelativeTo(null);//establcemos la ventana en el centro de la ventana
        //redimensionarl el tmaño de la ventana
        this.setResizable(false);
        this.setMinimumSize(new Dimension(200,200));
        //darle colores
        this.getContentPane().setBackground(Color.DARK_GRAY);
        // this.setCursor(new Cursor(CROSSHAIR_CURSOR)); //modifcaamos el curos
        inciarComponentes();

    }

    //sobre el panel podemos poner imagnes , colores , botones , etc
    // es recomendable poner paeles sobre la ventana
    private void inciarComponentes(){


        colocarPnanes();
        //colocarEtiquetas();
        //colocarBotones();
        //colorcarRadiosBotones();
        // colocarBotonesDeActivacion();
        // colocarCajasDeTetxo();
        //colocarArearDeTexto();
         //colocarCheckBox();
        //colocarListaDesplegables();
         //colocarCampoContraseña();
        // colocraTablas();
            colocarListas();


    }

    private void colocarListas() {
        DefaultListModel modelo = new DefaultListModel();

        modelo.addElement(new Pesona("Chuz",20,"Mexico"));
        modelo.addElement(new Pesona("Chuz",20,"Mexico") );

        JList lista = new JList(modelo);
        lista.setBounds(20,20,200,300);
        panel.add(lista);
        JScrollPane scroll = new JScrollPane(lista,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(20,20,200,300);
        panel.add(scroll);

    }

    private void colocraTablas() {

        String []personas={"Chuz" , "20", "Mexicano"};
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Nacionalidad");
        modelo.addRow(personas);

        JTable tabla = new JTable(modelo);
        tabla.setBounds(20,20,300,200);
        panel.add(tabla);
    JScrollPane scroll =new  JScrollPane(tabla,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    scroll.setBounds(20,20,300,200);
    panel.add(scroll);
    }

    private void colocarCampoContraseña() {


        JPasswordField campo  = new JPasswordField();
    campo.setBounds(20,20,150,30);
    panel.add(campo);
   String contraseña="Programacion";
        for (int i = 0; i <campo.getPassword().length ; i++) {
            contraseña+=campo.getPassword()[i];
        }
    System.out.println("Contraseña: "+contraseña);

    }

    private void colocarListaDesplegables() {
       /*
        String paise []= {"Mexico" , "EUA" ,"Francia" ,"Italia"};
        JComboBox listaDesplegable1 = new JComboBox(paise);
        listaDesplegable1.setBounds(20,20,100,30);
        listaDesplegable1.addItem("Belgica");
       listaDesplegable1.setSelectedItem("EUA");//Poen la opcion
        panel.add(listaDesplegable1);
*/

       Pesona persona1 = new Pesona("Alejandro" ,22,"Mexicano" );
       Pesona personas[] = new Pesona[2];
       personas [0]= new Pesona("Chuz",20,"Mexicano");
       personas [1]= new Pesona("Chuz",20,"Mexicano");
       DefaultComboBoxModel modelo = new DefaultComboBoxModel();
       JComboBox lista2  = new JComboBox(modelo);
       lista2.setBounds(20,20,100,30);
        for (int i = 0; i <personas.length ; i++) {
            modelo.addElement(personas[i].getNombre());
        }
       panel.add(lista2);



    }


    //checkboxes
    private void colocarCheckBox() {
        JCheckBox casillaDeVerificacion = new JCheckBox("Opcion 1");
        casillaDeVerificacion.setBounds(20,20,100,40);
        panel.add(casillaDeVerificacion);

        JCheckBox casillaDeVerificacion2 = new JCheckBox("Opcion 1");
        casillaDeVerificacion2.setBounds(20,50,100,40);
        panel.add(casillaDeVerificacion2);

        JCheckBox casillaDeVerificacion3 = new JCheckBox("Opcion 1");
        casillaDeVerificacion3.setBounds(20,80,100,40);
        panel.add(casillaDeVerificacion3);

        JCheckBox casillaDeVerificacion4 = new JCheckBox("Opcion 1");
        casillaDeVerificacion4.setBounds(20,110,100,40);
        panel.add(casillaDeVerificacion4);


    }

    private void colorcarRadiosBotones() {
        JRadioButton radioButton = new JRadioButton("Opcion 1",true);
        radioButton.setBounds(50,100,100,50);
        radioButton.setEnabled(false);
        panel.add(radioButton);

        JRadioButton radioButton2 = new JRadioButton("Opcion 2",false);
        radioButton2.setBounds(50,150,100,50);
        panel.add(radioButton2);

        ButtonGroup grupoRadioBotones = new ButtonGroup();
        grupoRadioBotones.add(radioButton);
        grupoRadioBotones.add(radioButton2);

    }

    private void colocarPnanes(){
        setVisible(true);
        this.getContentPane().add(panel);//agregamos el panel a la ventana
        panel.setBackground(Color.lightGray);

        //descativamos el panel por defacto el estilo por deffecto
        panel.setLayout(null); //Desactivamos la etiqeuta

    }

    private void colocarBotones (){
        //Boton 1 Boton de texto
        JButton boton =new JButton();
        boton.setText("Click");
        boton.setEnabled(true);
        boton.setBounds(120,120,100,40);
        panel.add(boton);
        boton.setMnemonic('a');//alt +a
        boton.setForeground(Color.blue);
        boton.setFont(new Font("arial", Font.BOLD, 20) );

        //Boton 2 Tipo Imagen
        JButton boton2 = new JButton();
        boton2.setBounds(180, 180, 100, 40);
        panel.add(boton2);
        boton2.setOpaque(true);//Doy permiso a que puedan cambiar de fonfo
        boton2.setBackground(Color.BLUE);
        boton2.setForeground(Color.white);
        ImageIcon imagen = new ImageIcon("main/descarga.png");
        boton2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(100,40, Image.SCALE_SMOOTH)));

        //Boton 3 - boton de bordes
        JButton boton3 = new JButton();
        boton3.setBounds(250,250,110,50);
       boton3.setBorder(BorderFactory.createLineBorder(Color.BLUE,3, true));
        panel.add(boton3);



    }


    public void colocarEtiquetas (){
   ///Etiqueita 1 TIpo Texto
        // damos ele texto y los centramos horizontalmnte
        JLabel etiqueta = new JLabel("Hola",SwingConstants.CENTER);//creamos etiqeuta
        //etiqueta.setText("Hola");
        etiqueta.setBounds(10,10,100,150);
        panel.add(etiqueta);//agregamos la etiqeuta al panel
        etiqueta.setForeground(Color.white);//cambiamos el color de la letas
        //cambiar el fondo
        etiqueta.setBackground(Color.black);
        //tengo que desactivar el diseño por defecto
        etiqueta.setOpaque(true);

        //Cambiar la ubicacion del texto
        //Establcemos a la alineacion horizontal
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);

        //Modificar la fuente de texto
        etiqueta.setFont(new Font("chiller",Font.BOLD, 20));

        //2,Etiqeuta tipo Imagen
        ImageIcon imagen = new ImageIcon("EW18NxLWkAAk2Q6.jpg");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setIcon( new ImageIcon(imagen.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH)));
        etiqueta2.setBounds(10,80,100,100);
        panel.add(etiqueta2);
    }

    //JToggleButton
    public void colocarBotonesDeActivacion(){
        JToggleButton botonActivar1 = new JToggleButton("Opcion1 ",true);
        botonActivar1.setBounds(50,50,100,50);
        panel.add(botonActivar1);

        JToggleButton botonActivar2 = new JToggleButton("Opcion1 ",false);
        botonActivar2.setBounds(50,100,100,50);
        panel.add(botonActivar2);

        JToggleButton botonActivar3 = new JToggleButton("Opcion1 ",false);
        botonActivar3.setBounds(50,150,100,50);
        panel.add(botonActivar3);

        ButtonGroup grupobotones = new ButtonGroup();
        grupobotones.add(botonActivar1);
        grupobotones.add(botonActivar2);
        grupobotones.add(botonActivar3);

    }

    //cajas de texto de una sola linea (formularios)

private void colocarCajasDeTetxo (){
        JTextField cajaTexto = new JTextField();
        cajaTexto.setBounds(50,50,100,30);
        cajaTexto.setText("Hola");
        panel.add(cajaTexto);
        System.out.println("Texto en la caja: "+cajaTexto.getText());
}

//crear Areas de texto JTextArea

    private void colocarArearDeTexto(){
        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(20,20,300,200);
        panel.add(areaTexto);
        areaTexto.setText("Esciba el texto aqui");
        //añidri mas texto
        areaTexto.append("\nhola guapo");
        areaTexto.setEditable(true);
        System.out.println("Texto "+areaTexto.getText());

        //Barras de desplezamiento vertical y horizontal
        JScrollPane barrasDesplazamiento = new JScrollPane(areaTexto,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barrasDesplazamiento.setBounds(20,20,300,200);
       // barrasDesplazamiento.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
       // barrasDesplazamiento.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        panel.add(barrasDesplazamiento);

    }

    //casillas de verificacion cjeck box




}
