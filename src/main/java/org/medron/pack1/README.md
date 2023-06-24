
# Creating and Destroying Objects

## [ITEM-1] Consider static factory methods instead of constructor
### Advantages


![img_4.png](img_4.png)


1- Advantage of static factory methods is that, unlike constructors,
they are not required to create a new object each time they’re invoked.

The ability of static factory methods to return the same object from repeated
invocations allows classes to maintain strict control over what instances exist at
any time. Classes that do this are said to be instance-controlled. There are several
reasons to write instance-controlled classes. Instance control allows a class to guar-
antee that it is a singleton (Item 3) or noninstantiable (Item 4). Also, it allows an
immutable value class (Item 17) to make the guarantee that no two equal instances
exist: a.equals(b) if and only if a == b. This is the basis of the Flyweight pattern
[Gamma95]. Enum types (Item 34) provide this guarantee.

2- dvantage of static factory methods is that, unlike constructors,
they can return an object of any subtype of their return type.


