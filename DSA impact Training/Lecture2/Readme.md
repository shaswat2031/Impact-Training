# Data Types in Java

Java supports two main categories of data types:

## 1. Primitive Data Types

Primitive data types are the most basic data types built into the Java language. They store simple values directly in memory and are not objects.

| Data Type | Size     | Example Values      | Description                |
|-----------|----------|--------------------|----------------------------|
| byte      | 1 byte   | -128 to 127        | Small integer              |
| short     | 2 bytes  | -32,768 to 32,767  | Short integer              |
| int       | 4 bytes  | -2^31 to 2^31-1    | Integer (default)          |
| long      | 8 bytes  | -2^63 to 2^63-1    | Large integer              |
| float     | 4 bytes  | 3.4e-038 to 3.4e+038| Single-precision decimal   |
| double    | 8 bytes  | 1.7e-308 to 1.7e+308| Double-precision decimal   |
| char      | 2 bytes  | 'a', '1', '$'      | Single Unicode character   |
| boolean   | 1 bit    | true, false        | Logical values             |

**Characteristics:**
- Fixed size and predefined by the language.
- Store actual values, not references.
- Faster and require less memory.

**Example:**
```java
int age = 25;
double salary = 50000.75;
char grade = 'A';
boolean isActive = true;
```

## 2. Non-Primitive Data Types

Non-primitive (reference) data types are created by the programmer and refer to objects. They can store multiple values or complex data.

| Type         | Example           | Description                       |
|--------------|-------------------|-----------------------------------|
| String       | "Hello"           | Sequence of characters (object)   |
| Arrays       | int[] arr = {1,2} | Collection of similar data types  |
| Classes      | Car, Student      | User-defined blueprints           |
| Interfaces   | Runnable, List    | Abstract types for contracts      |
| Objects      | new Car()         | Instances of classes              |

**Characteristics:**
- Can be of any size (dynamic).
- Store references (addresses) to memory locations.
- Can have methods and properties.

**Example:**
```java
String name = "Alice";
int[] numbers = {1, 2, 3, 4};
Car myCar = new Car("Toyota", "Blue", 2022);
```

---

# Java Boilerplate Code Explained

When writing Java programs, there is some standard structure (boilerplate code) that must be followed for the code to compile and run. This includes the class definition and the `main` method, which serves as the entry point for the program.

**Basic Java Program Structure:**
```java
public class Main {
    public static void main(String[] args) {
        // Your code goes here
        System.out.println("Hello, World!");
    }
}
```

**Explanation:**
- `public class Main { ... }`  
  Every Java application must have at least one class. The class name should match the filename (`Main.java` in this case).
- `public static void main(String[] args) { ... }`  
  This is the entry point of any Java application.  
  - `public`: Accessible from anywhere.
  - `static`: Can be run without creating an object of the class.
  - `void`: Does not return any value.
  - `String[] args`: Accepts command-line arguments as an array of Strings.
- Statements inside `main` are executed when the program runs.

---

## Can You Run a Java Program Without `main` Method?

In modern Java (Java 7+), the `main` method is required as the entry point for standalone applications. However, there are some scenarios and historical notes:

### 1. Static Block (Not Recommended, Not Supported in Modern Java)

Earlier versions of Java (before Java 7) allowed code in a `static` block to execute without a `main` method. For example:

```java
public class Demo {
    static {
        System.out.println("Static block executed!");
        System.exit(0);
    }
}
```
If you run this in older Java versions, it prints the message and exits.  
**Note:** In current Java versions, this will result in a runtime error:  
`Error: Main method not found in class Demo...`

### 2. Applets and Servlets

Java Applets (now obsolete) and Servlets do not require a `main` method. They have their own lifecycle methods (`init()`, `service()`, etc.) and are managed by the browser or server.

### 3. Why `main` is Required Now

For standard Java applications, the JVM looks for the `main` method as the starting point. Without it, the program will not run and will throw an error.

**Conclusion:**  
You cannot run a standard Java application without a `main` method in modern Java. Always include it for standalone programs.

---

# Classes and Objects in Java

## Difference Between Class and Object

### Class
A class is a blueprint or template that defines the structure and behavior of objects. It's like an architectural plan that specifies:

- **Fields/Attributes**: Variables that store data
- **Methods**: Functions that define behavior
- **Constructors**: Special methods for initializing objects
- **Access modifiers**: Control visibility and access to class members

