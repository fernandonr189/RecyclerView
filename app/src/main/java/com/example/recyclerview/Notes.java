package com.example.recyclerview;

public class Notes {
    public String name;
    public String content;

    public Notes(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
