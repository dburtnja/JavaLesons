package denys.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExamRunner {
    public static void main(String[] args) {
        ApplicationContext  context;
        Exam                exam;

        context = new AnnotationConfigApplicationContext(ExamConfig.class);
        exam = context.getBean(Exam.class);
        exam.examCheck();
    }
}
