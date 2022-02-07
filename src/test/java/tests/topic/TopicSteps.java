package tests.topic;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tests.comment.CommentModel;

import static org.junit.Assert.assertEquals;

public class TopicSteps {

    private DeleteTopicModel model;

    @Given("^Start topic deletion$")
    public void start_topic_deletion() {
        model = new DeleteTopicModel();
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

    @When("^Click delete button$")
    public void click_delete_button() {
        model.clickDeleteButton();
    }

    @Then("^Display message: \"([^\"]*)\"$")
    public void display_message(String expectedMessage) {
        assertEquals(expectedMessage, model.getMessage());
    }
}
