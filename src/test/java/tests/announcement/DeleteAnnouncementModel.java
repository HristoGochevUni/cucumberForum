package tests.announcement;

import com.example.*;
import com.example.services.ForumService;

public class DeleteAnnouncementModel {
    private String username;
    private String password;
    private String topicName;
    private String announcementTitle;
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
        message = service.deleteAnnouncement(user,topic, announcement);
    }
}
