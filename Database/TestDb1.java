import java.sql.*;
public class TestDb1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/Example";
            String username = "root";
            String password = "password";
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            String query = "update student set age=15 where name='John'";
            stmt.executeUpdate(query);
            con.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}