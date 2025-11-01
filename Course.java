package com.example3;

public class Course {
    private String courseName;
    private Student student;
    private Teacher teacher;
    // Setter Injection
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public void showCourseDetails() {
        System.out.println("\n=== Course Details ===");
        System.out.println("Course: " + courseName);
        System.out.println();
        student.displayInfo();
        teacher.displayInfo();
    }
}