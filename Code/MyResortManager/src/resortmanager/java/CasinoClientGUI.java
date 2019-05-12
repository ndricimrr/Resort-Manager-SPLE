/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resortmanager.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Ndricim Rrapi
 */
public class CasinoClientGUI extends ClientGUI{

    /**
     * Initializes the controller class.
     */
    
     public CasinoClientGUI() throws IOException{
        super();
        FXMLLoader loader = new FXMLLoader(CasinoClientGUI.class.getResource("/resortmanager/fxml/FXMLCasinoClient.fxml"));
        loader.setRoot((getClientBox()));
        loader.setController(this);
        loader.load();
//        setConfigurations();
    }
     
    
}
