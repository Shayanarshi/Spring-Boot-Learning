package in.ashokit.app.runnner;

import in.ashokit.app.bean.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.xml.stream.events.Comment;

@Component
public class MyAppRunner implements CommandLineRunner {
    @Autowired
    HelloWorld helloWorld;
    @Override
    public void run(String... args) throws Exception {
        System.out.println(helloWorld.sayHello());
    }
}
