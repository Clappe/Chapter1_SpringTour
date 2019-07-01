package com.springonaction.Knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");//加载Spring上下文
      //  BraveKnight knight = context.getBean(BraveKnight.class);//获取knight bean
        /**
         * 或者通过以下方式获取bean
         */
        BraveKnight knight = (BraveKnight) context.getBean("BraveKnight");
        knight.embarkOnQuest();//使用knight
        context.close();
    }
}
