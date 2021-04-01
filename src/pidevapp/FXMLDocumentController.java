/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pidevapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;

/**
 *
 * @author mohamed
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField txtm1;

    

    @FXML
    private TextField txtm2;

    @FXML
    private TextField txtavg;

    @FXML
    private TextField txttot;

    @FXML
    private TextField txtgrade;

    @FXML
    private Button btncal;

    @FXML
    private Button btnclair;

    @FXML
    void Cal(ActionEvent event) {

   
        
        
        int m1,m2,tot ;
        int avg ;
        String grade ;
        
        m1 = Integer.parseInt(txtm1.getText()) ;
        m2 = Integer.parseInt(txtm2.getText()) ;
        
        tot= (int) (m1+(m2*2));
        txttot.setText(String.valueOf(tot));
        avg = tot/3 ;
        txtavg.setText(String.valueOf(avg));
        
        
        if (avg >= 10)
            {
                grade = "Admis (e)" ;
            }
        else
            {
                grade ="refusé (e) " ;
            }
        txtgrade.setText(grade);

    }
   
    
    
    

    @FXML
    void clear(ActionEvent event) {
        txtm1.setText("");
        txtm2.setText("");
       
        txttot.setText("");
        txtavg.setText("");
        txtgrade.setText("");
        txtm1.requestFocus();
    
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
