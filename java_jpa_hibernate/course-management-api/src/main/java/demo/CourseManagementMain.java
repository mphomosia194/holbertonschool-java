package demo;

import entities.*;
import models.*;

public class CourseManagementMain {

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("John");

        Address address = new Address();
        address.setStreet("Main Street");

        Phone phone = new Phone();
        phone.setNumber("123456");

        student.getAddresses().add(address);
        student.getPhones().add(phone);

        Teacher teacher = new Teacher();
        teacher.setName("Dr Smith");

        CourseMaterial material = new CourseMaterial();
        material.setUrl("material.pdf");

        Course course = new Course();
        course.setTitle("Math");
        course.setTeacher(teacher);
        course.setMaterial(material);
        course.getStudents().add(student);

        StudentModel sm = new StudentModel();
        CourseModel cm = new CourseModel();

        sm.create(student);
        cm.create(course);
    }
}
