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
public class RoomManagerGUI extends ManagerGUI {

    /**
     * Initializes the controller class.
     */
    
  
    @FXML
    private  Button show_empty_rooms;
    
    @FXML
    private Button show_expiring_reservation;
    
    @FXML
    private Button assign_room_to_client;
    
    @FXML
    private Button get_room_number_request;
    
    @FXML 
    private VBox casinoBox ;
    
     public RoomManagerGUI() throws IOException{
        super();
        FXMLLoader loader = new FXMLLoader(RoomManagerGUI.class.getResource("/resortmanager/fxml/FXMLRoomManager.fxml"));
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

            String value = prop.getProperty("roomManager_show_empty_rooms");
            if(value.equals("false")){
                show_empty_rooms.setDisable(true);
            }
            value = prop.getProperty("roomManager_show_expiring_reservation");
            if(value.equals("false")){
                show_expiring_reservation.setDisable(true);
            }            
            value = prop.getProperty("roomManager_assign_room_to_client");
            if(value.equals("false")){
                 assign_room_to_client.setDisable(true);
            }
            value = prop.getProperty("roomManager_get_room_number_request");
            if(value.equals("false")){
                 get_room_number_request.setDisable(true);
            }
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
