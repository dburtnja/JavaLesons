package denys.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ExamConfig {

    @Bean
    @Scope("singleton")
    public Exam exam(){
        return new Exam(answerChecker());
    }

    @Bean
    public AnswerChecker answerChecker(){
        return new AnswerChecker();
    }
}
