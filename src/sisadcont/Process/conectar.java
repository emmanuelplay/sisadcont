
package sisadcont.Process;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class conectar {
    Connection conectar=null;
    public  Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://10.0.0.201/sisadcontdb","root","vs1051");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.print(e.getMessage());//PONER MENSAJE DE ERROR DE CONEXION 
        }
        return conectar;
    }
    
    public boolean ejecutarSQL(String sql)
{
   try {
      Statement sentencia = conectar.createStatement();
      sentencia.executeUpdate(sql);
   } catch (SQLException ex) {
      ex.printStackTrace();
   return false;
   }
 
   return true;
}
   
    
    public ResultSet ejecutarSQLSelect(String sql)
{
   ResultSet resultado;
   try {
      Statement sentencia = conectar.createStatement();
      resultado = (ResultSet) sentencia.executeQuery(sql);
   } catch (SQLException ex) {
      ex.printStackTrace();
      return null;
   }
 
   return resultado;
}
    
    
    public static void close(Connection rs) {

        try {

            if (rs != null) {

                rs.close();

            }

        } catch (Exception e) {

            System.out.println("Error al cerrar conexión " + e);

        }

    }
    
    
}

