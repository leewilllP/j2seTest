package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {
    public static void main(String[] args) {
        //Connection c = null;
        //Statement s = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        try (
                Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                "root","admin");
                Statement s = c.createStatement()
        ){

            System.out.println("获取Statement对象"+s);
            for (int i = 1;i<=100;i++){
                String name ="'hero"+i+"'";
                //建表
                String sql =("CREATE TABLE hero (\n" +
                        "  id int(11) AUTO_INCREMENT,\n" +
                        "  name varchar(30) ,\n" +
                        "  hp float ,\n" +
                        "  damage int(11) ,\n" +
                        "  PRIMARY KEY (id)\n" +
                        ")  DEFAULT CHARSET=utf8;");
                //增加
                String sql_insert = ("INSERT INTO hero VALUE (null,"+name+","+313.0f+","+50+")");
                //删除
                String sql_delete = ("DELETE FROM hero WHERE id > 1");
                //修改
                String sql_update = ("update hero set name = '提莫' where id = 1");
                s.executeUpdate(sql_insert);
                int sa = s.executeUpdate(sql_insert);

                s.execute(sql_insert);
               // s.execute(sql_delete);
               // s.execute(sql_update);
            }

            System.out.println("执行插入语句成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }/*finally {
            // 数据库的连接时有限资源，相关操作结束后，养成关闭数据库的好习惯
            // 先关闭Statement
            if (s != null)
            try {
                s.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            // 后关闭Connection
            if (c != null)
            try {
                c.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }*/
    }
}
