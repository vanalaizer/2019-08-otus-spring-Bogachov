package org.vanalaizer.homework01.Service;

import org.vanalaizer.homework01.domain.Question;

public interface QuestionUI {
    Question writeNextQuestion();
    void readAnswer();
    boolean compareQuestionAnswer();
    void letsGo();
}
