/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file03;
import javax.swing.JOptionPane;

/**
 *
 * @author miguel
 */
public class File03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        String nombre = JOptionPane.showInputDialog(null, "Introduce tu nombre");
        JOptionPane.showMessageDialog(null, "Saludos "+nombre);
    }
    
}
