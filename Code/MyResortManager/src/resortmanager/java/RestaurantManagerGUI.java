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
public class RestaurantManagerGUI extends ManagerGUI {

    /**
     * Initializes the controller class.
     */
      
    @FXML
    private  Button check_empty_tables;
    
    @FXML
    private Button check_number_of_reservations;
    
    @FXML
    private Button check_cooking_equipment;
    
    @FXML
    private Button get_table_request;
    
    @FXML
    private Button change_menu;
    
    @FXML 
    private VBox casinoBox ;
    
     public RestaurantManagerGUI() throws IOException{
        super();
        FXMLLoader loader = new FXMLLoader(RestaurantManagerGUI.class.getResource("/resortmanager/fxml/FXMLRestaurantManager.fxml"));
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

            String value = prop.getProperty("restaurantManager_check_empty_tables");
            if(value.equals("false")){
                check_empty_tables.setDisable(true);
            }
            value = prop.getProperty("restaurantManager_check_number_of_reservations");
            if(value.equals("false")){
                check_number_of_reservations.setDisable(true);
            }            
            value = prop.getProperty("restaurantManager_check_cooking_equipment");
            if(value.equals("false")){
                 check_cooking_equipment.setDisable(true);
            }
            value = prop.getProperty("restaurantManager_get_table_request");
            if(value.equals("false")){
                 get_table_request.setDisable(true);
            }
            value = prop.getProperty("restaurantManager_change_menu");
            if(value.equals("false")){
                change_menu.setDisable(true);
            }
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
