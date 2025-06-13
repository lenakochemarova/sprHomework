package homework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws IOException {

        var applicationContext = new AnnotationConfigApplicationContext(ProcessorConfig.class);

        var resultsProcessor = applicationContext.getBean(ResultsProcessor.class);
        var answerHandler = applicationContext.getBean(AnswersHandler.class);
        var filePath1 = new ClassPathResource("CorrectAnswers").getFile().toPath();
        var filePath2 = new ClassPathResource("StudentsAnswers").getFile().toPath();





        System.out.println(resultsProcessor.getResult());

    }
}
