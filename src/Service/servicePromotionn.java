/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entites.promotion;
import Utils.Maconnexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Servi.servicePromotion;


/**
 *
 * @author dell
 */
public class servicePromotionn implements servicePromotion{
    Connection cnx;
    List<promotion> promotions=new ArrayList<>();

    public servicePromotionn(){
    cnx=Maconnexion.getInstance().getCnx()  ;
    }
    
   

    @Override
    public List<promotion> afficherpromotion ()throws SQLException {
        
            Statement stm=cnx.createStatement();
       
    String query="SELECT * FROM `promotion`";
            ResultSet rst=stm.executeQuery(query);
            
                  List<promotion> promotions=new ArrayList<>();
        while(rst.next())
        {
        promotion c=new promotion();
        c.setpromotion_id(rst.getInt("promotion_id"));
        c.setvalue(rst.getString("value"));
        
        promotions.add(c);
        }
        
        
        
     
    return promotions;
    }



    @Override
    public void Addpromotion(promotion c) throws SQLException {
 try {
            Statement stm=cnx.createStatement();
       
        String query="INSERT INTO `promotion`(`value`) VALUES ('"+c.getvalue()+"')";
      
        stm.executeUpdate(query);
        
        } catch (SQLException ex) {
            Logger.getLogger(servicePromotionn.class.getName()).log(Level.SEVERE, null, ex);
        }       }

   @Override
    public void UpdatePromotion(promotion c) throws SQLException {
            Statement stm=cnx.createStatement();
       
        String query="UPDATE promotion SET value= '"+c.getvalue()+"'  WHERE promotion_id='"+c.getpromotion_id()+"'";
      
        
        
        stm.executeUpdate(query);    }

   
    @Override
    public void DeletePromotion(int id) throws SQLException {
 try {
            Statement stm=cnx.createStatement();
       
        String query="DELETE FROM `promotion` WHERE  promotion_id = '"+ id+"'";
      
        stm.executeUpdate(query);
        
        } catch (SQLException ex) {
            Logger.getLogger(servicePromotionn.class.getName()).log(Level.SEVERE, null, ex);
        }       }

   

   
    
}
