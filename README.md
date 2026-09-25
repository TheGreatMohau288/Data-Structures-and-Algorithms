# Data Structures and Algorithms (Java)

Assignments completed for my second-semester **Data Structures and Algorithms** module, written in Java using BlueJ.

## Assignments

### Planets and Stars - Abstraction and Polymorphism

Models celestial bodies with an abstract base class and concrete subclasses:

| Class | Role |
|-|-|
| `Star` | Abstract base class with shared fields (name, colour, size, age), getters/setters and an abstract `displayInfo()` method |
| `Venus` | Subclass that adds Venus-specific details (length of a day, distance from the Sun) and implements `displayInfo()` |
| `Earth` | Subclass that adds Earth-specific details and implements `displayInfo()` |
| `StarTest` | Driver program that creates both objects, stores them in a `Star[]` array and calls `displayInfo()` on each |

**Concepts:** abstract classes, inheritance, method overriding, polymorphism through a base-class array, encapsulation.

A screenshot of the program output is included (`Screenshot of the running code.jpg`).

## Running the code

**BlueJ:** open `package.bluej`, then right-click `StarTest` and run `main`.

**Command line** (JDK 8+):

```bash
javac *.java
java StarTest
```

## Author

**Mohau Mokoena**
