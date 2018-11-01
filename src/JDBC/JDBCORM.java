package JDBC;

import OOP.Hero;

import java.sql.*;

public class JDBCORM {
    public static Hero get(int id) {
        /*
        * ORM=Object Relationship Database Mapping

          对象和关系数据库的映射

          简单说，一个对象，对应数据库里的一条记录
        */
        Hero hero = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                "root","admin"); Statement s = c.createStatement();) {
            String sql = "SELECT *FROM hero WHERE id="+id;
            ResultSet rs = s.executeQuery(sql);

            if (rs.next()){
                hero = new Hero();
                String name = rs.getString(2);
                float hp = rs.getFloat("hp");
                hero.name = name;
                hero.id = id;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hero;
    }

    public static void main(String[] args) {
        Hero h = get(20);
        System.out.println(h.name);
    }
}
