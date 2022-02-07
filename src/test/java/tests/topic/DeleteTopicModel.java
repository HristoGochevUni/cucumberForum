package tests.topic;


import com.example.*;
import com.example.services.ForumService;

public class DeleteTopicModel {
    private String username;
    private String password;
    private String topicName;
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
        message = service.deleteTopic(user, topic);
    }
}
