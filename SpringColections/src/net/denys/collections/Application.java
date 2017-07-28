package net.denys.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext  context;
        CollectionInjection injection;

        context = new ClassPathXmlApplicationContext("resources/applicationContext.xml");
        injection = (CollectionInjection) context.getBean("collection");

        injection.getDocumentList();
        injection.getDocumentMap();
        injection.getDocumentSet();
        injection.getDocumentProperties();
    }
}
