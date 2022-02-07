package com.example;

import java.util.HashSet;
import java.util.Set;

public class Announcement {

    public Announcement(String title, String content, Topic topic) {
        this.title = title;
        this.content = content;
        this.topic = topic;
    }

    private String title;
    private String content;
    private Topic topic;
    private Set<Comment> comments= new HashSet<>();

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

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public void addComment(Comment comment) {
        this.comments.add(comment);
    }
}