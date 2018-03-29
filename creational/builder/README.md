# Builder
The intent is to separate the construction of a complex object from its representation, so that the same construction
process can create different representations.

It solves problems like:

 - How can a class create different representations of a complex object?
 - How can a class that includes createing a complex object be simplified?

Use when:

 - the algorithm for creating a complex object should be independent of the parts that make up the object and how they're assembled,
 - the construction process must allow different representations for the object that's constructed.
 
![Class Diagram of Builder design pattern](http://www.dofactory.com/images/diagrams/net/builder.gif)

![Sequence Diagram of Builder design pattern](http://java.boot.by/scea5-guide/images/070205.gif)

Usage in Java SE API:

 - [String Builder](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html)
 - [Stream Builder](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.Builder.html)
 - [Process Builder](https://docs.oracle.com/javase/8/docs/api/java/lang/ProcessBuilder.html)

***
#### References

##### Online:
 - *[Builder Pattern @ en.wikipedia.org](https://en.wikipedia.org/wiki/builder_pattern)*,
 - *[Builder Pattern @ sourcemaking.com](https://sourcemaking.com/design_patterns/builder)*.

