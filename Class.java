class Person{
    String name;
    int age;

    void info() {
        for (int i=0; i<3; i++) {
            System.out.println("hi, i'm " + name + " & my age is " + age + "!");
        }
    }
}

public class Class {
    public static void main(String args[]){
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "Sanzid";
        p1.age = 21;
        p1.info();

        p2.name = "Mou";
        p2.age = 16;
        p2.info();
    }
}
