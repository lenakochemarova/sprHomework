package homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Properties;

@Service
public class ResultsProcessor {
    private final AnswersHandler answersHandler;
    private final Properties properties;

    @Autowired
    public ResultsProcessor(AnswersHandler answersHandler, Properties properties) {
        this.answersHandler = answersHandler;
        this.properties = properties;
    }

    public int getResult(){
        Map<Integer,String> correctAnwsers = answersHandler.getCorrectAnwsers();
        Map<Integer,String> studentsAnswers = answersHandler.getStudentsAnswers();
        int result=0;

        for (int i = 1; i < 11; i++) {
            if(correctAnwsers.get(i).equals(studentsAnswers.get(i))){
                result+=Integer.parseInt(properties.getProperty(String.valueOf(i)));
            }
        }
        return result;
    }
}
