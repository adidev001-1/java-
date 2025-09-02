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

public  class hire {
    public static  void main(String[] args){

    }

}