![Valtech logo](http://i.imgur.com/32Oipl4.png "Valtech logo")

QA exercise
==============================

Overview
--------

We are interested in your approach to the following problems.

Please do the test in Selenium with a proper Object Oriented Programming
language using automated testing best practices and using BDD gerkin language to define the acceptance tests. This is expected to
take no more than 1 hour. 

Getting started
---------------
Fork this project.

Commit each exercise once you've finished with it.

Exercise #1
-----------
- Create Page Object Model framework for www.valtech.co.uk to do the exercise 2 & 3 
- Driver manager pattern. We should be able to run the test framework against Chrome, Firefox and Microsoft Edge browsers
  
Exercise #2
-----------
Navigate to https://www.valtech.com/en-gb HOME PAGE
- Assert that the “Partners” section is displaying
- Click on "Our Partners"button on the Partners page  
- Capture and Print a list of all the partners across industries in the test report or to the console 

Exercise #3
-----------
- a. Navigate to offices
- b. Verify and print a list of all offices in the UK  in the test report or to the console 

Exercise #4
-----------
README file - Include instructions on how to set up and execute your tests on a clean install of Windows/MacOS
Bonus point: Test execution on Docker instances 

Finish up
---------
Once you're finished, commit & push your changes, send us a link to your fork.

Framework Summary
---------

# Compatibility
- Before you run test, make sure your firefox version to be >50 as am using selenium 3

# How to run
G0 to root directory
  - COMMAND : mvn clean test
  - go to src/test/java/com/valtech and run RunCukesTest.java

# Dependencies Used
- Junit
- Cucumber  (selected framework)
- Webdriver manager  (to download all browser drivers )
- Selenium  (to interact with UI)
- Hamcrest (To assert)
- Cucumber-picocontaine (for dependency injections )

# Highlights
- Used page object model
- Used page factory
- Used Dependency injection concept (piko-container form Cucumber)

# Improvements
  - Will be nice to take screen shot on every test failure.
