

package pidevapp;
import Service.serviceSubscribee;
import Entites.subscribe;

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
public class FXMLDocumentController3 implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField tfmsg;
    @FXML
    private Label labelAffiche;
    @FXML
    private TextField idd;
    @FXML
    private TextField idd1;
    @FXML
    private TextField idd2;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ajoutersubscribe(ActionEvent event)throws SQLException {   
        
        Service.serviceSubscribee sc=new serviceSubscribee();
       subscribe c=new  subscribe();
        c.setmail(tfmsg.getText()); 
        c.setNom(idd1.getText());
        c.setPrenom(idd2.getText());
        sc.Addsubscribe(c);
               
            
    }

    @FXML
    private void supprimersubscribe(ActionEvent event)throws SQLException {
        int i;   
        serviceSubscribee sc=new serviceSubscribee();
                i=Integer.parseInt(idd.getText());
               
              sc.DeleteSubscribe(i);

    
    }

    @FXML
    private void modifiersubscribe(ActionEvent event)throws SQLException {
    int i;
                subscribe c=new subscribe();
    i=Integer.parseInt(idd.getText());
    c.setid(i);
    c.setmail(tfmsg.getText());
    c.setNom(idd1.getText());
        c.setPrenom(idd2.getText());
            serviceSubscribee sc=new serviceSubscribee();

              sc.UpdateSubscribe(c);
    
    }

    @FXML
    private void affichersubscribe(ActionEvent event) throws SQLException {
        serviceSubscribee sc=new serviceSubscribee();
        labelAffiche.setText(sc.affichersubscribe().toString());
    }
    
    
}
