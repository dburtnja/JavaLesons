package denys.event_handling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageRunner {
    public static void main(String[] args) {
        ConfigurableApplicationContext  context;
        Message             message;

        context = new ClassPathXmlApplicationContext("resources/applicationContext.xml");
        context.start();
        message = (Message) context.getBean("message");
        System.out.println(message);
        context.stop();
    }
}
