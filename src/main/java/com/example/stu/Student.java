package com.example.stu;





public class Student {
    private int studentID;
    private String name;
    private int age;
    private String Address;

    // Default constructor
    public Student() {}

    public Student(int studentID, String name, int age, String address) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        Address = address;
    }

    // Constructor with ID (for updates)

    // Getters and Setters


    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", Address='" + Address + '\'' +
                '}';
    }
}