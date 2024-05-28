Introduction:

The Feedback Management System is a web application designed to allow users to submit feedback and retrieve feedback previously submitted. 
The system provides features for managing feedback, including viewing, editing, and deleting feedback entries.The Feedback Management System provides a 
simple and efficient way for users to submit and retrieve feedback. With features for managing feedback entries, the system helps organizations collect 
valuable feedback from their customers and make informed decisions based on the feedback received.


Features:

-Feedback Submission
-Feedback Retrieval
-Feedback Management


Feature Explain:

-Feedback Submission:
  1)Users can submit feedback through a form on the website.
  2)The form includes fields for comments, customer ID, rating, and submission date.
  3)Upon submission date and customer id , the feedback is saved in the database.
  
-Feedback Retrieval:
  1)Users can retrieve their previously submitted feedback.
  2)Retrieval can be done by customer ID or any other unique identifier.
  3)The system displays the feedback along with details such as comments, rating, and submission date.
  
-Feedback Management
  1)Management includes viewing, editing, and Response to feedback.
  2)Admins can search for feedback by various criteria, such as customer ID or submission date.
  3)comments, rating, or other details are viewed 
  
  

Architecture:

-The application is built using the Quarkus framework for Java.
-Hibernate ORM is used for object-relational mapping to interact with the PostgreSQL database.
-SwaggerHub is used for for designing APIs
-


Database Schema:

-The database schema includes a table for storing feedback entries with 
 columns for ID, comments, customer ID, rating, and submission date.
-The database deployed on Docker Demon



API Endpoints:

Submit Feedback:
Endpoint: POST /feedback
Request Body: JSON with fields for comments, customer ID, rating, and submission date.

Retrieve Feedback:
Endpoint: GET /feedback/{customerId}
Path Parameter: Customer ID to retrieve to ALL feedback .
Response: JSON array of feedback entries for the customer ID.

Retrieve Specific Feedback:
Endpoint: PUT /feedback/{id}
Path Parameter: ID of the feedback entry to edit.
Request Body: JSON with updated fields for the feedback entry.
