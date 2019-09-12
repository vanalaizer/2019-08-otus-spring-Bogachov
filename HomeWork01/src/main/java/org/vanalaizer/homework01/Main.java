package org.vanalaizer.homework01;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.vanalaizer.homework01.DAO.QuestionDaoImp;
import org.vanalaizer.homework01.Service.QuestionUI;
import org.vanalaizer.homework01.domain.Question;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("context.xml");
        QuestionUI questionUI = classPathXmlApplicationContext.getBean(QuestionUI.class);
        questionUI.letsGo();
    }
}
