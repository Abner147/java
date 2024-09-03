/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author hp
 */
public class Conexion {
    public final String puerto= "3306";
    public final String db="db_empresa2";
    public final String urlConexion = String.format("jdbc:mysql://localhost:%s/%s?serverTimezone=UTC",puerto,db);
    public final String usuario = "root";
    public final String contraseña = "Abner741";
    public final String jdbc = "com.mysql.cj.jdbc.Driver";
    public Connection conexionBD;
    public void abrir_conexion(){
    try{
        Class.forName(jdbc);
        conexionBD=DriverManager.getConnection(urlConexion,usuario,contraseña);
        System.out.println("Conexion Exitosa :)");
    } catch(ClassNotFoundException | SQLException ex){
        System.out.println("Algo salio mal :("+ ex.getMessage());
    }
    }
    public void cerrar_conexion(){
    try{
        conexionBD.close();
    } catch(SQLException ex){
        System.out.println("Algo salio mal :("+ ex.getMessage());
    }
    }
}
