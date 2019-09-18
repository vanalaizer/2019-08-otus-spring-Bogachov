package org.vanalaizer.homework01.domain;

public class Question {
    private final String questionText;
    private final String questionAnswer;

    public Question(String questionText, String questionAnswer) {
        this.questionText = questionText;
        this.questionAnswer = questionAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getQuestionAnswer() {
        return questionAnswer;
    }

}
