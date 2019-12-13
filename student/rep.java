package student;
//1.模拟在校学生选课系统,1.模拟在校学生选课系统,使用集合完成
//        要求：1.学生类:学号，姓名，所选课程Set<Course>
//        学生可以对课程做增删改查操作
//        2.课程类：编号 课程名称
//        3.学生选课清单类
//        完成:有n个人 显示出每个人所选的课程信息
//        如：姓名：张三:    所选课程如下： 9527  java基础 ，9768 C# ，
//        9898 javaScript 等下： 9527  java基础 ，9768 C# ，9898 javaScript 等
import java.util.Arrays;
import java.util.TreeSet;

public class rep {

    public static class Students implements Comparable {

        private String name = null;
        private int num = 0;
        private int grade = 0;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }

        @Override
        public int compareTo(Object o) {

            //将Object类型强转成Students类型
            Students students = (Students) o;

            //比较分数
            int num1 = students.grade - this.grade;

            //如果分数一样，比较学号大小
            int num2 = num1 == 0 ? students.num - this.num : num1;

            return num2;
        }

        @Override
        public String toString() {
            return "Students{" +
                    "name='" + name + '\'' +
                    ", num=" + num +
                    ", grade=" + grade +
                    '}';
        }

        public static void main(String[] args) {

            TreeSet<Students> treeSet = new TreeSet<Students>();
            Students[] students = new Students[40];


            for (int i = 0; i < 40; i++) {
                students[i] = new Students();
                students[i].setName("同学" + (10 + i));
                students[i].setNum(180200 + i + 1);
                students[i].setGrade((int) (Math.random() * (100 - 50 + 1) + 50));

                treeSet.add(students[i]);


            }

            System.out.println(treeSet);

        }
    }
}