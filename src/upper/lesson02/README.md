## 4.2 Connection Computational Thinking and Program Design

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code. This is not a normal project but a repository of all the code that is meant to be like a course.

## 4.2.2 Standard operations of collections

We have demonstrated the use of ArrayList in Java which is a popular collection provided. In Java, a collection can store elements of the same data type. The most significant advantage is that they act like a resizable array 

## 4.2.3 Algorithms to solve a specific problem

So far we have seen very generic algorithms to process elements in an array. These are of course very useful but it is important to understand that algorithms need not be so mathematical and small. In fact, algorithms tend to grow, can be complex and do solve more businesslike problems. Solving problems is not an easy task! In fact, we do not just dive in head first into Java code.

Recall the beginning of this topic, we can express algorithms in the following manner:
- Simple English --> most ambiguous
- Flow charts
- Psuedocode
- Programming --> least ambiguous

You should always start describing problems in English and then work your way up to Programming in steps. After describing a problem in English, it is a good idea to visualise a solution either with a rough sketch of a screen, or perhaps a rough flow chart. From then should you start really thinking about pseudocode and your deliverable - which is the program of course!

### An Algorithm for User Authentication

Let's now consider a common problem in business, which is building a login screen for system users. However, a screen is not worth much if it is not hooked into back-end logic and this is the aspect we will be focusing on.

What is User Authentication in simple English?

User authentication is a process that allows a device to verify the identify of someone who connects to a network resource. 

<img src="https://raw.githubusercontent.com/erikacamilleri/bytesizelearning/main/java_assets/ib-upper-lesson02-user-authentication.png" width="auto" height="600" />

 The back-end logic can be found in the `user_authentication` folder.

 The following technical decisions have been made primarily because coding in Java requires a certain frame of mind:
 - Implemented the (Repository Pattern)[https://java-design-patterns.com/patterns/repository/] to maintain a list of User Accounts.
 - A UserAccount with constructor and standard property getters