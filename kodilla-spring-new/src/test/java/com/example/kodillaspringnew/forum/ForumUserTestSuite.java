package com.example.kodillaspringnew.forum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ForumUserTestSuite {

    @Test
    void testGetUserName() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.kodillaspringnew.forum");
        ForumUser forumUser = context.getBean(ForumUser.class);

        //When
        String name = forumUser.getUserName();

        //Then
        Assertions.assertEquals("John Smith", name);
    }
}
