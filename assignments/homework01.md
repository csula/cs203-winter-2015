# Homework 1

## Class design

You will need to design your class base on the laboratory exercises.  We consider the : (1) `Balloon`, (2) `Game`, (3) `BalloonGame`, (4) and `SimpleCanvas`.  Your assignment does not need to use these classes -- although it is highly recommended that you use them as reference.

The relationship between the `Game` and `BalloonGame` is interitance.  The relationship between the other classes are yet to be determined.  Your assignment is to come up with the relationship and then code the game accordingly.

Your GUI program should meet the following requirements:

1. It has to have the `start`, `stop`, and `pause` buttons.  
2. The balloons should have autonomous movements.
3. Your program will need to use a `timer` class to asynchronously move the balloons around.

**Hint**: Don't worry about collision detection until you have successfully gotten the balloons to animate.

## Game play

When you launch the game the balloons are drawn to the screen and remain stationary.  Once the game has started the balloons will start drifting.  Note that the balloons can drift in any directions.  The player will now move the mouse over the balloon.  Each the player successfully shoots down a balloon, the balloon is 'removed' from the game (change status?).  The player will have a limited time to shoot down all of the balloon.  Once the timer has expired the total number of balloons are tallied and a score is displayed.

## What to turn in

You will demo the game in class.  However, you must also submit the source code to the csns homework 1 submission page.  

Note that because homework is such an important aspect of the class, your ability to complete the assignment is very important to passing the CS202 portion of the course and being able to move to the CS203 portion of the course.  This assignment covers many of the aspects of OO design and coding, and they are: inherittance, polymorphism, interface, and GUI programming.  

The estimated time required for this assignment is approximately 10 hours.  Please get started early and ask questions often.

