package persistentobject;
/**
 * File : MySQLPersonDAO.java 06/06/23
 * Penulis : Muhammad Akmal Iskandar - 24060121140094
 * Deskripsi : implementasi PersonDAO untuk MySQL
 */
import java.sql.*;
class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pbo", "root", "");
        String query = "INSERT INTO person(name) VALUES ('" + name + "')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        con.close();
    }
}