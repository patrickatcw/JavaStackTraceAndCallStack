package com.me;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declaration
        int result = divide();
        System.out.println(result); //calling method to print
    }

    //method
    private static int divide() {
        int x = getInt();
        int y = getInt();
        System.out.println("x is " + x + ", y is " + y);
        return x / y;
    }

    //method
    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        return s.nextInt();
    }

}

/*
"C:\Program Files\Java\jdk-9.0.4\bin\java" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2017.3.4\lib\idea_rt.jar=58455:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2017.3.4\bin" -Dfile.encoding=UTF-8 -classpath C:\java\JavaStackTraceAndCallStack\out\production\JavaStackTraceAndCallStack com.me.Main
Please enter an integer
nhnh
Exception in thread "main" java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:860)
	at java.base/java.util.Scanner.next(Scanner.java:1497)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2161)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2115) //not accessed, in grey
	at com.me.Main.getInt(Main.java:25)                        //third called
	at com.me.Main.divide(Main.java:15)                         //second called
	at com.me.Main.main(Main.java:9)                            //first called, in blue

Process finished with exit code 1
 */

//can click on location of code in stack and cursor will go to line
//exception - something went wrong somewhere
//- what went wrong?
//- what can be done about it?
//the exception climbs the stack until it reaches a method that can't handle it
