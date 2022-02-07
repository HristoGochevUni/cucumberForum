package com.example;

import java.util.HashSet;
import java.util.Set;


public class Topic {
    public Topic(String name) {
        this.name = name;
        this.mainTopic = this;
    }

    private String name;
    private Topic mainTopic;
    private Set<Topic> children=new HashSet<>();
    private Set<Announcement> announcements = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Topic getMainTopic() {
        return mainTopic;
    }

    public void setMainTopic(Topic mainTopic) {
        this.mainTopic = mainTopic;
    }

    public Set<Topic> getChildren() {
        return children;
    }

    public void setChildren(Set<Topic> children) {
        this.children = children;
    }

    public Set<Announcement> getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(Set<Announcement> announcements) {
        this.announcements = announcements;
    }

    public void addAnnouncement(Announcement announcement) {
        this.announcements.add(announcement);
    }
}