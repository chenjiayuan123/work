package jdbcwork;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Jwork02 {
    public static void main(String[] args) throws SQLException {
        List list = new ArrayList();
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/day2_homework?useSSL=false&serverTimezone=UTC";
        con = DriverManager.getConnection(url, "root", "CJY_123");
            String sql = "select * from student where 学员姓名 = ？";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1,"王花");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Student student = new Student();
                student.setName(resultSet.getString(1));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}