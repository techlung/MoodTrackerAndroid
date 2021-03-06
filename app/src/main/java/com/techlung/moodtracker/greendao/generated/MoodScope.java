package com.techlung.moodtracker.greendao.generated;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "MOOD_SCOPE".
 */
public class MoodScope {

    private Long id;
    private String name;
    private Integer sequence;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public MoodScope() {
    }

    public MoodScope(Long id) {
        this.id = id;
    }

    public MoodScope(Long id, String name, Integer sequence) {
        this.id = id;
        this.name = name;
        this.sequence = sequence;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
