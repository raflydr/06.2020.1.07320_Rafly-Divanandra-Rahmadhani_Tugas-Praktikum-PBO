/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gudangsepatugui07320;
import java.sql.*;
import javax.swing.JOptionPane;

public class Koneksi07320 {
    private static Connection KoneksiDatabse;
    public static Connection koneksiDB() throws SQLException {
        try {
            String DB ="jdbc:mysql://localhost/db_datasepatu";
            String user="root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            KoneksiDatabse = (Connection) DriverManager.getConnection(DB,user,pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Can't Connect","Error",
                    JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
            System.exit(0);
        }
        return KoneksiDatabse;
    }
    
}
