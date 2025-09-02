class A{
    String name = "Rahul" ;
    int rollno = 1;
    void show(){
        System.out.println("Parent method Class");
    }
}
class B extends A {
    void display() {
        System.out.println(" Class b methoo class");
    }
}
class C extends B{
    void add(){
        System.out.println("Class C method called");
    }

}

public  class inherit {
    public static  void main(String[] args){

        B b = new B();
        C c = new C();
        System.out.println(b.name);
        System.out.println(b.rollno);
        b.show();
        b.display();
        c.add();
        c.display();
        c.show();

    }

}