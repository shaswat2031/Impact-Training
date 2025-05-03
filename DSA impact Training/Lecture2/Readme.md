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