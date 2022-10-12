package ui.test.kovalchuk.collection.set;

import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student st1 = new Student("Dima", 3);
        Student st2 = new Student("Olya", 5);
        Student st3 = new Student("Sveta", 3);
        Student st4 = new Student("Zina", 1);
        Student st5 = new Student("Vasya", 3);
        Student st6 = new Student("Pasha", 2);

        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);
        treeSet.add(st6);
        System.out.println(treeSet);
        Student st7 = new Student("Oleg", 4);
        Student st8 = new Student("Roma", 2);

        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.headSet(st7));
        System.out.println(treeSet.tailSet(st7));
        System.out.println(treeSet.subSet(st7,st8));


    }
}

class Student implements Comparable<Student>{
    String name;
    int course;

    public Student(String name, int course){
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student other){
        return this.course-other.course;
    }

}