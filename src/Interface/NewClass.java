/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ckk
 */
public class NewClass {
    
    public static void main(String[] args) {
      JFrame frame= new JFrame();
      frame.setTitle("calculatrice");
      frame.setSize(350, 300);
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      JPanel panel= new JPanel();
      panel.setBackground(Color.YELLOW);
       frame.setContentPane(panel);
       
       JLabel a=new JLabel("Nombre");
      frame.getContentPane().add(a);
      JTextField b= new JTextField(25);
      frame.getContentPane().add(b);
       
      JLabel c=new JLabel("Nombre2");
      frame.getContentPane().add(c);
      JTextField d= new JTextField(25);
      frame.getContentPane().add(d);
      JLabel e= new JLabel("Resultat");
      frame.getContentPane().add(e);
      JTextField f=new JTextField(25);
      frame.getContentPane().add(f);
      
      JButton g=new JButton("Additionner");
      frame.getContentPane().add(g);
      
      frame.setVisible(true);
      
      g.addActionListener(h->{
      
    int i,j,z;
i=Integer.parseInt(b.getText());
j=Integer.parseInt(d.getText());

z=i+j;
f.setText(""+z);
    
    
      
      
    });
      
      
        
        
    }
   
    
    
}
