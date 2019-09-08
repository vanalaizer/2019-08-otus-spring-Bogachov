package org.vanalaizer.homework01.Service;

import org.vanalaizer.homework01.DAO.QuestionDao;
import org.vanalaizer.homework01.domain.Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionUIImp implements QuestionUI {

    private QuestionDao questionDao;
    private  Question question;
    private  String answer;

    public QuestionUIImp(QuestionDao questionDao) {
        this.questionDao = questionDao;
    }

    public Question getCurrentQuestion() {
        return question;
    }

    public Question writeNextQuestion() {
        question = questionDao.readQuestion();
        if (question!=null) System.out.println(question.getQuestionText());
        return question;
    }

    public void readAnswer() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean compareQuestionAnswer() {
        return answer.equalsIgnoreCase(question.getQuestionAnswer());
    }
}
