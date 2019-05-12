/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resortmanager.java;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Ndricim Rrapi
 */
public class RoomClientGUI extends ClientGUI{

    /**
     * Initializes the controller class.
     */
   public RoomClientGUI() throws IOException{
        super();
        FXMLLoader loader = new FXMLLoader(RoomClientGUI.class.getResource("/resortmanager/fxml/FXMLRoomClient.fxml"));
        loader.setRoot((getClientBox()));
        loader.setController(this);
        loader.load();
//        setConfigurations();
    }
    
}
