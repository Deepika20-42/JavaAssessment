# JavaAssessment

Problem Statement
App to be coded:
------------------------
I want to board a train from London to France. The train ticket will cost $20.
Create API where you can submit a purchase for a ticket. Details included in the receipt are:
From, To, User , price paid.
User should include first and last name, email address
The user is allocated a seat in the train. Assume the train has only 2 sections, section A and section B.
An API that shows the details of the receipt for the user
An API that lets you view the users and seat they are allocated by the requested section
An API to remove a user from the train
An API to modify a user's seat


The Project Structure is as follows:

src
  -TrainApp.java (The entry point of the application. Implements a command-line interface (CLI) for interacting with the system)
  -User.java  (Represents a user with first name, last name, and email.)
  -Receipt.java (Represents a ticket receipt for a user)
  -TrainService.java (Contains the business logic for purchasing tickets, seat allocation, user management, etc)


Overview
This Java application implements an in-memory train ticket booking system. It allows users to book train tickets, view receipts, modify seat allocations, and manage users in different sections of the train. The train has two sections: Section A and Section B.



Features :-
Purchase Ticket:
---------------
Users can purchase a ticket for a trip from London to France, priced at $20.
Seat allocation alternates between Section A and Section B.
A receipt containing user details, the travel route, seat number, and ticket price is generated.

View Receipt:
--------------
Retrieve the receipt for a ticket using the user's email.

View Users by Section:
-----------------------
View all users seated in a specific section (either Section A or Section B).

Remove User:
------------
Remove a user and their ticket from the system using their email.

Modify Seat:
------------
Change the seat allocation for a specific user.



API Usage (Console Application)
The application is run via a simple console interface where the user can select an option to interact with the system.

Menu Options
1. Purchase Ticket:
The user provides their first name, last name, and email to book a ticket.
The system allocates a seat and provides a receipt with the trip details.
2. View Receipt:
Input the user's email to fetch the receipt.
If the receipt exists, the trip details and seat information are displayed.
3. View Users by Section:
Input a section (A or B) to view all users allocated to that section.
4. Remove User:
Input the user's email to remove their ticket and seat allocation from the system.
5. Modify Seat:
Input the user's email and the new seat number to modify their seat assignment.
6. Exit:

Exits the program.

How to Run the Application
Download/Clone the Repository:
----------------------
git clone <repository-url>
cd train-ticket-booking-system

Compile the Application:
-----------------------
Ensure you have Java installed (Java 8 or higher).
javac src/*.java
Run the Application:

java src/TrainApp
Follow the Console Prompts:
----------------
The application will display a menu where you can select different options for purchasing tickets, viewing receipts, etc.





  
