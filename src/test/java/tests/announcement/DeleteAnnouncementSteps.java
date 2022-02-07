package tests.announcement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class DeleteAnnouncementSteps {

    private DeleteAnnouncementModel model;

    @Given("^Start announcement deletion$")
    public void start_announcement_deletion() {
        model = new DeleteAnnouncementModel();
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

    @When("^Click delete button$")
    public void click_delete_button() {
        model.clickDeleteButton();
    }

    @Then("^Display message: \"([^\"]*)\"$")
    public void display_message(String expectedMessage) {
        assertEquals(expectedMessage, model.getMessage());
    }
}
