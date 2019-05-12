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
public class CasinoManagerGUI extends ManagerGUI {

    /**
     * Initializes the controller class.
     */
    @FXML 
    private VBox casinoBox ;
    
    @FXML
    private Button create_auction;
        
    @FXML
    private Button change_policy;
    
    @FXML
    private Button request_security;
     
    @FXML
    private Button manage_taxes;
    
    @FXML
    private Button manage_bids;
        
    
     public CasinoManagerGUI() throws IOException{
        super();
        FXMLLoader loader = new FXMLLoader(CasinoManagerGUI.class.getResource("/resortmanager/fxml/FXMLCasinoManager.fxml"));
        loader.setRoot((getManagerBox()));
        loader.setController(this);
        loader.load();
        setConfigurations();
    }
     
    private void setConfigurations(){
         try (InputStream input = new FileInputStream("config.properties")) {
            Properties prop = new Properties();
            // load a properties file
            prop.load(input);
           
            String value = prop.getProperty("casinoManager_create_auction");
              System.out.println(value);
            if(value.equals("false")){
               
                create_auction.setDisable(true);
            }
            value = prop.getProperty("casinoManager_change_policy");
            if(value.equals("false")){
                change_policy.setDisable(true);
            }            
            value = prop.getProperty("casinoManager_request_security");
            if(value.equals("false")){
                 request_security.setDisable(true);
            }
            value = prop.getProperty("casinoManager_manage_taxes");
            if(value.equals("false")){
                 manage_taxes.setDisable(true);
            }
            value = prop.getProperty("casinoManager_manage_bids");
            if(value.equals("false")){
                 manage_bids.setDisable(true);
            }
                        
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
 
}
