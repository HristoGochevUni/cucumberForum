package com.example.services;

import com.example.*;

import java.util.ArrayList;
import java.util.List;

public class ForumService {
    public List<User> usersDB = new ArrayList<>();
    public List<Topic> topicsDB = new ArrayList<>();
    public List<Role> rolesDB = new ArrayList<>();

    public ForumService() {
        Role userRole = new Role("User");
        Role administratorRole = new Role("Administrator");
        rolesDB.add(userRole);
        rolesDB.add(administratorRole);
        User user = new User("Hristo", "Gochev", "stu1901321063@uni-plovdiv.bg");
        User user2 = new User("Petar", "Stoyanov", "stu1901281112@uni-plovdiv.bg");
        User administrator = new User("Pencho", "Malinov", "pepo-malinov@uni-plovdiv.bg");
        administrator.addRole(administratorRole);
        usersDB.add(user);
        usersDB.add(user2);
        usersDB.add(administrator);
        Topic topic = new Topic("F.A.Q.");
        Announcement announcement = new Announcement("Most common questions", "How to do X?", topic);
        Comment comment = new Comment("Solution", "You simply click Y", usersDB.get(0), announcement);
        topic.addAnnouncement(announcement);
        announcement.addComment(comment);
        topicsDB.add(topic);
    }

    public Role getRole(String roleCode) {
        for (Role role : rolesDB) {
            if (role.getRoleCode().equals(roleCode)) return role;
        }
        return null;
    }

    public User getUser(String username, String password) {
        for (User user : usersDB) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) return user;
        }
        return null;
    }

    public Topic getTopic(User user, String name) {
        if (user == null || !usersDB.contains(user)) return null;
        for (Topic topic : topicsDB) {
            if (topic.getName().equals(name)) return topic;
        }
        return null;
    }

    public Announcement getAnnouncement(User user, Topic topic, String title) {
        if (user == null || !usersDB.contains(user)) return null;
        if (topic == null || !topicsDB.contains(topic)) return null;
        for (Announcement announcement : topic.getAnnouncements()) {
            if (announcement.getTitle().equals(title)) return announcement;
        }
        return null;
    }

    public Comment getComment(User user, Announcement announcement, String title) {
        if (user == null || !usersDB.contains(user)) return null;
        if (announcement == null) return null;
        for (Comment comment : announcement.getComments()) {
            if (comment.getTitle().equals(title)) return comment;
        }
        return null;
    }

    public String deleteTopic(User user, Topic topic) {
        if (user == null || !usersDB.contains(user)) return "User does not exist!";
        if (topic == null || !topicsDB.contains(topic)) return "Topic does not exist!";
        if (!user.getRoles().contains(getRole("Administrator"))) return "Only administrators can delete topics!";
        return topicsDB.remove(topic) ? "Topic deleted successfully!" : "Topic could not be deleted!";
    }

    public String deleteAnnouncement(User user, Topic topic, Announcement announcement) {
        if (user == null || !usersDB.contains(user)) return "User does not exist!";
        if (topic == null || !topicsDB.contains(topic)) return "Topic does not exist!";
        if (announcement == null) return "Announcement does not exist!";
        if (!user.getRoles().contains(getRole("Administrator"))) return "Only administrators can delete announcements!";
        boolean deletedSuccessfully = announcement.getTopic().getAnnouncements().remove(announcement);
        return deletedSuccessfully ? "Announcement deleted successfully!" : "Announcement could not be deleted!";
    }

    public String deleteComment(User user, Topic topic, Announcement announcement, Comment comment) {
        if (user == null || !usersDB.contains(user)) return "User does not exist!";
        if (topic == null || !topicsDB.contains(topic)) return "Topic does not exist!";
        if (announcement == null) return "Announcement does not exist!";
        if (comment == null) return "Comment does not exist!";
        if (!user.getRoles().contains(getRole("Administrator")) && user != comment.getUser()) {
            return "Comments can only be deleted by the one who made them or by an administrator!";
        }
        boolean deletedSuccessfully = comment.getAnnouncement().getComments().remove(comment);
        return deletedSuccessfully ? "Comment deleted successfully!" : "Comment could not be deleted!";
    }

    public String createComment(User user, Topic topic, Announcement announcement, String title, String content) {
        if (user == null || !usersDB.contains(user)) return "User does not exist!";
        if (topic == null || !topicsDB.contains(topic)) return "Topic does not exist!";
        if (announcement == null) return "Announcement does not exist!";
        if (title == null || title.isEmpty()) return "Title cannot be empty!";
        if (content == null || content.isEmpty()) return "Content cannot be empty!";
        Comment comment = new Comment(title, content, user, announcement);
        announcement.addComment(comment);
        user.createComment(comment);
        return "Comment created successfully!";
    }
}
