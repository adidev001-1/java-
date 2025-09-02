public class Parent {
    String name;
    int age;

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showDetails() {
        System.out.println("Parent Name: " + name);
        System.out.println("Parent Age: " + age);
    }

    void parentMethod() {
        System.out.println("This is a method in the Parent class.");
    }
}

class Child extends Parent {
    String school;

    public Child(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    void showChildDetails() {
        System.out.println("Child Name: " + name);
        System.out.println("Child Age: " + age);
        System.out.println("Child School: " + school);
    }

    void childMethod() {
        System.out.println("This is a method in the Child class.");
    }

    public static void parent (String[] args) {
        Parent p = new Parent("Alice", 45);
        p.showDetails();
        p.parentMethod();

        System.out.println();

        Child c = new Child("Bob", 15, "Greenwood High");
        c.showChildDetails();
        c.childMethod();
    }
}
