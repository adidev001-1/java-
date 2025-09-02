class stu {
    private String name;
    private int rollno;
    private int marks;

    // Constructor
    stu(String name, int rollno, int marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    // Getter
    public int getmarks() {
        return marks;
    }

    // Setter
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
            System.out.println("Marks uploaded");
        } else {
            System.out.println("Invalid marks");
        }
    }

    // Display
    void display() {
        System.out.println("Name: " + name + " | Roll No: " + rollno + " | Marks: " + marks);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // Create object with all 3 parameters
        stu s1 = new stu("Rahul", 1, 85);

        // 1. Display student details
        s1.display();

        // 2. Get marks
        System.out.println("Current Marks: " + s1.getmarks());

        // 3. Set valid marks
        s1.setMarks(90);

        // 4. Try invalid marks
        s1.setMarks(110);

        // 5. Display again after update
        s1.display();
    }
}