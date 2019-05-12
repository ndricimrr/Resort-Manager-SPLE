/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resortmanager.java;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Ndricim Rrapi
 */
public class ClientGUI extends ParentGUI{

    /**
     * Initializes the controller class.
     */
    @FXML 
    private VBox clientChild ;
    
    @FXML 
    private VBox managerMain ;
    
    public ClientGUI() throws IOException{
        super();
        FXMLLoader loader = new FXMLLoader(ClientGUI.class.getResource("/resortmanager/fxml/FXMLClient.fxml"));
        loader.setRoot((getParentBox()));
        loader.setController(this);
        loader.load();
    }
      
    /**
     * Initializes the controller class.
     */
    
     protected final VBox getClientBox() {
        return clientChild ;
    } 
    
}
