package apple.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("apple.dao")
@ComponentScan("apple.service")
@ComponentScan("apple.controller")
public class AppleAnnotationConfig {

}
