package denys.event_handling;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class MyStopEventListener implements ApplicationListener{

    public void onApplicationEvent(ContextStoppedEvent stoppedEvent) {
        System.out.println("Stop event listener " + stoppedEvent);
    }

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {

    }
}
