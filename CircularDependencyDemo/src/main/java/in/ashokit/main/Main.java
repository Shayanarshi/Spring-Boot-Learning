package in.ashokit.main;

import in.ashokit.bean.ClassA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        Object ob = ctx.getBean("ca");
        ClassA classA = (ClassA) ob;

        classA.m1();

    }
}
