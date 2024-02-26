#Introduction to JAVA :
1. Development of Java language was started in 1991, by a U.S. company Sun MicroSystems.
2. Java is developed by James Gosling.
3. Its first version was released in 1996.
4. Initially java language was names 'Oak', then after it renamed to Java(Java Coffee).

#Features of JAVA :
1. High level language
2. Object Oriented Language
3. Portable programs
4. Class based
5. Java uses the concept of 'Write Once Run Anywhere' (because of Bytecodes)
6. Platform Independent
7. We can handle multiple programs in Java (Multi-Threading)

#Extension of file
- Source code : file_name.java
- Compile using 'javac', it checks syntax and libraries
- Bytecodes : file_name.class
- Bytecodes are archetecture neutral - not in 0's and 1's.
- Java developer needs JDK, libraries, JRE(JVM) for development.
- End user need libraries & JVM from executing application.
- Java can be considered both a compiled and an interpreted language because its source code is first compiled into a binary byte-code. This byte-code runs on the Java Virtual Machine (JVM), which is usually a software-based interpreter.

#Editions of Java software :
1. Java Standard Edition -> Java SE or J2SE
2. Java Enterprise Edition -> Java EE or J2EE
3. Java Micro Edition -> Java ME or J2ME

#Keypoints of JAVA :
1. Java has 50 keywords.
2. In addition java reserves - true, false, null.
3. Java has a extra reserved word 'goto', but we cannot use it in java.
4. Java uses 'Unicode', which includes ASCII and other characters from languages around the world.

#Escape Sequences in JAVA :
1. \n - new line
2. \t - tab
3. \b - backspace

#Datatypes in JAVA(8 primitive datatypes):
1. byte : range -> -128 to +127, memory -> 1 byte
2. short : range -> -32768 to +36767, memory -> 2 bytes
3. int : range -> -2147483648 to +2147483647, memory => 4 bytes
4. long : 8 bytes
5. float : 4 bytes
6. double : 8 bytes
7. boolean : memory -> 1 bit, possible values are 'true' or 'false'
8. char : memory -> 2 bytes

- No unsigned types in java. All number are signed.

#Operators in JAVA :
1. Arithmetic operators : +, -, *, /, %, ++, --
2. Assignment operators : =, +=, -=, *=, /=, *=, %=
3. Relational/Comparison operators : ==, !=, >, <, >=, <=
4. Logical operators : &&, ||, !
5. Bitwise operators : |, &, ^, ~

#Operator Precedence in JAVA :
1. Parenthesis
2. Postfix
3. Prefix
4. Multiplicative
5. Additive
6. Relational
7. Logical

#Program Control Statements in JAVA :
1. if
2. if-else
3. nested if
4. if-else-if
5. switch case
6. jump statements - break, continue, return

- break statement - simple and labeled
- continue statement - simple and labeled

#Scope & Lifetime of variable in JAVA :
- Java allows variables to be declared within any block. A block defines a scope.
- Each time we create a new block, we are actually defining a new scope.
- A scope defines the visibility of any variable or object.
- In java, two major scopes are those which are defined by a 'class', 'method', 'loops', 'if - else'.

#Loops in JAVA :
1. for
2. while
3. do - while
4. Enhanced for / for-each

#Arrays in JAVA :
1. Single dimensional array
2. Multidimensional array (rectangular multidimensional array and Jagged multidimensional array)

- Every element id distinguished by a unique unsigned integer value starting from 0 also called 'subscript number'.

#Declaration & initialization of an Array in JAVA :
- Single dimensional array 
1. int array = new int[5];
2. int array[]; array = new int[5];
3. int array[] = {1, 2, 3, 4, 5};
4. int array[] = new int[]{1, 2, 3, 4, 5};
5. int array[]; array = new int[]{1, 2, 3, 4, 5}; //in this case 'new' keyword is required.

- Max size of an array could be - 2,14,74,83,647

