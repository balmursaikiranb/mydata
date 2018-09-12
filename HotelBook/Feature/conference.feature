Feature: Conference room Booking
  This feature will check Conference hall booking event

  @execute
  Scenario: User will book conference room with invalid information
    Given User Conference room booking page to book the room
    When User click on 'Next' link without entering 'FirstName'
    Then Display the message 'Please fill the First Name'
    When User click on 'Next' link without entering 'LastName'
    Then Display the message 'Please fill the Last Name'
    When User click on 'Next' link without entering 'Email'
    Then Display the message 'Please fill the Email'
    When User click on 'Next' link after entering invalid 'Email' address
    Then Display the message 'Please enter valid Email Id.'
    When User click on 'Next' link without entering 'Contact No'
    Then Display the message 'Please fill the Contact No.'
    When User click on 'Next' link after entering invalid 'Contact No'
    Then Display the message 'Please enter valid Contact no.'
    When User click on 'Next' link without selecting  'Number of people attending'
    Then Display the message 'Please fill the Number of people attending'
    When User click on 'Next' link without entereing  'Building Name & Room No'
    Then Display the message 'Please fill the Building & Room No'
    When User click on 'Next' link without entereing  'Area Name'
    Then Display the message 'Please fill the Area name'
    When User click on 'Next' link without selecting  'City'
    Then Display the message 'Please select city'
    When User click on 'Next' link without selecting  'State'
    Then Display the message 'Please select state'
    When User click on 'Next' link without selecting  'MemberShip Status '
    Then Display the message 'Please Select MemeberShip status'

  @execute
  Scenario: User will book conference room with Valid information
    Given User Conference room booking page to book the room
    When User click on 'Next' link after entering Valid information
    Then Display the message 'Personal details are validated.'
