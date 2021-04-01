/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entites.subscribe;
import Utils.Maconnexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Servi.serviceSubscribe;


/**
 *
 * @author dell
 */
public class serviceSubscribee implements serviceSubscribe{
    Connection cnx;
    List<subscribe> subscribes=new ArrayList<>();

    public serviceSubscribee(){
    cnx=Maconnexion.getInstance().getCnx()  ;
    }
    
   

    @Override
    public List<subscribe> affichersubscribe ()throws SQLException {
        
            Statement stm=cnx.createStatement();
       
    String query="SELECT * FROM `subscribe`";
            ResultSet rst=stm.executeQuery(query);
            
                  List<subscribe> subscribes=new ArrayList<>();
        while(rst.next())
        {
        subscribe c=new subscribe();
        c.setid(rst.getInt("id"));
        c.setNom(rst.getString("Nom"));
        c.setPrenom(rst.getString("Prenom"));
        c.setmail(rst.getString("mail"));
        
        subscribes.add(c);
        }
        
        
        
     
    return subscribes;
    }



    @Override
    public void Addsubscribe(subscribe c) throws SQLException {
 try {
            Statement stm=cnx.createStatement();
       
        String query="INSERT INTO `subscribe`(`nom`, `prenom` , `mail`) VALUES ('"+c.getNom()+"','"+c.getPrenom()+"','"+c.getmail()+"')";
      
        stm.executeUpdate(query);
        
        } catch (SQLException ex) {
            Logger.getLogger(serviceSubscribee.class.getName()).log(Level.SEVERE, null, ex);
        }       }

   @Override
    public void UpdateSubscribe(subscribe c) throws SQLException {
            Statement stm=cnx.createStatement();
       
        String query="UPDATE subscribe SET nom= '"+c.getNom()+"'  , prenom ='"+c.getPrenom()+"'  , mail ='"+c.getmail()+ "'WHERE id='"+c.getid()+"'";
      
        
        
        stm.executeUpdate(query);    }

   
    @Override
    public void DeleteSubscribe(int id) throws SQLException {
 try {
            Statement stm=cnx.createStatement();
       
        String query="DELETE FROM `subscribe` WHERE  id = '"+ id+"'";
      
        stm.executeUpdate(query);
        
        } catch (SQLException ex) {
            Logger.getLogger(serviceSubscribee.class.getName()).log(Level.SEVERE, null, ex);
        }       }

   

   
    
}
