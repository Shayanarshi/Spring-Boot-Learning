package in.ashokit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "in.ashokit")
@PropertySource("classpath:application.properties")
public class AppConfig {
}
