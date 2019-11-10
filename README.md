# Walkin Clinic DELIVERABLE 2

This is our implementation of deliverable 2 of the Walkin Clinic app.

## Team Members
| Name | Student Number | Tasks | 
| --- | --- | --- |
| Kayla Donovan | 300057156 | displays |
| Mahnam Nauman | 8281780 | UML diagram | 
| Yutaro Miyata | 8912340 | add service |
| Minh Ta Anh | 300078762 | admin class methods and authentication and create testing methods|
| Prashanth Sivoththaman | 8693247 | test classes |
| Mohannad Shaheen | 8571137 | edit, delete service |

### DIRECTORIES
- Java files for the classes added, specifically the AdminScreen (successful Admin login screen), AddService, DeleteService, EditService, and RemoveAccount
can all be found within the directory:
	
    WalkinClinic > app > src > main > java > com > example > walkinClinicv01

    https://github.com/professor-forward/project-lab01-group7/tree/f/deliverable02/WalkinClinic/app/src/main/java/com/example/walkinclinicv01

    We did not implement seperate class files for each type of user, instead, this was accomplished by storing each user's attributes 
    within our database.
    (To be specific, their role*, first and last names, and email were stored). 

- XML files for the newly added activities acivity_add_service, activity_delete_service, activity_edit_service, activity_remove_account and activity_admin_screen can be found in the directory:
	
    WalkinClinic > app > src > main > res > layout

    https://github.com/professor-forward/project-lab01-group7/tree/f/deliverable02/WalkinClinic/app/src/main/res/layout

- Test files relevant to the features of deliverable 1 and 2 can be found in the directory: 
	
    WalkinClinic > app > src > androidTest > java > com > example > walkinClinicv01

    https://github.com/professor-forward/project-lab01-group7/tree/f/deliverable02/WalkinClinic/app/src/androidTest/java/com/example/walkinclinicv01 

	Test classes of successfull logins of Admin, Patients and Employees were implemented. Further, tests for expected failed logins were also created. 
	Note JUnit tests were used. 

### RUNTIME SCREENSHOTS
Please note:
A successful login of the Administrator will appear as: 

- the login screen for admin looks like:

![login](https://github.com/professor-forward/project-lab01-group7/blob/f/deliverable02/screenshots/adminLogin.png)

- the welcome screen for admin looks like:

scroll view, part 1/2
![welcome](https://github.com/professor-forward/project-lab01-group7/blob/f/deliverable02/screenshots/scrollViewAdminScreen1.png)

scroll view, part 1/2
![welcome](https://github.com/professor-forward/project-lab01-group7/blob/f/deliverable02/screenshots/scrollViewAdminScreen2.png)

- after clicking the 'Add Service' button brings you to the AddService screen which looks like:

![add](https://github.com/professor-forward/project-lab01-group7/blob/f/deliverable02/screenshots/addServiceScreen.png)

- after clicking the 'Edit Service' button brings you to the EditService screen which looks like:

![edit](https://github.com/professor-forward/project-lab01-group7/blob/f/deliverable02/screenshots/editServiceScreen.png)

- after clicking the 'Delete Service' button brings you to the DeleteService screen which looks like:

![delete](https://github.com/professor-forward/project-lab01-group7/blob/f/deliverable02/screenshots/deleteServiceScreen.png)

- after clicking the 'Remove Account' button brings you to the RemoveService screen which looks like:

![remove](https://github.com/professor-forward/project-lab01-group7/blob/f/deliverable02/screenshots/removeUserScreen.png)


### DATABASE
For our implementation, Firebase was used.
Our database: https://console.firebase.google.com/u/1/project/walkinclinicv01/overview

Please also note: the admin user is stored as 
(under the directory : https://console.firebase.google.com/u/1/project/walkinclinicv01/database/walkinclinicv01/data)
> ~~firstName = 'John',~~
> ~~lastName = 'Doe',~~
> ~~role = 'Admin',~~
> ~~userName = 'admin'~~
>>role = 'Admin',
> userName = 'qwe@gmail.com' ,
> password = '123456'

### UML DIAGRAM
The UML diagram for our system can be found in the folder UML. Within the directory, there is a PNG file of the diagram as well as the corresponding umple code.
