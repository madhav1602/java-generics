package src.com.bridgelabz.univeristycoursemanagement;

import java.util.*;

// Abstract class representing different types of courses
abstract class CourseType {
    protected String courseName;
    protected String instructor;

    public CourseType(String courseName, String instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public abstract void evaluate();

    public void displayInfo() {
        System.out.println("Course: " + courseName + " | Instructor: " + instructor);
    }
}


class ExamCourse extends CourseType {
    public ExamCourse(String courseName, String instructor) {
        super(courseName, instructor);
    }

    @Override
    public void evaluate() {
        System.out.println(courseName + " is evaluated through final exams.");
    }
}


class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName, String instructor) {
        super(courseName, instructor);
    }

    @Override
    public void evaluate() {
        System.out.println(courseName + " is evaluated through assignments.");
    }
}


class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName, String instructor) {
        super(courseName, instructor);
    }

    @Override
    public void evaluate() {
        System.out.println(courseName + " is evaluated through research papers.");
    }
}



// Generic Class for Course Management
class Course<T extends CourseType> {
    private T courseDetails;

    public Course(T courseDetails) {
        this.courseDetails = courseDetails;
    }

    public void displayCourseDetails() {
        courseDetails.displayInfo();
        courseDetails.evaluate();
    }
}

// Utility Class for Handling Courses Dynamically using Wildcards
class CourseManager {
    public static void displayAllCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            course.displayInfo();
            course.evaluate();
            System.out.println("----------------------------");
        }
    }
}

// Main class to test the system
public class UniversityCourseSystem {
    public static void main(String[] args) {
        // Creating different types of courses
        ExamCourse math = new ExamCourse("Mathematics", "Dr. Sharma");
        AssignmentCourse cs = new AssignmentCourse("Computer Science", "Prof. Verma");
        ResearchCourse physics = new ResearchCourse("Quantum Mechanics", "Dr. Bose");

        // Managing courses using generics
        Course<ExamCourse> mathCourse = new Course<>(math);
        Course<AssignmentCourse> csCourse = new Course<>(cs);
        Course<ResearchCourse> physicsCourse = new Course<>(physics);

        // Display individual course details
        mathCourse.displayCourseDetails();
        csCourse.displayCourseDetails();
        physicsCourse.displayCourseDetails();

        System.out.println("\n==== Displaying All Courses Dynamically ====");
        List<CourseType> courseList = new ArrayList<>();
        courseList.add(math);
        courseList.add(cs);
        courseList.add(physics);

        // Displaying all courses using wildcard method
        CourseManager.displayAllCourses(courseList);
    }
}

