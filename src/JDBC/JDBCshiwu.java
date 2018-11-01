package JDBC;
/*
* 没写完
* */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCshiwu {
    public static void main(String[] args) {
    shiwu();
    }
    private static void shiwu(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        int id = 1;
        String sql = "DELETE FROM hero WHERE id = "+id;
        try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                "root","admin");
            Statement s = c.createStatement()){
                for (int i = 1; i<=10;i++){
                    System.out.println("试图删除 id="+i+"的数据");
                }
            System.out.println("是否要删除数据 Y/N");
            Scanner scanner = new Scanner(System.in);
            String s1 = scanner.nextLine();
            js:
            if (s1=="Y")
                s.execute("DELETE FROM hero WHERE id = "+id);
            if (s1=="N")
                System.out.println("SB");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
