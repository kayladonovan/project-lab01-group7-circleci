# Walkin Clinic DELIVERABLE 3

This is our implementation of deliverable 3 of the Walkin Clinic app.

## Team Members
| Name | Student Number | Tasks | 
| --- | --- | --- |
| Kayla Donovan | 300057156 | displays, UML diagram |
| Mahnam Nauman | 8281780 | add service to clinic, remove service from clinic | 
| Yutaro Miyata | 8912340 | creating clinic, checking if employee has a clinic |
| Minh Ta Anh | 300078762 | assign/edit hours |
| Prashanth Sivoththaman | 8693247 | test classes |
| Mohannad Shaheen | 8571137 | view hours |

### DIRECTORIES
- Java files for the classes added, specifically the Clinic, Hours, WEeklySchedule, Info, ProfileInformation, EmployeeScreen, ClinicServicesScreen, AddServiceToProfile, DeleteServiceFromProfile, ClinicHours, and ListOfHours
can all be found within the directory:
	
    https://github.com/professor-forward/project-lab01-group7/tree/f/deliverable03/WalkinClinic/app/src/main/java/com/example/walkinclinicv01

    We did not implement seperate class files for each type of user, instead, this was accomplished by storing each user's attributes 
    within our database.
    (To be specific, their role*, first and last names, and email were stored). 

- XML files for the newly added activities acivity_clinic_services_screen, activity_profile_information, activity_clinic_hours, activity_list_of_hours, activity_add_clinic_to_profile, delete_clinic_from_profile and activity_employee_screen can be found in the directory:
	
    https://github.com/professor-forward/project-lab01-group7/tree/f/deliverable03/WalkinClinic/app/src/main/res/layout

- Test files relevant to the features of deliverable 1 and 2 can be found in the directory: 
	
    https://github.com/professor-forward/project-lab01-group7/tree/f/deliverable03/WalkinClinic/app/src/androidTest/java/com/example/walkinclinicv01 

	Test classes of sucessfully creating a clinic, adding and removing services to a clinic, assigning hours to the clinic, and viewing clinic (employee) hours were implemented.
	Note JUnit tests were used. 
	
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

### RUNTIME SCREENSHOTS

#### The login screen for an employee looks like:

![login]()

#### The welcome screen for an employee looks like:

![welcome]()

- A successful creation of an employee in the DB looks like:

![employee]()

#### After clicking the 'Add Service' button brings you to the AddServiceToProfile screen which looks like:

![add]()

- A successful addition of a service in a clinic in the DB looks like:
![add]()


#### After clicking the 'Delete Service' button brings you to the DeleteServiceFromProfile screen which looks like:

![delete]()

- After removing the service from the clinic the DB looks like:
![remove]()


#### After clicking the '(Re)Assign Clinic Hours' button brings you to the ClinicHours screen which looks like:

![hours]()


#### After clicking the 'View Clinic Hours' button brings you to the ListOfHours screen which looks like:

![list]()
