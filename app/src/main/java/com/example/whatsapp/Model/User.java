package com.example.whatsapp.Model;

public class User {

    private String id;
    private String username;
    private String imageURL;
    private String status;                                    //是否在线
    private String relation;

    public User(String id, String username, String imageURL, String status, String relation) {
        this.id = id;
        this.username = username;
        this.imageURL = imageURL;
        this.status = status;
        this.relation = relation;
    }

    public User(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }
}
