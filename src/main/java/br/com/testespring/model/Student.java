package br.com.testespring.model;

import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
import java.util.Objects;

public class Student {
    public Student(){
    }

    public Student(String name){
        this.name = name;
    }

    public Student( int id, String name){
        this.name = name;
        this.id = id;
    }

    private String name;
    private int id;
    public static List<Student> studentList;

    static {
        studentRepository();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<Student> getStudentList() {
        return studentList;
    }

    public static void setStudentList(List<Student> studentList) {
        Student.studentList = studentList;
    }

    private static void studentRepository(){
        studentList = new ArrayList(asList(new Student(1, "Maria"), new Student(2, "João")));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
