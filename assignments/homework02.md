# Homework 2

## Objective

We've discussed containers extensively in class. In principle, containers are designed to hold "things" and they should be fairly general.  By choosing and designing containers carefully we can more effectively write software.  What's more we can estimate the performance of our code.

## What to code

You will update your balloon game.  This time, instead of popping the individual balloons.  You will select a number of balloons using a square box.  How you implement the square box is up to you.  Once the balloons have been selected they are transfered into a separate container (not yet displayed).

Your program will provide the option to show these containers when all the balloons from the original container has been selected.

Your program will note the time that it takes to select and move X balloons from the larger container to the smaller container.  Note that the number of balloons in the larger container will be in the 10's of thousands.  It's not possible therefore to show all of the balloons so you will have to randomly show some of the balloons.

You can come up with some strategy as to what is shown and what is not shown.  The "net" which grabs the balloons will only grab the visible balloons -- thus making this an even more challenging game.  Note however that the balloons are all drifting simultaneously.

Finally, you should change the window size so that the play canvas is larger than what has been used and that you can fix the radius of the balloons to be something small ~10 or less.

## What to turn in

You will demo the game in class.


