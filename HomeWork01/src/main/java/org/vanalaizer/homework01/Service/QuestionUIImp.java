package org.vanalaizer.homework01.Service;

import org.vanalaizer.homework01.DAO.QuestionDao;
import org.vanalaizer.homework01.domain.Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionUIImp implements QuestionUI {

    private final QuestionDao questionDao;
    private  Question question;
    private  String answer;

    public QuestionUIImp(QuestionDao questionDao) {
        this.questionDao = questionDao;
    }

    public Question writeNextQuestion() {
        question = questionDao.readQuestion();
        if (question!=null) System.out.print(question.getQuestionText() + ": ");
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

    public void letsGo() {
        while (writeNextQuestion() != null) {
            readAnswer();
            if (compareQuestionAnswer()) {
                System.out.println("this correct.");
            } else {
                System.out.println("no, incorrect answer.");
            }

        }
    }
}
