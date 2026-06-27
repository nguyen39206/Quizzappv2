package com.pnkn.quizzappv2;

import com.pnkn.utils.MyAlertSingleton;
import com.pnkn.utils.MyStageSingleton;
import com.pnkn.utils.themes.ThemeTypes;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;



public class PrimaryController implements Initializable{
    
    @FXML private ComboBox<ThemeTypes> cbThemes;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbThemes.setItems(FXCollections.observableArrayList(ThemeTypes.values()));
    }
   
    public void QuanLyCauHoi(ActionEvent e){
        MyStageSingleton.getInstance().showStace("Question");
    }
     public void luyenThi(ActionEvent e){
        MyAlertSingleton.getInstance().ShowMsg("luyen thi");
    }
      public void LuyenTap(ActionEvent e){
        MyAlertSingleton.getInstance().ShowMsg("luyen tap");
    }        
    public void changeTheme(ActionEvent e){
        this.cbThemes.getSelectionModel().getSelectedItem().updateTheme(this.cbThemes.getScene());
    }
    

}
