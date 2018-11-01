package JDBC;
import JDBC.sql;
/*
* 查询账号密码
* */
import java.sql.*;

public class passw{
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try(
                Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","admin");
                Statement s = c.createStatement();
        ){
            String cer = ("CREATE TABLE user (\n" +
                    "  id int(11) AUTO_INCREMENT,\n" +
                    "  name varchar(30) ,\n" +
                    "  password varchar(30),\n" +
                    "  PRIMARY KEY (id)\n" +
                    ") ;\n" +
                    "insert into user values(null,'dashen','thisispassword');");
            String name = "dashen";
            String password = "thisispassword1";
            String sqls = "select * from user where name = '"+name+"' and password = '"+password+"'";
            String sql = "select count(*) FROM  hero";
            ResultSet res = s.executeQuery(sql);
            int total = 0;
            while (res.next()) {
                total = res.getInt(1);
            }
            System.out.println(total);
            ResultSet rs = s.executeQuery(sqls);
            if (rs.next()){
                System.out.println("密码正确");
            }else {
                System.out.println("密码错误");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
