package homework.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ResultsProcessor {
    private final AnswersHandler answersHandler;
    private final PropertyService properties;

    @Autowired
    public ResultsProcessor(AnswersHandler answersHandler, PropertyService properties) {
        this.answersHandler = answersHandler;
        this.properties = properties;
    }

    public int getResult() {
        Map<Integer, String> correctAnswers = answersHandler.getCorrectAnwsers();
        Map<Integer, String> studentsAnswers = answersHandler.getStudentsAnswers();
        int result = 0;

        for (int i = 1; i < 11; i++) {
            if (correctAnswers.get(i).equals(studentsAnswers.get(i))) {
                result += properties.getPoint(i);
            }
        }
        return result;
    }
}
