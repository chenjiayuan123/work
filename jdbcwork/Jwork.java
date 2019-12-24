package jdbcwork;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Jwork {
    public static void main(String[] args) throws SQLException {
        List list = new ArrayList();
        Connection con = null;


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/day2_homework?useSSL=false&serverTimezone=UTC";
            con = DriverManager.getConnection(url, "root", "CJY_123");
//            String sql = "select * from student where 学员姓名 = ？";
//            PreparedStatement statement = con.prepareStatement(sql);
//            statement.setString(1,"王花");
//            ResultSet resultSet = statement.executeQuery();
//            while (resultSet.next()){
//                student student = new student();
//                student.setName(resultSet.getString(1));s
//            }
            String  sql="insert into student set (num,name,grade,address,day) values (?,?,?,?,?)";  //调用存储过程
            PreparedStatement ps = con.prepareStatement(sql);
            Student st = new Student(6,"李四",40,"南京","2019-04-29");
            ps.setInt(1, st.getNum());
            ps.setString(2, st.getName());
            ps.setInt(3, (int) st.getGrage());
            ps.setString(4, st.getAddress());
            ps.setString(5, st.getDay());

            int  result=ps.executeUpdate();
            if(result>0){
                System.out.println("插入成功....");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}