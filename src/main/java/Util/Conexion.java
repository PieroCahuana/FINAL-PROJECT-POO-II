package Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public Conexion(){}
    public static Connection ObtenerConexion(){
    Connection cn = null; //Creando la variable Conexion
    try{
    Class.forName("com.mysql.jdbc.Driver");
    cn =DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema","root","");
    System.out.println("Conexion exitosa!!!");
    }
    catch(Exception ex){
        System.out.println("Error al conectar con la BD" +
        ex.getMessage());
    }
        return cn;//si hay una Conexion
    }
}
