package tests.comment;


import com.example.*;
import com.example.services.ForumService;

public class CommentModel {
    private String username;
    private String password;
    private String topicName;
    private String announcementTitle;
    private String commentTitle;
    private String commentContent;
    private String message;

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

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getAnnouncementTitle() {
        return announcementTitle;
    }

    public void setAnnouncementTitle(String announcementTitle) {
        this.announcementTitle = announcementTitle;
    }

    public String getCommentTitle() {
        return commentTitle;
    }

    public void setCommentTitle(String commentTitle) {
        this.commentTitle = commentTitle;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void clickDeleteButton() {
        ForumService service = new ForumService();
        User user = service.getUser(username, password);
        Topic topic = service.getTopic(user, topicName);
        Announcement announcement = service.getAnnouncement(user, topic, announcementTitle);
        Comment comment = service.getComment(user, announcement, commentTitle);
        message = service.deleteComment(user, topic, announcement, comment);
    }

    public void clickCreateButton() {
        ForumService service = new ForumService();
        User user = service.getUser(username, password);
        Topic topic = service.getTopic(user, topicName);
        Announcement announcement = service.getAnnouncement(user, topic, announcementTitle);
        message = service.createComment(user, topic, announcement, commentTitle, commentContent);
    }
}
