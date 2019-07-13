/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kstock;

/**
 *
 * @author Mayur
 */
public class KStock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainStock frame= new MainStock();           
                frame.setExtendedState(MainStock.MAXIMIZED_BOTH);
                frame.setVisible(true);
                //new Login().setVisible(true);
            }
        });
        
    }
    
}
