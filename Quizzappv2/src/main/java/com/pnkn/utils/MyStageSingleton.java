/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pnkn.utils;

import com.pnkn.quizzappv2.App;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author admin
 */
public class MyStageSingleton {
    private static MyStageSingleton instance;
    private final Stage stage;
    private MyStageSingleton() {
        this.stage =new Stage();
        stage.setTitle("Quizz App Question");
        
    }
    
    public static MyStageSingleton getInstance(){
        if(instance==null)
            instance = new MyStageSingleton();
        return instance;
    }
    public void showStace(String fxml){
        if (!this.stage.isShowing()){
            try {
                Scene scene=new Scene(new FXMLLoader(App.class.getResource(fxml+".fxml")).load());
                this.stage.setScene(scene);
                this.stage.show();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            
        }
            
    }
}
