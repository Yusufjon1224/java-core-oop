package oop.method_overloading_overriding;
/*
✅ Method Overriding in Java (Runtime Polymorphism)
👉 Definition (simple):

Subclass provides its own implementation of a method that already exists in parent class

Java decides which method to call at runtime.

✔ Rules:

• Same method name
• Same parameters
• IS-A relationship (inheritance)
• Return type same or child type (covariant)
• Access level cannot be more restrictive

📌 Example: Method Overriding

🧠 What happened?

Even though reference type is Animal,
actual object is Dog

👉 Java calls Dog’s method at runtime

✅ Interview one-liner:

Method overriding occurs when a subclass provides a specific implementation of a method already defined in its superclass and is resolved at runtime.
 */
class Animal {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Overriding {
    public static void main(String[] args) {

        Animal animal = new Dog();   // polymorphism

        animal.makeSound();  // Dog barks (NOT Animal makes sound)
    }
}

