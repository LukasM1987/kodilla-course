package com.example.kodillaspring143.board;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Bean
    public Board getBoard() {
        return new Board(getToDo(), getInProgress(), getDone());
    }

    @Bean
    @Scope("prototype")
    public TaskList getToDo() {
        return new TaskList();
    }

    @Bean
    @Scope("prototype")
    public TaskList getInProgress() {
        return new TaskList();
    }

    @Bean
    @Scope("prototype")
    public TaskList getDone() {
        return new TaskList();
    }
}
