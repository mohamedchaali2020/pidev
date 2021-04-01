/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pidevapp;

import Entites.coupon;
import Service.serviceCouponn;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.sql.SQLException;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 *
 * @author dell
 */
public class FXMLDocumentController1 implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField tfmsg;
   
    @FXML
    private TextField idd;
    @FXML
    private Label label1;
    @FXML
    private Label labelAffiche;
    @FXML
    private Label label2;
    @FXML
    private TextField idd1;
    
    @FXML
    private Label label3;
   


    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ajoutercoupon(ActionEvent event)throws SQLException {   
        
        Service.serviceCouponn sc=new serviceCouponn();
        coupon c=new coupon();
        
        c.setvalue(tfmsg.getText()); 
        c.setcoupon_key(idd1.getText()); 
        sc.Addcoupon(c);
               
            
    }

    @FXML
    private void supprimercoupon(ActionEvent event)throws SQLException {
        int i;   
        serviceCouponn sc=new serviceCouponn();
                i=Integer.parseInt(idd.getText());
               
              sc.DeleteCoupon(i);

    
    }

    @FXML
    private void modifiercoupon(ActionEvent event)throws SQLException {
    int i;
                coupon c=new coupon();
    i=Integer.parseInt(idd.getText());
    c.setcoupon_id(i);
    c.setcoupon_key(idd1.getText()); 
    c.setvalue(tfmsg.getText());
            serviceCouponn sc=new serviceCouponn();

              sc.UpdateCoupon(c);
    
    }

    @FXML
    private void affichercoupon(ActionEvent event) throws SQLException {
        serviceCouponn sc=new serviceCouponn();
        labelAffiche.setText(sc.affichercoupon().toString());
    }
    
    
}
