package homework.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({PropertiesConfig.class, ResoursesConfig.class})
@ComponentScan("homework")
public class ProcessorConfig {
}
