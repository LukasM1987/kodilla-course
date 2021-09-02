package com.kodilla.spring.portfolio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("toDoList")
    TaskList taskList;


    @Bean
    public Board getBoard() {
        return new Board(getToDo(), getInProgress(), getDone());
    }

    @Bean(name = "toDoList")
    @Scope("prototype")
    public TaskList getToDo() {
        return new TaskList();
    }

    @Bean(name = "inProgress")
    @Scope("prototype")
    public TaskList getInProgress() {
        return new TaskList();
    }

    @Bean(name = "doneList")
    @Scope("prototype")
    public TaskList getDone() {
        return new TaskList();
    }
}
