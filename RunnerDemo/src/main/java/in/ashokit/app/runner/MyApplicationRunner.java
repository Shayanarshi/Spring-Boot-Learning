package in.ashokit.app.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Component
public class MyApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        //Accessing non - option arguments
        System.out.println("The non option args : ");
        List<String> nonOptionArgsList =args.getNonOptionArgs();
        nonOptionArgsList.forEach(System.out::println);
        System.out.println("======================");
        //Accessing Option Arguments

        System.out.println("The Option args :");
        Set<String> optionNames = args.getOptionNames();
        for (String optionName : optionNames){
            List<String> list = args.getOptionValues(optionName);
            System.out.println("Option Name : "+ optionName);
            System.out.println("Option value : "+list);
            System.out.println("****************");
        }

    }
}
