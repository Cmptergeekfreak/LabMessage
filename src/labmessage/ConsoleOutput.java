/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labmessage;

/**
 *
 * @author Joe
 */
public class ConsoleOutput implements MessageOutput {

  @Override
    public void outPutMessage(String message) {
        System.out.println("Retrieved the following message-");
        System.out.println(message);
    }
      
    
}
