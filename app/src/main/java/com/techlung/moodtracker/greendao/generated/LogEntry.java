package com.techlung.moodtracker.greendao.generated;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "LOG_ENTRY".
 */
public class LogEntry {

    private Long id;
    private String text;
    private String category;
    private java.util.Date day;
    private Long timestamp;

    public LogEntry() {
    }

    public LogEntry(Long id) {
        this.id = id;
    }

    public LogEntry(Long id, String text, String category, java.util.Date day, Long timestamp) {
        this.id = id;
        this.text = text;
        this.category = category;
        this.day = day;
        this.timestamp = timestamp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public java.util.Date getDay() {
        return day;
    }

    public void setDay(java.util.Date day) {
        this.day = day;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

}
