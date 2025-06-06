package com.alex.example;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student
{
    @Id
    private int StudentId;
    private String StudentName;
    private String StudentEmail;
    private int StudentAge;


    public Student(){}

    public Student(int StudentID, String StudentName, String StudentEmail, int StudentAge)
    {
        this.StudentAge = StudentAge;
        this.StudentName = StudentName;
        this.StudentEmail = StudentEmail;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentEmail() {
        return StudentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        StudentEmail = studentEmail;
    }

    public int getStudentAge() {
        return StudentAge;
    }

    public void setStudentAge(int studentAge) {
        StudentAge = studentAge;
    }
}






