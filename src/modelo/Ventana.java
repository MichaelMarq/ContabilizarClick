
package modelo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;




public class Ventana extends JFrame{
    
   
    //Atributos
    
    private JPanel panel;
    private JLabel etiqueta;
    private JButton boton;
    private int contador = 0;
    
    //Ventana
    
    public Ventana(){
        
        //Dimension de la ventana
        this.setSize(400, 400);
        this.setTitle("Contabilizar click");
        //Posicion de la ventana
        this.setLocationRelativeTo(null);
        
        //Inicializar los componentes
        iniciarComponentes();
        
        //Cerrar la ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      
    }
    
    //Iniciar Componentes
    private void iniciarComponentes(){
        agregarPanel();
        agregarEtiqueta();
        agregarBoton();
    }
    
    
    //Agregar el panel
    private void agregarPanel(){
        panel = new JPanel();
        
        panel.setLayout(null);
        
        this.getContentPane().add(panel);
    }
    
    //agregar etiqueta
    private void agregarEtiqueta(){
        etiqueta = new JLabel("Pulsa el boton");
        etiqueta.setLayout(null);
        etiqueta.setBounds(0, 50, 400, 20);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setFont(new Font("arial", 0, 20));
        
        panel.add(etiqueta);
    }
    
    //Agregar boton
    private void agregarBoton(){
        boton = new JButton("Pulsa Aqui!");
        boton.setBounds(130, 200, 150, 50);
        boton.setFont(new Font("Serif",0,20));
        panel.add(boton);
        
        
        //Llamar al evento
        eventoOyenteDeAccion();
        
    }
    
    //Metodo del evento del boton
    private void eventoOyenteDeAccion(){
        ActionListener evento = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador++;
                
                if(contador == 1){
                    etiqueta.setText("Boton pulsado "+contador+" vez ");
                }
                else{
                    etiqueta.setText("Boton pulsado "+contador+" veces ");
                }

            }
        };
        
        boton.addActionListener(evento);
    }
    
    
    
}
