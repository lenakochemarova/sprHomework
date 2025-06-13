package homework;

import homework.config.ProcessorConfig;
import homework.service.PropertyService;
import homework.service.ResultsProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        var applicationContext = new AnnotationConfigApplicationContext(ProcessorConfig.class);

        var resultsProcessor = applicationContext.getBean(ResultsProcessor.class);
        var propertyService = applicationContext.getBean(PropertyService.class);

        propertyService.addMap();

        System.out.println(resultsProcessor.getResult());

    }
}
