# simple-polymorphism-example

This project shows what is polymorhism on example of geometric figures.

Consider two classes: Triangle and Rectangle. 
For both types of figures it is possible to compute figure's perimeter and figure's area. 
So it make sense to create an interface Figure, which contains methods computePerimeter() and computeArea(). 
There are different implementations of these methods, according to the type of figure, but both can be called on an instance of Figure. 
This is done in the main method.
