package com.examination.app.entity;

import javax.persistence.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;




@Entity
@Validated
public class ExamResult {

    // Unique identifier for the exam result.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    
    @NotBlank(message = "grade is mandatory")
    private String grade;

    // Marks obtained by the student in the exam.
    @NotNull(message="marks should not be null")
    private Float marks;

    // Reference to the associated student.
    @OneToOne
    private Student student;

    // Reference to the associated exam.
    @OneToOne
    private Exam exam;

    
    public ExamResult() {
		super();
	}

	
    public ExamResult(Integer id, String grade, Float marks, Student student, Exam exam) {
        this.id = id;
        this.grade = grade;
        this.marks = marks;
        this.student = student;
        this.exam = exam;
    }
    // Getter and Setter methods for each property.


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Float getMarks() {
		return marks;
	}

	public void setMarks(Float marks) {
		this.marks = marks;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}


	@Override
	public String toString() {
		return "ExamResult [id=" + id + ", grade=" + grade + ", marks=" + marks + ", student=" + student + ", exam="
				+ exam + "]";
	}
	
	
    

   

}
