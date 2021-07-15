package com.kodilla.stream.immutable;

public class ForumUser {

    private final String name;
    private final String realName;

    public ForumUser(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }
}
