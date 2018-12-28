
package store;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Store{

   public Connection con = null;
    public static void main(String[] args) {
        Store store1 = new Store();
        store1.createConnection();
        store1.createTables();
        new Home().setVisible(true);
        
    }
    public Connection createConnection(){
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/store", "root", "");
        }
        catch (ClassNotFoundException ex){
            Logger.getLogger(Store.class.getName()).log(Level.SEVERE,null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    void createTables(){
       try {
           Statement stm = null;
           stm = con.createStatement();
           
           String sql = "CREATE TABLE IF NOT EXISTS users" +
                   "(id INTEGER not NULL AUTO_INCREMENT, " +
                   " username VARCHAR(255), " + 
                   " email VARCHAR(255) UNIQUE, " +
                   " password VARCHAR(255), " +
                   " role VARCHAR(255) not NULL, " +
                   " PRIMARY KEY ( id ))";
           String sql1 = "CREATE TABLE IF NOT EXISTS products" +
                   "(id INTEGER not NULL AUTO_INCREMENT, " +
                   " name VARCHAR(255) UNIQUE, " + 
                   " type VARCHAR(255), " +
                   " price INTEGER not NULL DEFAULT 0.0, " +
                   " description VARCHAR(255), " +
                   " PRIMARY KEY ( id ))";
           String sql2 = "CREATE TABLE IF NOT EXISTS cart" +
                   "(id INTEGER not NULL AUTO_INCREMENT, " +
                   " name VARCHAR(255) UNIQUE, " + 
                   " type VARCHAR(255), " +
                   " price INTEGER not NULL DEFAULT 0, " +
                   " quantity INTEGER not NULL DEFAULT 0, " +
                   " PRIMARY KEY ( id ))";
           
           String sql3 = "CREATE TABLE IF NOT EXISTS sales" +
                   "(id INTEGER not NULL AUTO_INCREMENT, " +
                   " name VARCHAR(255) , " + 
                   " type VARCHAR(255), " +
                   " price INTEGER not NULL DEFAULT 0, " +
                   " quantity INTEGER not NULL DEFAULT 0, " +
                   " PRIMARY KEY ( id ))";
           String admin = "INSERT IGNORE INTO users(username, email, password, role) "
                   + "VALUES('admin','admin@gmail.com', '[a, d, m, i, n]', 'admin')";
           stm.executeUpdate(sql);
           stm.executeUpdate(sql1);
           stm.executeUpdate(sql2);
           stm.executeUpdate(sql3);
           stm.executeUpdate(admin);
       } catch (SQLException ex) {
           Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

    
}
