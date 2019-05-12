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
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPaneBuilder;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Ndricim Rrapi
 */
public class ParentGUI extends VBox implements Initializable{

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private VBox parentBox ;
    @FXML
    private  Button show_empty_rooms;
     
    public ParentGUI() throws IOException{
        FXMLLoader loader = new FXMLLoader(ParentGUI.class.getResource("/resortmanager/fxml/FXMLParentGUI.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        loader.load();
    }
      
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    protected final VBox getParentBox() {
        return parentBox ;
    }

    
    
    
}
