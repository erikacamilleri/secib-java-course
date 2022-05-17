# Construct related objects for a given problem (D.1.8)

Taken straight from the IB Comp Sci Guide:

> In *examinations* problems will require students to construct definitions of no more than three objects and to explain their relationships to each other and any additional classes defined by the examiners. 

The keyword here is *exam* so I guess then this is our cue to look at a past paper. Are you ready?

## May 2016 Paper 2 Option D

14 a. The relationship between the `Client` and `Room` is a *uses* relationship, to explain, the `Client` has to make use of *one* `Room`. In OOP this can be referred to as aggreagtion since the instansiation of a `Client` loosely depends on having one `Room` and is drawn as an empty diamond in a UML.

*In the MS they said it was simple association, aggregation is a more specific kind of association, so the above should still be correct.*

14 b. <img src=""/>

14 c. If we did not have a class for `Dates`, then perhaps we would have stored a `date` in an `int` array e.g. {2, 5, 2022} where 2 is the day, 5 is the month and 2022 is the year. However, if we encapsulate all this data in its own class, then we have to opportunity to add methods which can convert '2' to Monday (as an example).

14 d. The code below:

```
public void bill()   { 
        int numberOfNights = Date.stayDays(arrive, leave);
        double total = numberOfNights * bedroom.price;
        System.out.println("Name: " + name);
        System.out.println("Price per night: " + bedroom.price);
        System.out.println("Number of nights: " + numberOfNights);
        System.out.println("Dates: " + arrive + " - " + leave);
        System.out.println("Total Due: " + total); 
    }
```
15 a. The code below:

```
public class GClient extends Client {

    private Group g;

    private List<Room> rooms;
    
    public GClient(int id, String c, Date dateIn, Date dateOut, List rooms, Group g) {
        super(id, c, dateIn, dateOut, null);
        this.rooms = rooms;
        this.g = g;
    }

    public Group getGroup() {
        return this.g;
    }

    public List<Room> getRoom() {
        return this.rooms;
    }
}
```

15 b. We need to create an instance of the `Group` object for "HappyTravellers" like so:
```
Group happyTravellers = new Group("HappyTravellers", 15);
```
We also need to create an instance of the `GClient` object and pass into the constructor: an id; two dates (for the stay) and the instance of `Group`, `happyTravellers`.
```
Date startDate = new Date(15, 5, 2022);
Date endDate = new Date(27, 5, 2022);
GClient happyTravellersGroup = new GClient(1, startDate, endDate, happyTravellers);
```

Inside the `GClient` object we can define a method `allocateRooms` that will use the `Hotel` object that has the method `findRooms` that returns an array of vacant room numbers. We will loop through the first 15 numbers, and using the `Room` object create an instance of `Room` with the `roomNumber`. The rooms are added to a collection called `rooms`.

15 c. The code below:

```
public double bill(int[] gRooms) { 
        double totalCost = 0;
        // method that calculates the bill for the group
        for (int i = 0; i < gRooms.length; i++) {
            Room room = Hotel.getRoomByNumber(gRooms[i]); // assuming I have access to all rooms 
            totalCost = totalCost + room.price;
        }
        return  totalCost;    
    }
```

16 a. One of the responsibilities is to make sure that the code produced *addresses the needs of the new hotel*. As part of the craft, code should be *readable* so that more changes in the future are relatively easy to do. Make sure the end-product is really *usable*. It is also critical for the programmer to *test* what he/she built.

16 b. Most programming languages support unicode because of data portability. Programming languages like Java come with a lot of libraries, and a localisation library would be really useful when supporting multiple languages. For wide distribution, it is better to sell an executable. Use many tools available in order to program options that the client can set and save into a file. 
