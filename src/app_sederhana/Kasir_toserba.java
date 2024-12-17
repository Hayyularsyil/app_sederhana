package app_sederhana;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Kasir_toserba {
    String jdbcDriver = "com.mysql.cj.jdbc.Driver"; // Perbarui driver
    String dbUrl = "jdbc:mysql://localhost:8111/db_toserba?useSSL=false";
    String user = "root";
    String pass = "";
    Connection con;
    Statement stmt;

    public static void main(String[] args) {
        Kasir_toserba app = new Kasir_toserba();
        app.koneksi();
    }

    public void koneksi() {
        try {
            Class.forName(jdbcDriver);
            con = DriverManager.getConnection(dbUrl, user, pass);
            stmt = con.createStatement();
            System.out.println("Koneksi berhasil!");
        } catch (ClassNotFoundException ex) {
            System.out.println("Class Error: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Error Koneksi: " + ex.getMessage());
        }
    }
}
