/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.helper;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */
public class RedimencionarImagem {
    public ImageIcon redimensionar(JLabel jLabel, int xLargura, int yAltura){
       
        ImageIcon img = new ImageIcon (jLabel.getIcon().toString());  
        //img.setImage(img.getImage().getScaledInstance(xLargura, yAltura, Image.S));
       
        return img;
    }
}
