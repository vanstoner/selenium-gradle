# selenium-gradle
gradle build that executes selenium test

build / execute by running 
gradle test

Currently this executes selenium, opens the gmail login page and does a string compare of an expected page title vs. actual.

The test as configured, should fail.

After execution, Junit XML output is located in build/test-results/TEST-myFirstTestngSelenium.MyFirstJunitClass.xml
