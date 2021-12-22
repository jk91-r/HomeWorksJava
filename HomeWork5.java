/*
* Java 1 Homework #5
*@ author Julia Kuznetsova
*@ version 21.12.2021
*/

class HomeWork5{
    public static void main (String[] args) {
        Person[] person = new Person[5];
        person[0] = new Person("Ivanov Ivan", "Engineer", "iivanov@mailbox.com", "89231231220", 40000, 30 );
        person[1] = new Person("Avdeev Iliya", "Architect", "iavdeev@mailbox.com", "89223212550", 50000, 40);
        person[2] = new Person("Konovalov Andrey", "Chief Engineer", "akonavalov@mailbox.com", "89252222525", 100000, 55);
        person[3] = new Person("Poneeva Anna", "Accountant", "aponeeva@mailbox.com", "89231111111", 60000, 45);
        person[4] = new Person("Peskov Nikolay", "Intern", "npeskov@mailbox.com", "89222225555", 20000, 25);
            for (int i = 0; i < person.length; i++){
                if (person[i].getAge() > 40) {
                    System.out.println(person[i]);
                }
            }
     }
}

class Person {
    private String fullname;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public int getAge() {
        return age;
    }

    Person(String fullname, String position, String email, String phone, int salary, int age) {
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return fullname + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age;
    }

}

