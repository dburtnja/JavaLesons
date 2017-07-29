package denys.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext  context;
        TestMessage         message;

        context = new AnnotationConfigApplicationContext(TestMessageConfig.class);
        message = context.getBean(TestMessage.class);
        message.setMessage("New message");
        System.out.println(message);
    }
}
