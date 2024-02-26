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
