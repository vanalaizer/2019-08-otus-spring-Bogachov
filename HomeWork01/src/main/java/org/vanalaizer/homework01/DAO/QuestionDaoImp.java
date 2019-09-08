package org.vanalaizer.homework01.DAO;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.vanalaizer.homework01.domain.Question;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;

import static org.apache.commons.csv.CSVFormat.*;

public class QuestionDaoImp implements QuestionDao{

    private List<CSVRecord> records;
    private int index;

    public QuestionDaoImp() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("csv/questions.csv");
        if (inputStream!=null) {
            records = CSVParser.parse(inputStream, Charset.forName("UTF-8"), CSVFormat.RFC4180).getRecords();
        } else throw new IOException("нет файла вопросов и ответов");
        index = 0;
    }

    public Question readQuestion() {
        Question question;
        try {
            question = new Question(records.get(index).get(0), records.get(index).get(1));
        } catch (Exception e) {
            question = null;
        }
        index++;
        return question;
    }

    public Question readFirst() {
        index = 0;
        return readQuestion();
    }
}
