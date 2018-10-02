Feature: Gmail Login
Scenario: validate gmail site
Given launch gmail site
Then title is "Gmail" for home page
And close site
Scenario: validate gorgot email link
Given launch gmail site
When click forgot email link
Then phone number or email is displayed
And close site