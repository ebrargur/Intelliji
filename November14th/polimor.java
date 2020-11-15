package com.company.November14th;

public class polimor {
    public static void main(String[] args) {
        polimor myAnimal = new polimor();  // it can hold variables of family
        polimor myPig = new Pig();  // same concept primitive short type variables
        polimor myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
        public void animalSound() {
            System.out.println("The animal makes a sound");
        }
    }

    class Pig extends polimor {
        public void animalSound() {
            System.out.println("The pig says: wee wee");
        }
    }

    class Dog extends polimor {
        public void animalSound() {
            System.out.println("The dog says: bow wow");
        }
    }

