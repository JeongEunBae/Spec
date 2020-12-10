package com.example.mobileproject;

import android.graphics.drawable.Drawable;

public class RecentItem {
    private Drawable img;
    private String title;
    private String date;
    private String explanation;


    public void setImg(Drawable img) {
        this.img = img;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public Drawable getImg() {
        return img;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getExplanation() {
        return explanation;
    }
}
