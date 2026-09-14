
// Java is platform independent, which means that you can run the same program on any machine but that machine must have a Java Vitual Machine (JVM) installed.
//The JVM is dependent itself but your application is independent of the platform.JVM Needs to be built for particular OS.For Windows JVM  is available.
//JVM says i can run your code but  you have to submit me not the java code but something called bytecode because JVM understands bytecode and not the java code.
//To convert java code to bytecode we need a compiler which is called javac 
//There can be a lot of files in a project so we need to tell that javac what is the entry point of the project and that 
//entry point is called main method in file and we will javac which is the entry point of project, an entry point has a main method in it
//There can be multiple entry points in the projects means we can have multiple files which can contains the main methods
//the execution of project will be started from first file which you specify which has main method inside of it












//How java runs behind the scene

// A dev write a java code then he will put that into the compiler the compiler then gives us the byte code then we take this 
//byte code and run that on jvm and that jvm will look at the main method and we will get the output

class Hello{
public static void main(String a[]){
    System.out.println("Hello, World!");

}

}



// // 
// public static void main(String a[]){
//     System.out.println("Hello, World!");

// } when we try to run this program the compiler will gives us error because java is the object oriented lanaguage ,objectg oriented
// means that every thing is an object and to run an object we need a class so a class is missing here





//When we compile this hello.java code we noticed that there is an extra file created in the project with .class extension this is 
//basically the byte code we were talking about
// and when javac compiled this code we will tell the jvm to run this byte code so we will say java and then class name and it will 
//GIVES us the output




// One more important thing


//The JVM is a part of JRE so jvm with libraries is a part of JRE so when you run something it runs inside JRE not jvm and jvm is responsible to run it




// architect is like this




// base layer is hardware
//on top of hardware we have os and remember jvm is already built for all os
//and the last and most top layer is JRE which is on top of os 
//and JRE Contains JVM so every time you run anything it runs inside JRE and JVM Is responsible to run it