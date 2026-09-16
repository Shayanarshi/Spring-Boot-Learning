package in.ashokit.main;

import in.ashokit.bean.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //start the spring IoC Container

         ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

         Object obj = ctx.getBean("helloWorld");

          HelloWorld hw = (HelloWorld) obj;
        // call the method 
        hw.sayHello("Shayan");

    }
}
