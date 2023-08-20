# Java Tutorial 

### Lesson 1: Getting Started with Java

**1. Installing Java:**

First, you need to install the Java Development Kit (JDK) on your computer. You can download the JDK from the official Oracle website or use OpenJDK, which is an open-source alternative.

**2. Setting Up Your Development Environment:**

Once you have the JDK installed, you'll need a code editor or Integrated Development Environment (IDE) to write and run your Java code. Some popular options are IntelliJ IDEA, Eclipse, and Visual Studio Code with appropriate plugins.

**3. Your First Java Program:**

Let's create a simple "Hello, World!" program to get started.

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

Save this code in a file named `HelloWorld.java`.

**4. Compiling and Running:**

Open your terminal or command prompt and navigate to the directory containing `HelloWorld.java`. Compile the program using the `javac` command:

```sh
javac HelloWorld.java
```

This will generate a file named `HelloWorld.class`. Now, run the compiled program using the `java` command:

```sh
java HelloWorld
```

You should see the output: "Hello, World!"

Congratulations! You've written and executed your first Java program.

### Lesson 2: Basic Java Concepts

**1. Variables and Data Types:**

Java has various data types for storing different types of values, such as `int` for integers, `double` for floating-point numbers, `char` for characters, and `String` for text.

```java
int age = 25;
double price = 19.99;
char grade = 'A';
String name = "John";
```

**2. Operators:**

Java supports arithmetic, assignment, comparison, and logical operators.

```java
int x = 10, y = 5;
int sum = x + y;
int product = x * y;
boolean isEqual = x == y;
boolean logicalResult = (x > y) && (y != 0);
```

**3. Control Flow:**

Java provides `if`, `else if`, and `else` statements for conditional execution, as well as `for`, `while`, and `do-while` loops for repetition.

```java
if (age < 18) {
    System.out.println("You are a minor.");
} else if (age >= 18 && age < 60) {
    System.out.println("You are an adult.");
} else {
    System.out.println("You are a senior citizen.");
}

for (int i = 1; i <= 5; i++) {
    System.out.print(i + " ");
}

int count = 0;
while (count < 3) {
    System.out.println("Hello");
    count++;
}
```

**4. Methods:**

Methods are blocks of code that perform a specific task. They allow you to organize and reuse code.

```java
public int addNumbers(int a, int b) {
    return a + b;
}

int result = addNumbers(5, 7);
System.out.println("Sum: " + result);
```

These are just the basics of Java. As you progress, you can explore more advanced topics such as classes and objects, object-oriented programming, exception handling, and working with arrays and collections.

Remember that practice is key to mastering any programming language. Try writing small programs and gradually work on more complex projects to deepen your understanding of Java.