- Multidimensional array (rectangular multidimensional array)
1. int a[][]; a = new int[3][4];
2. int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
3. int a[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

- Multidimensional array (Jagged multidimensional array)
1. int q[][] = new int[3][];
- q[0] = new int[3];
- q[1] = new int[2];
- q[2] = new int[5];

#Alternate ways for declaring an array variable in JAVA :
1. int a[];
2. int [] a;
3. int a[], e; //a will be 1D array & e will be a variable

#Enum in JAVA :
- enum Currency {RUPEES, YEN, COLON, FRANC} //values in enum should be case-sensitive & unique

#Command line arguments in JAVA :
- javac file_name.java
- java class_name hello world //'hello world' will be passed as cmd ling arguments


#Classes and Objects in JAVA :
- Classes
1. A class is a template for an object, and an object is an instance of class. //instance means occurence in memory
2. A class defines a new datatype. Once defined, this new type can be used to create 'object' of that type.
3. A class is defined by using 'Class' keyword.
4. The variables defined in a class are called 'Instance variables'. The code is contained in methods. Collectively, they are called members of a class.
5. Generally, instance variables are accessed by the member functions(methods).
6. Variables are called instance variable because each object of that class has its own copy of that variables.

- Objects
1. Obtaining an object of a class has two processes.
2. First, we have to declare a variable of that class type which is also called 'Reference variable'. This variable does not define an object, it simply refer or point to an object.
3. Second, we must obtain a copy to an object and sign it to the reference variable using 'new' keyword.
4. The 'new' keyword dynamically allocates memory to the object and returns a reference to that object.
5. reference_variable of class type = new Class_name(); //the class_name followed by parenthesis specifies 'Constructor'.

#Parts of a class in JAVA :
1. Variables also called instance variables.
2. Functions which are called Methods.
3. Constructors.

#Constructors in JAVA :
- Types
1. Non - parameterized constructor
2. Parameterized constructor

- Constructors don't have a return datatype.
- we can access members of a class by using (.) operator.

#Method overloading in JAVA :
1. Method overloading is a concept that allows multiple methods to share the same name.
2. But with different number of arguments, return datatype or sequence of arguments.
3. When an overloaded method is invoked, java uses the type and no. of arguments to determine between the versions of overloaded methods.
- we can also overload parameterized constructors.

#'this' keyword in JAVA :
1. this keyword is used inside any method to refer the current object.
2. 'this' is always a reference to the object on which the method was invoked.
3. When a local variable has the same name as an instance variable, the local variable hides the instance variable, we can use 'this' keyword to access that instance variable.

#Static data and member function :
1. Generally, a class member is accessed by using an object of that class, but we can access the member without creating an object.
2. To create such a member, we have to specify 'static' keyword in its declaration.
3. When a member is declared static, it can be accessed without referencing to an object.
4. Both variables and methods can be static.
5. The most common example of static member is 'main()'.
6. Static variables are declared as private. Thus, data hiding is achieved, as data is only accessed to the member functions.
7. Private static data members are not accessible outside the class.
8. The 'static' variables which are declared as 'public' are like global variables.
9. Storage space for data members which are declared as static is allocated only once during the class declaration. All objects that this class have access to static data members.
10. When one of the object modifies the static data member, the effect is visible to all the instances of that class.
11. The static methods can only access static data members or static methods. It means non-static data is unavailable to these methods.
12. Static methods cannot refer to 'this' or 'super' in any way.

- We can create a static initialization block, these can be used to declare static variables.

- The main() method is marked static so that the JVM may call it without having to create an instance of the class that contains the main() function.

#Inheritance in JAVA :
1. It is a technique of organizing information in hierarchial form. It is like child inheriting the features of its parent.
2. Parent class is also called base class or super class.
3. Child class is also called derived class or sub class.
4. We can use 'extends' keyword to inherit the features of a class in another class.
5. No memory is allocated to the derived classes, but memory is allocated when it is instantiated to create object.
6. Java does not support inheriting multiple parent classes to a single class.
7. Although a sub class includes all the members of its parent class, but it cannot access the 'private' members.
8. Types of inheritance suported in java are :
- Single inheritance -> only one class is derived 
- Multilevel inheritance -> derivation of a class from another derived class
- Hierarchical inheritance -> derivation of several classes from a single base class
9. Whenever a subclass needs to refer to its super class, it can do so by using 'super' keyword.
10. 'super' keyword has generally two forms of use :
- using super to call super class constructor -> super(parameter_list);
- using super to call members of super class -> super.member;

#Method Overriding in JAVA :
1. In a class hierarchy, when a method in a sub class has same name and type signature as a method in its super class, then the method in the sub class is said to be overrided method.
2. If we want to access the super class version of overrided method, we have to use 'super' keyword.
3. Method overriding occurs only when the name and the type signatures of the two methods are identical. //type signature means - number, type, and order of parameters.

#Polymorphism in JAVA :
1. The sub class checks whether or not it has a method with the same name and exactly the same parameters. If so, it uses it.
2. If not, the parent class becomes responsible for handling the message and look for the method with that name and those parameters.
3. Since the message handling can continue moving up the inheritance chain, parent classes are checked until the chain ends or until the method is found.
4. If there is no matching, we'll get a complie time error.
5. A method defined in a sub class with the same name and parameter list as a method in one of the parent classes hides the method of the parent class.
6. The key to make polymorphism work is called 'Late binding'.
7. Late binding means that the compiler does not generate the code to call the method at compile time. Instead, compiler generates code to calculate which method to call using type information from object. //late binding is also called dynamic binding or dynamic method dispatch or runtime polymorphism.
8. Another method call mechanism is called 'Static binding', where the operation to be executed is completely determined at compile time. //it is also called compile time binding or Early binding or compile time polymorphism.
9. Static binding depends on the type of the object variable alone, while Dynamic binding depends on the type of the actual object at run time.

#Final keyword in JAVA :
1. Using 'final' keyword to prevent inheritance by defining a final class.
2. Using 'final' to prevent method overriding.
3. Using 'final' to declare a constant variable.

#Abstraction in JAVA :
1. An abstract modifier indicates that the class has not been fully implemented and that it should not be instantiated.
2. If 'abstract' keyword is applied to a member function declaration, it means that the method will be implemented in the child class.
3. Class which contains abstract method also become abstract and not been instantaited.

#Interfaces in JAVA :
1. It is java's way of defining 'multiple inheritance'.
2. Interface is a promise that your class will implement certain methods with certain signature.
3. We can derive a class from an interface by using 'implements' keyword.
4. A class can have multiple parent interfaces.
5. We can't create object of an interface, as interface provides the concept of full abstraction.
6. The interface body can contain abstract methods, default methods, and static methods.
7. Variables declared in an interface are constants.

- Examples of predefined interfaces are - ActionListeners, MouseListeners, KeyListeners. 
- Abstract class can have abstract and non-abstract methods. Interface can have only abstract methods.

#Packages in JAVA :
1. Java allows you to group classes in a collection called a Package.
2. Packages are convenient for organizing your work and for separating your work from code libraries provided by others.
- Examples of packages are - java.lang, java.util, javax.swing

#Defining a package in JAVA :
1. To place classes inside a package, you must put the name of the package at the top of your source file, before the code defines the classes in the package.
2. If you don't put a package statement in the source file, then the classes in that source file belong to the default package. The default package has no package name.
3. The general form of package statement is - package package_name;
4. The general form of multileveled package statment is - package pkg1[.pkg2[.pkg3]];

- CLASSPATH : It is actually an environment variable in Java, and tells Java applications and the Java Virtual Machine (JVM) where to find the libraries of classes. These include any that you have developed on your own.

#Access protection in JAVA :
1. Java has 4 types of visibilties for class members
- Sub class in the same package.
- Non sub class in the same package.
- Sub classes in different packages.
- Classes that are neither in the same package nor sub class.
2. 'public' features can be used in any class.
3. 'private' features can be used only by the class that defines them.
4. 'protected' members are visible to the package and all sub classes of that class. These subclasses can be in same or different packages.
5. default members cannot be accessed explicitly. It means they can be access only in by the classes of same package. 


#Exception Handling in JAVA :
1. An exception is an abnormal condition that arises in the code sequence at runtime. In other words, an exception is a runtime error.
2. In java exception can be managed through 5 keywords -> try, catch, finally, throw, throws.
3. Program statements that you want to monitor for exceptions are contained in 'try' block.
4. If an exception is occured in a 'try' block, it will be catched by the 'catch' block.
5. System generated exceptions are automatically thrown by a Java runtime system.
6. To manually throw an exception, use the keyword 'throw'.
7. Any exception that is thrown out of a method is must be specified by a 'throws' keyword.
8. Any code that absolutely must be executed before the method returns is put in a 'finally' block.

![alt text](https://media.geeksforgeeks.org/wp-content/uploads/20230613122108/Exception-Handling-768.png)
