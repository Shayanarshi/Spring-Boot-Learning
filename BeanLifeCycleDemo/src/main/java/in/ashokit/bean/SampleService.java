package in.ashokit.bean;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service
public class SampleService
        implements
            BeanNameAware,
            ApplicationContextAware,
            InitializingBean,
            DisposableBean {
    TempororyService tempororyService;

    public SampleService(){
        System.out.println("SampleService :: constructor");
    }

    @Autowired
    public void setTempororyService(TempororyService tempororyService){
        this.tempororyService = tempororyService;
        System.out.println("Dependency is  injected.");
    }


    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName() of BeanNameAware");
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext() of ApplicationContextAware");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy() of DisposableBean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet() of InitializingBean");
    }
    @PostConstruct
    public void init(){
        System.out.println("Post construct method");
    }

    @PreDestroy
    public  void close(){
        System.out.println("Pre destroy method");
    }

    public  void  doTask(){
        System.out.println("Task is Completed..");
    }
}
