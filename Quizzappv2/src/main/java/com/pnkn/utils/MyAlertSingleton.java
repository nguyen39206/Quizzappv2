/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pnkn.utils;

import javafx.scene.control.Alert;

/**
 *
 * @author admin
 */
public class MyAlertSingleton {
    private static MyAlertSingleton instance;
    private final Alert alert;
    private MyAlertSingleton(){
        this.alert =new Alert(Alert.AlertType.INFORMATION);
        this.alert.setTitle("Qizzapp");
        this.alert.setHeaderText("Qizzapp");
        
    }
    
    public static MyAlertSingleton getInstance(){
        if(instance==null)
            instance=new MyAlertSingleton();
        return instance;
    }
    public void ShowMsg(String content){
        alert.setContentText(content);
        alert.show();
    }
}
