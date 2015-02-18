package edu.calstatela.cs203.lab05;

import java.util.UUID;

public class GenerateUUID {
  
  public static final void main(String... aArgs){
    //generate random UUIDs
    UUID idOne = UUID.randomUUID();
    UUID idTwo = UUID.randomUUID();
    log("UUID One: " + idOne);
    log("UUID Two: " + idTwo);
  }
  
  private static void log(Object aObject){
    System.out.println( String.valueOf(aObject) );
  }
} 