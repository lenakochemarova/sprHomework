package homework;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ProcessorConfig.class)
@ComponentScan("homework")
public class ProcessorConfig {
}
