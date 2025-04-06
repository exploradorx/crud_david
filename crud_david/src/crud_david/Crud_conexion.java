/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud_david;

import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author GAMING
 */
public class Crud_conexion {
    
    Connection conectar = null;
    
    String usuario = "root";
    String contraseña = "root";
    String bd = "senati";
    String ip = "localhost";
    String puerto = "3306";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection estableceConexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena,usuario,contraseña);
            JOptionPane.showMessageDialog(null, "La Conexion se ha realizado con exito");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos, err: "+ e.toString());
        }
        return conectar;
    }
}
