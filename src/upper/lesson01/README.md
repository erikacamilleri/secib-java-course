# Data Management Systems

If you are building a productivity app of some sort, or a self-service application you will probably need to maintain some database. A database is a collection of data files. In case you are confused by this notion, and you are more used to thinking in terms of objects, probably some objects would represent a data file.

Managing data is a common problem in OOP applications therefore it comes as no surprise that there is a particular design pattern that we should follow.

## Data Access Object Design Pattern

The <a href="https://www.baeldung.com/java-dao-pattern">Data Access Object (DAO) pattern</a> is a structural pattern that allows us to isolate the application/business layer from the persistence layer (usually a relational database but could be any other persistence mechanism such as a File) using an <b>abstract</b> API.

## Link 4.3.1 Fundamental Operations of a Computer

If we had to rethink computers and reinvent entirely we still have to preserve the following basic functions:
- Create
- Read
- Delete
- Update
- Compare

It is only natural that we want to do all of the above with our data records. We want to create a record. We want to read it. We want to delete it. We want to make changes, so update it. And when we probably want to search, order data so we would need to compare two entities.



