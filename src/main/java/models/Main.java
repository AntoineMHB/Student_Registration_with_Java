package models;

import dao.StudentDAO;
import java.util.Date;
import java.util.List;


public class Main {
	 public static void main(String[] args) {
	        StudentDAO studentDAO = new StudentDAO();

	        // Create student
	        Student student = new Student();
	        student.setStudentName("Nzanzu Antoine");
	        student.setStudentNumber("24291");
	        student.setStudentDob(new Date());
	        student.setStudentAddress("Kicukiro");
	        studentDAO.saveStudent(student);
	        
	        // Confirm the student was saved
	        System.out.println("Student saved successfully!");

//	        // Read students
//	        List<Student> students = studentDAO.getStudents();
//	        for (Student s : students) {
//	            System.out.println(s.getStudentName());
//	        }
//
//	        // Update student
//	        student.setStudentName("John Smith");
//	        studentDAO.updateStudent(student);
//
//	        // Delete student
//	        studentDAO.deleteStudent(student.getId());
	    }

}
