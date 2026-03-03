 public class Stud {

    String name;
    int phno;

    // Parameterized constructor
    public Stud(String name, int phno) {
        this.name = name;
        this.phno = phno;
    }

    // Copy constructor
    public Stud(Stud s) {
        this.name = s.name;
        this.phno = s.phno;
    }

    public static void main(String[] args) {

        // Creating first object
        Stud s1 = new Stud("Thrisha", 1245);

        // Creating second object using copy constructor
        Stud s2 = new Stud(s1);

        System.out.println("Name: " + s2.name);
        System.out.println("Phone: " + s2.phno);
    }
}