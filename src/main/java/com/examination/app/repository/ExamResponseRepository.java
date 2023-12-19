package com.examination.app.repository;

import com.examination.app.entity.ExamResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ExamResponseRepository extends JpaRepository<ExamResponse, Integer> {

   
    List<ExamResponse> findByStudent_IdAndExamPaper_Exam_Id(Integer studentId, Integer examPaperId);

	
}
