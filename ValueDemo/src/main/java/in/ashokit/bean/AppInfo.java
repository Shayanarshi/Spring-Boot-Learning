package in.ashokit.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppInfo {
    @Value("${app.name: MyApp}")
    private  String appName;
    @Value("${app.version : 1.0}")
    private  String appVersion;
    @Value("${app.admin: John}")
    private  String appAdmin;


    public void displayAppInfo(){
        System.out.println("App Name "+appName);
        System.out.println("App Version "+appVersion);
        System.out.println("App Admin "+appAdmin);
    }
}
