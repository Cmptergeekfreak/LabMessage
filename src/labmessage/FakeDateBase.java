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
public class FakeDateBase {
      private String messages[] = {"Today at ten.",
        "I have made my lunch and ready to go to work.",
        "Your friend is waiting in front of the entrance.",
        "Please vaccum the stairs and clean your room if you want to hangout tonight!"};
    
    
    public String getFakeMessage(int randNumber){
        return messages[randNumber];
    } 
    
}
