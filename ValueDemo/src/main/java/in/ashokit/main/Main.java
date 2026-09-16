package in.ashokit.main;

import in.ashokit.bean.AppInfo;
import in.ashokit.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Object o = context.getBean("appInfo");
        AppInfo ai = (AppInfo) o;
        ai.displayAppInfo();
    }
}
