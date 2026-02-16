package oop.method_overloading_overriding;

/*

✅ Method Overloading in Java (Compile-time Polymorphism)
👉 Definition (simple):

Same method name, different parameters, in the SAME class

Java decides which method to call at compile time.

✔ You can overload by:

• Different number of parameters
• Different data types
• Different order of parameters

❌ You CANNOT overload only by return type

🧠 What happened?

Java looks at parameters and decides:

👉 which add() to call at compile time

✅ Interview one-liner:

Method overloading allows multiple methods with the same name but different parameter lists in the same class and is resolved at compile time.
 */
class Calculator {

    // method with 2 int parameters
    int add(int a, int b) {
        return a + b;
    }

    // method with 3 int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // method with double parameters
    double add(double a, double b) {
        return a + b;
    }
}

public class Overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(2, 3));        // 5
        System.out.println(calc.add(2, 3, 4));     // 9
        System.out.println(calc.add(2.5, 3.5));    // 6.0
    }
}

