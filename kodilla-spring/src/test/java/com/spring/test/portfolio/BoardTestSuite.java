package com.spring.test.portfolio;

import com.kodilla.spring.portfolio.Board;
import com.kodilla.spring.portfolio.BoardConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    void toDoListTest() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDo().getTasks().add("afasa");
        String taskToDo = board.getToDo().getTasks().get(0);

        //Then
        System.out.println("Tak to do: " + taskToDo);
        Assertions.assertEquals("afasa", taskToDo);
    }

    @Test
    void inProgressListTest() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getInProgress().getTasks().add("sadgsddg");
        String taskInProgress = board.getInProgress().getTasks().get(0);

        //Then
        System.out.println("Task in progress: " + taskInProgress);
        Assertions.assertEquals("sadgsddg", taskInProgress);
    }

    @Test
    void doneLIstTask() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getDone().getTasks().add("sdgfseagfa");
        String taskDone = board.getDone().getTasks().get(0);

        //Then
        System.out.println("TDone task: " + taskDone);
        Assertions.assertEquals("sdgfseagfa", taskDone);
    }
}
