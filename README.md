1. Object-Oriented Programming (OOP)
Encapsulation: Using private fields in Address.java and Student.java.

Composition (Has-A Relationship): The Student class has an Address (postalAddress) and has a Trainer (instructor), illustrating a strong relationship between objects.

2. Functional Interfaces and Lambda Expressions
This project defines several Functional Interfaces (Printable.java, Searchable.java, etc.) which are then implemented concisely using various forms of Lambda Expressions in DemoLambda.java.

Key Lambda syntax demonstrated in DemoLambda.java:

Zero-Argument Lambda: Printable f = () -> {};

Single-Argument, Expression Body (Most Concise): taxable t = income -> income * 0.30;

Multi-Argument Lambda: joinable j = (s1, s2, s3) -> s1 + s2 + s3;

3. Inner Classes
The DemoRegularInnerClass.java file provides basic structural examples for Regular Inner, Method-Local, and Static Nested Classes.

4. Static Import
The DemoStaticImport.java class demonstrates how to use the static import feature to call static members directly, such as using out.println instead of System.out.println.
