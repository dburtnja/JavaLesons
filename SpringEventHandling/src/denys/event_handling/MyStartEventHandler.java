package denys.event_handling;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MyStartEventHandler implements ApplicationListener{

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("Start event listener: " + applicationEvent);
    }
}