A class is a **logical entity** that doesn't occupy memory when defined. It's a theoretical construct that serves as a blueprint.

### Object
An object is an **instance of a class**. It's the actual entity created based on the class blueprint. Key characteristics:

- **Physical entity**: Exists in memory at runtime
- **State**: Represented by the values of its attributes/fields
- **Behavior**: Defined by its methods
- **Identity**: Each object has a unique identity

### Example:
```java
// Class definition - blueprint
public class Car {
    // Fields/attributes
    String model;
    String color;
    int year;
    
    // Constructor
    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }
    
    // Methods
    public void startEngine() {
        System.out.println("Engine started!");
    }
    
    public void displayInfo() {
        System.out.println("Car: " + model + ", Color: " + color + ", Year: " + year);
    }
}

// Creating objects - instances of the Car class
Car myCar = new Car("Toyota Camry", "Blue", 2022);
Car friendsCar = new Car("Honda Civic", "Red", 2021);
```

### Key Differences:

| Aspect | Class | Object |
|--------|-------|--------|
| Definition | Blueprint/Template | Instance of a class |
| Creation | Created once | Multiple objects can be created |
| Memory Allocation | No memory allocated | Memory allocated when created |
| Keyword | Defined using `class` keyword | Created using `new` keyword |
| Existence | Logical entity (compile time) | Physical entity (runtime) |
| Initialization | Can have default values | Must be initialized with constructor |
| Access | Can be accessed by name | Can be accessed by reference variables |

### Relationship:
You can think of the class-object relationship like:
- Class = Cookie cutter
- Object = The actual cookies made with the cutter

Or:
- Class = House blueprint
- Object = The actual houses built from that blueprint

---

# Core OOPS Concepts in Java

Java is based on four main Object-Oriented Programming (OOP) principles:

## 1. Encapsulation

**Definition:**  
Encapsulation is the process of wrapping data (fields) and code (methods) together as a single unit. It restricts direct access to some of the object's components, which is achieved using access modifiers (`private`, `public`, etc.).

**Benefits:**  
- Data hiding
- Increased security
- Easy maintenance

**Example:**
```java
public class Student {
    private String name; // private = encapsulated
    private int age;

    // Public getter and setter methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
```

## 2. Inheritance

**Definition:**  
Inheritance allows one class (child/subclass) to inherit fields and methods from another class (parent/superclass). It promotes code reusability.

**Types:**  
- Single
- Multilevel
- Hierarchical

**Example:**
```java
// Parent class
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Usage
Dog d = new Dog();
d.eat();  // Inherited method
d.bark(); // Own method
```

## 3. Polymorphism

**Definition:**  
Polymorphism means "many forms". It allows objects to be treated as instances of their parent class rather than their actual class. There are two types:
- Compile-time (method overloading)
- Runtime (method overriding)

**Example (Method Overriding):**
```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Usage
Animal a = new Cat();
a.sound(); // Output: Cat meows
```

## 4. Abstraction

**Definition:**  
Abstraction is the concept of hiding complex implementation details and showing only the necessary features of an object.

**Achieved by:**  
- Abstract classes
- Interfaces

**Example:**
```java
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

// Usage
Shape s = new Circle();
s.draw(); // Output: Drawing Circle
```

---

# Difference Between `do-while` and `while` Loops in Java

Both `while` and `do-while` loops are used for iteration in Java, but they differ in how and when the loop condition is checked, and how many times the loop body is guaranteed to execute.

## What is a `while` Loop?

A `while` loop is an entry-controlled loop. This means the loop's condition is checked **before** the loop body executes. If the condition is `false` at the start, the loop body will **not execute at all**.

**Syntax:**
```java
while (condition) {
    // statements to execute
}
```

**Flow Diagram:**
```
   +-------------------+
   |   Check condition |
   +--------+----------+
            |
         true
            v
   +-------------------+
   |   Loop body       |
   +--------+----------+
            |
            +----> (back to Check condition)
            |
         false
            v
        Exit loop
```

**Example 1:**
```java
int count = 1;
while (count <= 5) {
    System.out.println("Count is: " + count);
    count++;
}
// Output:
// Count is: 1
// Count is: 2
// Count is: 3
// Count is: 4
// Count is: 5
```

