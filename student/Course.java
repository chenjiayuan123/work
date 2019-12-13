package student;


import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Objects;

    public class Course {
        private int number;
        private String courseName;
        public static ArrayList courses=new ArrayList() ;

        public Course() {
        }

        public Course(String courseName) {
            this.courseName = courseName;
        }

        public Course(int number, String courseName) {
            this.number = number;
            this.courseName = courseName;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getCourseName() {
            return courseName;
        }

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }

        public ArrayList getCourses() {
            return courses;
        }

        public void setCourses(ArrayList courses) {
            this.courses = courses;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Course course = (Course) o;
            return courseName.equals(course.courseName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(courseName);
        }

        public Course findByName(String string){
            Course course=new Course(string);
            for (int i = 0; i <4 ; i++) {
                Course c1=(Course) courses.get(i);
                if(c1.equals(course)){
                    course=c1;
                }


            }

            return course;
        }


        @Override
        public String toString() {
            return "Course{" +
                    "number=" + number +
                    ", courseName='" + courseName + '\'' +
                    '}';
        }
    }

