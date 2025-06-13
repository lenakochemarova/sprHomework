package homework.service;

import homework.model.AnswersHandlerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.nio.file.Path;
import java.util.Map;

@Repository
public class AnswersHandler implements AnswersHandlerInterface {
    private final Map<Integer, String> correctAnwsers;
    private final Map<Integer, String> studentsAnswers;


    public AnswersHandler(@Qualifier("correct") @Autowired Path correct, @Qualifier("student") @Autowired Path student) {
        this.correctAnwsers = getAnswers(correct);
        this.studentsAnswers = getAnswers(student);
    }

    public Map<Integer, String> getCorrectAnwsers() {
        return correctAnwsers;
    }

    public Map<Integer, String> getStudentsAnswers() {
        return studentsAnswers;
    }
}
