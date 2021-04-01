/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author dell
 */
public class Maconnexion {
     String url="jdbc:mysql://localhost:3306/contactmsg";
    String login="root";
     String pwd="";
    
    public static Maconnexion mac;
    private  Connection cnx;
    
    
    private Maconnexion(){
    
        try {
            cnx=DriverManager.getConnection(url,login,pwd);
            System.out.println("Connexion etablie");
        } catch (SQLException ex) {
            System.out.println("Pas de connexion");
        }
    }


    public static Maconnexion  getInstance(){
        if(mac==null)
        {
           mac=new Maconnexion();
        }
        return mac; 
   
    }


    
    public Connection getCnx(){
        return cnx;
    }

   


}
