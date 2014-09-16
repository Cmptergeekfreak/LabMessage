/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labmessage;

import java.util.Random;

/**
 *
 * @author Joe
 */
public class DatabaseInput implements MessageInput {
    
    FakeDateBase fakebs = new FakeDateBase();
    private String message;
    
      @Override
    public String retrieveMessage() {
        Random rand = new Random();
        int num = rand.nextInt(4);
        message = fakebs.getFakeMessage(num);
        return message;
    }

    @Override
    public void setMessage(String message) {
      this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
    
}
