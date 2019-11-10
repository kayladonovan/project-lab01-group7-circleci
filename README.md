# Walkin Clinic DELIVERABLE 2

This is our implementation of deliverable 2 of the Walkin Clinic app. 

## Team Members
| Name | Student Number | Tasks | 
| --- | --- | --- |
| Kayla Donovan | 300057156 | displays |
| Mahnam Nauman | 8281780 | UML diagram | 
| Yutaro Miyata | 8912340 | add service |
| Minh Ta Anh | 300078762 | admin class methods and authentication |
| Prashanth Sivoththaman | 8693247 | test classes |
| Mohannad Shaheen | 8571137 | edit, delete service |

### DIRECTORIES
- Java files for the classes added, specifically the AdminScreen (successful Admin login screen), AddService, DeleteService, EditService, and RemoveAccount
can all be found within the directory:
	WalkinClinic > app > src > main > java > com > example > walkinClinicv01

    We did not implement seperate class files for each type of user, instead, this was accomplished by storing each user's attributes within our database.
    (To be specific, their role*, first and last names, and email were stored). 

- XML files for the newly added activities acivity_add_service, activity_delete_service, activity_edit_service, activity_remove_account and activity_admin_screen can be found in the directory:
	WalkinClinic > app > src > main > res > layout

- Test files relevant to the features of deliverable 1 and 2 can be found in the directory: 
	WalkinClinic > app > src > androidTest > java > com > example > walkinClinicv01

	Tests of successfull and expected failed logins of Admin, Patients and Employees were implemented.

### RUNTIME SCREENSHOTS
Please note:
A successful login of the Administrator will appear as: 

- the login screen for admin looks like:

![alt text]()

- the welcome screen for admin looks like:

![alt text]()

- after clicking the 'Add Service' button brings you to the AddService screen which looks like:

![alt text]()

- after clicking the 'Edit Service' button brings you to the EditService screen which looks like:

![alt text]()

- after clicking the 'Delete Service' button brings you to the DeleteService screen which looks like:

![alt text]()

- after clicking the 'Remove Account' button brings you to the RemoveService screen which looks like:

![alt text]()


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
