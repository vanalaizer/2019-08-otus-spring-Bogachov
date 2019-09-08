package org.vanalaizer.homework01.DAO;

import org.vanalaizer.homework01.domain.Question;

public interface QuestionDao {
    Question readQuestion();
    Question readFirst();
}
