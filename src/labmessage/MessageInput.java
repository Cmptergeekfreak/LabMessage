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
public interface MessageInput {
    
    public abstract String retrieveMessage();
    
    public abstract void setMessage(String message);
    
    public abstract String getMessage();
}
