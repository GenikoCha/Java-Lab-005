# Java-Lab-005 - Conditions Game

Last week we learned a bit about Java Methods, and we've already been introduced to a special method called a constructor whether you know it or not! A constructor is a special method inside a class definition that is always **public** has **no return type** and is named **exactly the same as the class itself.** Why? Well we're learning about object oriented programming, which means we need to **construct** objects, and that is exactly what a constructor does! A constructor is always **public** because we always need to **create an object outside of its class definition.** A constructor has **no return type** because, along with the help of the **new** operator, it returns a **memory reference** to the **object** it creates by default! You've seen this in action MANY times now:

```
Scanner s = new Scanner(System.in);
```

This uses the **new** operator and the **Scanner(System.in)** constructor call to assign to **s** a memory reference that refers to a **Scanner** object! In fact, nearly every time you've seen the keyword **new** it is calling some class's constructor to return a memory reference to an object created somewhere in a computer's memory! Hence, we call **s** an object because it points to one.

Well this week, you are going to use your new knowledge about Methods and Constructors to create your first classes, and its methods. Thus, you may not be familiar with another term quite yet, and that is **instance variables.** You know what variables are, and instance variables are similar, they are just defined within the **class** but outside the **methods.** They are typically defined at the top of the class, and they are **NON-static** variables that dictate what **state** an **object** of that **class type** is in. Take the first class you will create for example, a Dice class. You can have many dice, and that dice can have **n** sides (at least 2). Thus, an instance variable for a Dice class will be **sides,** and the constructor method for the Dice class will take the number of **sides** as a parameter, so you can initialize the object's number of sides.

```java
public class Dice {
    private int sideFacingUp;
    private int sides;
    private Random randomGenerator;

    // Constructor
    public Dice(int sides) {
        this.sides = sides;  // this is a keyword for "this" object that's being created.
    }

}

Dice d1 = new Dice(6);
Dice d2 = new Dice(20);
```

See, Dice is the class, which has an instance variable **sides,** but d1 and d2 are **objects** that need their **own copy of sides.** Hence, this is what makes it an instance variable! Instead of being **static** and shared by the Dice class, it is **NON-static** and when the Dice gets constructed via the **new** operator (i.e. new Dice(6)) the new operator and constructor create an object somewhere in memory and designate a memory location nearby for any non-static method OR instance variable! Thus, d1 and d2 both have **sides,** but they can be set to different values, unlike **static** variables!

Similarly, **NON-static** methods are instance methods and are called by objects (instances of a Class), unlike **static** methods that are global and therefore called by the Class.

I hope this diatribe just sparked an aha-moment, but if not, hopefully finishing the lab and connecting the dots within will!


## Part 1 - Creating the Dice Class
1. Create a class named **Dice** that has 3 private instance variables:
    * HINT: You'll need an import for class **Random**

           private int sideFacingUp;
           private int sides;
           private Random randomGenerator;
2. Create a Dice **constructor** that takes an integer parameter **sides**, assigns it to the instance variable **sides**, and initializes an instance of the **Random** class.
3. Add two methods to the Dice class
    * Method 1 should be named **roll** and should use **randomGenerator** to generate a random number between 1 and **sides**, and assign that number to the instance variable **sideFacingUp**
    * Method 2 should be named **view** and should simply return the value stored in the instance variable **sideFacingUp**

## Part 2 - Creating the Player Class
1. Create a class name **Player** that has 2 private instance variables:

        private String name;
        private int score;
2. Create a Player **constructor** that takes a **String** parameter **name** and assigns the **name** parameter to the instance variable **name**.
3. Add three methods to the Player class
    * Method 1 should be named **getName** and should return the **name** instance variable.
    * Method 2 should be named **getScore** and should return the **score** instance variable.
    * Method 3 should be named **toss** and should roll the die and record its view in the **score** instance variable.

## Part 3 - Playing the Game
1. Create a Game **constructor** that takes a **Player p1** parameter, a **Player p2** parameter, and a **Dice die** parameter, and then assigns the parameters to the **Game** instance variables.
2. Implement 3 methods
    * Method **play** needs to declare a local **Player** variable named **current** that gets assigned **this.p1** and calls methods **takeTurn**, **nextPlayer**, and **takeTurn** again before printing method **announceWinner**
    * Method **nextPlayer** needs to use conditions to check the **current** Player parameter, and switch to the other Player (i.e. Either instance variable **this.p1** or **this.p2**).
    * Method **announceWinner** needs to display each Player's name and score, then using conditions needs to determine which Player's score is highest, and finally return the winning Player's name.
3. Last, Implement the Java **main** method to:
    * Create a Scanner object.
    * Request and store in an int variable the number of sides you **Dice** should have.
    * Create a **new** **Game** object and pass its **constructor** two **new** Player objects, and a **new** Dice object.
    * Finally, use the **Game** object to call the **play** method and play the game.

## Part 4 - Turn in
1. Make sure to create a local **Sprint2023** branch as we've done all semester.
2. Commit and push that branch to your GitHub Account's Fork of Java-Lab-005
3. Create a Pull request back to my Java-Lab-005 Repo.
4. Paste your Pull request URL into Canvas to complete the assignment.

**/**
*
* @author Trevor Hartman
* @author Geng Cha
*
* @since Version 1.0
*
*/**