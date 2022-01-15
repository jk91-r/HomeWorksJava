/*
* Java 1 Homework #7
*@ author Julia Kuznetsova
*@ version 29.12.2021
*/

class HomeWork7{
    public static void main (String[] args) {
        Cat[] cat = {new Cat("Mary",20), new Cat("Gary",30), new Cat("Bob",5)};
        for (Cat c : cat) {
            System.out.println(c);
        }

        Plate plate = new Plate(30);
        System.out.println(plate);

        for (Cat c : cat) {
        c.eat(plate);
        System.out.println(c);
        System.out.println(plate);
        }
    }
}

class Cat {
    protected String name;
    protected int appetite;

    Cat(String name,int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    void eat(Plate plate) {
        if (plate.food >= appetite) {
        plate.decreaseFood(appetite);
        boolean full = true;
        }
        if (plate.food <= appetite){
        plate.addFood(10);
        }
    }

    @Override
    public String toString(){
        return "Cat: " + name + ", appetite: " + appetite ;
    }
}

class Plate{
    protected int food;

    Plate (int food) {
        this.food = food;
    }

    void decreaseFood(int food) {
        if (this.food >= food) {
            this.food -= food ;
        }
    }

    @Override
    public String toString(){
        return "Plate: " + food;
    }

    void addFood (int food) {
        this.food += food;
    }

}




