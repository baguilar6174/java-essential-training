package poo.polymorphism;

// extends word = poo.polymorphism.inheritance (reusing code between related classes)
public class Employee extends Person {

    // set an attribute as private = encapsulation
    private String employeeId;
    private String title;

    public Employee() {
        /*
        * - A superclasses constructor is run before the subclass constructor
        * - If the superclass doesn't have a default constructor then the subclass must explicitly call
        * one of its other constructor.
        * - super() must be the first statement in the constructor's body
        * - If we call super without arguments -> call default constructor
        * */
        super("Bryan");
        System.out.println("In Employee default constructor");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /* To override a method, keep the same signature but change the body */
    @Override
    public void printInfo() {
        System.out.println("This is the info in a employee");
    }

    /* To overload a method, keep the same name but change the signature of the method */
    public void print(String param) {
        System.out.println("I am an employee " + param);
    }
}
