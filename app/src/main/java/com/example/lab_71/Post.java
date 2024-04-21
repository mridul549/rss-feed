package com.example.lab_71;

public class Post {
    private String heading, description, imageUrl;

    public Post() {} // Needed for Firebase

    // Getters
    public String getHeading() { return heading; }
    public String getDescription() { return description; }
    public String getImageUrl() { return imageUrl; }

    // Setters
    public void setHeading(String heading) { this.heading = heading; }
    public void setDescription(String description) { this.description = description; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
}

