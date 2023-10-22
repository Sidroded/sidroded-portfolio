package com.example.sidrodedportfolio.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("posts")
public class Post {

    @Id
    private String id;
    private String title;
    private String anons;
    private String full_text;
    private String image_link_1;
    private String image_link_2;
    private String image_link_3;
    private int priority;
    private int views;

    public Post() {
    }

    public Post(String title, String anons, String full_text, String image_link_1, String image_link_2, String image_link_3, int priority) {
        this.title = title;
        this.anons = anons;
        this.full_text = full_text;
        this.image_link_1 = image_link_1;
        this.image_link_2 = image_link_2;
        this.image_link_3 = image_link_3;
        this.priority = priority;
    }

    public Post(String title, String anons, String full_text) {
        this.title = title;
        this.anons = anons;
        this.full_text = full_text;
    }

    public String getImage_link_1() {
        return image_link_1;
    }

    public void setImage_link_1(String image_link_1) {
        this.image_link_1 = image_link_1;
    }

    public String getImage_link_2() {
        return image_link_2;
    }

    public void setImage_link_2(String image_link_2) {
        this.image_link_2 = image_link_2;
    }

    public String getImage_link_3() {
        return image_link_3;
    }

    public void setImage_link_3(String image_link_3) {
        this.image_link_3 = image_link_3;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnons() {
        return anons;
    }

    public void setAnons(String anons) {
        this.anons = anons;
    }

    public String getFull_text() {
        return full_text;
    }

    public void setFull_text(String full_text) {
        this.full_text = full_text;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
}
