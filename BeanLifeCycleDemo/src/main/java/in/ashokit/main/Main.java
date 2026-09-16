package in.ashokit.main;

import in.ashokit.bean.SampleService;
import in.ashokit.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SampleService ss = (SampleService) context.getBean("sampleService");
        ss.doTask();

       context.close();

    }
}
