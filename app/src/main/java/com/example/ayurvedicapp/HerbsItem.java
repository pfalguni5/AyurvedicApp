package com.example.ayurvedicapp;

import android.widget.Button;

public class HerbsItem {
    String name;
    int image;

    public HerbsItem(int image, String name) {
        this.image = image;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
