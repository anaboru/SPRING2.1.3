import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorldBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloWorldBean.getMessage());
        HelloWorld helloWorldBean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloWorldBean == helloWorldBean2);

        Cat catBean = (Cat) applicationContext.getBean("cat");
        Cat catBean2 = (Cat) applicationContext.getBean("cat");
        System.out.println(catBean == catBean2);

    }
}