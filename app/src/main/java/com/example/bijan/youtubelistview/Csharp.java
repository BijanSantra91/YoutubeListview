package com.example.bijan.youtubelistview;

/**
 * Created by Bijan on 12/10/2016.
 */

public class Csharp {
    private String course;
    private String duration;
    private String assignment;
    private String tests;

    public Csharp(String course, String duration, String assignment, String tests) {
        this.course = course;
        this.duration = duration;
        this.assignment = assignment;
        this.tests = tests;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getAssignment() {
        return assignment;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }

    public String getTests() {
        return tests;
    }

    public void setTests(String tests) {
        this.tests = tests;
    }
}
