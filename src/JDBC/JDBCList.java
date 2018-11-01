package JDBC;

import java.sql.*;

public class JDBCList {

    public static void list(int start, int count){

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                "root","admin");Statement s = c.createStatement();) {
            String sql = "select * from hero limit "+ start + "," + count;
            s.execute(sql);
            ResultSet resultSet = s.getResultSet();
            while (resultSet.next()){
                System.out.print(resultSet.getInt("id")+"\t");
                System.out.print(resultSet.getString(2)+"\t");
                System.out.print(resultSet.getFloat("hp")+"\t");
                System.out.println(resultSet.getInt(4));
            }
            //ResultSet resultSet = s.executeQuery(sql);

            /*while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString(2);
                float hp = resultSet.getFloat("hp");
                int damage = resultSet.getInt(4);
                System.out.printf("%d\t%s\t%f\t%d\n", id, name, hp, damage);
            }*/
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        list(0,5);
    }
}
