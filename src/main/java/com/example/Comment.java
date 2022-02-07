package com.example;

public class Comment {

    public Comment(String title, String content, User user, Announcement announcement) {
        this.title = title;
        this.content = content;
        this.user = user;
        this.announcement = announcement;
    }

    private String title;
    private String content;
    private User user;
    private Announcement announcement;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Announcement getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(Announcement announcement) {
        this.announcement = announcement;
    }
}