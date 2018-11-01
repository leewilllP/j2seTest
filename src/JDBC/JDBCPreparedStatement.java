package JDBC;

import java.sql.*;

public class JDBCPreparedStatement {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String sql = "INSERT INTO hero VALUES (null,?,?,?)";
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                "root","admin");
             // 根据sql语句创建PreparedStatement
             PreparedStatement ps = c.prepareStatement(sql);
        ){
            for (int i = 0; i<10000;i++){
                String s = "hero"+i;
                ps.setString(1,s);
                ps.setFloat(2,313.0f);
                ps.setInt(3,50);
                ps.execute();
            }

           /* // 设置参数
            ps.setString(1,"提莫");
            ps.setFloat(2,313.0f);
            ps.setInt(3,50);
            // 执行
            ps.execute();*/
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
