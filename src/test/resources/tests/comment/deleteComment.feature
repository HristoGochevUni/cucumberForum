Feature: Deleting a comment

  Scenario: Successful comment deletion by owner
    Given Start comment crud
    When Specify username: "Hristo"
    And Specify password: "Gochev"
    And Specify topic name: "F.A.Q."
    And Specify announcement title: "Most common questions"
    And Specify comment title: "Solution"
    And Click delete button
    Then Display message: "Comment deleted successfully!"

  Scenario: Successful comment deletion by an administrator
    Given Start comment crud
    When Specify username: "Pencho"
    And Specify password: "Malinov"
    And Specify topic name: "F.A.Q."
    And Specify announcement title: "Most common questions"
    And Specify comment title: "Solution"
    And Click delete button
    Then Display message: "Comment deleted successfully!"

  Scenario: Unsuccessful comment deletion due to no rights
    Given Start comment crud
    When Specify username: "Petar"
    And Specify password: "Stoyanov"
    And Specify topic name: "F.A.Q."
    And Specify announcement title: "Most common questions"
    And Specify comment title: "Solution"
    And Click delete button
    Then Display message: "Comments can only be deleted by the one who made them or by an administrator!"

  Scenario: Unsuccessful comment deletion due to invalid topic name
    Given Start comment crud
    When Specify username: "Pencho"
    And Specify password: "Malinov"
    And Specify topic name: "Archive"
    And Specify announcement title: "Most common questions"
    And Specify comment title: "Solution"
    And Click delete button
    Then Display message: "Topic does not exist!"

  Scenario: Unsuccessful comment deletion due to invalid announcement title
    Given Start comment crud
    When Specify username: "Pencho"
    And Specify password: "Malinov"
    And Specify topic name: "F.A.Q."
    And Specify announcement title: "Answered questions"
    And Specify comment title: "Solution"
    And Click delete button
    Then Display message: "Announcement does not exist!"

  Scenario: Unsuccessful comment deletion due to invalid comment title
    Given Start comment crud
    When Specify username: "Pencho"
    And Specify password: "Malinov"
    And Specify topic name: "F.A.Q."
    And Specify announcement title: "Most common questions"
    And Specify comment title: "Solution3"
    And Click delete button
    Then Display message: "Comment does not exist!"