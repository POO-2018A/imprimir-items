/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author chalosalvador
 */
public class ListaCompras extends JFrame{

    private JButton btn_anadir;
    private JTextField txt_item;
    private JPanel pnl_nuevo;
    private JLabel lbl_item;
    
    public ListaCompras(){
        super("Lista de compras");
        setLayout(new BorderLayout());
        
        pnl_nuevo = new JPanel(new FlowLayout());
        
        txt_item = new JTextField(10);
        pnl_nuevo.add(txt_item, BorderLayout.NORTH);
        
        btn_anadir = new JButton("Añadir");
        pnl_nuevo.add(btn_anadir);
        
        add(pnl_nuevo, BorderLayout.NORTH);
        
        lbl_item = new JLabel();
        add(lbl_item, BorderLayout.SOUTH);
        
        ManejadorBoton manejador = new ManejadorBoton();
        btn_anadir.addActionListener(manejador);
        
    }
    
    private class ManejadorBoton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String content = lbl_item.getText();
            lbl_item.setText(content + "\n" +  txt_item.getText());
        }
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaCompras lc = new ListaCompras();
        lc.setDefaultCloseOperation(EXIT_ON_CLOSE);
        lc.setSize(400,400);
        lc.setVisible(true);
    }
    
}
