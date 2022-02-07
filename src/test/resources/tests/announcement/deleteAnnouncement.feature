Feature: Deleting an announcement

  Scenario: Successful announcement deletion
    Given Start announcement deletion
    When Specify username: "Pencho"
    And Specify password: "Malinov"
    And Specify topic name: "F.A.Q."
    And Specify announcement title: "Most common questions"
    And Click delete button
    Then Display message: "Announcement deleted successfully!"

  Scenario: Unsuccessful announcement deletion due to no administrator rights
    Given Start announcement deletion
    When Specify username: "Hristo"
    And Specify password: "Gochev"
    And Specify topic name: "F.A.Q."
    And Specify announcement title: "Most common questions"
    And Click delete button
    Then Display message: "Only administrators can delete announcements!"

  Scenario: Unsuccessful announcement deletion due to invalid credentials
    Given Start announcement deletion
    When Specify username: "Pesho"
    And Specify password: "Peshev"
    And Specify topic name: "F.A.Q."
    And Specify announcement title: "Most common questions"
    And Click delete button
    Then Display message: "User does not exist!"


  Scenario: Unsuccessful announcement deletion due to invalid topic name
    Given Start announcement deletion
    When Specify username: "Pencho"
    And Specify password: "Malinov"
    And Specify topic name: "Archive"
    And Specify announcement title: "Most common questions"
    And Click delete button
    Then Display message: "Topic does not exist!"

  Scenario: Unsuccessful announcement deletion due to invalid announcement title
    Given Start announcement deletion
    When Specify username: "Pencho"
    And Specify password: "Malinov"
    And Specify topic name: "F.A.Q."
    And Specify announcement title: "Answered questions"
    And Click delete button
    Then Display message: "Announcement does not exist!"