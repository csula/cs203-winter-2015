# lab 6

# lab 6.1: implement a `set` by hand

1. Modify `balloon.java` such each time a balloon is generated it has a unique id.   
2. This id is generated using UUID.
3. We need to make sure that the id is unique before assigning it to the balloon.

We note that:

1. Eventhough uuid are more or less unique, we still want to go through the exercise of verifying it's uniqueness.
2. Our approach to maintaining a list of unique uuid's is naive as we shall use an arraylist.

# lab 6.2 time your balloon creation

1. Write the code to get the time of day
2. For every 10,000 balloons being created print the time
3. Plot N versus time

# lab 6.3 utilizing a tree map in your code

1. Let us assume that the balloons are stored in a huge cage
2. Let us also assume that the balloons each have a random radius and a random color
3. We will also need to calculate the average balloon size
4. We will need to count up the colors of each balloons being generated
5. We want to plot our access time on the tree
   a. generate 10,000 balloons
   b. pick one random id and search for the balloon
   c. save the time
   d. repeat for 20,000 balloons (same deal)
