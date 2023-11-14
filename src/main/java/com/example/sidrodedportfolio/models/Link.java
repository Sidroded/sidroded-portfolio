package com.example.sidrodedportfolio.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("links")
public class Link {

    @Id
    private String id;
    private String name;
    private String link;
    private String image_id;

    public Link() {
    }

    public Link(String name, String link, String image_id) {
        this.name = name;
        this.link = link;
        this.image_id = image_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImage_id() {
        return image_id;
    }

    public void setImage_id(String image_id) {
        this.image_id = image_id;
    }
}