**Example 2 (condition false initially):**
```java
int n = 10;
while (n < 5) {
    System.out.println("This will not print");
}
// Output: (nothing)
```

---

## What is a `do-while` Loop?

A `do-while` loop is an exit-controlled loop. This means the loop body is executed **at least once**, and then the condition is checked. If the condition is `true`, the loop continues; otherwise, it stops.

**Syntax:**
```java
do {
    // statements to execute
} while (condition);
```

**Flow Diagram:**
```
   +-------------------+
   |   Loop body       |
   +--------+----------+
            |
   +-------------------+
   | Check condition   |
   +--------+----------+
            |
         true
            +----> (back to Loop body)
            |
         false
            v
        Exit loop
```

**Example 1:**
```java
int count = 1;
do {
    System.out.println("Count is: " + count);
    count++;
} while (count <= 5);
// Output:
// Count is: 1
// Count is: 2
// Count is: 3
// Count is: 4
// Count is: 5
```

**Example 2 (condition false initially):**
```java
int n = 10;
do {
    System.out.println("This will print once even though n < 5 is false");
} while (n < 5);
// Output:
// This will print once even though n < 5 is false
```

---

## What is a `for` Loop?

A `for` loop is another entry-controlled loop in Java, commonly used when the number of iterations is known in advance. It combines initialization, condition-checking, and increment/decrement in a single line.

**Syntax:**
```java
for (initialization; condition; increment/decrement) {
    // statements to execute
}
```

- **initialization**: Executed once at the beginning (e.g., `int i = 0`)
- **condition**: Checked before each iteration; loop runs if true
- **increment/decrement**: Executed after each iteration (e.g., `i++`)

**Flow Diagram:**
```
   +----------------------+
   |   Initialization     |
   +----------+-----------+
              |
         +----v----+
         | Condition|
         +----+----+
              |
           true
              v
      +---------------+
      |   Loop body   |
      +-------+-------+
              |
      +-------v-------+
      | Increment/    |
      | Decrement     |
      +-------+-------+
              |
         (back to Condition)
              |
           false
              v
           Exit loop
```

**Example 1: Print numbers 1 to 5**
```java
for (int i = 1; i <= 5; i++) {
    System.out.println("i = " + i);
}
// Output:
// i = 1
// i = 2
// i = 3
// i = 4
// i = 5
```

**Example 2: Print even numbers from 2 to 10**
```java
for (int i = 2; i <= 10; i += 2) {
    System.out.println(i);
}
// Output:
// 2
// 4
// 6
// 8
// 10
```

**Example 3: Looping through an array**
```java
int[] arr = {10, 20, 30, 40};
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
// Output:
// 10
// 20
// 30
// 40
```

---

## Summary Table

| Loop Type   | Condition Check | Minimum Executions | Use Case                                  |
|-------------|-----------------|-------------------|--------------------------------------------|
| while       | Before body     | 0                 | When iterations depend on a condition      |
| do-while    | After body      | 1                 | When loop must run at least once           |
| for         | Before body     | 0                 | When number of iterations is known         |

---

## Example: User Input Validation

**Using `while`:**
```java
Scanner sc = new Scanner(System.in);
System.out.print("Enter a positive number: ");
int num = sc.nextInt();
while (num <= 0) {
    System.out.print("Invalid! Enter a positive number: ");
    num = sc.nextInt();
}
System.out.println("You entered: " + num);
```

**Using `do-while`:**
```java
Scanner sc = new Scanner(System.in);
int num;
do {
    System.out.print("Enter a positive number: ");
    num = sc.nextInt();
} while (num <= 0);
System.out.println("You entered: " + num);
```
*In the `do-while` version, the prompt is always shown at least once.*

---

# Summary Table

| OOPS Concept   | Description | Example |
|----------------|-------------|---------|
| Encapsulation  | Wrapping data and code together | Private fields with getters/setters |
| Inheritance    | Acquiring properties from parent class | `class Dog extends Animal` |
| Polymorphism   | Many forms, method overloading/overriding | Overriding `sound()` in subclasses |
| Abstraction    | Hiding implementation details | Abstract classes/interfaces |

---

# Best Practices

- Use encapsulation to protect data.
- Prefer inheritance only when there is an "is-a" relationship.
- Use interfaces and abstract classes for abstraction.
- Leverage polymorphism for flexible and maintainable code.

---