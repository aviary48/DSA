package solidPrinciples.liscovSubstitution;

/*
    states that derived classes mus tbe substitutable for their base classes.
    or
    Objects of a superclass should be replaceable with objects of its subclasses without breaking functionality, example is: if S is a subclass of Bm then the objects
    of B may be replaced with objects of type S, without any issues, meaning objects of subclass should behave in the same way as the superclass.
    in lay-man terms,
    if a Father is a farmer, then the child can also be a farmer, but if the child wants to be an engineer, even though he knows farming, he can't be forced to do farming.
    but if he wants to do farming then he should do farming.

    below code puts this in action.

    if we have a class Bird and it has a method fly(), pigeon class can extend and inherit the fly method, Penguin can inherit but will throw exception because penguines
    don't fly, essentially breakig Liscov substitution law.

    Best way to implement is to have two classes, FlyingBird which has method fly() and Bird which doesn't have property/object of flying

 */


public class FlyingBird {


    public void fly(){

    }

}
