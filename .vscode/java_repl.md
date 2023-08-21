You can use the Java REPL (Read-Eval-Print Loop) tool called "JShell" to run and test Java code interactively. JShell comes bundled with the Java Development Kit (JDK) starting from JDK 9. It allows you to execute Java code snippets, see immediate results, and experiment with Java features without the need to compile and run a full Java program.

To use JShell, follow these steps:

1. **Ensure You Have JDK Installed**: JShell is included with the Java Development Kit (JDK), so make sure you have JDK 9 or later installed on your system.

2. **Open Terminal or Command Prompt**: Open your system's terminal or command prompt.

3. **Launch JShell**: Enter the command `jshell` to launch the JShell environment.

4. **Start Writing Java Code**: You can now start writing Java code snippets directly in the JShell environment. Press Enter after each line to see the immediate result.

   ```java
   jshell> int x = 5;
   x ==> 5

   jshell> int y = 10;
   y ==> 10

   jshell> int sum = x + y;
   sum ==> 15
   ```

5. **Test Java Features**: JShell allows you to test Java features, classes, methods, and expressions in an interactive manner.

6. **Exit JShell**: To exit JShell, simply type `/exit` and press Enter.

   ```java
   jshell> /exit
   |  Goodbye
   ```

JShell is a great tool for quick experimentation, learning, and trying out Java code snippets without the overhead of writing full Java programs and compiling them. It's particularly useful for beginners who want to explore Java syntax and features in an interactive way.