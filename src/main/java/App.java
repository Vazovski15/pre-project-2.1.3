import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat myCat =(Cat) applicationContext.getBean("cat",Cat.class);
        Cat yourCat =(Cat) applicationContext.getBean("cat",Cat.class);

        System.out.println("Hello World = "+(bean==bean1));
        System.out.println("Cat = "+ (myCat==yourCat));


    }



}