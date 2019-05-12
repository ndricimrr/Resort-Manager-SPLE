/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resortmanager.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javafx.scene.image.Image;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import resortmanager.java.CasinoManagerGUI;
import javafx.stage.Stage;

/**
 *
 * @author Ndricim Rrapi
 */
public class MainEngine extends Application {
    public  Stage stage;
    private Image icon;
    private final String ROOM_MANAGER       = "RoomManager";
    private String userType                 = ROOM_MANAGER;
    private final String CASINO_MANAGER     = "CasinoManager";
    private final String RESTAURANT_MANAGER = "RestaurantManager";
    private final String RESTAURANT_CLIENT = "RestaurantClient";
    private final String CASINO_CLIENT = "CasinoClient";
    private final String ROOM_CLIENT = "RoomClient";
    
    public MainEngine(){
        icon = new Image(MainEngine.class.getResource("/resortmanager/images/icon.png").toExternalForm());
    }
 
    @Override
    public void start(Stage stage) throws Exception {
      
        // Configurations
        setConfigurations();
        
        ParentGUI user = new RestaurantClientGUI();
        if(userTypeIs(ROOM_MANAGER)){
            user = new RoomManagerGUI();
        }else if(userTypeIs(CASINO_MANAGER)){
            user = new CasinoManagerGUI();
        }else if(userTypeIs(RESTAURANT_MANAGER)){
            user = new RestaurantManagerGUI();
        }else if(userTypeIs(RESTAURANT_CLIENT)){
            user = new RestaurantClientGUI();
        }else if(userTypeIs(CASINO_CLIENT)){
            user = new CasinoClientGUI();
        }else if(userTypeIs(ROOM_CLIENT)){
            user = new RoomClientGUI();
        }else{ 
             user = new RoomManagerGUI(); // by default
        }
        Scene scene = new Scene(user, 500, 500);
            
        stage.setTitle("ResortManager 1.0");
        stage.getIcons().add(icon ); 
        
        // Maximize Window
        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();
        stage.setX(bounds.getMinX());
        stage.setY(bounds.getMinY());
        stage.setWidth(bounds.getWidth());
        stage.setHeight(bounds.getHeight());

        
        stage.setScene(scene);
        stage.show();
        
        // Set initial configs
        setConfigurations();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public void setConfigurations(){
         try (InputStream input = new FileInputStream(("config.properties"))) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            setUserType(prop.getProperty("userType"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    private void setUserType(String type){
        userType = type;
    }
    
    
    private boolean userTypeIs(String type){
        if(userType.equals(type)){
            return true;
        }
        return false;
    }
    
    
}
