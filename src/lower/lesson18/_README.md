# Construct related objects for a given problem (D.1.8)

Taken straight from the IB Comp Sci Guide:

> In *examinations* problems will require students to construct definitions of no more than three objects and to explain their relationships to each other and any additional classes defined by the examiners. 

The keyword here is *exam* so I guess then this is our cue to look at a past paper. Are you ready?

## May 2016 Paper 2 Option D

14 a. The relationship between the `Client` and `Room` is a *uses* relationship, to explain, the `Client` has to make use of *one* `Room`. In OOP this can be referred to as aggreagtion since the instansiation of a `Client` loosely depends on having one `Room` and is drawn as an empty diamond in a UML.

*In the MS they said it was simple association, aggregation is a more specific kind of association, so the above should still be correct.*

14 b. <img src=""/>

14 c. If we did not have a class for `Dates`, then perhaps we would have stored a `date` in an `int` array e.g. {2, 5, 2022} where 2 is the day, 5 is the month and 2022 is the year. However, if we encapsulate all this data in its own class, then we have to opportunity to add methods which can convert '2' to Monday (as an example).

