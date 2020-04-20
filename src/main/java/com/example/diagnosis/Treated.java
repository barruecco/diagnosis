package com.example.diagnosis;

public class Treated {

    private String eventType;
    private Long id;

    public Treated() {
        this.eventType = Treated.class.getSimpleName();
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
