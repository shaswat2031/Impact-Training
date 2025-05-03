# Java Conditional Statements and Object-Oriented Programming

## Conditional Statements in Java

Conditional statements allow programs to perform different actions based on whether a specific condition evaluates to true or false.

### Types of Conditional Statements in Java:

1. **if statement**: Executes a block of code if a specified condition is true.
   ```java
   if (condition) {
       // code to execute if condition is true
   }
   ```

2. **if-else statement**: Executes one block if condition is true, another if it's false.
   ```java
   if (condition) {
       // code to execute if condition is true
   } else {
       // code to execute if condition is false
   }
   ```

3. **if-else-if ladder**: Tests multiple conditions sequentially.
   ```java
   if (condition1) {
       // code if condition1 is true
   } else if (condition2) {
       // code if condition2 is true
   } else {
       // code if all conditions are false
   }
   ```

4. **switch statement**: Selects one of many code blocks to execute based on a variable value.
   ```java
   switch (expression) {
       case value1:
           // code block
           break;
       case value2:
           // code block
           break;
       default:
           // default code block
   }
   ```

5. **Ternary operator**: A shorthand for the if-else statement.
   ```java
   variable = (condition) ? expressionIfTrue : expressionIfFalse;
   ```

## Java as an Object-Oriented Programming Language

Java is a fully object-oriented programming language, which means:

1. **Everything is an Object**: Almost everything in Java is treated as an object, except for primitive data types.

2. **Classes and Objects**: Java programs are organized into classes, which serve as blueprints for creating objects.

3. **Is Java 100% Object-Oriented?**: Technically, Java is not 100% object-oriented because it supports primitive data types (like int, char, boolean, etc.) that are not objects. These primitive types exist for performance reasons. However, Java provides wrapper classes (Integer, Character, Boolean, etc.) that can be used when object representations are required.

4. **Key OOP Principles in Java**:
   - **Encapsulation**: Bundling data and methods that operate on the data within a single unit (class)
   - **Inheritance**: Creating new classes based on existing ones
   - **Polymorphism**: The ability to present the same interface for different underlying forms
   - **Abstraction**: Hiding implementation details and showing only functionality

5. **Example of a simple Java class**:
   ```java
   public class Person {
       // Fields (attributes)
       private String name;
       private int age;
       
       // Constructor
       public Person(String name, int age) {
           this.name = name;
           this.age = age;
       }
       
       // Methods
       public void greet() {
           System.out.println("Hello, my name is " + name);
       }
       
       // Getters and Setters
       public String getName() {
           return name;
       }
       
       public void setName(String name) {
           this.name = name;
       }
   }
   ```
