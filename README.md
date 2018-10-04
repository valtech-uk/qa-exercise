![Valtech logo](http://i.imgur.com/32Oipl4.png "Valtech logo")

QA exercise
==============================

Overview
--------

We are interested in your approach to the following problems.

Please do the test in Selenium with a proper Object Oriented Programming
language using automated testing best practices. This is expected to
take no more than 1 hour. 

Getting started
---------------
Fork this project.

Commit each exercise once you've finished with it.

Exercise #1
-----------
Create Page Object Model framework for www.valtech.co.uk to do the exercise 2 & 3 
  
Exercise #2
-----------
Navigate to www.valtech.co.uk HOME PAGE
- a. Assert that the “Recent Blogs” section is displaying
- b. Click on the first blog article & then assert that the page title is present

Exercise #3
-----------
- a. Navigate to ABOUT, SERVICES and WORK pages via top navigation and assert that H1 tag in each page is displaying the relevant page name. Ex H1 tag in Services page is displaying as “Services”

- b. Navigate to Contact page (/about/contact-us) and output how many Valtech offices in total

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
