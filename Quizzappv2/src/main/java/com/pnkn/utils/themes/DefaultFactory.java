/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pnkn.utils.themes;

import com.pnkn.quizzappv2.App;

/**
 *
 * @author admin
 */
public class DefaultFactory extends ThemeAbtractFactory{

    @Override
    public String getStyleSheet() {
    return App.class.getResource("qizzappStyle.css").toExternalForm();
    }
    
}
