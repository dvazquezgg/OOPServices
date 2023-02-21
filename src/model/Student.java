package model;

import java.util.Date;

public class Student extends Person {
    private String studentId;
    private String level;
    private Course[] courses;
    private String yearOfStudy;
    private int semester;
    private String status;
    private String dateOfRegistration;
    private String dateOfGraduation;

    public Student(String name, String surname, String email, String gender, Date dateOfBirth, String studentId, String level, Course[] courses, String status, String dateOfRegistration) {
        super(name, surname, email, gender, dateOfBirth);
        this.studentId = studentId;
        this.level = level;
        this.courses = courses;
        this.status = status;
        this.dateOfRegistration = dateOfRegistration;
    }
}
