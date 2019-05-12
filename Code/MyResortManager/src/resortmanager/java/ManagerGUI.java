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
public class ManagerGUI extends ParentGUI {

    @FXML 
    private VBox managerChild ;
    
    @FXML 
    private VBox managerMain ;
    
    public ManagerGUI() throws IOException{
        super();
        FXMLLoader loader = new FXMLLoader(ManagerGUI.class.getResource("/resortmanager/fxml/FXMLManager.fxml"));
        loader.setRoot((getParentBox()));
        loader.setController(this);
        loader.load();
    }
      
    /**
     * Initializes the controller class.
     */
    
     protected final VBox getManagerBox() {
        return managerChild ;
    }
  
    
}
