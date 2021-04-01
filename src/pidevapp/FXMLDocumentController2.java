/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pidevapp;

import Entites.promotion;
import Service.servicePromotionn;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.sql.SQLException;

/**
 *
 * @author dell
 */
public class FXMLDocumentController2 implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField tfmsg;
    @FXML
    private Label labelAffiche;
    @FXML
    private TextField idd;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ajouterpromotion(ActionEvent event)throws SQLException {   
        
        Service.servicePromotionn sc=new servicePromotionn();
       promotion c=new promotion();
        c.setvalue(tfmsg.getText()); 
        sc.Addpromotion(c);
               
            
    }

    @FXML
    private void supprimerpromotion(ActionEvent event)throws SQLException {
        int i;   
        servicePromotionn sc=new servicePromotionn();
                i=Integer.parseInt(idd.getText());
               
              sc.DeletePromotion(i);

    
    }

    @FXML
    private void modifierpromotion(ActionEvent event)throws SQLException {
    int i;
                promotion c=new promotion();
    i=Integer.parseInt(idd.getText());
    c.setpromotion_id(i);
    c.setvalue(tfmsg.getText());
            servicePromotionn sc=new servicePromotionn();

              sc.UpdatePromotion(c);
    
    }

    @FXML
    private void afficherpromotion(ActionEvent event) throws SQLException {
        servicePromotionn sc=new servicePromotionn();
        labelAffiche.setText(sc.afficherpromotion().toString());
    }
    
    
}
