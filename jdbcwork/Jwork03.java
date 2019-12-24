package jdbcwork;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Jwork03 {
    public static void main(String[] args) throws SQLException {
        List list = new ArrayList();
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/day2_homework?useSSL=false&serverTimezone=UTC";
            con = DriverManager.getConnection(url, "root", "CJY_123");
            String sql = "delete from student where 学员姓名 = ？";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1,"王花");
            int le = statement.executeUpdate();
            while (le>0){
                System.out.println("删除成功");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
