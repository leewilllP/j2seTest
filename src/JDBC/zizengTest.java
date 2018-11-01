package JDBC;

import java.sql.*;

public class zizengTest {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String sql = "INSERT INTO hero VALUES (null,?,?,?)";
        try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                "root","admin");
            PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            Statement s = c.createStatement();){

            ps.setString(1,"狗东西");
            ps.setFloat(2,313.0f);
            ps.setInt(3,50);
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();

            int id = -1;
            if (rs.next()){
                id = rs.getInt(1);
            }
            System.out.println("刚才插入的数据是"+id);
            for (int i = id -1;i>0;i++){
                int targetId = i;
                ResultSet rs2 = s.executeQuery("select id from Hero where id = " + targetId);
                if (rs2.next()){
                    System.out.println("id="+targetId+"的数据存在，删除该数据");
                    c.setAutoCommit(false);
                    String deleteSql = "delete from hero where id = "+ targetId;
                    s.execute(deleteSql);
                    c.commit();
                    break;
                }

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
