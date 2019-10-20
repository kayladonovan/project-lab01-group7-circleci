# Walkin Clinic DELIVIERABLE 1

This is our implementation of deliverable 1 of the Walkin Clinic app. 

## Team Members
| Name | Student Number |
| --- | --- |
| Kayla Donovan | 300057156 |
| Mahnam Nauman |  |
| Yutaro Miyata |  |
| Minh Ta Anh |  |
| Prashanth Sivoththaman |  |
| Mohannad Shaheen |  |

###DIRECTORIES
- Java files for the classes MainActivity (the login screen), RegistrationWindow (the register user screen), WelcomeWindow and Person (the user class) call all be found within the directory:
	WalkinClinic > app > src > main > java > com > example > walkinClinicv01

We did not implement seperate class files for each type of user, instead this was accomplished by storing each user's attributes within our database.
(To be specific, their role*, first and last names, and email were stored). 

- XML files for the activities acivity_main, activity_registration, and activity_welcome_window can be found in the directory:
	WalkinClinic > app > src > main > res > layout

###RUNTIME SCREENSHOTS
Please note:
A successful login or registration will appear as: 

- the login screen for a patient looks like:
- the registration screen for a patient looks like:
- the welcome screen for a patient looks like:


###DATABASE
For our implementation, Firebase was used.
Our database: https://console.firebase.google.com/u/1/project/walkinclinicv01/overview

Please also note: The admin user is stored as 
(under the directory : https://console.firebase.google.com/u/1/project/walkinclinicv01/database/walkinclinicv01/data)
		firstName = 'John'
		lastName = 'Doe'
		role = 'Admin'
		userName = 'admin'

###UML DIAGRAM
The UML diagram for our system can be found in the folder UML. Within the directory, there is a PNG file of the diagram as well as the corresponding umple code.