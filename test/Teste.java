
import java.util.concurrent.TimeUnit;
import views.Main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Teste {
    
    public static void main(String []args) throws InterruptedException{
        
        Main main = new Main();
        
        main.setVisible(true);
        
        System.out.println("abriu");
        
        TimeUnit.SECONDS.sleep(2);
        
        System.out.println("esperei");
        
        main.dispose();
        
        System.out.println("fechei");
        
        
    }
    
}
