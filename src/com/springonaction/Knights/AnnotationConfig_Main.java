package com.springonaction.Knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfig_Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
        BraveKnight knight = context.getBean(BraveKnight.class);
        knight.embarkOnQuest();
    }
}
