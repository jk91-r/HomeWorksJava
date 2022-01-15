/*
* Java 1 Homework #6
*@ author Julia Kuznetsova
*@ version 26.12.2021
*/

class HomeWork6{
    public static void main (String[] args) {
        IAnimal cat = new Cat ("Mary", 200);
        IAnimal dog = new Dog ("Jack", 500, 10);
        IAnimal[] animals = {cat,dog};
        for (IAnimal a : animals) {
            System.out.println(a);
            System.out.println(a.run(100));
            System.out.println(a.run(230));
            System.out.println(a.run(510));
            System.out.println(a.swim(5));
            System.out.println(a.swim(25));
        }
    }
}

class Cat extends Animal {
    Cat(String name, int runMaxValue, int swimMaxValue) {
        super(name, runMaxValue, swimMaxValue);
    }
    Cat(String name, int runMaxValue){
        super(name, runMaxValue, -1);
    }
    @Override
    public String swim (int value) {
        return name + " can't swim!!!";
    }
}

class Dog extends Animal {
    Dog(String name, int runMaxValue, int swimMaxValue) {
        super(name, runMaxValue, swimMaxValue);
    }
}

interface IAnimal {
    String run(int value);
    String swim(int value);
}

abstract class Animal implements IAnimal {
    protected String name;
    protected int runMaxValue;
    protected int swimMaxValue;

    Animal(String name,int runMaxValue, int swimMaxValue) {
        this.name = name;
        this.runMaxValue = runMaxValue;
        this.swimMaxValue = swimMaxValue;
    }

    @Override
    public String toString () {
        return name + " : runLimit: " + runMaxValue + " m , swimLimit: " + swimMaxValue + " m.";
    }

    @Override
    public String run (int value){ 
        if (value > runMaxValue){
            return name + " can't run " + value + " m.";
        } else {
            return name + " ran " + value + " m.";
        }
    }

    @Override
    public String swim (int value){ 
        if (value > swimMaxValue){
            return name + " can't swim " + value + " m.";
        } else {
            return name + " swam " + value + " m.";
        }
    }
}
