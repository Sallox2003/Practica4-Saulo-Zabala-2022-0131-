
package Class;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
       
    private final String base="login_java_mysql";
    private final String user="root";
    private final String password="";
    private final String url="jdbc:mysql://localhost:3306/"+base;
    
    private Connection con = null;

    public  Connection getConexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,password);
            JOptionPane.showMessageDialog(null, "Connected to Database");
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
