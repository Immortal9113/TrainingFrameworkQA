package ui.test.kovalchuk.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Dima", "Kovalchuk",4);
        Student st2 = new Student("Olly", "Stepanjuk",5);
        Student st3 = new Student("Masha", "Nikonchuk",2);
        Student st4 = new Student("Zoya", "Sokolova",1);
        map.put(st1, 7.0);
        map.put(st2, 9.4);
        map.put(st3, 7.6);
        map.put(st4, 8.1);
        System.out.println(map);

        Student st5 = new Student("Zoya", "Sokolova",1);
        boolean result = map.containsKey(st5);
        System.out.println("result = " + result);



    }
}
class Student{
    String name;
    String surname;
    int course;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, surname, course);
//    }

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;

    }
}
