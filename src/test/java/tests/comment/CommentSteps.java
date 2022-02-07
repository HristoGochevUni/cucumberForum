package tests.comment;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class CommentSteps {

    private CommentModel model;

    @Given("^Start comment crud$")
    public void start_comment_crud() {
        model = new CommentModel();
    }

    @When("^Specify username: \"([^\"]*)\"$")
    public void specify_username(String username) {
        model.setUsername(username);
    }

    @When("^Specify password: \"([^\"]*)\"$")
    public void specify_password(String password) {
        model.setPassword(password);
    }

    @When("^Specify topic name: \"([^\"]*)\"$")
    public void specify_topic_name(String topicName) {
        model.setTopicName(topicName);
    }

    @When("^Specify announcement title: \"([^\"]*)\"$")
    public void specify_announcement_title(String announcementTitle) {
        model.setAnnouncementTitle(announcementTitle);
    }

    @When("^Specify comment title: \"([^\"]*)\"$")
    public void specify_comment_title(String commentTitle) {
        model.setCommentTitle(commentTitle);
    }

    @When("^Specify comment content: \"([^\"]*)\"$")
    public void specify_comment_content(String commentContent) {
        model.setCommentContent(commentContent);
    }

    @When("^Click delete button$")
    public void click_delete_button() {
        model.clickDeleteButton();
    }

    @When("^Click create button$")
    public void click_create_button() {
        model.clickCreateButton();
    }

    @Then("^Display message: \"([^\"]*)\"$")
    public void display_message(String expectedMessage) {
        assertEquals(expectedMessage, model.getMessage());
    }
}
