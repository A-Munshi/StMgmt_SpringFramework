package com.example3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;
public class MenuApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Student student = (Student) context.getBean("studentBean");
        Teacher teacher = (Teacher) context.getBean("teacherBean");
        Course course = (Course) context.getBean("courseBean");
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("========= MENU =========");
            System.out.println("1. View Student Details");
            System.out.println("2. View Teacher Details");
            System.out.println("3. View Course Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            System.out.println();
            switch (choice) {
                case 1: student.displayInfo();      break;
                case 2: teacher.displayInfo();      break;
                case 3: course.showCourseDetails();     break;
                case 4: System.out.println("Exiting... Thank you!");        break;
                default: System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);
        sc.close();
    }
}