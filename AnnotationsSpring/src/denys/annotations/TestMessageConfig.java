package denys.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestMessageConfig {

    @Bean
    public TestMessage getTestMessage(){
        return new TestMessage();
    }
}
