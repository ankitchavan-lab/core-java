# Core Java

A collection of Java SE examples and college assignments covering language
fundamentals, object-oriented programming, collections, exceptions, file APIs,
concurrency, and Java 8 features.

The examples were originally written as separate Eclipse projects and have
been organized into one project. They are independent exercises, not a single
application, and many classes have their own `main` method.

## Requirements

- JDK 8 or later
- Eclipse IDE (optional)

The code targets Java 8. One original source file uses Windows-1252 encoding;
the Eclipse project settings preserve that encoding.

## Project structure

```text
core-java/
  src/main/java/corejava/
    association/
    assertionexceptioncopy/
    assertionsexceptions/
    clientexamples/
    collections/
    copying/
    exceptions/
    filehandling/
    fundamentals/
      oop/
    functionalinterfaces/
    generics/
    inheritancecomposition/
    interfaces/
    javaseassignments/
    lambda/
    latebinding/
    methodreference/
    miscprograms/
    multithreading/
    nestedclasses/
    nio/
    objectmethods/
    optional/
    serialization/
    streams/
    strings/
    viva/
    vivaquestions/
```

Each topic has its own `corejava.<topic>` package namespace. Existing
subpackages are retained where useful, keeping similarly named examples from
different topics separate.

The `fundamentals` package introduces primitive types and operators, control
flow, arrays, methods, and encapsulation through small runnable examples.

## Open and run

To use Eclipse, import this directory as an existing project. The included
`.project`, `.classpath`, and `.settings` files configure a Java project with
`src/main/java` as its source folder and Java 8 compiler settings.

To run an example in Eclipse, open a class containing `main` and select
**Run As > Java Application**.

To compile all sources from the project directory with JDK 9 or later:

```sh
javac --release 8 -encoding windows-1252 -d bin $(find src/main/java -name "*.java")
```

On Windows PowerShell:

```powershell
Get-ChildItem -Recurse -Filter *.java |
  ForEach-Object { $_.FullName } |
  Set-Content -Encoding ASCII sources.txt
javac --release 8 -encoding windows-1252 -d bin @sources.txt
```

The compiled classes are written to `bin/`, which is ignored by Git.
