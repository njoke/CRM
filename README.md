# Knock
Assessment for Knock

Introduction:
Simple automated test to verify the schedule appointment functionality

Prerequisite:
- Java is installed and Java path in system variables. 
- Maven is installed and maven path in system variables.
- IDE (Eclipse or any other)
- Chrome browser
- Chomedriver on the local machine. 

Clone the following github repository:
- njoke/Knock

Test Framework is implemented with:
- Java
- Selenium
- Test NG
- Maven

Setup:
- Open the Maven project
- Navigate to src/test/java.testcases
- Open the testcase scheduletourTest
- Replace the following with your local paths:
	- Chrome webdriver path : <YOURPATH\\drivers\\chromedriver.exe
	- Chrome browser path : <YOURPATH\\drivers\\chrome.exe
- Save the file
Testcase:
 - Click the Schedule a Tour button
 - Select a date and time
 - Fill iFirst name, Last name, Email, Phone,Message
 - Click Book tour! button
 - Validated booking is confirmed.
Testcase assumptions:
 - Appointment is 5 days from today
 - Test case is running on chrome only

Running the test:

From command line:
* >mvn clean
* >mnv test
	
From IDE:
Run As > TestNG Test
	
Other tests for Appointment Booking:
- Cancel appointment
- Reschedule appointment
- Validate that after booking appointment time slot is no longer available.
- Cancelling appointment releases the time slot
- Try to cancel the appointment less than 24hrs
- Appointment can be added to calender (gmail calender..etc)
- Try to make an appointment in the past
- Try to enter invalid data in the textboxes.
- Try to book all available time slots using the same user(idiot-proof)
- Make sure all the spellings are GUI are correct.
- Test can also can be done via the API

Cross platform Testing can be done with:
- TestNG
- Selenium Grid
- Sauce Labs
- LambdaTest

CI/CD intergration
This test can be intergrated with a CI/CD tool such as Jenkins. To manage this steps:
- Pulling code from version control and executing a build
- Automated start up or tear down test infrastructure.
- Managing the environment variables and configuring them for the target environment.
- Executing continuous tests and rollback environments if tests fail.
- Providing log data and alerts on the state of testing.

If you have any issues or questions, please send me an email at njoken.qa@gmail.com
