package com.examination.app.dto;

import javax.validation.constraints.NotBlank;

// Data Transfer Object (DTO) representing an answer option selected by a student for a specific question.
public class AnswerOptionDTO {

    // ID of the question for which an answer option is selected.
    @NotBlank
    private Integer questionId;

    @NotBlank
    private String selectedAnswer;

    public AnswerOptionDTO() {
    }

    public AnswerOptionDTO(Integer questionId, String selectedAnswer) {
        this.questionId = questionId;
        this.selectedAnswer = selectedAnswer;
    }
    
    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getSelectedAnswer() {
        return selectedAnswer;
    }

    public void setSelectedAnswer(String selectedAnswer) {
        this.selectedAnswer = selectedAnswer;
    }
}
