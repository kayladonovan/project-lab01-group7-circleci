# Walkin Clinic DELIVERABLE 1

This is our implementation of deliverable 1 of the Walkin Clinic app. 

## Team Members
| Name | Student Number | Tasks | 
| --- | --- | --- |
| Kayla Donovan | 300057156 | create UI |
| Mahnam Nauman |  | password management | 
| Yutaro Miyata |  | firebase implementation/ UI modifications |
| Minh Ta Anh | 300078762 | firebase implementation/ UI modifications |
| Prashanth Sivoththaman | 8693247 | UML diagrams |
| Mohannad Shaheen |  | UML diagrams |

### DIRECTORIES
- Java files for the classes MainActivity (the login screen), RegistrationWindow (the register user screen), WelcomeWindow and Person (the user class) call all be found within the directory:
	WalkinClinic > app > src > main > java > com > example > walkinClinicv01

    We did not implement seperate class files for each type of user, instead, this was accomplished by storing each user's attributes within our database.
    (To be specific, their role*, first and last names, and email were stored). 

- XML files for the activities acivity_main, activity_registration, and activity_welcome_window can be found in the directory:
	WalkinClinic > app > src > main > res > layout

### RUNTIME SCREENSHOTS
Please note:
A successful login or registration will appear as: 

- the login screen for a patient looks like:
![alt text](https://github.com/professor-forward/project-lab01-group7/blob/f/deliverable01/screenshots/activity_main..PNG)

- the empty registration screen for a patient looks like:
![alt text](https://github.com/professor-forward/project-lab01-group7/blob/f/deliverable01/screenshots/activity_registration.PNG)

- the correctly filled registration screen for a patient looks like:
![alt text](https://github.com/professor-forward/project-lab01-group7/blob/f/deliverable01/screenshots/activity_registration_filled.PNG)

- the welcome screen for a patient looks like:
![alt text](https://github.com/professor-forward/project-lab01-group7/blob/f/deliverable01/screenshots/activity_welcome_window.PNG)

### DATABASE
For our implementation, Firebase was used.
Our database: https://console.firebase.google.com/u/1/project/walkinclinicv01/overview

Please also note: the admin user is stored as 
(under the directory : https://console.firebase.google.com/u/1/project/walkinclinicv01/database/walkinclinicv01/data)
> firstName = 'John',
> lastName = 'Doe',
> role = 'Admin',
> userName = 'admin'

### UML DIAGRAM
The UML diagram for our system can be found in the folder UML. Within the directory, there is a PNG file of the diagram as well as the corresponding umple code.
