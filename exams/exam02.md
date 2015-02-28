# Exam 2

## Table of Good vs. Evil

Consider the following Java program:

```java
public class Table {
   Map<String,String> table = new HashMap<String,String>();
  
   public void printGoodGuys() {
      /* print the names of the good guys only */
   }

   public void printBadGuys() {
      /* print the names of the bad guys only */
   }

   public static void main(String[] args) {
      table.put("darth maul", "bad guy");
      table.put("luke", "good guy");
      table.put("leia", "good guy");
      table.put("darth vader", "bad guy");
      table.put("jaba the hut", "bad guy");
      table.put("obi one", "good guy");
      
      printGoodGuys();
      printBadGuys();
   }
}
```

Implement the two methods `PrintGoodGuys()` and `PrintBadBuys()` from above.

## Circular Queue

Consider an abstract class `CircularQueue` defined as followed:

```java
public abstract class CircularQueue {
   public abstract void Enqueue(Object *object);
   public abstract Object* Dequeue(Object *object);
   public abstract void RotateLeft();
   public abstract void RotateRight();
   public abstract void print();
}
```

For simplicity, let us assume that the data in this case is of the type `String`.  Your task is to extend the above abstract class with a concrete class `CircularStringQueue`.  You can implement the storage of the queue anyway you'd like.  However, it's recommended that you use `ArrayList<String>` to simplify your implementation.

```java
public class CircularStringQueue extends CircularQueue {
  /* implement your abstract methods and they will be tested against 
     main below ... */
  
  public static void main(String args[]) {
     CircularStringQueue cq = new CircularStringQueue();
     cq.Enqueue("a"); // cq = ["a"]
     cq.Enqueue("b"); // cq = ["b" "a"]
     cq.Enqueue("c"); // cq = ["c" "b" "a"]
     cq.RotateLeft(); // cq = ["b" "a" "c"]
     String s1 = cq.Dequeue(); // s1 = "c", cq = ["b" "a"]
     cq.Enqueue("d"); // cq = ["d" "b" "a"]
     cq.RotateRight(); // cq = ["a" "d" "b"]
     String s2 = cq.Dequeue(); // s2 = "b", cq = ["a" "d"]
     cq.Print();
  }
}
```

## Theory Questions

1. In the `CircularStringQueue` program, please estimate the time complexity for insert (enqueue), remove (dequeue), rotate left, and rotate right.   Show (discuss) your work for credit.

2. The three possible time complexity for accessing a map key are _O(n)_, _O(log n)_ and _O(c)_ .  Provide an explanation as to why this case.

3. What are the two essential aspects of 
