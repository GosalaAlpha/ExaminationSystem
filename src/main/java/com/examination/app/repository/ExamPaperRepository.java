package com.examination.app.repository;

import com.examination.app.entity.ExamPaper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ExamPaperRepository extends JpaRepository<ExamPaper, Integer> {

    List<ExamPaper> findByExam_Id(Integer id);
}
