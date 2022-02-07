Feature: Deleting a topic

  Scenario: Successful topic deletion
    Given Start topic deletion
    When Specify username: "Pencho"
    And Specify password: "Malinov"
    And Specify topic name: "F.A.Q."
    And Click delete button
    Then Display message: "Topic deleted successfully!"

  Scenario: Unsuccessful topic deletion due to no administrator rights
    Given Start topic deletion
    When Specify username: "Hristo"
    And Specify password: "Gochev"
    And Specify topic name: "F.A.Q."
    And Click delete button
    Then Display message: "Only administrators can delete topics!"

  Scenario: Unsuccessful topic deletion due to invalid credentials
    Given Start topic deletion
    When Specify username: "Pesho"
    And Specify password: "Peshev"
    And Specify topic name: "F.A.Q."
    And Click delete button
    Then Display message: "User does not exist!"


  Scenario: Unsuccessful topic deletion due to invalid topic name
    Given Start topic deletion
    When Specify username: "Pencho"
    And Specify password: "Malinov"
    And Specify topic name: "Archive"
    And Click delete button
    Then Display message: "Topic does not exist!"
