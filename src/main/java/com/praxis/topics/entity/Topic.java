package com.praxis.topics.entity;

import java.util.UUID;

public class Topic {
    private UUID id;
    private String name;
    private String description;
    private int status;
    private int teachers_count;
    private int students_count;
    private String createdAt;
    private String openedAt;
    private String closedAt;
    private String expiredAt;

    public Topic(UUID id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Topic() {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getTeachers_count() {
        return teachers_count;
    }

    public void setTeachers_count(int teachers_count) {
        this.teachers_count = teachers_count;
    }

    public int getStudents_count() {
        return students_count;
    }

    public void setStudents_count(int students_count) {
        this.students_count = students_count;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getOpenedAt() {
        return openedAt;
    }

    public void setOpenedAt(String openedAt) {
        this.openedAt = openedAt;
    }

    public String getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(String closedAt) {
        this.closedAt = closedAt;
    }

    public String getExpiredAt() {
        return expiredAt;
    }

    public void setExpiredAt(String expiredAt) {
        this.expiredAt = expiredAt;
    }
}
