package com.example.bijan.youtubelistview;

/**
 * Created by Bijan on 12/10/2016.
 */

public class Csharp2 {
    private String courseno;
    private String coursename;
    private String coursetime;

    public Csharp2(String courseno, String coursename, String coursetime) {
        this.courseno = courseno;
        this.coursename = coursename;
        this.coursetime = coursetime;
    }

    public String getCourseno() {
        return courseno;
    }

    public void setCourseno(String courseno) {
        this.courseno = courseno;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getCoursetime() {
        return coursetime;
    }

    public void setCoursetime(String coursetime) {
        this.coursetime = coursetime;
    }
}