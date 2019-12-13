package student;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Set;
public class student {

    public class Student{
        private String name;
        private int num;
        private ArrayList courses=new ArrayList() ;


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int age) {
            this.num = age;
        }

        //增删改查

        public void addCourse(String string){
            Course course=new Course();
            Course c1= course.findByName(string);
            this.courses.add(c1);


        }

        public  void    delCourse(String string){
            Course course=new Course();
            Course c1= course.findByName(string);
            this.courses.remove(c1);


            for (Object o:courses) {
                System.out.print(+((Course) o).getNumber()+" "+((Course) o).getCourseName()+",");
            }
            System.out.println();
        }

        public boolean  findCourse(String string){
            Course course=new Course();
            Course c1= course.findByName(string);
            return courses.contains(c1);
        }

        public void outCourse(){

            for (Object o:courses) {
                System.out.print(((Course) o).getNumber()+" "+((Course) o).getCourseName()+".");
            }
            System.out.println();
        }

    }


}
