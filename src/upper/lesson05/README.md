If you are building a productivity app of some sort, or a self-service application you will probably need to maintain some database. A database is a collection of data files. In case you are confused by this notion, and you are more used to thinking in terms of objects, probably some objects would represent a data file.

Again, for this problem, we have another design pattern to help us out...

# Data Access Object Design Pattern

The Data Access Object (DAO) pattern is a structural pattern that allows us to isolate the application/business layer from the persistence layer (usually a relational database but could be any other persistence mechanism) using an abstract API.

https://www.baeldung.com/java-dao-pattern

# Car Rental App

In order to demonstrate this design pattern, we will be looking into the scenario of a Car Rental App. To come up with the structure for this lesson, I did not have much time to architect a complex rental app solution. So I looked to others for some ideas. I always like looking for UX case study articles on the internet. In fact, this lesson was inspired by this (article)[https://medium.com/my-design-journal/ux-study-hertz-mobile-app-rental-customization-f8219ed4192a]. 

## Other Interesting UX Case Studies:
* (Physician Assistant)[https://uxplanet.org/data-speaks-lean-ux-approach-to-a-physician-assistant-system-e89d729c1c3c]
* (Book Renting App)[https://www.behance.net/gallery/104092279/Biblichor-Book-Renting-App-(Ux-Case-Study)]
* (Reminders App)[https://www.elenamargolin.com/remind-app-case-study]