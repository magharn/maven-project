package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * This method is used to say customized hello.
   *
   * @param someone person's name
   * @return greeting containing person's name
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
