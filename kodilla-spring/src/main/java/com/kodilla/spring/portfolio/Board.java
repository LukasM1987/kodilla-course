package com.kodilla.spring.portfolio;

public class Board {

    private TaskList toDo;
    private TaskList inProgress;
    private TaskList done;

    public Board(TaskList toDo, TaskList inProgress, TaskList done) {
        this.toDo = toDo;
        this.inProgress = inProgress;
        this.done = done;
    }

    public TaskList getToDo() {
        return toDo;
    }

    public TaskList getInProgress() {
        return inProgress;
    }

    public TaskList getDone() {
        return done;
    }
}
