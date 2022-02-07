Feature: Creating a comment

  Scenario: Successful comment creation
    Given Start comment crud
    When Specify username: "Hristo"
    And Specify password: "Gochev"
    And Specify topic name: "F.A.Q."
    And Specify announcement title: "Most common questions"
    And Specify comment title: "Second rate solution"
    And Specify comment content: "You click the second thing"
    And Click create button
    Then Display message: "Comment created successfully!"

  Scenario: Unsuccessful comment creation due to invalid credentials
    Given Start comment crud
    When Specify username: "Pesho"
    And Specify password: "Peshev"
    And Specify topic name: "F.A.Q."
    And Specify announcement title: "Most common questions"
    And Specify comment title: "Second rate solution"
    And Specify comment content: "You click the second thing"
    And Click create button
    Then Display message: "User does not exist!"

  Scenario: Unsuccessful comment creation due to invalid topic name
    Given Start comment crud
    When Specify username: "Hristo"
    And Specify password: "Gochev"
    And Specify topic name: "Archive"
    And Specify announcement title: "Most common questions"
    And Specify comment title: "Second rate solution"
    And Specify comment content: "You click the second thing"
    And Click create button
    Then Display message: "Topic does not exist!"

  Scenario: Unsuccessful comment creation due to invalid announcement title
    Given Start comment crud
    When Specify username: "Hristo"
    And Specify password: "Gochev"
    And Specify topic name: "F.A.Q."
    And Specify announcement title: "Answered questions"
    And Specify comment title: "Second rate solution"
    And Specify comment content: "You click the second thing"
    And Click create button
    Then Display message: "Announcement does not exist!"

  Scenario: Unsuccessful comment creation due to empty comment title
    Given Start comment crud
    When Specify username: "Hristo"
    And Specify password: "Gochev"
    And Specify topic name: "F.A.Q."
    And Specify announcement title: "Most common questions"
    And Specify comment title: ""
    And Specify comment content: "You click the second thing"
    And Click create button
    Then Display message: "Title cannot be empty!"

  Scenario: Unsuccessful comment creation due to empty comment content
    Given Start comment crud
    When Specify username: "Hristo"
    And Specify password: "Gochev"
    And Specify topic name: "F.A.Q."
    And Specify announcement title: "Most common questions"
    And Specify comment title: "Second rate solution"
    And Specify comment content: ""
    And Click create button
    Then Display message: "Content cannot be empty!"