package br.com.testespring.model;

public class Student {
    public Student(){
    }

    public Student(String name){
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
