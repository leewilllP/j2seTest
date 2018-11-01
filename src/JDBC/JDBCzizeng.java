package JDBC;

import java.sql.*;

public class JDBCzizeng {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String sql = "INSERT INTO hero VALUES (null,?,?,?)";
        try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                "root","admin");
            PreparedStatement ps = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ){
            ps.setString(1,"盖伦");
            ps.setFloat(2,313.0f);
            ps.setInt(3,100);

            ps.execute();
            //
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()){
                int id = rs.getInt(1);
                System.out.println(id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
