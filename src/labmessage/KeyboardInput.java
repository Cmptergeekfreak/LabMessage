/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labmessage;

import java.util.Scanner;

/**
 *
 * @author Joe
 */
public class KeyboardInput implements MessageInput {
    
    Scanner keyboard = new Scanner(System.in);
        
    private String message;
    
    
    
    //this method has the user actually enter a message, then sets it to the "message" variable
    @Override
    public String retrieveMessage(){
        System.out.println("Using the keyboard, please enter a message: ");
        setMessage(keyboard.nextLine());
        return message;
    }

    
    @Override
    public String getMessage() {
        return message;
    }
    
    
    @Override
    public void setMessage(String message) {
        this.message = message;
    }
    
}
