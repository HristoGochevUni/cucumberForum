package com.example;

import java.util.HashSet;
import java.util.Set;

public class User {
    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.roles.add(new Role("User"));
    }

    private String username;

    private String password;

    private String email;

    private Set<Role> roles = new HashSet<>();

    private Set<Comment> comments = new HashSet<>();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public void addRole(Role role) {
        this.roles.add(role);
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void createComment(Comment comment) {
        this.comments.add(comment);
    }
}