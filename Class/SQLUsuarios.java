
package Class;

import java.sql.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SQLUsuarios extends Conexion {
        
    public boolean registrar (User usr){
        
     PreparedStatement ps = null;
     Connection con = getConexion();
      
       
     String sql ="INSERT INTO usuarios (nombre, apellidos,username,pass,email,telefono) VALUES(?,?,?,?,?,?)";
     
        try {   
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, usr.getNombre());
            ps.setString(2, usr.getApellidos());
            ps.setString(3, usr.getUsername());
            ps.setString(4, usr.getPass());
            ps.setString(5, usr.getEmail());
            ps.setString(6, usr.getTelefono());
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(SQLUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        
            return false;
        }
     
    }

    
}
