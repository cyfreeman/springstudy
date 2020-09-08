package project002.cystudy.spring5.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

    //1、数组类型属性
    private String[] courses;

    //2、list集合类型属性
    private List<String> list;

    //3、map集合类型属性
    private Map<String, String> map;

    //4、set集合类型属性
    private Set<String> set;

    //5、学生所学的多门课程
    List<Courses> coursesList;

    public void setCoursesList(List<Courses> coursesList) {
        this.coursesList = coursesList;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "courses=" + Arrays.toString(courses) +
                "\n list=" + list +
                "\n  map=" + map +
                "\n  set=" + set +
                "\n  coursesList=" + coursesList.toString() +
                '}';
    }
}
