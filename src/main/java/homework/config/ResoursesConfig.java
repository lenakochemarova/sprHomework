package homework.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.nio.file.Path;

@Configuration
@ComponentScan("resources")
public class ResoursesConfig {

    @Bean
    @Qualifier("correct")
    public Path correctFile() throws IOException {
        return new ClassPathResource("CorrectAnswers").getFile().toPath();
    }

    @Bean
    @Qualifier("student")
    public Path studentFile() throws IOException{
        return new ClassPathResource("StudentsAnswers").getFile().toPath();
    }
}
