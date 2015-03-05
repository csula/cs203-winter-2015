# Homework 2

## Objective

The objective of this program is for you to write a program that read text files and performs statistical analysis on the text files.  The goal here is to calculate similar traits (if any between the text).  We will limit the complexity of our analysis to purely statistical evidence.  In other words, while it might be desirable to perform complex similarity analysis, it is beyond the scope of this course.

Your code will read 3 text files into memory.  For each text file, it will calculate the following information:

1. Number of unique words in the text.
2. Top 10% frequently words.  For example if a document has 1000 unique words, your progrm will display 100 most frequently occuring words
3. Top 10% infrequently words; similarly, your program will display 100 least frequently occuring words.

Your code will also print out similarities between the documents:

1. Similarity of top 10% frequently appearing words against the other two documents
2. Similarity of top 10% infrequently appearing words against the other two documents

For example:

```
"document a" <=> "document b"
  top 10% frequently appearing: 3 words
     apple, orange, banana
  top 10% infrequently appearing: 1 word
     robert
"document b" <=> "document c"
  top 10% frequently appearing: 2 words
     mouse, house
  top 10% infrequently appearing: 1 word
     james
"document a" <=> "document c"
  top 10% frequently appearing: 5 words
     apple, orange, banana, sugar, orange
  top 10% infrequently appearing: 2 word
     james, michael
```

## What to code

You will write a Java program that will read in three files from the command line:

```java
java -jar homework2.jar "file 1.txt" "file 2.txt" "file 3.txt"
```

## What to turn in

You will demonstrate your homework assignment in class.  Note that these are individual assignments.  If you have questions, please direct them to the instructor.

