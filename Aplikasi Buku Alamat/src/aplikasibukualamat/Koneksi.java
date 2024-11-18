/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasibukualamat;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class Koneksi {
    private static final String DB = "jdbc:mysql://localhost/buku_alamat";
    
    public static java.sql.Connection getKoneksi(){
        java.sql.Connection con = null;
        
        MysqlDataSource data = new MysqlDataSource();
        data.setUser("root");
        data.setPassword("");
        data.setURL(DB);
        try {
            con = data.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
}
