package JDBC;

import java.sql.*;

public class resulTest {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                "root","admin");
            Statement s = c.createStatement();
        ){
            String sql = "SELECT * FROM hero";
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString(2);
                float hp = rs.getFloat("hp");
                int damage = rs.getInt(4);
                System.out.printf("%d\t%s\t%f\t%d%n",id,name,hp,damage);
            }
                } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
