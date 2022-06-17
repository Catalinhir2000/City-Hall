A city hall wants to install surveillance cameras at all intersections in a city.
To do this, it must connect all intersections with data cables, along the streets between them, such that the resulting network is connected.
We assume that the lengths (in km) of the streets between all the intersections of the city are known and the costs of installing the cables is proportional with the street lengths.
The problem is to determine how to install the data cables (on which streets) such as the total cost is minimum.

Example (the dots are the intersections, the lines are the streets)


The main specifications of the application are:

Compulsory (1p)

Create a Maven project.
Create an object-oriented model of the problem. Streets have names and lengths, intersections have names. A street joins two intersections.
Create the streets and the intersections of the problem described in the example. Use streams in order to easily create the intersections.
Create a list of streets, using LinkedList implementation and sort it by the length, using a comparator expressed as a lambda-expression or method reference. Make sure all the objects are comparable.
Create a set of intersections, using a HashSet implementation. Verify the property that a Set does not contain duplicates.
Homework (2p)
Create a class that describes the city.
Using Java Stream API, write a query that display all the streets that are longer than a specified value and join at least 3 streets.
Use a third-party library in order to generate random fake names for intersections and streets.
You may use this package of JGraphT in order to solve the problem (or other library).
Note: A personal implementation of the algorithm will be will be scored extra (+1p).
