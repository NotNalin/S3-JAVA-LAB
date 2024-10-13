import java.sql.*;
class TestDb{
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/Example";
            String user = "root";
            String password = "password";
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("select * from person");
            while(rs.next())
                System.out.println(rs.getString(1) + " " + rs.getInt(2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}