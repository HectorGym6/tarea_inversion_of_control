package org.example;

import org.example.components.MemberProgram;
import org.example.configuration.MemberConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception {

        ApplicationContext context = new AnnotationConfigApplicationContext(
                MemberConfiguration.class
        );

        MemberProgram program = context.getBean(MemberProgram.class);
        program.execute();
    }
}