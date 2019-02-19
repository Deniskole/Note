package com.example.notescheck;

public class Note {

    private String title;
    private String description;
    private String weekOfDay;
    private int priority;


    public Note(String title, String description, String weekOfDay, int priority) {
        this.title = title;
        this.description = description;
        this.weekOfDay = weekOfDay;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getWeekOfDay() {
        return weekOfDay;
    }

    public int getPriority() {
        return priority;
    }
}
