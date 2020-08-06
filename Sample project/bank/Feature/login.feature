Feature: Sign up function successfully
Scenario Outline:Sign up E-commerce site.
Given user navigates to sign up page
When I enter email address as "<email>","<firstname>","<lastname>","<password>","<address>","<phoneno>","<city>","<state>","<country>"
Examples:
|email|firstname|lastname|password|address|phoneno|city|state|country|status|
|sasi223@smail.com|renu1|raj|Asahi@123|ss|1234567890|chennai|Indiana|United States|Created successfully|
