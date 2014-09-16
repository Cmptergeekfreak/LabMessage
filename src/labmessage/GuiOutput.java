/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labmessage;

import javax.swing.JOptionPane;

/**
 *
 * @author Joe
 */
public class GuiOutput implements MessageOutput {
   
    @Override
    public void outPutMessage(String message) {
       System.out.println("Retrieving your message-");
       JOptionPane.showMessageDialog(null, message);
    } 
}
