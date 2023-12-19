package com.examination.app.repository;

import com.examination.app.entity.Exam;
import com.examination.app.entity.ExamResult;
import com.examination.app.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ExamResultRepository extends JpaRepository<ExamResult, Integer> {

   
    List<ExamResult> findByExam_Id(Integer examId);

    
    Optional<ExamResult> findByExam_IdAndStudent_Id(Integer examId, Integer studentId);

    
    boolean existsByStudentAndExam(Student student, Exam exam);
}
